package com.shine.iocdi.annotation.document;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/4/21.
 */
@Component("pdfDocument")
public class PdfDocument implements Document {
    public void read() {
        System.out.println("pdf read");
    }

    public void write() {
        System.out.println("pdf write");
    }
}
