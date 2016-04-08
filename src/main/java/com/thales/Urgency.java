package com.thales;

public enum Urgency {

	CRISIS(1), CRITICAL(5), HIGH(10), MEDIUM(20), LOW(30), ROUTINE(99);

	private final int value;

	private Urgency(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
