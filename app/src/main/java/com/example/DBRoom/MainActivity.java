package com.example.DBRoom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.example.DBRoom.database.DataBaseHelper;
import com.example.DBRoom.database.Expense;
import com.example.db_room.R;
import com.example.db_room.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Adapter adapter;
    ArrayList<Model> arrayList = new ArrayList<>();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        DataBaseHelper dataBaseHelper = DataBaseHelper.getDB(this);

        binding.button.setOnClickListener(v -> {
            dataBaseHelper.expenseDao().addExp(new Expense(binding.title.getText().toString(),
                    binding.amount.getText().toString()));
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<Expense> arrExpense = (ArrayList<Expense>) dataBaseHelper.expenseDao().getAllExpense();
            for (int i = 0; i < arrExpense.size(); i++) {
                stringBuilder.append(dataBaseHelper.expenseDao().getAllExpense().get(i).getTitle()).append(" ").append(dataBaseHelper.expenseDao().getAllExpense().get(i).getAmount());
                Log.e("Data",dataBaseHelper.expenseDao().getAllExpense().get(i).getTitle()+ " " +dataBaseHelper.expenseDao().getAllExpense().get(i).getAmount());
            }
            binding.entries.setText(stringBuilder);
        });
    }
}