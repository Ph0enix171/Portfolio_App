package com.raccoon.projectrecord;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.r_view);

        Project projects[]= {
                new Project("Quiz App","An app to gve a short quiz containing pre-loaded questions",R.drawable.win_5834110_640),
                new Project("Template of an E-mail app","A template of an e-mail app with hamburger drawer",R.drawable.mail),
                new Project("BMI Calculator","An app to find your BMI and health status",R.drawable.inch),
                new Project("Simple Calculator","A very simle calculator with addition,subtraction,division , and multiplication",R.drawable.calculate),
                new Project("Android Cafe","Restaurant menu app",R.drawable.android_cafe)

            };
        ProjectAdapter adapter=new ProjectAdapter(projects);
        list.setAdapter(adapter);

        }
    }
