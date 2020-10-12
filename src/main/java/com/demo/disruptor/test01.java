package com.demo.disruptor;

import java.util.Collections;
import java.util.List;

public class test01
{
    public static void main(String[] args) throws RuntimeException
    {
            List<String> l = Collections.emptyList();
            l.add("1");
            //
        String s = l.get(0);
        System.out.println(s);

    }
}
