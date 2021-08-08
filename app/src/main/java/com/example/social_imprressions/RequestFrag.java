package com.example.social_imprressions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RequestFrag extends Fragment {

    RecyclerView requestRv;
    ArrayList<com.example.socialimpressions.NotificationModel> list;

    public RequestFrag() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_request, container, false);

        requestRv = view.findViewById(R.id.requestRecyclerView);

        list = new ArrayList<>();
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.nature,"<b>Alicia Addams</b> Send you a friend request","just now"));
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.deaf,"<b>Janeeleona</b> Send you a friend request","40 minutes ago"));
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.cover,"<b>Katherinn</b> Suggested for you","2 hours"));
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.dennis,"<b>Alicia Addams</b> Send you a friend request","3 hours"));
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.profile,"<b>Janeeleona</b> Suggested for you","3 hours"));
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.nature1,"<b>Alicia Addams</b> Send you a friend request","3 hours"));
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.hipster,"<b>Alicia Addams</b> Send you a friend request","3 hours"));
        list.add(new com.example.socialimpressions.NotificationModel(R.drawable.art,"<b>Alicia Addams</b> Send you a friend request","3 hours"));


        com.example.socialimpressions.NotificationAdapter adapter = new com.example.socialimpressions.NotificationAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        requestRv.setLayoutManager(layoutManager);
        requestRv.setNestedScrollingEnabled(false);
        requestRv.setAdapter(adapter);

        return view;
    }
}