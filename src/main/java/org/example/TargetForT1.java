package org.example;

public class TargetForT1 implements Runnable{
    @Override
    public void run() {
        DBConn db2=DBConn.getInstance();
        System.out.println(db2);
    }
}
