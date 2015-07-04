package com.ikmr.banbara23.android_retrofit.Entity.largeArea;

/**
 * Created by banbara23 on 15/07/04.
 */

import com.google.gson.annotations.Expose;

//@Generated("org.jsonschema2pojo")
public class ServiceArea {

    @Expose
    private String name;
    @Expose
    private String code;

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The code
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     * The code
     */
    public void setCode(String code) {
        this.code = code;
    }

}