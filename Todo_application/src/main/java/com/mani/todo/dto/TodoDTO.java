package com.mani.todo.dto;

import java.time.Instant;

public class TodoDTO {
	private int id;
	private String title;
	private String description;
	private Instant created_on;
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

}
