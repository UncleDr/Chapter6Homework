package com.bytedance.android.lesson.restapi.solution.newtork;

import com.bytedance.android.lesson.restapi.solution.bean.Feed;
import com.bytedance.android.lesson.restapi.solution.bean.FeedResponse;
import com.bytedance.android.lesson.restapi.solution.bean.PostVideoResponse;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * @author Xavier.S
 * @date 2019.01.17 20:38
 */
public interface IMiniDouyinService {
    @Multipart @POST("minidouyin/video") Call<PostVideoResponse> postVideo(@Part("student_id") RequestBody id,
                                                                @Part("user_name") RequestBody name,
                                                                @Part MultipartBody.Part cover_image,
                                                                @Part MultipartBody.Part video);
    @GET("minidouyin/feed") Call<FeedResponse> fetchFeed();

}
