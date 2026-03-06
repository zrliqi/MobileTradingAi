package com.tradingai.app.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tradingai.app.databinding.ItemCourseBinding
import com.tradingai.app.models.Course

class CourseAdapter(private val courses: List<Course>) :
    RecyclerView.Adapter<CourseAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemCourseBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCourseBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = courses[position]
        holder.binding.apply {
            tvCourseTitle.text = course.title
            tvCourseDescription.text = course.description
            
            // Timeline visibility
            viewTopLine.visibility = if (position == 0) View.INVISIBLE else View.VISIBLE
            viewBottomLine.visibility = if (position == itemCount - 1) View.INVISIBLE else View.VISIBLE

            // Format topics as bullet points
            if (course.topics.isNotEmpty()) {
                val bulletPoints = course.topics.joinToString("\n") { "• $it" }
                tvCourseTopics.text = bulletPoints
                tvCourseTopics.visibility = View.VISIBLE
                tvTopicsLabel.visibility = View.VISIBLE
            } else {
                tvCourseTopics.visibility = View.GONE
                tvTopicsLabel.visibility = View.GONE
            }
            
            btnWatchVideo.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(course.videoUrl))
                it.context.startActivity(intent)
            }
            
            btnReadDoc.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(course.docLink))
                it.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount() = courses.size
}
