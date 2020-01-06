package com.bridgelabs.list

class HashingFunction() {

    val list: Array<OrderedLinkedList<Int>?> = arrayOfNulls(11)

    fun hashingFunction() {
        for (index in 0.until(list.size)) {
            list[index] = OrderedLinkedList<Int>()
        }
    }

    override fun toString(): String {
        var str = ""
        for (index in 0.until(list.size)) {
            if (list[index] != null)
                str += list[index].toString()
        }
        return str
    }

    fun put(number: Int) {
        list[number % 11]?.add(number)
    }

    fun search(number: Int): Boolean {
        if (list[number % 11]!!.search(number))
            return true
        return false
    }

    fun pop(number: Int) {
        if (list[number % 11]!!.search(number)) {
            list[number % 11]!!.remove(number)
        }
    }


}

fun main() {
    val hashingFunction = HashingFunction()

    val fileName = "C:\\Users\\soundarya k\\IdeaProjects\\BridgeLabz\\src\\com\\bridgelabs\\list\\NumberFile"
    val list = readNumberFile(fileName)

    hashingFunction.hashingFunction()
    
    for (index in 0.until(list.size)) {
        hashingFunction.put(list.get(index))
    }
    println(hashingFunction)

    println("Enter a number to be searched")
    val input = readLine()!!.toInt()
    if (hashingFunction.search(input)) {
        hashingFunction.pop(input)
    } else {
        hashingFunction.put(input)
    }

    println(hashingFunction)

}




