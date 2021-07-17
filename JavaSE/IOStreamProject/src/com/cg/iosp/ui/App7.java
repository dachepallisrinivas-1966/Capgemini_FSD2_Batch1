package com.cg.iosp.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.cg.iosp.model.Person;

public class App7 {

	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("persons.dat");
			ObjectInputStream oos = new ObjectInputStream(fis);) {
				
				System.out.println((Person)oos.readObject());
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("cannot read" + e.getMessage());		
		} 

	}

}
