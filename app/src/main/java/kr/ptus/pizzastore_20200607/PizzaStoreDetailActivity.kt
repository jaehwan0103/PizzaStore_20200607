package kr.ptus.pizzastore_20200607

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_pizza_store_detail.*
import kr.ptus.pizzastore_20200607.data.PizzaStore

class PizzaStoreDetailActivity : BaseActivity() {

    lateinit var mPizzaStore : PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_store_detail)
        setupEvents()
        setValuse()

    }


    override fun setupEvents() {


    }

    override fun setValuse() {

        mPizzaStore = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext).load(mPizzaStore.logoUrl).into(pizzaDetailLogo)
        pizzaStoreDetailName.text = mPizzaStore.name
        pizzaStoreDetailPhone.text = mPizzaStore.phoneNum

    }
}
