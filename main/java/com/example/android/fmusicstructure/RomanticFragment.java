package com.example.android.fmusicstructure;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RomanticFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_romantic, container, false);
        ArrayList<Music> musics=new ArrayList<Music>();
        musics.add(new Music("Love Me Like You Do","Ellie Goulding"));
        musics.add(new Music("Senorita","Camila Cabello,Shawn Mendes"));
        musics.add(new Music("Crowded Room","Selena Gomez"));
        musics.add(new Music("Lover","Taylor Swift"));

        MusicAdapter musicAdapter = new MusicAdapter(getContext(),musics);

        ListView listView  =(ListView) view.findViewById(R.id.romanticList);
        listView.setAdapter(musicAdapter);

        return view;
    }


}
