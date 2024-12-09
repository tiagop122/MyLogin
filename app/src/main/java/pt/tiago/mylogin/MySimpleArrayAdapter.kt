package pt.tiago.mylogin

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MySimpleArrayAdapter (context: Context, resource: Int, objects: MutableList<String>) :
    ArrayAdapter<String>(context, resource, objects){

        var mContext: Context
        var mValues: MutableList<String>
        var mResource: Int

init {
    mContext = context
    mValues = objects
    mResource = resource
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(mContext)
        val rowView = inflater.inflate(mResource, parent,false)

        val textView = rowView.findViewById<TextView>(R.id.item_text)
        val str = mValues.get(position)

        textView.text = str

        return rowView
    }
}