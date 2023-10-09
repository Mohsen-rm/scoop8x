package com.ajiashi.Scoop8x.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ajiashi.Scoop8x.R
import com.ajiashi.Scoop8x.include.Data
import com.ajiashi.Scoop8x.model.ItemsViewModel


class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_select_sinper, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemMode = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(itemMode.image)
        holder.itemView.setOnClickListener(View.OnClickListener {

            var data = Data(holder.itemView.context)

            data.setImg_sinper(itemMode.image)
            data.setTitle("")
            data.setIs_sinper(true)
            data.setIs_Voice(true)
            data.setUrl_voice(itemMode.url_voice)

            Toast.makeText(holder.itemView.context,"Yes Select"+itemMode.url_voice,Toast.LENGTH_LONG).show()
//            val intent = Intent(holder.itemView.context, MainActivity::class.java)
//            holder.itemView.context.startActivity(intent)
            (holder.itemView.context as Activity).finish()
        })
        // sets the text to the textview from our itemHolder class
        //holder.textView.text = ItemsViewModel.text

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        //val textView: TextView = itemView.findViewById(R.id.textView)
    }
}
