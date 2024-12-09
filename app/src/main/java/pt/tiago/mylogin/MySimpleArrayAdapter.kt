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
        var rowView : View = convertView ?: inflater.inflate(mResource, parent, false)


        if (convertView == null){
            rowView.tag = MyViewHolder(rowView)
        }

        val vh = rowView.tag as MyViewHolder

        val str = mValues.get(position)
        vh.tv?.text = str

            return rowView
    }
}

private class MyViewHolder (view: View?){

    val tv = view?.findViewById<TextView>(R.id.item_text)
}