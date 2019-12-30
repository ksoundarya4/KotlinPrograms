package com.bridgelabs.sample

val templet : String = "Hello <<UserName>> , How are you?"
var name = "Soundarya"
fun main() {

    val result = "${templet.replace("<<UserName>>" , name)}"
        println(result)
    }

