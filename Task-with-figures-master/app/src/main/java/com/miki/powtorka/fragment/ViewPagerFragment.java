package com.miki.powtorka.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miki.powtorka.R;


public class ViewPagerFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        ViewPager viewPager = (ViewPager) inflater.inflate(R.layout.pager_titles, container, false);
        viewPager.setAdapter(new MyAdapter(getFragmentManager(), new FragmentFactory() {
            @Override
            public Fragment create() {
                return new FragmentTriangle();
            }
        }, new FragmentFactory() {
            @Override
            public Fragment create() {
                return new FragmentRectangle();
            }
        }, new FragmentFactory() {
            @Override
            public Fragment create() {
                return new FragmentCircle();
            }
        }));
        return viewPager;
    }

    private class MyAdapter extends FragmentPagerAdapter {

        public final FragmentFactory[] factories;
        public final int[] names = {R.string.Triangle, R.string.Rectangle, R.string.Circle};

        public MyAdapter(FragmentManager fm, FragmentFactory... factories) {
            super(fm);
            this.factories = factories;
        }

        @Override
        public Fragment getItem(int position) {
            return factories[position].create();
        }

        @Override
        public int getCount() {
            return factories.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return getString(names[position]);
        }
    }

    public interface FragmentFactory {
        Fragment create();
    }


}
