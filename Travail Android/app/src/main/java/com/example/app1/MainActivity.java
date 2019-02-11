package com.example.app1;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonGoAddUser;
    Button buttonGoTrombi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.i(Tag,"On Create");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGoAddUser = findViewById(R.id.buttonGoAddUser);
        buttonGoAddUser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Log.i(Tag,"REDIRECTION VERS ADD USER");
                Intent i = new Intent(MainActivity.this, AddUser.class);
                startActivity(i);

            }
        });

        buttonGoTrombi = findViewById(R.id.buttonGoTrombi);
        buttonGoTrombi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Log.i(Tag,"REDIRECTION VERS TROMBINOSCOPE");
                Toast.makeText(getApplicationContext(),"Bienvenue au trombinoscope",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, Trombinoscope.class);
                startActivity(i);

            }
        });
    }


}
