package main.java.Find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String args[])
    {
        String str = "vbhs";
        char arr[]= str.toCharArray();
        String s ="bhvs";
        char sec[] =s.toCharArray();
        Arrays.sort(sec);
        Arrays.sort(arr);
        System.out.println(Arrays.equals(arr,sec));

        List<String> inner = new ArrayList<>();
        ArrayList<List<String>> outer = new ArrayList<>();
        for(int j =0 ;j<2;j++) {
            for (int i = 0; i < 2; i++) {
                inner.add("A");
            }
            outer.add(inner);

        }
        System.out.println(outer);
    }

}
