package com.paladino.favores.presentation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.paladino.favores.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link VoluntariosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VoluntariosFragment extends Fragment {
    public VoluntariosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment VoluntariosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VoluntariosFragment newInstance() {
        VoluntariosFragment fragment = new VoluntariosFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_voluntarios, container, false);
    }
}
