package com.example.fah_fee.model;

public class PlayedNumbers {
    int image;
    String date;
    String numberPlayedPrevious;
    Boolean playStatus;
    String drawTime;

    public PlayedNumbers(int image, String date, String numberPlayedPrevious, Boolean playStatus, String drawTime) {
        this.image = image;
        this.date = date;
        this.numberPlayedPrevious = numberPlayedPrevious;
        this.playStatus = playStatus;
        this.drawTime = drawTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumberPlayedPrevious() {
        return numberPlayedPrevious;
    }

    public void setNumberPlayedPrevious(String numberPlayedPrevious) {
        this.numberPlayedPrevious = numberPlayedPrevious;
    }

    public Boolean getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(Boolean playStatus) {
        this.playStatus = playStatus;
    }

    public String getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(String drawTime) {
        this.drawTime = drawTime;
    }
}
