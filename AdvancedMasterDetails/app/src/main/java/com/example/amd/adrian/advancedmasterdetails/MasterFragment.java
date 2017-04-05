package com.example.amd.adrian.advancedmasterdetails;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**
 * Created by Adrian on 2017-03-29.
 */

public class MasterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master, container, false);
        final Button currencyCalculatorButton = (Button) view.findViewById(R.id.currencyCalculatorButton);
        Button investmentButton = (Button) view.findViewById(R.id.investmentButton);
        final MainActivity activity = (MainActivity) getActivity();

        currencyCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showCurrencyCalculator();
            }
        });
        investmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showInvestmentButton();
            }
        });
        return view;
    }
}
