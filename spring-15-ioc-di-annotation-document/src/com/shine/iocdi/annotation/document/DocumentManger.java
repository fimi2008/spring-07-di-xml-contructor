package com.shine.iocdi.annotation.document;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/4/21.
 */
@Component("documentManger")
public class DocumentManger {
	@Resource(name = "pdfDocument")
    private Document document;

    public void read(){
        document.read();
    }

    public void write(){
        document.write();
    }


    public DocumentManger(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public DocumentManger() {
    }
}
