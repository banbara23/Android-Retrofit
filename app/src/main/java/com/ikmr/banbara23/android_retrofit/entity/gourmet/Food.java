package com.ikmr.banbara23.android_retrofit.Entity.gourmet;

import com.google.gson.annotations.Expose;

/**
 * Created by banbara23 on 15/07/05.
 */
public class Food {

    @Expose
    private String name;
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
