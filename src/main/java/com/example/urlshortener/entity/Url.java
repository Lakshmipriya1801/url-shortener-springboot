package com.example.urlshortener.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Url {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String originalurl;
	String shortcode;
	public Url() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Url(String originalurl, String shortcode) {
		super();
		this.originalurl = originalurl;
		this.shortcode = shortcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOriginalurl() {
		return originalurl;
	}
	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}
	public String getShortcode() {
		return shortcode;
	}
	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}
	
}
