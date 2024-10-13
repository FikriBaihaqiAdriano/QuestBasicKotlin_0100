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
}

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik (tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu)
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah)
// Set Read-Only menggunakan setOf
// Set Mutable menggunaka nmutableSetOf

fun ContohSet() {
    println()
    println("=== Set ===")

// Set Read-Only
val readOnlyAbjad = setOf ("A", "B", "C")
println (readOnlyAbjad)

// Set Mutable
val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
println(shape)

    //Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari set Mutable
    shape.remove("Circle")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// map adalah kumpulan data yang disusun dalam pasangan key-value
// map bersifat unordered, artinya daya yang dimasukkan tidak memiliki posisi tertentu
// map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// map read only menggunakan mapOf
// map mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("=== Map ===")

    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Squere" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Squere" to 2, "Triangle" to 3)
    println(shape)

    //Menambahkan data kedalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

}

fun main(){
    ContohList()

}