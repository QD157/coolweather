package com.example.wyf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WYF on 2017/2/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
