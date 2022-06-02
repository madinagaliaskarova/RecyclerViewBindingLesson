package com.geektech.recyclerviewbindinglesson

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.addFragment(fragment: Fragment) {
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
}
fun Fragment.replaceFragment(fragment: Fragment) {
requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit()
}