package com.goldencarp.lingqianbao.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goldencarp.lingqianbao.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CacheFragment extends Fragment {


    public CacheFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cache, container, false);
    }

}
