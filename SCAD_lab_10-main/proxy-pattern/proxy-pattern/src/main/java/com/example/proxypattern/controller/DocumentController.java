package com.example.proxypattern.controller;

import com.example.proxypattern.service.DocumentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/view")
    public String viewDocument(@RequestParam String fileName, @RequestParam boolean isAdmin) {
        return documentService.getDocument(fileName, isAdmin);
    }
}
