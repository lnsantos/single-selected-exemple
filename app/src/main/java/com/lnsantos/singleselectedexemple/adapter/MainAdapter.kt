package com.lnsantos.singleselectedexemple.adapter

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lnsantos.singleselectedexemple.R
import com.lnsantos.singleselectedexemple.mock.Mock

class MainAdapter(val resources: Resources) : RecyclerView.Adapter<MainAdapter.ViewHolder>(){

    private val mock = Mock().itens
    private var currentPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_card, parent, false) as View
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = mock.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView()

        holder.itemView.setOnClickListener {
            currentPosition = position
            notifyDataSetChanged()
        }

        if (currentPosition == position){
            holder.itemView.background = resources.getDrawable(R.drawable.background_default)
        }else{
            holder.itemView.background = resources.getDrawable(R.drawable.background_selected)
        }
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindView(){}

    }
}