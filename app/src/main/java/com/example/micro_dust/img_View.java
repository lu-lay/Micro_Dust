package com.example.micro_dust;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface img_View {

    String BASE_URL = "http://openapi.airkorea.or.kr/";
    String ServiceKey = "4rAiAT9%2BYGzi7AdZmEuWDTQF1GZfPVCqGTMhEEyDtlD92BvCODH7Vt6uly8M%2F%2FMCplomUe%2B8W1QZqXEEEe%2B35w%3D%3D";

    @GET("openapi/services/rest/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty")
    Call<ResponseBody> getComment(@Query("stationName") String stationName, @Query("dataTerm") String dataTerm,
                                  @Query(value = "ServiceKey", encoded = true) String ServiceKey
            , @Query("_returnType") String _returnType);

}


