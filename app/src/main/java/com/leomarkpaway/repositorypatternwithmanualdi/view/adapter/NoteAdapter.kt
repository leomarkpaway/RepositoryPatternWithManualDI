package com.leomarkpaway.repositorypatternwithmanualdi.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.leomarkpaway.repositorypatternwithmanualdi.R
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.entity.Note


class NoteAdapter(private val items: List<Note>) : RecyclerView.Adapter<NoteAdapter.NoteHolder>() {

    inner class NoteHolder(private val view: View) :  RecyclerView.ViewHolder(view) {
        fun bind(note: Note) {
            val title = view.findViewById<TextView>(R.id.tv_title)
            title.text = note.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteAdapter.NoteHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_note, parent, false)
        return NoteHolder(view)
    }

    override fun onBindViewHolder(holder: NoteAdapter.NoteHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount() = items.size

}