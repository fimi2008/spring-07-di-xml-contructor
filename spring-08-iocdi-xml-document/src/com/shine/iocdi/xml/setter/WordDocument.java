package com.shine.iocdi.xml.setter;

import javax.print.Doc;

/**
 * Created by Administrator on 2016/4/21.
 */
public class WordDocument implements Document {
    public void read() {
        System.out.println("word read");
    }

    public void write() {
        System.out.println("word write");
    }
}
