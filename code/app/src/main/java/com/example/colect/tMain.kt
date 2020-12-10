package com.example.colect

data class Person(val age: Int)

fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 0, 4, 3, 3, 5, 5, 10, 5, 1, 8, 5)
    println(returnFrequent(list))

    val mapOfPerson: Map<Person, String> = mapOf(Person(15) to "Oleg", Person(18) to "Helga", Person(12) to "Olga", Person(10) to "Kevin", Person(20) to "Keysi")
    println(mapOfPerson.toSortedMap(compareBy<Person> { it.age }))
}

fun <T>returnFrequent(list: List<T>): T? = list.groupBy { it }.maxByOrNull { it.value.size }?.key