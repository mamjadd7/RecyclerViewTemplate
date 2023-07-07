package com.example.recyclerviewtemplate.customadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtemplate.databinding.RvItemViewBinding
import com.example.recyclerviewtemplate.modal.RvModal

class CustomAdapter(var context: Context, var listItem: ArrayList<RvModal>): RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {

    inner class MyViewHolder(var binding: RvItemViewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding = RvItemViewBinding.inflate(LayoutInflater.from(context),parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(listItem.get(position).image)
        holder.binding.textViewName.text = listItem[position].name
        holder.binding.textViewNumber.text = listItem[position].number.toString()
    }
}