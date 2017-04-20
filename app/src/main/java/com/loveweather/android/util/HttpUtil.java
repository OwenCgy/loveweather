package com.loveweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**和服务器进行交换
 * Created by sy on 2017/4/16.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
