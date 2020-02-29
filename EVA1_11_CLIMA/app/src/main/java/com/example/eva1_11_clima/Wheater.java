package com.example.eva1_11_clima;

public class Wheater {

    /* Ciudad String
     * Temp int
     * Descripcion String
     * Imagen int */

    private String City;
    private int Temp;
    private String desc;
    private int image;

    public Wheater(String city, int temp, String desc, int image) {
        City = city;
        Temp = temp;
        this.desc = desc;
        this.image = image;
    }

    public String getCity() {
        return City;
    }

    public int getTemp() {
        return Temp;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}



