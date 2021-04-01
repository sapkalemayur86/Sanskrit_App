package com.example.android.sanskrit;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mycontext;
    public SimpleFragmentPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mycontext=context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new ColorsFragment();
        } else if(position==2){
            return new FamilyFragment();
        }else {
            return  new PhrasesFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mycontext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mycontext.getString(R.string.category_colors);
        } else if (position == 2) {
            return mycontext.getString(R.string.category_family);
        } else {
            return mycontext.getString(R.string.category_phrases);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
