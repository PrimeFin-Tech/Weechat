package org.telegram.http;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("api/proxy/")
    Call<Reception> getCall();
}
