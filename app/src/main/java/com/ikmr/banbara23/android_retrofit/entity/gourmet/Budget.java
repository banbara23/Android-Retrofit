package com.ikmr.banbara23.android_retrofit.Entity.gourmet;

import com.google.gson.annotations.Expose;

/**
 * Created by banbara23 on 15/07/05.
 */
public class Budget {

    @Expose
    private String average;
    @Expose
    private String name;
    @Expose
    private String code;

    /**
     * @return The average
     */
    public String getAverage() {
        return average;
    }

    /**
     * @param average The average
     */
    public void setAverage(String average) {
        this.average = average;
    }

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