package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static void main(String[] args){
        จาร t = new จาร();
        t.จารID = "1234";
        t.fullname = "wanarat";
        t.gender = "Famale";
        System.out.println(t.จารID);
        t.speak();
        t.จาร();

    }
//    public static void main(String[] args) {
//        book bookA = new book();
//        book bookB = new book();
//        book bookC = new book();
//
//        bookA.name = "Comi san ha Comyusho desu";
//        bookA.category = "Love Comedy";
//        bookA.author = "Tomohito Oda";
//
//        bookB.name = "Final Fantasy Lost Strangep";
//        bookB.category = "Fantasy";
//        bookB.author = "Hazuki Minase";
//
//        bookC.name = "Kimetsu no Yaiba";
//        bookC.category = "Adventure,Dark Fantasy";
//        bookC.author = "Koyoharu Gotouge";
//    }
}