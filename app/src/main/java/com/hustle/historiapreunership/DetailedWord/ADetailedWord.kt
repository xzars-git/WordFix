package com.hustle.historiapreunership.DetailedWord

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hustle.historiapreunership.Adapter.DetailedWordAdapter
import com.hustle.historiapreunership.Model.Word
import com.hustle.historiapreunership.R


class ADetailedWord : AppCompatActivity() {
    private lateinit var adapter: DetailedWordAdapter
    private lateinit var recView: RecyclerView
    private lateinit var wordArrayList: ArrayList<Word>
    private lateinit var abjad: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adetailed_word)

        abjad = arrayListOf(
            getString(R.string.Andora),
            getString(R.string.Australia),
            getString(R.string.Austria)
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
                        val intent = Intent(Intent.ACTION_WEB_SEARCH)
                        intent.putExtra(SearchManager.QUERY,R.string.Andora)
                        startActivity(intent)
                    }
                    1 -> {
                        val intent = Intent(Intent.ACTION_WEB_SEARCH)
                        intent.putExtra(SearchManager.QUERY,R.string.Australia)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(Intent.ACTION_WEB_SEARCH)
                        intent.putExtra(SearchManager.QUERY,R.string.Austria)
                        startActivity(intent)
                    }
                }
            }
        })
    }
}