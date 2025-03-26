package com.example.proxypattern.service;

import com.example.proxypattern.model.Document;
import com.example.proxypattern.model.DocumentProxy;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    public String getDocument(String fileName, boolean isAdmin) {
        Document document = new DocumentProxy(fileName, isAdmin);
        return document.display();
    }
}
