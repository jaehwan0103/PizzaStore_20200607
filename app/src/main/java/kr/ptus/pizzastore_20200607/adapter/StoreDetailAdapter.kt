package kr.ptus.pizzastore_20200607.adapter

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import kr.ptus.pizzastore_20200607.data.PizzaStore

class StoreDetailAdapter(context: Context, resId : Int, list : List<PizzaStore>) : ArrayAdapter<PizzaStore>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)







}