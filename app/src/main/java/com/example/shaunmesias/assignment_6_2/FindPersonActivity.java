package com.example.shaunmesias.assignment_6_2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shaunmesias.assignment_6_2.conf.util.App;
import com.example.shaunmesias.assignment_6_2.domain.person.Person;
import com.example.shaunmesias.assignment_6_2.services.person.impl.FindPersonServiceImpl;

import java.lang.ref.SoftReference;

public class FindPersonActivity extends AppCompatActivity {
   /* private Boolean isBound;
    private FindPersonServiceImpl myService;

    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_person);

        myService = FindPersonServiceImpl.getInstance();
        Intent intent = new Intent(App.getAppContext(), FindPersonServiceImpl.class);
        App.getAppContext().bindService(intent, myConnection, Context.BIND_AUTO_CREATE);
    }

    public void ButtonClickFindPerson(View v){
        id = ((EditText)findViewById(R.id.editText)).getText().toString();
        Person person = myService.findPerson(id);
        ((TextView)findViewById(R.id.lblIdFind)).setText(person.getServerId());
        ((TextView)findViewById(R.id.lblNameFind)).setText(person.getName());
        ((TextView)findViewById(R.id.lblLocationFind)).setText(person.getLocation());
        ((TextView)findViewById(R.id.lblEmailFind)).setText(person.getEmail());
    }

    private ServiceConnection myConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            FindPersonServiceImpl.MyLocalBinder binder = (FindPersonServiceImpl.MyLocalBinder) service;
            myService = binder.getService();
            isBound = true;

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound=false;
        }
    };*/
}
