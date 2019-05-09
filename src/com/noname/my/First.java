package com.noname.my;

import java.util.*;

/** A class comment */
public class First {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path")
        );

        System.out.println(
                System.console()
        );
    }
}
