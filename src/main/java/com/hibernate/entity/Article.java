package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This program demonstrates how to use JPA annotations to map a one-to-many
 * association on join table in Hibernate.
 * 
 * @author prashant
 * 
 */
@Entity
@Table(name = "article")
public class Article {

	private long id;
	private String title;
	private String description;
	private String keywords;
	private String content;

	public Article() {
	}

	public Article(String title, String description, String keywords,
			String content) {
		this.title = title;
		this.description = description;
		this.keywords = keywords;
		this.content = content;
	}

	@Id
	@GeneratedValue
	@Column(name = "article_Id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}