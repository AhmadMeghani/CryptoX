package com.abcx.cryptox.CaesarCypher;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abcx.cryptox.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ceasarCypher extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;




    public ceasarCypher() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ceasar_cypher, container, false);



    }

}
