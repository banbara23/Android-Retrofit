package com.ikmr.banbara23.android_retrofit.Entity.gourmet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by banbara23 on 15/07/05.
 */
public class Genre {

    @Expose
    private String name;
    @SerializedName("catch")
    @Expose
    private String _catch;
    @Expose
    private String code;

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The _catch
     */
    public String getCatch() {
        return _catch;
    }

    /**
     * @param _catch The catch
     */
    public void setCatch(String _catch) {
        this._catch = _catch;
    }

    /**
     * @return The code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(String code) {
        this.code = code;
    }

}