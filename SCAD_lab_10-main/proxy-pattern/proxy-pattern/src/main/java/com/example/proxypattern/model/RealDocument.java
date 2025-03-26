package com.example.proxypattern.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealDocument implements Document {
    private static final Logger log = LoggerFactory.getLogger(RealDocument.class);

    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadDocument();
    }

    private void loadDocument() {
        log.info("Loading document: " + fileName);
    }

    @Override
    public String display() {
        return "Displaying document: " + fileName;
    }
}
