package com.example.criminalintent;

import java.util.UUID;

/**
 * Created by yongchao on 2016/5/29.
 */
public class Crime {
    private UUID  mid;
    private  String title;
    public Crime(){
        mid = UUID.randomUUID();
    }

    public UUID getMid() {
        return mid;
    }

    public String getTitle() {
        return title;
    }

    public void setMid(UUID mid) {
        this.mid = mid;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
