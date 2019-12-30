package com.demo.addition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView dummyRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dummyRecycler=findViewById(R.id.testRec);
        DummyModel dummyModel=new DummyModel();
        ArrayList<DummyModel> dm=new ArrayList<>();
        dm.add(dummyModel);

        dummyRecycler.setAdapter(new DummyAdapter(dm,MainActivity.this));

    }
}
