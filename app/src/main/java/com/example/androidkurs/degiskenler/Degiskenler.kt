package com.example.androidkurs.degiskenler

//22.04 tarihli derse aittir.

fun main() {

    //part1:
    // println("Merhaba Dunya!")

    //part2:
    val yas = 17
    println(yas >= 18)

    if (yas >= 18) {
        println("rRsitsiniz.")
    } else {
        println("Resit degilsiniz.")
    }

    //part3:
    val ka = "admin"
    val s = 123456
    val sayi = 10

    if (ka == "admin" && s == 123456) {
        println("Hos geldiniz")
    } else {
        println("Hatali giris.")
    }

    if (sayi == 9 || sayi == 10) {
        println("Sayi 9 veya 10")
    } else {
        println("Sayi 9 veya 10 degildir.")
    }

    //part4:
    //When diğer dillerde Switch olarak bilirinir.

    val number = 5

    when (number) {
        1 -> {
            println("Sayi 1'dir.")
        }

        2 -> println("Sayi 2'dir.")
        else -> println("Tanimlanmayan sayi.")
    }

    //part5:
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurumu = true

    //part5.1:
    println(id)
    println(ad)
    println(resim)
    println(puan)
    println(fiyat)
    println(stokDurumu)

    //part5.2:
    println("Id         : $id")
    println("Ad         : $ad")
    println("Resim      : $resim")
    println("Puan       : $puan")
    println("Fiyat      : $fiyat")
    println("Stok Durumu: $stokDurumu")

    //part6
    //Sabitler - constant
    var sayi2 = 30
    sayi2 = 100
    println(sayi)

    val numara = 50
    println(numara)

    //part7:
    //Tür Dönüşümü
    //1-Sayısaldan sayısala Dönüşüm
    val d = 89.56
    val sonuc1 = d.toInt()
    println(sonuc1)

    val i = 34
    val sonuc2 = i.toDouble()
    println(sonuc2)

    //2.Sayısaldan metine dönüşüm
    var x = 85
    val sonuc3 = x.toString()//"85"
    println(sonuc3)

    //3-Metinden sayısala dönüşüm !!TEHLİKELİ
    //3.1
    val yazi = "48"
    val sonuc4 = yazi.toInt()
    println(sonuc4)

    //3.2
    val yazi2 = "48T"
    val sonuc5 = yazi2.toIntOrNull()
    println(sonuc5)

    if (sonuc5 != null) {
        println(sonuc5)
    } else {
        println("Sonuc nulldur.")
    }







}