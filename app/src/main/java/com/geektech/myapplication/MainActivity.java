package com.geektech.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Person> contacts;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        initRecycler();
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.myRecycler);
        SimpleAdapter adapter = new SimpleAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        contacts = new ArrayList<>();
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "fghfgcgfgxf", 4463563));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 44223123));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 4468645));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 443533421));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 44987842));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 7858644));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 486868964));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 4656554));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 45686534));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 413131314));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 13648744));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 45757544));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 4465314));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 435393634));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 4147454));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 53369244));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 44156821));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 440205834));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
        contacts.add(new Person(R.mipmap.ic_launcher, "dfghjgfd", 40255654));
        contacts.add(new Person(R.drawable.ic_wallpaper, "dfghjgfd", 412344524));
    }
}