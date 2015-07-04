package com.ikmr.banbara23.android_retrofit.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ikmr.banbara23.android_retrofit.Api.RetroFitApi;
import com.ikmr.banbara23.android_retrofit.Callback.RequestCallback;
import com.ikmr.banbara23.android_retrofit.Entity.largeArea.LargeArea;
import com.ikmr.banbara23.android_retrofit.Listener.RequestListener;
import com.ikmr.banbara23.android_retrofit.R;

import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.converter.GsonConverter;


public class MainActivity extends AppCompatActivity {

    //http://webservice.recruit.co.jp/hotpepper/large_area/v1/?key=86b2c7035911964c&format=json

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        // デフォルトのアダプター(converter)はjson用
        // json以外の形式をサポートするには別途converterの実装が必要
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint("http://webservice.recruit.co.jp")
                .setConverter(new GsonConverter(gson))
                .build();
        RetroFitApi service = restAdapter.create(RetroFitApi.class);

        service.getLargeArea(new RequestCallback<>(new LargeAreaResponseListener()));
    }

    // コールバックリスナーの定義
    public class LargeAreaResponseListener implements RequestListener<LargeArea>, com.ikmr.banbara23.android_retrofit.Listener.ResponseListener {
        @Override
        public void onSuccess(LargeArea response) {
            Log.d("onSuccess", "onSuccess!!!");
            Log.d("onSuccess", response.toString());
        }

        @Override
        public void onFailure(RetrofitError error) {
            Log.d("rest", "onFailure!!!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
