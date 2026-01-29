package com.example.coffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffee.Adapters.MenuAdapter
import com.example.coffee.state.MenuProductState


class MenuFragment : Fragment(R.layout.fragment_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val initialDate = listOf(
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 1",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 2",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 3",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 4",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 5",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 6",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 7",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 8",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 9",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 10",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 12",
                price = 100f
            ),
            MenuProductState(
                imageResource = R.drawable.coffee_image,
                name = "Coffee 13",
                price = 100f
            ),
        )
        val adapter = MenuAdapter(initialDate)
        adapter.setOnClickListener(object : MenuAdapter.OnClickListener {
            override fun onClick(
                position: Int,
                model: MenuProductState
            ) {
                Toast.makeText(this@MenuFragment.context, model.name, Toast.LENGTH_SHORT)
                    .show()
            }
        })
        val recyclerView = view.findViewById<RecyclerView>(R.id.rlMenu)

        recyclerView.layoutManager = GridLayoutManager(this.context, 2)
        recyclerView.adapter = adapter
    }
}