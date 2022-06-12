package com.example.mvpsimple

class MainPresenter(private val mainView: MainActivity) {
    fun hitungLuasPersegiPjn(panjang: Float, lebar: Float) {
        if (panjang == 0F) {
            mainView.showError("jangan ampe kosong,, Coy")
            return
        }

        if (lebar == 0F) {
            mainView.showError("lebar mana ada yang kosong,, Coy")
            return
        }

        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegiPjg(panjang: Float, lebar: Float) {
        if (panjang == 0F) {
            mainView.showError("jangan ampe kosong,, Coy")
            return
        }

        if (lebar == 0F) {
            mainView.showError("lebar mana ada yang kosong,, Coy")
            return
        }

        val keliling = 2*(panjang+lebar)
        mainView.updateKeliling(keliling)
    }

    //PERSEGI

    fun hitungLuasPersegi(panjang: Float) {
        if (panjang == 0F) {
            mainView.showError("jangan ampe kosong,, Coy")
            return
        }

        val luas = panjang * panjang
        mainView.updateLuasP(luas)
    }

    fun hitungKelilingPersegi(panjang: Float) {
        if (panjang == 0F) {
            mainView.showError("jangan ampe kosong,, Coy")
            return
        }


        val keliling = panjang * 4
        mainView.updateKelilingP(keliling)
    }
}