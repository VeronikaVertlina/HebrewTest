package com.example.quiztestapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hebrewtest.R;

public class RankingFragment extends Fragment {
    //View myFragment;

    static RankingFragment newInstance() {
        RankingFragment rankingFragment;
        rankingFragment = new RankingFragment();
        return rankingFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View myFragment;
        myFragment = inflater.inflate(R.layout.fragment_ranking, container, false);

        return myFragment;
    }
}
