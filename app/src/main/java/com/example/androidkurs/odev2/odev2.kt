package com.example.androidkurs.odev2

class odev2 {
    fun fahrenheit(derece: Double): Double {
        val sonuc = (derece * 1.8 + 32)
        return sonuc
    }

    fun dikdortgenCevresi(kk: Double, uk: Double) {
        val sonuc = (kk + uk) * 2
        println(sonuc)
    }

    fun faktoriyel(sayi: Int): Int {
        var sonuc = 1
        if (sayi == 0) {
            return 0
        } else {
            for (i in 1..sayi) {
                sonuc *= i
            }
            return sonuc
        }
    }

    fun aHarfi(kelime: String) {
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'a' || harf == 'A') {
                sayac++
            }
        }
        println(sayac)
    }

    fun icAcilarToplami(k: Int): Int {
        val sonuc = (k - 2) * 180
        return sonuc
    }

    fun maasHesaplama(gun: Int): Int {
        val gunlukSaat = 8
        val toplamSaat = gunlukSaat * gun
        if (toplamSaat > 160) {
            val ucret = (160 * 10) + ((toplamSaat - 160) * 20)
            return ucret
        } else {
            return toplamSaat * 10
        }

    }

    fun paketUcreti(kota: Int): Int {
        if (kota <= 50) {
            return 100
        } else {
            return 100 + ((kota - 50) * 4)
        }
    }


}