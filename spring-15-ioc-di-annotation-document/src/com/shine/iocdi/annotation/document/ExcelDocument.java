package com.shine.iocdi.annotation.document;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/4/21.
 */
@Component("excelDocument")
public class ExcelDocument implements Document {
    public void read() {
        System.out.println("excel read");
    }

    public void write() {
        System.out.println("excel write");
    }
}
