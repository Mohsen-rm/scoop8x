package com.ajiashi.Scoop8x

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class ButtomSheetDialgoSelectSinper {

    private val itemsList = ArrayList<String>()
    private lateinit var customAdapter: CustomAdapter

    fun showDialogOne(
        context: MainActivity,
        onClickListener: View.OnClickListener
    ) {

        val dialog = BottomSheetDialog(context)
        dialog.setContentView(R.layout.buttom_sheet_dialgo_select_sinper)

        //title = "RecyclerView - www.tutorialkart.com"

        val recyclerView: RecyclerView? = dialog.findViewById(R.id.recyclerView)
        customAdapter = CustomAdapter(itemsList)
        val layoutManager = LinearLayoutManager(context)
        if (recyclerView != null) {
            recyclerView.layoutManager = layoutManager
        }
        if (recyclerView != null) {
            recyclerView.adapter = customAdapter
        }
        prepareItems()

        dialog.show()
    }

    private fun prepareItems() {
        itemsList.add("Item 1")
        itemsList.add("Item 2")
        itemsList.add("Item 3")
        itemsList.add("Item 4")
        itemsList.add("Item 5")
        itemsList.add("Item 6")
        itemsList.add("Item 7")
        itemsList.add("Item 8")
        itemsList.add("Item 9")
        itemsList.add("Item 10")
        itemsList.add("Item 11")
        itemsList.add("Item 12")
        itemsList.add("Item 13")
        customAdapter.notifyDataSetChanged()
    }
}