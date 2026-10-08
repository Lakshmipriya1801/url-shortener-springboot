package com.example.urlshortener.service;

import com.example.urlshortener.entity.*;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urlshortener.dao.*;

@Service
public class UrlService {

    @Autowired
    UrlRepo repo;

    public String shortenUrl(String originalurl) {

        String shortcode = UUID.randomUUID()
                .toString()
                .substring(0, 6);

        Url url = new Url();

        url.setOriginalurl(originalurl);
        url.setShortcode(shortcode);

        repo.save(url);

        return shortcode;
    }

    public String getOriginalUrl(String shortcode) {

        Url url = repo.findByShortcode(shortcode);

        return url.getOriginalurl();
    }
}
	

