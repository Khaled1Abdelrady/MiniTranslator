package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ArrayAdapter extends android.widget.ArrayAdapter<Word> {

    public ArrayAdapter(Context context, ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    //to set the values of the list to views (imageView,textView..etc).
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //select the custom layout for the list view items.
        View listItemView = convertView;
        if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.test, parent, false);
        }

        //set the values.
        final Word currentAndroidWord = getItem(position);

        TextView arbText =  listItemView.findViewById(R.id.arabicWord);

        arbText.setText(currentAndroidWord.getArabic());

        TextView engText = listItemView.findViewById(R.id.englishWord);

        engText.setText(currentAndroidWord.getEnglish());

        ImageView image =  listItemView.findViewById(R.id.image);

        if (currentAndroidWord.getId()==0)
            image.setVisibility(View.GONE);
        else
            image.setImageResource(currentAndroidWord.getImageResource());

        return listItemView;
    }

}
