package com.mani.todo.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class TodoModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	@Lob
	private String description;
	@Column(name="created_on")
	private Instant created_on;
	@Column(name="updated_on")
	private Instant updated_on;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Instant getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Instant created_on) {
		this.created_on = created_on;
	}

	public Instant getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Instant updated_on) {
		this.updated_on = updated_on;
	}

	public TodoModel() {
		super();
	}

	public TodoModel(String title, String description, Instant created_on, Instant updated_on) {
		super();
		this.title = title;
		this.description = description;
		this.created_on = created_on;
		this.updated_on = updated_on;
	}
}
