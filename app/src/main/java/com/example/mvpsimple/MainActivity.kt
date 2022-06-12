package com.example.mvpsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var btnLuas: Button
    private lateinit var btnKeliling: Button
    private lateinit var tvHasilPP: TextView
    private lateinit var tvHasilP: TextView
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter( this)
        etPanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        btnLuas = findViewById(R.id.btnLuas)
        btnKeliling = findViewById(R.id.btnKeliling)
        tvHasilPP = findViewById(R.id.tvHasilPP)
        tvHasilP = findViewById(R.id.tvHasilP)

        btnLuas.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPjn(panjang, lebar)
            mainPresenter.hitungLuasPersegi(panjang)
        }

        btnKeliling.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPjg(panjang, lebar)
            mainPresenter.hitungKelilingPersegi(panjang)
        }
    }

    override fun updateLuas(luas: Float) {
        tvHasilPP.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        tvHasilPP.text = keliling.toString()
    }

    override fun showError(errorMsg: String) {
        tvHasilPP.text = errorMsg
        tvHasilP.text = errorMsg
    }

    override fun updateLuasP(luas: Float) {
        tvHasilP.text = luas.toString()
    }

    override fun updateKelilingP(keliling: Float) {
        tvHasilP.text = keliling.toString()
    }


}