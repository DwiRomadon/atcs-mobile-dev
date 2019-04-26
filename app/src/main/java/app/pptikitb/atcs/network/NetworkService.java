package app.pptikitb.atcs.network;


import java.util.List;
import java.util.Map;

import app.pptikitb.atcs._common.CommonResponse;
import app.pptikitb.atcs.features.cctv.model.Cctvs;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

/**
 * Created by github.com/adip28 on 7/17/2018.
 */
public interface NetworkService {


    @GET("cctv")
    Call<List<Cctvs>> getCctvList();

}
