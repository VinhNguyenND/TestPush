package com.example.material_tester.Ui.Activities.bottomBar_nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.view.get
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.material_tester.Cororutine.DictionaryInterface
import com.example.material_tester.Cororutine.Model.Dictionary
import com.example.material_tester.R
import com.example.material_tester.databinding.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.launch
import okhttp3.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

class MainActivity2 : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var binding:ActivityMain3Binding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var view1:Layout1Binding
    private lateinit var view2:Layout2Binding
    private lateinit var view3:Layout3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        getNowFragment()
        event()
        view1.toast1.setOnClickListener {
            Toast.makeText(this,"hello text 1",Toast.LENGTH_LONG).show()
        }
        GlobalScope.launch(Dispatchers.IO){
        callTextToSpeech("Các lựa chọn của bạn về nhật ký, quảng cáo và hoạt động cá nhân hóa. Xem lại những nội dung bạn đã tìm kiếm, đọc và xem cũng như xem những nơi bạn từng đến."
        ,"76373408e2mshdd1b501acbcbf46p1b09c4jsn6300c60e03f5"
        ,"text-to-speech27.p.rapidapi.com"
        )
        }
        get()
    }
    private fun init(){
        navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController=navHostFragment.navController
        appBarConfiguration= AppBarConfiguration(setOf(R.id.home_Fragment_id,R.id.search_Fragment,R.id.profile_Fragment))
        setupActionBarWithNavController(navController,appBarConfiguration)
        findViewById<BottomNavigationView>(R.id.bottom_app_bar_main).setupWithNavController(navController)
        view1= Layout1Binding.inflate(layoutInflater,binding.viewFlipper,false)
        view2= Layout2Binding.inflate(layoutInflater,binding.viewFlipper,false)
        view3= Layout3Binding.inflate(layoutInflater,binding.viewFlipper,false)
//        binding.viewFlipper.addView(view1.root)
//        binding.viewFlipper.addView(view2.root)
//        binding.viewFlipper.addView(view3.root)
    }
    private fun getNowFragment(){
        val navController = findNavController(R.id.nav_host_fragment)
        val destinationChangedListener = NavController.OnDestinationChangedListener { _, destination, _ ->
            when (destination.label) {
                "fragment_blank3"->{
                    val index = indexOfChildById(R.layout.fragment_blank3)
                    binding.viewFlipper.displayedChild = 0
                }
                "fragment_blank2"->{
                    val index = indexOfChildById(R.layout.fragment_blank2)
                    binding.viewFlipper.displayedChild = 1
                }
                "fragment_blank1"->{
                    val index = indexOfChildById(R.layout.fragment_blank1)
                    binding.viewFlipper.displayedChild = 2
                }
                else -> "Invalid day"
            }
        }
        navController.addOnDestinationChangedListener(destinationChangedListener)
    }

    private fun indexOfChildById(layoutId: Int): Int {
        for (i in 0 until binding.viewFlipper.childCount) {
            val child = binding.viewFlipper.getChildAt(i)
            if (child.id == layoutId) {
                return i
            }
        }
        return -1
    }

    private fun event(){
//        view1.toast1.setOnClickListener {
//            Toast.makeText(this,"hello text 1",Toast.LENGTH_LONG).show()
//            Log.d("hellllllllllllllollolo:...",view1.toast1.text.toString())
//        }
//        view2.toast2.setOnClickListener {
//            Toast.makeText(this,"hello text 2",Toast.LENGTH_LONG).show()
//            Log.d("hellllllllllllllollolo:...",view2.toast2.text.toString())
//        }
//        view3.toast3.setOnClickListener {
//            Toast.makeText(this,"hello text 3",Toast.LENGTH_LONG).show()
//              Log.d("hellllllllllllllollolo:...",view3.toast3.text.toString())
//        }
        val a=findViewById<Button>(R.id.toast1)
        a.setOnClickListener {
            Toast.makeText(this,"hello "+view1.toast1.text.toString(),Toast.LENGTH_LONG).show()
            Log.d("hellllllllllllllollolo:...",view1.toast1.text.toString())
        }
    }
    private suspend fun callTextToSpeech(text: String,apiKey:String,apiHost:String){
        val client = OkHttpClient()
        val request =  Request.Builder()
            .url("https://text-to-speech27.p.rapidapi.com/speech?text=$text&lang=en-us")
            .get()
            .addHeader("X-RapidAPI-Key", apiKey)
            .addHeader("X-RapidAPI-Host", apiHost)
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }
            override fun onResponse(call: Call, response: Response) {
                response.body()?.toString()?.let { Log.d("nhan ve", it) }
            }
        })
    }
private  fun get(){
val retrofit =  Retrofit.Builder()
    .baseUrl("https://api.dictionaryapi.dev/api/v2/entries/en/")
    .addConverterFactory(GsonConverterFactory.create())
    .build();
  val  service = retrofit.create(DictionaryInterface::class.java)
  service.listWord("hello").enqueue(object:retrofit2.Callback<List<Dictionary>>{
      override fun onResponse(
          call: retrofit2.Call<List<Dictionary>>,
          response: retrofit2.Response<List<Dictionary>>
      ) {
          if(response.isSuccessful){
              response.body()?.let {
                  for(doc in it){
                      Log.d("du lieu lay ve tu dictionary api:",doc.toString())
                  }
              }
          }
      }

      override fun onFailure(call: retrofit2.Call<List<Dictionary>>, t: Throwable) {
          TODO("Not yet implemented")
      }

  })
}
}