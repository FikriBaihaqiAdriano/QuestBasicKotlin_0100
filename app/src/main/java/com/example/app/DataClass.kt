package com.example.app

// Data class
// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi aquals(), hashCode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id : Int,
    val email: String
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    // fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) //false

    // fungsi copy
    val data3 = data.copy()
    println(data3)

    // fungsi copy dengan perubahan
    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)
}