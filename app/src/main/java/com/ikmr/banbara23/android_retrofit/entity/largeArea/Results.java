package com.ikmr.banbara23.android_retrofit.Entity.largeArea;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//@Generated("org.jsonschema2pojo")
public class Results implements Serializable {

    @SerializedName("results_start")
    @Expose
    private Integer resultsStart;
    @SerializedName("results_returned")
    @Expose
    private String resultsReturned;
    @SerializedName("api_version")
    @Expose
    private String apiVersion;
    @SerializedName("results_available")
    @Expose
    private Integer resultsAvailable;
    @SerializedName("large_area")
    @Expose
    private List<LargeArea_> largeArea = new ArrayList<LargeArea_>();

    /**
     * @return The resultsStart
     */
    public Integer getResultsStart() {
        return resultsStart;
    }

    /**
     * @param resultsStart The results_start
     */
    public void setResultsStart(Integer resultsStart) {
        this.resultsStart = resultsStart;
    }

    /**
     * @return The resultsReturned
     */
    public String getResultsReturned() {
        return resultsReturned;
    }

    /**
     * @param resultsReturned The results_returned
     */
    public void setResultsReturned(String resultsReturned) {
        this.resultsReturned = resultsReturned;
    }

    /**
     * @return The apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * @param apiVersion The api_version
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * @return The resultsAvailable
     */
    public Integer getResultsAvailable() {
        return resultsAvailable;
    }

    /**
     * @param resultsAvailable The results_available
     */
    public void setResultsAvailable(Integer resultsAvailable) {
        this.resultsAvailable = resultsAvailable;
    }

    /**
     * @return The largeArea
     */
    public List<LargeArea_> getLargeArea() {
        return largeArea;
    }

    /**
     * @param largeArea The large_area
     */
    public void setLargeArea(List<LargeArea_> largeArea) {
        this.largeArea = largeArea;
    }

    @Override
    public String toString() {
        return "Results{" +
                "resultsStart=" + resultsStart +
                ", resultsReturned='" + resultsReturned + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                ", resultsAvailable=" + resultsAvailable +
                ", largeArea=" + largeArea +
                '}';
    }
}