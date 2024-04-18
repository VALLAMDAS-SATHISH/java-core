package com.learning.core.day1session1;

interface MedicineInfo {
	void displayLabel();
}

class Tablet implements MedicineInfo {

	@Override
	public void displayLabel() {
		System.out.println("Store in a cool dry place");
	}

}

class Syrup implements MedicineInfo {

	@Override
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription");
	}

}

class Ointment implements MedicineInfo {

	@Override
	public void displayLabel() {
		System.out.println("Ointment is for external use only");
	}

}

public class D01P02 {
	public static void main(String[] args) {

		// Declaring Medicine instances
		MedicineInfo tablet = new Tablet();
		MedicineInfo syrup = new Syrup();
		MedicineInfo ointment = new Ointment();

		// Checking the polymorphic behaviour of dislayLabel() method
		tablet.displayLabel();
		syrup.displayLabel();
		ointment.displayLabel();
	}
}
