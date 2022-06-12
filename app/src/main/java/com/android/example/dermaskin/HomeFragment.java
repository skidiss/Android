package com.android.example.dermaskin;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
    Button homejerawat, homeeksim, homeherpes, homealergi, homepsoriasis, homeinfeksi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button homejerawat = (Button) v.findViewById(R.id.homejerawat);
        Button homeeksim = (Button) v.findViewById(R.id.homeeksim);
        Button homeherpes = (Button) v.findViewById(R.id.homeherpes);
        Button homealergi = (Button) v.findViewById(R.id.homealergi);
        Button homepsoriasis = (Button) v.findViewById(R.id.homepsoriasis);
        Button homeinfeksi = (Button) v.findViewById(R.id.homeinfeksi);
        homejerawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homejerawat = new Intent(getActivity(),Jerawat.class);
                startActivity(homejerawat);
            }
        });
        homeeksim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeeksim = new Intent(getActivity(),Eksim.class);
                startActivity(homeeksim);
            }
        });
        homeherpes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeherpes = new Intent(getActivity(),Herpes.class);
                startActivity(homeherpes);
            }
        });
        homealergi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homealergi = new Intent(getActivity(),AlergiKulit.class);
                startActivity(homealergi);
            }
        });
        homepsoriasis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homepsoriasis = new Intent(getActivity(),Psoriasis.class);
                startActivity(homepsoriasis);
            }
        });
        homeinfeksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeinfeksi = new Intent(getActivity(),InfeksiKulit.class);
                startActivity(homeinfeksi);
            }
        });
        return v;

    }
}
