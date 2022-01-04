package cn.edu.hebue.test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {

    private static int a;
    private String name;
    private static final int b = 10;
    public static void main(String[] args) {
        a = 10;
        System.out.println("hello world");
        //region Description
        System.out.println();
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        System.out.println("args = " + args);

        String[] arr = new String[]{"lijiawei", "jiawenyu", "sunsongyi"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        ArrayList<Boolean> booleans1 = new ArrayList<Boolean>();
        booleans1.add(true);
        booleans1.add(false);
        booleans1.add(true);
        for (Boolean aBoolean : booleans1) {
            System.out.println("aBoolean = " + aBoolean);
        }

        Date date1 = new Date();
        //endregion



        System.out.println("hello world");


//        System.out.println("hello world");
    }

    public void method(){
        ArrayList<Boolean> booleans1 = new ArrayList<Boolean>();
        booleans1.add(true);
        booleans1.add(false);
        booleans1.add(true);

        if (booleans1 == null) {

        }

        if (booleans1 != null) {

        }

        if (booleans1 != null) {

        }

        if (booleans1 == null) {

        }

    }

}
