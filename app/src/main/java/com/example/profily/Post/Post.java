package com.example.profily.Post;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.profily.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Post extends Fragment {


    public Post() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_post, container, false);

        if (getArguments() != null && getArguments().size()!=0)
        {
            String postId = PostArgs.fromBundle(getArguments()).getPostId();
        }
        return view;
    }

}
