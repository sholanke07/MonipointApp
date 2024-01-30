package com.example.monipoint

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class SearchListAdapter(private var itemsList: List<SearchData>) :
    RecyclerView.Adapter<SearchListAdapter.MyViewHolder>(), Filterable {

    private var filterList = mutableListOf<SearchData>()

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nameTextView: TextView = view.findViewById(R.id.name_txt)
        var addressTextView: TextView = view.findViewById(R.id.address_txt)
        var numTextView: TextView = view.findViewById(R.id.num_txt)

    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.searchlist, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]
        holder.nameTextView.text = item.name
        holder.addressTextView.text = item.address
        holder.numTextView.text = item.number

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setEvents(searchData: List<SearchData>){
        this.itemsList = searchData as MutableList<SearchData>
        this.filterList = searchData as MutableList<SearchData>

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun getFilter(): Filter {
        return object: Filter(){
            override fun performFiltering(charSequence: CharSequence?): FilterResults {
                val filterResult = FilterResults()
                if (charSequence == null || charSequence.length < 0){
                    filterResult.count = filterList.size
                    filterResult.values = filterList
                }else{
                    var searchChr = charSequence.toString().toUpperCase(Locale.ROOT)
                    val itemModel  = mutableListOf<SearchData>()
                    for (item in filterList){
                        if (item.number!!.contains(searchChr)) {

                            itemModel.add(item)
                        }
                    }
                    filterResult.count = itemModel.size
                    filterResult.values = itemModel
                }
                return filterResult

            }

            override fun publishResults(p0: CharSequence?, filterResult: FilterResults?) {
                itemsList = filterResult!!.values as MutableList<SearchData>
                notifyDataSetChanged()
            }

        }
    }
}