package com.example.utsmobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.modelsiput.view.*

 class AdapterList(private val listSiput: ArrayList<siput1>):
     RecyclerView.Adapter<AdapterList.ListViewHolder> () {
        inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            var textNama = itemView.textNamaSiput
            var textIlmiah = itemView.textNamaIlmiah
            var textDetail = itemView.textPenjelasanSiput
            var fotoSiput = itemView.gambarSiput
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.modelsiput, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val siput = listSiput[position]
        holder.textNama.text = siput.siput
        holder.textIlmiah.text = siput.ilmiah
        holder.textDetail.text = siput.penjelasanSingkat

        Glide.with(holder.itemView.context)
            .load(siput.fotoSiput)
            .into(holder.fotoSiput)
    }

    override fun getItemCount(): Int {
        return listSiput.size
    }

}