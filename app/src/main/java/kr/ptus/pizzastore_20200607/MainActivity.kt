package kr.ptus.pizzastore_20200607

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pizza_list_item.*
import kr.ptus.pizzastore_20200607.adapter.PizzaAdapter
import kr.ptus.pizzastore_20200607.data.PizzaStore

class MainActivity : BaseActivity() {

    val pizzaStoreList = ArrayList<PizzaStore>()
    lateinit var mPizzaAdapter : PizzaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValuse()

    }

    override fun setupEvents() {

        listViewTxt.setOnItemClickListener{parent, view, position, id ->

            val clickedStore = pizzaStoreList[position]

            val myIntent = Intent(mContext, PizzaStoreDetailActivity::class.java)
            myIntent.putExtra("store",clickedStore)
            startActivity(myIntent)

        }

    }

    override fun setValuse() {
        addStores()
        mPizzaAdapter = PizzaAdapter(mContext, R.layout.pizza_list_item, pizzaStoreList)

        listViewTxt.adapter = mPizzaAdapter

    }
    fun  addStores(){
        pizzaStoreList.add(PizzaStore("피자헛", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg", "1588-5588"))
        pizzaStoreList.add(PizzaStore("파파존스", "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800", "1577-8080"))
        pizzaStoreList.add(PizzaStore("미스터피자", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200", "1577-0077"))
        pizzaStoreList.add(PizzaStore("도미노피자", "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png", "1577-3082"))
    }

}
