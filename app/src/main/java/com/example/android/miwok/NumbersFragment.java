package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersFragment extends Fragment {

    //create the numbers view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflate the the fragment to the wanted layout.
        View rootView = inflater.inflate(R.layout.activity_numbers, container, false);

        //create the list of the items
       final ArrayList<Word> numbers_list = new ArrayList<>();
        numbers_list.add(new Word("One","واحد",R.drawable.number_one,R.raw.english_one));
        numbers_list.add(new Word("Two","اثنين",R.drawable.number_two));
        numbers_list.add(new Word("Three","ثلاتة",R.drawable.number_three));
        numbers_list.add(new Word("Four","اربعة",R.drawable.number_four));
        numbers_list.add(new Word("Five","خمسة",R.drawable.number_five));
        numbers_list.add(new Word("Six","ستة",R.drawable.number_six));
        numbers_list.add(new Word("Seven","سبعة",R.drawable.number_seven));
        numbers_list.add(new Word("Eight","ثمانية",R.drawable.number_eight));
        numbers_list.add(new Word("Nine","تسعة",R.drawable.number_nine));
        numbers_list.add(new Word("Ten","عشرة",R.drawable.number_ten));

        //set the adapter to the layout(list view).
        ArrayAdapter Adapter = new ArrayAdapter(getActivity(),  numbers_list);
        ListView listView = rootView. findViewById(R.id.list);
        listView.setAdapter(Adapter);
        return  rootView;
    }

}
