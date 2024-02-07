package org.example;

public class TargetForT2 implements Runnable{
    @Override
    public void run() {
        DBConn db3=DBConn.getInstance();
        System.out.println(db3);
    }
}
