package com.example

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.concurrent.TimeUnit

class retrofit {

    object RetrofitClient {
        private var retrofit: Retrofit? = null

        /* Converter Factory to convert your Json to gson */ /* Converter Factory to convert your Xml to gson */
        val client: Retrofit?
            get() {
//                if (retrofit == null) {
//                    val cookieManager = CookieManager()
//                    cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL)
//                    val logging = HttpLoggingInterceptor()
//                    logging.setLevel(HttpLoggingInterceptor.Level.BODY)
//                    val oktHttpClient: OkHttpClient.Builder = OkHttpClient.Builder()
//                        .connectTimeout(connection_time_in_min, TimeUnit.MINUTES)
//                        .writeTimeout(write_time_in_min, TimeUnit.MINUTES)
//                        .readTimeout(read_time_in_min, TimeUnit.MINUTES)
//                        .cookieJar(JavaNetCookieJar(cookieManager))
//                    oktHttpClient.addInterceptor(logging)
//                    retrofit = Retrofit.Builder()
//                        .baseUrl(your_base_url)
//                        .addConverterFactory(GsonConverterFactory.create()) /* Converter Factory to convert your Json to gson */
//                        .addConverterFactory(SimpleXmlConverterFactory.create()) /* Converter Factory to convert your Xml to gson */
//                        .client(oktHttpClient.build())
//                        .build()
//                }
                return retrofit
            }
    }
}