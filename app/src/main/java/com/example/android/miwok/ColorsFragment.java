package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ColorsFragment extends Fragment {

    //create the colors view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //inflate the the fragment to the wanted layout.
        View rootView = inflater.inflate(R.layout.activity_colors, container, false);

        //create the list of the items
        final ArrayList<Word> Colors = new ArrayList<>();
        Colors.add(new Word("White","ابيض",R.drawable.color_white));
        Colors.add(new Word("Black","اسود",R.drawable.color_black));
        Colors.add(new Word("Brown","بني",R.drawable.color_brown));
        Colors.add(new Word("Gray","رمادي",R.drawable.color_gray));
        Colors.add(new Word("Red","احمر",R.drawable.color_red));
        Colors.add(new Word("Blue","ازرق",R.drawable.color_blue));
        Colors.add(new Word("Green","اخضر",R.drawable.color_green));
        Colors.add(new Word("Orange","برتقالي",R.drawable.color_dusty_yellow));
        Colors.add(new Word("Yellow","اصفر",R.drawable.color_mustard_yellow));
        Colors.add(new Word("Pink","بمبي",R.drawable.color_bink));

        //set the adapter to the layout(list view).
        ArrayAdapter itemsAdapter = new ArrayAdapter(getActivity(),  Colors);
        ListView listView =rootView.findViewById(R.id.list3);
        listView.setAdapter(itemsAdapter);
        return  rootView;
    }

}
