package com.esatgozcu.sharedprefaddotherdatatype;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    Set<String> set = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        set.add("value1");
        set.add("value2");
        set.add("value3");

        editor.putString("stringKey","apple");
        editor.putInt("intKey",12);
        editor.putLong("longKey",123123);
        editor.putFloat("floatKey",123f);
        editor.putBoolean("boolKey",true);
        editor.putStringSet("stringSetKey",set);
        editor.apply();
    }
}
