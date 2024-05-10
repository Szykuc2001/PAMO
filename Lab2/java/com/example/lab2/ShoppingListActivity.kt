package com.example.lab2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShoppingListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)

        val customItemList = listOf(
                CheckboxAdapter.CustomItem("Extra-Virgin Olive Oil"),
                CheckboxAdapter.CustomItem("Lemon"),
                CheckboxAdapter.CustomItem("Garlic"),
                CheckboxAdapter.CustomItem("Spinach"),
                CheckboxAdapter.CustomItem("Lemon Juice"),
                CheckboxAdapter.CustomItem("Ground Pepper"),
                CheckboxAdapter.CustomItem("Parmesan Cheese"),
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Checkbox(customItemList)
    }
    fun openHome(view: View?) {
        startActivity(Intent(this, HomeActivity::class.java))
    }

    fun openRecipe2(view: View?) {
        startActivity(Intent(this, Recipe2Activity::class.java))
    }
}
