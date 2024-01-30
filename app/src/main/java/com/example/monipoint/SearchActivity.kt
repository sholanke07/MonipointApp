package com.example.monipoint

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.monipoint.databinding.ActivityMainBinding
import com.example.monipoint.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private val itemsList = ArrayList<SearchData>()
    private lateinit var searchListAdapter: SearchListAdapter


    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_search)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        searchListAdapter = SearchListAdapter(itemsList)
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView2.layoutManager = layoutManager
        binding.recyclerView2.adapter = searchListAdapter
        prepareItems()


        binding.searchBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun onTextChanged(cs: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun afterTextChanged(editable: Editable?) {
                searchListAdapter.filter.filter(editable)

            }

        })

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun prepareItems() {
        val list1 = SearchData("Summer linen jacket","#NEJ20089934122231", "* Barcelona -> Paris")
        val list2 = SearchData("Tapered-fit jeans AW","#NEJ35870264978695", "* Colombia -> Paris")
        val list3 = SearchData("Macbook pro M2 ","#NE43857340857904", "* Paris -> Morocco")
        val list4 = SearchData("Office setup desk","#NEJ23481570754963", "* France -> German")

        itemsList.add(list1)
        itemsList.add(list2)
        itemsList.add(list3)
        itemsList.add(list4)
        searchListAdapter.setEvents(itemsList)

    }

}