package com.example.shaunmesias.assignment_6_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shaunmesias.assignment_6_2.conf.util.App;
import com.example.shaunmesias.assignment_6_2.domain.person.Person;
import com.example.shaunmesias.assignment_6_2.factories.person.PersonFactory;
import com.example.shaunmesias.assignment_6_2.services.person.impl.AddPersonServiceImpl;

public class PreviewPersonActivity extends AppCompatActivity {
    TextView txtServerId, txtName, txtLocation, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_person);

      /*  txtServerId = ((TextView)findViewById(R.id.textView3));
        txtName = ((TextView)findViewById(R.id.textView5));
        txtLocation = ((TextView)findViewById(R.id.textView7));
        txtEmail = ((TextView)findViewById(R.id.textView9));

        txtServerId.setText(AddDriverActivity.id);
        txtName.setText(AddDriverActivity.name);
        txtLocation.setText(AddDriverActivity.loc);
        txtEmail.setText(AddDriverActivity.email);*/
    }

    public void ButtonSubmit(View v) throws Exception
    {
       /* Person person = PersonFactory.getPerson(AddDriverActivity.id, AddDriverActivity.name, AddDriverActivity.loc, AddDriverActivity.email);
        AddPersonServiceImpl service = AddPersonServiceImpl.getInstance();
        service.AddPerson(App.getAppContext(), person);
        Thread.sleep(1000);

        startActivity(new Intent(this, ViewAllActivity.class));*/
    }
}
