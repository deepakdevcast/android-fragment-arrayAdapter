package com.example.android.fmusicstructure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MusicStatePagerAdapter mMusicStatePagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
    }
    private void setupViewPager(ViewPager viewPager){
        MusicStatePagerAdapter adapter = new    MusicStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RomanticFragment(),"Romantic List");
        adapter.addFragment(new ClassicFragment(),"Classic List");
        viewPager.setAdapter(adapter);
    }
}
