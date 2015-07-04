package com.ikmr.banbara23.android_retrofit.Entity.gourmet;

import com.google.gson.annotations.Expose;

/**
 * Created by banbara23 on 15/07/05.
 */
public class Photo {

    @Expose
    private Mobile mobile;
    @Expose
    private Pc pc;

    /**
     * @return The mobile
     */
    public Mobile getMobile() {
        return mobile;
    }

    /**
     * @param mobile The mobile
     */
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    /**
     * @return The pc
     */
    public Pc getPc() {
        return pc;
    }

    /**
     * @param pc The pc
     */
    public void setPc(Pc pc) {
        this.pc = pc;
    }

}