package com.example.app

// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList () {
    println("=== List ===")
    //List Read Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape : MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari list Mutable
    shape.remove ("Triangle")
    println(shape)

    //Mengubah data di dalam List Mutable
    shape [0] ="Oval"
    println(shape)

    //List Read Only
    val shapeLocked: List<String> = shape
    println(shapeLocked)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt (1)
    println(shape)
}

fun main(){
    ContohList()
}