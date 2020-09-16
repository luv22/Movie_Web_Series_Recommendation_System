package com.example.android.filmyview;

import android.graphics.Bitmap;

import java.io.Serializable;

public class MData implements Serializable {

    private int mId;

    private String mName;

    private String releaseYear;

    private String plot;

    private Double rateing ;

   // private String[] cast ;

    private  String country ;

    private String language;

    private String trailerLink;

    private Bitmap poster;

    private boolean adult;

    public String getmName() {
        return mName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getPlot() {
        return plot;
    }

    public Double getRateing() {
        return rateing;
    }

   // public String[] getCast() {
     //   return cast;
   // }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public Bitmap getPoster() {
        return poster;
    }

    public boolean isAdult() {
        return adult;
    }

    public MData(String mName, String releaseYear, String plot, Double rateing,  String country, String language, String trailerLink, Bitmap poster, boolean adult,int mIdd) {

        this.mName = mName;
        this.releaseYear = releaseYear;
        this.plot = plot;
        this.rateing = rateing;
       // this.cast = cast;
        this.country = country;
        this.language = language;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.adult = adult;
        mId = mIdd;
    }

    public int getmId() {
        return mId;
    }
}
