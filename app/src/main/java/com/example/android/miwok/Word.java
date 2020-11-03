package com.example.android.miwok;

class Word  {
    private String english;
    private String arabic;
    private int imageResource;
    private int audioR;
    private int id=-1;
   Word(String eng,String arb )
    {
        english=eng;
        arabic=arb;
        id=0;
    }
    Word(String eng,String arb ,int img,int aud)
    {
        english=eng;
        arabic=arb;
        imageResource=img;
        audioR=aud;
    }
    Word(String eng,String arb ,int img)
    {
        english=eng;
        arabic=arb;
        imageResource=img;
        id=1;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getEnglish() {
        return english;
    }

    public String getArabic() {
        return arabic;
    }

    public int getId() {
        return id;
    }

//    public int getAudioR() {
//        return audioR;
//    }
}
