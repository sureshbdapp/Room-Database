package com.example.DBRoom.database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ExpenseDao {
    @Query("select * from expense")
    List<Expense> getAllExpense();

    @Insert
    void addExp(Expense expense);

    @Update
    void updateExp(Expense expense);

    @Delete
    void deleteExp(Expense expense);
}
