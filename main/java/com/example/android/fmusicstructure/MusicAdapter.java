package com.example.android.fmusicstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(Context context, ArrayList<Music> musics) {
        super(context, 0, musics);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        View currentView = convertView;
        if(currentView==null){
            currentView = LayoutInflater.from(getContext()).inflate(R.layout.music_item,parent,false);
        }
        Music currentmusic = getItem(position);

        TextView musicTitle= (TextView) currentView.findViewById(R.id.musicTitle);

        musicTitle.setText(currentmusic.getTitle());
        TextView musicaArtist = (TextView) currentView.findViewById(R.id.musicArtist);
        musicaArtist.setText(currentmusic.getArtist());

        return currentView;

    }
}
