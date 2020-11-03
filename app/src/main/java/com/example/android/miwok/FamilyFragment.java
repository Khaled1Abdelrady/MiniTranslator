package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class FamilyFragment extends Fragment {

    //create the family view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //inflate the the fragment to the wanted layout.
        View rootView = inflater.inflate(R.layout.activity_family, container, false);

        //create the list of the items
       final ArrayList<Word>family_list=new ArrayList<>();
        family_list.add(new Word("Grandfather","الجد",R.drawable.family_grandfather));
        family_list.add(new Word("Grandmother","الجده",R.drawable.family_grandmother));
        family_list.add(new Word("Father","الاب",R.drawable.family_father));
        family_list.add(new Word("Mother","الام",R.drawable.family_mother));
        family_list.add(new Word("Son","الابن",R.drawable.family_son));
        family_list.add(new Word("Daughter","الابنه",R.drawable.family_daughter));
        family_list.add(new Word("Brother","الاخ",R.drawable.family_younger_brother));
        family_list.add(new Word("Sister","الاخت",R.drawable.family_younger_sister));
        family_list.add(new Word("Uncle"," العم",R.drawable.family_older_brother));
        family_list.add(new Word("Aunt"," العمة",R.drawable.family_older_sister));

        //set the adapter to the layout(list view).
        ArrayAdapter FamilyAdapter=new ArrayAdapter(getActivity(),family_list);
        ListView listView= rootView .findViewById(R.id.list2);
        listView.setAdapter(FamilyAdapter);
        return  rootView;
    }

}
