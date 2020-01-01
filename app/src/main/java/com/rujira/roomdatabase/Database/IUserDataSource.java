package com.rujira.roomdatabase.Database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.rujira.roomdatabase.Model.User;

import java.util.List;

import io.reactivex.Flowable;

public interface IUserDataSource {

    Flowable<User> getUserById(int userId);

    Flowable<List<User>> getAllUsers();

    void insertUser(User... users);

    void updateUser(User... users);

    void deleteUser(User user);

    void deleteAllUsers();
}
