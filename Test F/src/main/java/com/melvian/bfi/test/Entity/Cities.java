package com.melvian.bfi.test.Entity;

public class Cities {

    private String country;
    private String name;
    private String lat;
    private String lng;

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("country: ").append(country);
        sb.append(" name: ").append(name);
        return sb.toString();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    //    @Override
//    public String toString() {
//        return "Cities{" +
//                "country='" + country + '\'' +
//                ", name='" + name + '\'' +
//                ", lat='" + lat + '\'' +
//                ", lng='" + lng + '\'' +
//                '}';
//    }
}
