package com.hustle.historiapreunership

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hustle.historiapreunership.Adapter.DetailedWordAdapter
import com.hustle.historiapreunership.DetailedWord.*
import com.hustle.historiapreunership.Model.Word
import com.hustle.historiapreunership.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var adapter: DetailedWordAdapter
    private lateinit var recView: RecyclerView
    private lateinit var wordArrayList: ArrayList<Word>
    private lateinit var abjad: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        abjad = arrayListOf(
            getString(R.string.A),
            getString(R.string.B),
            getString(R.string.C),
            getString(R.string.D),
            getString(R.string.E),
            getString(R.string.F),
            getString(R.string.G),
            getString(R.string.H),
            getString(R.string.I),
            getString(R.string.J)
        )

        recView = findViewById(R.id.recView)
        recView.layoutManager = LinearLayoutManager(this)
        recView.setHasFixedSize(true)

        wordArrayList = arrayListOf<Word>()

        for (i in abjad.indices) {
            val word = Word(abjad[i])
            wordArrayList.add(word)
        }

        var adapter = DetailedWordAdapter(wordArrayList)
        recView.adapter = adapter

        adapter.setOnItemClickListener(object : DetailedWordAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                when (position) {
                    0 -> {
                        intentA()
                    }
                    1 -> {
                        intentB()
                    }
                    2 -> {
                        intentC()
                    }
                    3 -> {
                        intentD()
                    }
                    4 -> {
                        intentE()
                    }
                    5 -> {
                        intentF()
                    }
                    6 -> {
                        intentG()
                    }
                    7 -> {
                        intentH()
                    }
                    8 -> {
                        intentI()
                    }
                    9 -> {
                        intentJ()
                    }
                }
            }
        })
    }
    private fun intentA(){
        val intent = Intent(this, ADetailedWord()::class.java)
        startActivity(intent)
    }

    private fun intentB(){
        val intent = Intent(this, BDetailedWord()::class.java)
        startActivity(intent)
    }

    private fun intentC(){
        val intent = Intent(this, CDetailedWord()::class.java)
        startActivity(intent)
    }

    private fun intentD(){
        val intent = Intent(this, DDetailedWord()::class.java)
        startActivity(intent)
    }

    private fun intentE(){
        val intent = Intent(this, EDetailedWord()::class.java)
        startActivity(intent)
    }

    private fun intentF(){
        val intent = Intent(this, FDetailedWord()::class.java)
        startActivity(intent)
    }
    private fun intentG(){
        val intent = Intent(this, GDetailedWord()::class.java)
        startActivity(intent)
    }
    private fun intentH(){
        val intent = Intent(this, HDetailedWord()::class.java)
        startActivity(intent)
    }
    private fun intentI(){
        val intent = Intent(this, IDetailedWord()::class.java)
        startActivity(intent)
    }
    private fun intentJ(){
        val intent = Intent(this, JDetailedWord()::class.java)
        startActivity(intent)
    }


}
