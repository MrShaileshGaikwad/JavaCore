package com.guvi;

public class Switch {
public static void main(String[] args) {
	int DayOfWeek=1;
	switch (DayOfWeek) {
	case 0: {
		System.out.println("Sunday");
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + DayOfWeek);
	}
}
}
