package com.example.androidkurs.odev2

class odev2 {
    fun fahrenheit(derece : Double) : Double {
        val sonuc = (derece * 1.8 +32)
        return sonuc
    }
    fun dikdortgenCevresi (kk : Double, uk : Double) : Double{
        val sonuc = (kk+uk)*2
        return sonuc
    }
    fun faktoriyel (sayi : Int): Int {
        var sonuc = 1
        if (sayi == 0){
            return 0
        }else{
            for( i in 1 ..sayi ){
             sonuc*=i
            }
            return sonuc
        }
    }
    fun aHarfi(kelime : String) : Int{
        var sayac = 0
        for (harf in kelime){
            if(harf == 'a' || harf == 'A'){
                sayac++
            }
        }
        return sayac
    }



}