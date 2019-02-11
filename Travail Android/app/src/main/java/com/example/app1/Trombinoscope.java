package com.example.app1;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Trombinoscope extends AppCompatActivity {
    ListView listView;
    UserAdapter Adapter;
    Button buttonGoAddUser;
    Button buttonGoMainActivity;

    public static List<User> selectedUser = new ArrayList<>();
    public static List<View> selectedView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_trombinoscope);

        listView = (ListView) findViewById(R.id.listView);
        Adapter = new UserAdapter(Trombinoscope.this, DataUser.getUsers());
        listView.setAdapter(Adapter);



        buttonGoAddUser = findViewById(R.id.buttonGoAddUser);
        buttonGoAddUser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Log.i(Tag,"REDIRECTION VERS ADD USER");
                Intent i = new Intent(Trombinoscope.this, AddUser.class);
                startActivity(i);

            }
        });

        buttonGoMainActivity = findViewById(R.id.buttonGoMain);
        buttonGoMainActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Log.i(Tag,"REDIRECTION VERS ADD USER");
                Intent i = new Intent(Trombinoscope.this, MainActivity.class);
                startActivity(i);

            }
        });



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User selectedItem = (User) parent.getItemAtPosition(position);

                DataUser.getUsers().remove(selectedItem);
                listView.invalidateViews();
            }
        });


    }
}
