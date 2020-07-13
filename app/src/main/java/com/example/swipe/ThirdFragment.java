package com.example.swipe;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class ThirdFragment  extends Fragment {
    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments

    public static ThirdFragment newInstance(int page, String title) {
        ThirdFragment fragment = new ThirdFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment.setArguments(args);
        return fragment;
    }

    // Store instance variables based on arguments passed

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
        /*
        ImageButton btn_start_1 = (ImageButton) getActivity().findViewById(R.id.imageButton1);
        ImageButton btn_end_1 = (ImageButton) getActivity().findViewById(R.id.imageButton2);
        btn_start_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(new Intent(getActivity().getApplicationContext(), MusicService.class));

            }
        });

        btn_end_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(new Intent(getActivity().getApplicationContext(), MusicService.class));
            }
        });

        ImageButton btn_start_2 = (ImageButton) getActivity().findViewById(R.id.imageButton3);
        ImageButton btn_end_2 = (ImageButton) getActivity().findViewById(R.id.imageButton4);
        btn_start_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(new Intent(getActivity().getApplicationContext(), MusicService1.class));

            }
        });

        btn_end_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(new Intent(getActivity().getApplicationContext(), MusicService1.class));
            }
        });


        ImageButton btn_start_3 = (ImageButton) getActivity().findViewById(R.id.imageButton5);
        ImageButton btn_end_3 = (ImageButton) getActivity().findViewById(R.id.imageButton6);
        btn_start_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(new Intent(getActivity().getApplicationContext(), MusicService2.class));

            }
        });

        btn_end_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(new Intent(getActivity().getApplicationContext(), MusicService2.class));
            }
        });


        ImageButton btn_start_4 = (ImageButton) getActivity().findViewById(R.id.imageButton7);
        ImageButton btn_end_4 = (ImageButton) getActivity().findViewById(R.id.imageButton8);
        btn_start_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(new Intent(getActivity().getApplicationContext(), MusicService3.class));

            }
        });

        btn_end_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(new Intent(getActivity().getApplicationContext(), MusicService3.class));
            }
        });
        */

    }
}


    // Inflate the view for the fragment based on layout XML

    /*
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        ImageButton btn_start_1 = (ImageButton) view.findViewById(R.id.imageButton1);
        ImageButton btn_end_1 = (ImageButton) view.findViewById(R.id.imageButton2);

        btn_start_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(new Intent(getActivity().getApplicationContext(), MusicService.class));

            }
        });

        btn_end_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // getActivity().stopService(new Intent(getActivity().getApplicationContext(), MusicService.class));
            }
        });

        return view;
    }
}
*/
