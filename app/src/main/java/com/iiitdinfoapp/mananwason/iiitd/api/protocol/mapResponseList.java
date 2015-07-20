package com.iiitdinfoapp.mananwason.iiitd.api.protocol;

import com.google.gson.annotations.SerializedName;
import com.iiitdinfoapp.mananwason.iiitd.Model.Map;

import java.util.List;

/**
 * Created by MananWason on 20-07-2015.
 */
public class mapResponseList {
    @SerializedName("map")
    public List<Map> maps;
}
