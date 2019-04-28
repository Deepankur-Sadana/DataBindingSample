package com.example.vogueladatabinding


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


class MyAdapter(private val list: List<TemperatureData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            layoutInflater,
            R.layout.rowlayout,
            parent,
            false
        );
        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val temperatureData = list.get(position)
        holder.bind(temperatureData)
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class MyViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        // each data item is just a string in this case


        fun bind(obj: Any) {
            binding.setVariable(BR.obj, obj)
            binding.executePendingBindings()
        }
    }


}