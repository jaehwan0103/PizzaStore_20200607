package kr.ptus.pizzastore_20200607.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kr.ptus.pizzastore_20200607.R
import kr.ptus.pizzastore_20200607.data.PizzaStore
import java.util.ArrayList
import java.util.zip.Inflater

class PizzaAdapter(context: Context, resId: Int, list: List<PizzaStore>) : ArrayAdapter<PizzaStore>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {

            tempRow = inf.inflate(R.layout.pizza_list_item, null)

        }

        val row = tempRow!!

        val pizzaLogo = row.findViewById<ImageView>(R.id.pizzaLogo)
        val storeName = row.findViewById<TextView>(R.id.pizzaNameTxt)

        val data = mList[position]

        storeName.text = data.name
        Glide.with(mContext).load(data.logoUrl).into(pizzaLogo)


        return row

    }


}