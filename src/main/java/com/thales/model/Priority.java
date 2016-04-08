package com.thales.model;

public enum Priority {

	HIGH(10), MEDIUM(20), LOW(30), LOWEST(255);

	private final int value;

	private Priority(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
