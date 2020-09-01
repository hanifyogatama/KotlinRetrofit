package com.binar.kotlinretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binar.kotlinretrofit.pojo.GetPersonsResponse
import kotlinx.android.synthetic.main.person_item.view.*

class PersonAdapter(val listPerson: List<GetPersonsResponse.Result>) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.person_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_id.text = listPerson[position].iD.toString()
        holder.itemView.tv_firstname.text = listPerson[position].firstName
        holder.itemView.tv_lastname.text = listPerson[position].lastName
        holder.itemView.tv_created_at.text = listPerson[position].createdAt
        holder.itemView.tv_updated_at.text = listPerson[position].updatedAt
        holder.itemView.tv_deleted_at.text = "${listPerson[position].deletedAt} "
    }

    override fun getItemCount(): Int {
        return listPerson.size
    }

}