package com.example.proxypattern.model;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String fileName;
    private boolean isAdmin;

    public DocumentProxy(String fileName, boolean isAdmin) {
        this.fileName = fileName;
        this.isAdmin = isAdmin;
    }

    @Override
    public String display() {
        if (isAdmin) {
            if (realDocument == null) {
                realDocument = new RealDocument(fileName);
            }
            return realDocument.display();
        } else {
            return "Access Denied: You do not have permission to view this document.";
        }
    }
}
