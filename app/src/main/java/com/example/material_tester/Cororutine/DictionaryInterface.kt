package com.example.material_tester.Cororutine

import com.example.material_tester.Cororutine.Model.Dictionary
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryInterface {
 @GET("{Word}")
  fun listWord(@Path("Word")  word:String): Call<List<Dictionary>>;
}