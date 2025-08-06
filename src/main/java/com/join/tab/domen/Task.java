package com.join.tab.domen;

import java.util.UUID;

public class Task {
	private UUID id;
	private String text;
	private boolean status;
	
	public Task() {
	}

	public Task(String text) {
		this.id = UUID.randomUUID();
		this.text = text;
		this.status = false;
	}
	
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public UUID getId() {
		return id;
	}
	
}
