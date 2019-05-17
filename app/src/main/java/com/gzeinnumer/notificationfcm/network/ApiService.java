package com.gzeinnumer.notificationfcm.network;



import com.gzeinnumer.notificationfcm.ResponseInsertToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseInsertToken> regisToken(@Field("Token") String Token);

}
