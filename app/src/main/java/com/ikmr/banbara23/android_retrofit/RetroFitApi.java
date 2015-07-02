package com.ikmr.banbara23.android_retrofit;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * REST通信のコールバック
 */
public interface RetroFitApi {

    /**
     * アノテーションでGET/POST/PUT/DELETEを指定。
     * カッコ内はリクエストのホスト部以降を指定。
     *
     * 戻り型をvoidとすることで勝手に別スレッドで通信処理を行ってくれる。
     *
     * メソッドの引数とアノテーションの組み合わせで
     * リクエストパラメータを生成する。
     * 下記の例では?name="hoge"が付与される
     *
     * コールバックにPOJOのオブジェクトを指定するとPOJO変換してくれる。
     */
    @GET("/news/new")
    void getNew(@Query("name") String name, Callback<ArticleList> cb);
}