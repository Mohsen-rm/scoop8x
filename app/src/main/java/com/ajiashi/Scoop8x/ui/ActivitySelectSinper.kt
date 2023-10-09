package com.ajiashi.Scoop8x.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ajiashi.Scoop8x.R
import com.ajiashi.Scoop8x.adapter.CustomAdapter
import com.ajiashi.Scoop8x.model.ItemsViewModel


class ActivitySelectSinper : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_sinper)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = GridLayoutManager(this, 4)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        data.add(ItemsViewModel(R.drawable.ic_sinper1, "",true,R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper2, "", true, R.raw.sniper_rifle))
//        data.add(ItemsViewModel(R.drawable.ic_sinper3, "", false, R.raw.sniper_rifle))
//        data.add(ItemsViewModel(R.drawable.ic_sinper4, "", false, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper5, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper6, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper7, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper9, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper10, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper11, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper12, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper13, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper14, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper15, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper16, "", true, R.raw.clean_machin))
        data.add(ItemsViewModel(R.drawable.ic_sinper17, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper18, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper19, "", false, R.raw.sniper_rifle))
//        data.add(ItemsViewModel(R.drawable.ic_sinper20, "", false, R.raw.sniper_rifle))
//        data.add(ItemsViewModel(R.drawable.ic_sinper21, "", false, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper23, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper24, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper25, "", true, R.raw.sniper_rifle))
        data.add(ItemsViewModel(R.drawable.ic_sinper26, "", true, R.raw.clean_machin))
        data.add(ItemsViewModel(R.drawable.ic_sinper27, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper28, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper29, "", true, R.raw.shotgun_firin))
        data.add(ItemsViewModel(R.drawable.ic_sinper30, "", true, R.raw.shotgun_firin))
        data.add(ItemsViewModel(R.drawable.ic_sinper31, "", true, R.raw.mm_pistol_shot))
        data.add(ItemsViewModel(R.drawable.ic_sinper33, "", false, R.raw.mm_pistol_shot))
        data.add(ItemsViewModel(R.drawable.ic_sinper34, "", true, R.raw.mm_pistol_shot))
        data.add(ItemsViewModel(R.drawable.ic_sinper35, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper36, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper37, "", true, R.raw.machin_gun))
        data.add(ItemsViewModel(R.drawable.ic_sinper38, "", true, R.raw.sniper_rifle))
        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)
        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}
