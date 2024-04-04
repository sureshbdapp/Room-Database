package com.example.DBRoom;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class Practice extends AppCompatActivity {
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> listSecond = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> thirdList = new ArrayList<>();
        thirdList.add("1,2,3,4,5,6,7,8,9");
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add("1,3,2,6,8,3");
          //  list.addAll(arrayList);
            if (arrayList.get(i).equals(list.get(i))) {
                for (int j = 0; j < arrayList.size(); j++) {
                    if (thirdList.equals(arrayList.get(i))) {
                        listSecond.add(thirdList.get(j));
                        Log.e("Answer", listSecond.get(j));
                    }
                }
                {

                }
            }
        }
    }
}
