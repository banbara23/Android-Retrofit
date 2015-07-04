package com.ikmr.banbara23.android_retrofit.Entity.gourmet;

import com.google.gson.annotations.Expose;

/**
 * Created by banbara23 on 15/07/05.
 */
public class Pc {

    @Expose
    private String l;
    @Expose
    private String m;
    @Expose
    private String s;

    /**
     * @return The l
     */
    public String getL() {
        return l;
    }

    /**
     * @param l The l
     */
    public void setL(String l) {
        this.l = l;
    }

    /**
     * @return The m
     */
    public String getM() {
        return m;
    }

    /**
     * @param m The m
     */
    public void setM(String m) {
        this.m = m;
    }

    /**
     * @return The s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s The s
     */
    public void setS(String s) {
        this.s = s;
    }

}