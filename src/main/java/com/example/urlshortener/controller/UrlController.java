
package com.example.urlshortener.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import com.example.urlshortener.service.UrlService;

@RestController
public class UrlController {

    @Autowired
    UrlService service;

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam String originalUrl) {

        String shortCode = service.shortenUrl(originalUrl);

        String shortUrl = "http://localhost:8080/" + shortCode;

        return shortUrl;
    }

    @GetMapping("/{shortCode}")
    public RedirectView redirect(@PathVariable String shortCode) {

        String originalUrl = service.getOriginalUrl(shortCode);

        return new RedirectView(originalUrl);
    }
}
