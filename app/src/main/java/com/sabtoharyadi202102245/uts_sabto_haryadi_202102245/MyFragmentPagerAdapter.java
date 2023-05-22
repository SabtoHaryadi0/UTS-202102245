package com.sabtoharyadi202102245.uts_sabto_haryadi_202102245;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private WebInternalFragment _webinternalFragment = new WebInternalFragment();

    private Context _context;
    private WebResmiFragment _webresmiFragment = new WebResmiFragment();
    private int _tabcount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabcount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return _webresmiFragment;
            default:
                return _webinternalFragment;
        }}

    @Override
    public int getCount()
    {
        return _tabcount;
    }
}
