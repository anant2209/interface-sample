package proj1;

import java.io.*;

interface Vehicle {

	void applyBrake(int decrement);

	void accleration(int increment);
}

class Honda implements Vehicle {
	int a = 40;

	public void applyBrake(int decrement) {
		System.out.println("Applying Brake");
		a=a-decrement;
	}

	public void accleration(int increment) {
		System.out.println("Applying increment");
		a=a+increment;
	}

	public static void main(String args[]) {
		Honda hero = new Honda();
		hero.applyBrake(1);
		System.out.println(hero.a);
		hero.accleration(10);
		System.out.println(hero.a);
	}
}
