package com.example.material_tester.Cororutine

import android.util.Log
import com.example.material_tester.Cororutine.Model.Dictionary
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


data class MyObject(val result1: String?, val result2: String?, val result3: String?,
                   val result4: String?, val result5: String?, val result6: String?,
                   val result7: String?, val result8: String?, val result9: String?)
suspend fun fetchDataAsync(param: String, delayTime: Long): String? {
    return withTimeoutOrNull(6000) {
        // Điều này giả sử bạn có một hàm lấy dữ liệu từ API, bạn có thể sử dụng async để gọi nó
        delay(delayTime) // Sử dụng thời gian delay được truyền vào
        "Result for $param"
    }
}
suspend fun fetchAllData(): MyObject = coroutineScope {
    val paramList = listOf("param1", "param2", "param3", "param4", "param5", "param6", "param7", "param8", "param9")
    val delayTimes = listOf(1000L, 2000L, 3000L, 500L, 4000L, 1000L, 2000L, 3000L, 500L)    // Sử dụng async để bắt đầu các lời gọi API một cách song song
    val deferredResults = paramList.mapIndexed { index, param ->
        async {
            fetchDataAsync(param, delayTimes[index])
        }
    }
    // Chờ tất cả các lời gọi hoàn tất và lấy kết quả
    MyObject(
        result1 = deferredResults[0].await(),
        result2 = deferredResults[1].await(),
        result3 = deferredResults[2].await(),
        result4 = deferredResults[3].await(),
        result5 = deferredResults[4].await(),
        result6 = deferredResults[5].await(),
        result7 = deferredResults[6].await(),
        result8 = deferredResults[7].await(),
        result9 = deferredResults[8].await()
    )
}
private suspend fun get(){
val retrofit =  Retrofit.Builder()
    .baseUrl("https://api.dictionaryapi.dev/api/v2/entries/en/")
    .addConverterFactory(GsonConverterFactory.create())
    .build();
  val  service = retrofit.create(DictionaryInterface::class.java)
  service.listWord("hello").enqueue(object :Callback<List<Dictionary>>{
      override fun onResponse(call: Call<List<Dictionary>>, response: Response<List<Dictionary>>) {
          if(response.isSuccessful){
              response.body()?.let {
                  for(doc in it){
                      Log.d("du lieu lay ve tu dictionary api:",doc.toString())
                  }
              }
          }
      }
      override fun onFailure(call: Call<List<Dictionary>>, t: Throwable) {
          TODO("Not yet implemented")
      }
  })
}

//fun main() = runBlocking {
////    val myObject = fetchAllData()
////    println(myObject)
// get()
//}
