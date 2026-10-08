package com.example.urlshortener.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.urlshortener.entity.*;
public interface UrlRepo extends JpaRepository<Url,Integer>{

	Url findByShortcode(String shortcode);
}
