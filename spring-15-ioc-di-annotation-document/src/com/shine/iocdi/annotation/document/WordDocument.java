package com.shine.iocdi.annotation.document;

import org.springframework.stereotype.Component;


/**
 * Created by Administrator on 2016/4/21.
 */
@Component("wordDocument")
public class WordDocument implements Document {
    public void read() {
        System.out.println("word read");
    }

    public void write() {
        System.out.println("word write");
    }
}
