package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesFragment extends Fragment {

    //create the phrases view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflate the the fragment to the wanted layout.
        View rootView = inflater.inflate(R.layout.activity_phrases, container, false);

        //create the list of the items
        final ArrayList<Word> Phrases_list=new ArrayList<>();
        Phrases_list.add(new Word("How are you","كيف حالك"));
        Phrases_list.add(new Word("I am feeling good thank you","انا بخير شكرا لك"));
        Phrases_list.add(new Word("What is your name","ماهو اسمك"));
        Phrases_list.add(new Word("My name is Khaled ","اسمي خالد "));
        Phrases_list.add(new Word("How old are you","ما هو عمرك"));
        Phrases_list.add(new Word("I am ten years old","عمري عشر سنين"));
        Phrases_list.add(new Word("Where are you from","من اين انت"));
        Phrases_list.add(new Word("I am from egypt","انا من مصر"));
        Phrases_list.add(new Word("Can you help me please","هل بإمكان مساعدتي لو سمحت"));
        Phrases_list.add(new Word("Yes of course","نعم بالتأكيد"));

        //set the adapter to the layout(list view).
        ArrayAdapter PhrasesAdapter=new ArrayAdapter(getActivity(),Phrases_list);
        ListView listView= rootView. findViewById(R.id.list4);
        listView.setAdapter(PhrasesAdapter);
        return  rootView;
    }

}
