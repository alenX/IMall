package com.jn.sd.imall.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jn.sd.imall.R;


public class CatagoryFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactsLayout = inflater.inflate(R.layout.fragment_catagory,
                container, false);
        return contactsLayout;
    }

}
