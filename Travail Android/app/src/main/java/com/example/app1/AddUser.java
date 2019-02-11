package com.example.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AddUser extends AppCompatActivity {

    Button buttonAddUser;
    Button buttonGoMainView;
    EditText editTextNom;
    EditText editTextPrenom;
    DataUser userList = new DataUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);



        buttonGoMainView = findViewById(R.id.buttonAddUserGoMain);
        buttonGoMainView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Log.i(Tag,"REDIRECTION VERS ADD USER");
                Intent i = new Intent(AddUser.this, MainActivity.class);
                startActivity(i);

            }
        });

        editTextNom = findViewById(R.id.editTextNom);
        editTextPrenom = findViewById(R.id.editTextPrenom);
        buttonAddUser = findViewById(R.id.buttonAddUser);



        buttonAddUser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                String Nom = editTextNom.getText().toString();
                String Prenom = editTextPrenom .getText().toString();



                if (!Nom.isEmpty() && !Prenom.isEmpty()){
                    userList.addUser(new User(editTextNom.getText().toString(),editTextPrenom.getText().toString()));
                    Toast.makeText(getApplicationContext(),"User "+Prenom+" "+Nom +" Add", Toast.LENGTH_LONG).show();
                    editTextNom.setText("");
                    editTextPrenom.setText("");
                }

            }
        });

    }
}
