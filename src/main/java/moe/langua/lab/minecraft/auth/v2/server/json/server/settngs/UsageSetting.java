package moe.langua.lab.minecraft.auth.v2.server.json.server.settngs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsageSetting {

    public static UsageSetting get(long limitPerCircle,long circleInMillisecond){
        UsageSetting settingInstance = new UsageSetting();
        settingInstance.limitPerCircle = limitPerCircle;
        settingInstance.circleInMillisecond = circleInMillisecond;
        return settingInstance;
    }

    @SerializedName("limitPerCircle")
    @Expose
    private Long limitPerCircle;
    @SerializedName("circleInMillisecond")
    @Expose
    private Long circleInMillisecond;

    public Long getLimitPerCircle() {
        return limitPerCircle;
    }

    public Long getCircleInMillisecond() {
        return circleInMillisecond;
    }

}