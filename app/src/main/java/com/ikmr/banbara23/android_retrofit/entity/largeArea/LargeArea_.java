package com.ikmr.banbara23.android_retrofit.Entity.largeArea;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by banbara23 on 15/07/04.
 */
public class LargeArea_ {

    @SerializedName("service_area")
    @Expose
    private ServiceArea serviceArea;
    @SerializedName("large_service_area")
    @Expose
    private LargeServiceArea largeServiceArea;
    @Expose
    private String name;
    @Expose
    private String code;

    /**
     * @return The serviceArea
     */
    public ServiceArea getServiceArea() {
        return serviceArea;
    }

    /**
     * @param serviceArea The service_area
     */
    public void setServiceArea(ServiceArea serviceArea) {
        this.serviceArea = serviceArea;
    }

    /**
     * @return The largeServiceArea
     */
    public LargeServiceArea getLargeServiceArea() {
        return largeServiceArea;
    }

    /**
     * @param largeServiceArea The large_service_area
     */
    public void setLargeServiceArea(LargeServiceArea largeServiceArea) {
        this.largeServiceArea = largeServiceArea;
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
