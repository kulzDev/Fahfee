package com.example.fah_fee.model;

public class BetTime {
    private String cutOffTime;
    private String betTime;

    public BetTime(String cutOffTime, String betTime) {
        this.cutOffTime = cutOffTime;
        this.betTime = betTime;
    }

    public String getCutOffTime() {
        return cutOffTime;
    }

    public void setCutOffTime(String cutOffTime) {
        this.cutOffTime = cutOffTime;
    }

    public String getBetTime() {
        return betTime;
    }

    public void setBetTime(String betTime) {
        this.betTime = betTime;
    }
}
