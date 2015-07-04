package com.ikmr.banbara23.android_retrofit.Listener;

import retrofit.RetrofitError;

/**
 * REST通信のコールバックに利用するinterface
 */
public interface RequestListener<T> {
    void onSuccess(T response);

    void onFailure(RetrofitError error);
}
