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


public class ClassicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_classic, container, false);
        ArrayList<Music> musics=new ArrayList<Music>();
        musics.add(new Music("What A Wonderfull","Louis Armstrong"));
        musics.add(new Music("It's Magic","Sarah Vaughan"));
        musics.add(new Music("Crowded Room","Selena Gomez"));

        MusicAdapter musicAdapter = new MusicAdapter(getContext(),musics);

        ListView listView  =(ListView) view.findViewById(R.id.classicList);
        listView.setAdapter(musicAdapter);

        return view;
    }

}
