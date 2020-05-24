package com.example.android.fmusicstructure;

public class Music {
    private String title;
    private String artist;

    public Music(String t,String a){
        title = t;
        artist =a;
    }
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
}
