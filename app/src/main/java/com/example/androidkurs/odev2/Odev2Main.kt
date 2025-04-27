package com.example.androidkurs.odev2

fun main() {
    val islem = odev2()

    println("${islem.fahrenheit(30.0)} F")
    islem.dikdortgenCevresi(5.0, 3.0)
    println("${islem.faktoriyel(5)}")
    islem.aHarfi("Bugün hava cok guzeldi.")
    println("${islem.icAcilarToplami(3)}")
    println("${islem.maasHesaplama(25)} TL")
    println("${islem.paketUcreti(55)} TL")


}
