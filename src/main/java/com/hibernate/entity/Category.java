package com.hibernate.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This program demonstrates how to use JPA annotations to map a one-to-many
 * association on join table in Hibernate.
 * 
 * @author prashant
 * 
 */
@Entity
@Table(name = "category")
public class Category {

	private long id;
	private String name;

	private Set<Article> articles;

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	@Column(name = "category_Id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "category_article", joinColumns = @JoinColumn(name = "category_Id"), inverseJoinColumns = @JoinColumn(name = "article_Id"))
	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

}