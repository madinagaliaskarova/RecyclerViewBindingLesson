package com.geektech.recyclerviewbindinglesson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.recyclerviewbindinglesson.databinding.ItemNameBinding

class NameAdapter(val data : ArrayList<Person>) : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        return NameViewHolder(ItemNameBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.bind (data.get(position))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class NameViewHolder(private val binding: ItemNameBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(person: Person) {
            binding.name.text = person.name
            binding.surname.text = person.surname
            binding.age.text = person.age
        }

    }


}