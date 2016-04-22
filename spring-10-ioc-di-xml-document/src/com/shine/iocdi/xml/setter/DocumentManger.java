package com.shine.iocdi.xml.setter;

/**
 * Created by Administrator on 2016/4/21.
 */
public class DocumentManger {
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
