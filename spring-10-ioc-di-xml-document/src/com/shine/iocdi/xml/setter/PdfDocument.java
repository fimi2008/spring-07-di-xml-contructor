package com.shine.iocdi.xml.setter;

/**
 * Created by Administrator on 2016/4/21.
 */
public class PdfDocument implements Document {
    public void read() {
        System.out.println("pdf read");
    }

    public void write() {
        System.out.println("pdf write");
    }
}
