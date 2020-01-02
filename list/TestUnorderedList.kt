package com.bridgelabs.list

fun main(){
    val list = UnorderedList<Int>()
    println(list.size)
    list.add(2)
    println(list.size)
    list.add(4)
    println(list.size)
    println(list)
    list.add(3)
    list.add(1)
    println(list)
    println(list.size)

}