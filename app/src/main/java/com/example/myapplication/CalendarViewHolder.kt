package com.example.myapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class CalendarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val titleTextView: TextView = itemView.findViewById(R.id.txtTitle)
    private val descriptionTextView: TextView = itemView.findViewById(R.id.txtSubTitle)
    private val dateTextView: TextView = itemView.findViewById(R.id.txtHora)
    private val constraint: ConstraintLayout = itemView.findViewById(R.id.constraint)
    private val btnCheck: ImageView = itemView.findViewById(R.id.imgCheck)

    fun bind(event: Event) {
        var color = false
        titleTextView.text = event.title
        descriptionTextView.text = event.description
        dateTextView.text = event.date
        btnCheck.setOnClickListener {
            color = if(color) {
                constraint.setBackgroundColor(itemView.resources.getColor(R.color.white))
                !color
            }else {
                constraint.setBackgroundColor(itemView.resources.getColor(event.colorBackground))
                !color
            }
        }
    }
}
