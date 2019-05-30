package com.example.fah_fee.model;

public class PlayNumber {

    private int image;
    private String number;

    public PlayNumber(int image, String number) {
        this.image = image;
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
