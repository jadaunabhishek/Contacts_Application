package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ContactDatabase>arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrContacts.add(new ContactDatabase(R.drawable.a, "Hritik kumar Sinha", "911017367"));
        arrContacts.add(new ContactDatabase(R.drawable.b, "Daddy", "626542567"));
        arrContacts.add(new ContactDatabase(R.drawable.c, "Mummy", "877043649"));
        arrContacts.add(new ContactDatabase(R.drawable.d, "Suryasen", "+91 7990 80677"));
        arrContacts.add(new ContactDatabase(R.drawable.e, "Shivanshu", "+91 4532 24924"));
        arrContacts.add(new ContactDatabase(R.drawable.f, "Siddhant", "+91 340-389295"));
        arrContacts.add(new ContactDatabase(R.drawable.g, "Bade Papa", "+91 9-74371331"));
        arrContacts.add(new ContactDatabase(R.drawable.h, "Dadi Jee", "9691 43852"));
        arrContacts.add(new ContactDatabase(R.drawable.i, "Riya", "97709 2720"));
        arrContacts.add(new ContactDatabase(R.drawable.j, "Neha", "+91 7895 15838"));
        arrContacts.add(new ContactDatabase(R.drawable.k, "Abhinav", "747-087922"));
        arrContacts.add(new ContactDatabase(R.drawable.l, "Ali", "78288 6237"));
        arrContacts.add(new ContactDatabase(R.drawable.m, "Siddharth", "8030 41072"));
        arrContacts.add(new ContactDatabase(R.drawable.n, "Sarthak", "8130 41072"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);
    }
}