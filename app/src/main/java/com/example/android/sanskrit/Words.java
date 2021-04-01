package com.example.android.sanskrit;

public class Words {

   private String defaultTranslation;

    private String sanskritTranslation;
    private int audioResourceId;
    private  int imageResourceId = NO_IMAGE;
    private  static final int NO_IMAGE = -1;


    public Words(String defaultWord ,String sanskritWord,int audioid){

        defaultTranslation=defaultWord;
        sanskritTranslation=sanskritWord;
        audioResourceId=audioid;
    }

    public Words(String defaultWord ,String sanskritWord,int imageid,int audioid){

        defaultTranslation=defaultWord;
        sanskritTranslation=sanskritWord;
        imageResourceId =imageid;
        audioResourceId=audioid;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getSanskritTranslation() {
        return sanskritTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
