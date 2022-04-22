package com.rzs.peliculasapp.presentation.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rzs.peliculasapp.R
import com.rzs.peliculasapp.presentation.view.MovieDetailsActivity

class MoviesAdapter(
    private val title: List<String>,
    private val image: List<Int>,
    private val quantity: Int
) :
    RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        var textView: TextView = itemView.findViewById(R.id.txt_title_desc)
        val imageView: ImageView = itemView.findViewById(R.id.img_poster)

        init {
            itemView.setOnClickListener {
                val position = this.adapterPosition
                val intent1 = Intent(itemView.context, MovieDetailsActivity::class.java)
                intent1.putExtra("Item", title[position])
                intent1.putExtra("Image", image[position])

                itemView.context.startActivity(intent1)
            }
        }

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.moview_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = title[position]
        holder.imageView.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return quantity
    }
}

