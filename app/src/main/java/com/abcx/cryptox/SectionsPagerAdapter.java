package com.abcx.cryptox;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.abcx.cryptox.CaesarCypher.ccDecryption;
import com.abcx.cryptox.CaesarCypher.ccEncryption;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int mode) {
        switch (mode){
            case 0:
                ccEncryption ccEncryption = new ccEncryption();
                return ccEncryption;

            case 1:
                ccDecryption ccDecryption = new ccDecryption();
                return ccDecryption;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
