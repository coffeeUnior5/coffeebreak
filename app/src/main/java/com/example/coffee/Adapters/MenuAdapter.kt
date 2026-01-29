package com.example.coffee.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffee.Adapters.MenuAdapter.MenuViewHolder
import com.example.coffee.R
import com.example.coffee.state.MenuProductState

class MenuAdapter(
    private val list: List<MenuProductState>
): RecyclerView.Adapter<MenuViewHolder>() {

    private var onClickListener: OnClickListener? = null

    interface OnClickListener {
        fun onClick(position: Int, model: MenuProductState)
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_list_item, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: MenuViewHolder,
        position: Int
    ) {
        val item = list[position]
        holder.image.setImageResource(item.imageResource)
        holder.name.text = item.name
        holder.price.text = item.price.toString()

        holder.itemView.setOnClickListener {
            onClickListener?.onClick(position, item)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MenuViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.imgMenu)
        val name: TextView = view.findViewById(R.id.tvMenuName)
        val price: TextView = view.findViewById(R.id.tvMenuPrice)
    }
}