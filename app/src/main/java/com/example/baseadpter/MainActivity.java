package com.example.baseadpter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
String countrylist[]={"India", "China", "australia", "Portugle"};
int flag[]={R.drawable.mmmm,R.drawable.bbbb,R.drawable.ffff,R.drawable.iiii};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.l1);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),countrylist,flag);
        listView.setAdapter(customAdapter);
    }
}
