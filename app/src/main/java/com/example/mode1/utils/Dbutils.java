package com.example.mode1.utils;

import com.example.mode1.MyApplication;
import com.example.mode1.beans.User;
import com.example.mode1.db.DaoSession;

import java.util.List;

/**
 * Created by 张亚丹 on 2019/5/29.
 */

public class Dbutils {

    public static void insert(User user){
        DaoSession daoSession = MyApplication.getDaoSession();
        daoSession.insert(user);
    }

    public static List<User> querryAll(){
        DaoSession daoSession = MyApplication.getDaoSession();
        return daoSession.loadAll(User.class);
    }

}
