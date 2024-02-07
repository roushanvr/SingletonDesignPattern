package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConn {
    //some fields
    private static DBConn inst;
    private static Lock lock=new ReentrantLock();
    private DBConn(){

    }
    public static DBConn getInstance(){//static method returning DBConn type object
        if(inst==null){
         lock.lock();
           if(inst==null){
             inst=new DBConn();
         }
           lock.unlock();
        }
        return inst;
    }
}
