package com.example.tutorial05listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts, this);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initData() {
        ContactModel contact = new ContactModel("Nguyen Trung Kien" ,"0915350236", R.drawable.ic_u2 );
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Ngoc Son", "099849153", R.drawable.ic_u1);
        listContacts.add(contact);
        contact = new ContactModel("Mai Ngoc Toan", "046549875", R.drawable.ic_u4);
        listContacts.add(contact);
        contact = new ContactModel("Doan Manh Thang", "098713217", R.drawable.ic_u3);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Ngoc Son", "099849153", R.drawable.ic_u1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Ngoc Son", "099849153", R.drawable.ic_u1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Ngoc Son", "099849153", R.drawable.ic_u1);
        listContacts.add(contact);

    }
}