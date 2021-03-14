package com.assigment;

public class Singleton {
    private static Singleton Manga = null;
    private Singleton(){}
    public static Singleton createManga(){
        if (Manga==null){Manga= new Singleton();}
        return Manga;
    }
    public String ReadManga(String a) {
        ///something here
        return a;
    }
}
