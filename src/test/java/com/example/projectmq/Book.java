package com.example.projectmq;

import java.io.Serializable;

/**
 * @ClassName Book
 * @Description 测试
 * @Author cssl
 * @DATE 2023/2/22 09:28
 * @Version 1.0
 */
public class Book implements Serializable {


    private static final long serialVersionUID = 7591047349087769000L;

    public static void main(String[] args) {
        int i=0,j=0,a=0,b=0;
        a=i++;
        b=++j;
        System.out.println(a);
        System.out.println(i);
        System.out.println(b);
    }
}
