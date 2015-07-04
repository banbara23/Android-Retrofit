package com.ikmr.banbara23.android_retrofit.Entity.gourmet;

import com.google.gson.annotations.Expose;

/**
 * Created by banbara23 on 15/07/05.
 */
public class Urls {

    @Expose
    private String qr;
    @Expose
    private String mobile;
    @Expose
    private String pc;

    /**
     *
     * @return
     * The qr
     */
    public String getQr() {
        return qr;
    }

    /**
     *
     * @param qr
     * The qr
     */
    public void setQr(String qr) {
        this.qr = qr;
    }

    /**
     *
     * @return
     * The mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     *
     * @param mobile
     * The mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     *
     * @return
     * The pc
     */
    public String getPc() {
        return pc;
    }

    /**
     *
     * @param pc
     * The pc
     */
    public void setPc(String pc) {
        this.pc = pc;
    }

}