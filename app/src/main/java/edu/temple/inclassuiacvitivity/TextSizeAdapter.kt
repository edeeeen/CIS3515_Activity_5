package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val objects: Array<Int> ) : BaseAdapter() {

    override fun getCount(): Int {
        return objects.size;
    }

    override fun getItem(position: Int): Any {
        return objects[position];
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView;

        if(convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context);
        }


        textView.text = objects[position].toString()
        textView.textSize = 22.toFloat();
        textView.setPadding(20, 20, 20, 20);

        return textView

    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val textView: TextView;

        if(convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context);
        }
        textView.text = objects[position].toString()
        textView.textSize = objects[position].toFloat()
        textView.setPadding(20, 20, 20, 20);

        return textView
    }

}