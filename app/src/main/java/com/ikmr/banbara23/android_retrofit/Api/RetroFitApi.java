package com.ikmr.banbara23.android_retrofit.Api;

import com.ikmr.banbara23.android_retrofit.Entity.largeArea.LargeArea;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * REST通信のコールバック
 */
public interface RetroFitApi {

    static final String key = "86b2c7035911964c";
    static final String format = "json";

    /**
     * アノテーションでGET/POST/PUT/DELETEを指定。
     * カッコ内はリクエストのホスト部以降を指定。
     * <p/>
     * 戻り型をvoidとすることで勝手に別スレッドで通信処理を行ってくれる。
     * <p/>
     * メソッドの引数とアノテーションの組み合わせで
     * リクエストパラメータを生成する。
     * 下記の例では?name="hoge"が付与される
     * <p/>
     * コールバックにPOJOのオブジェクトを指定するとPOJO変換してくれる。
     */
    @GET("/hotpepper/large_area/v1?key=86b2c7035911964c&format=json")
    void getLargeArea(Callback<LargeArea> cb);

    @GET("/hotpepper/gourmet/v1?key=86b2c7035911964c&format=json&large_area=Z011")
    void getGourmet(Callback<LargeArea> cb);
}