package com.cg.iosp.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cg.iosp.model.Person;

public class App6 {

	public static void main(String[] args) {
		Person p1 = new Person("Srinivas", 55);
		try (
			FileOutputStream fos = new FileOutputStream("persons.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				
				oos.writeObject(p1);
			
		} catch (FileNotFoundException e) {
			System.out.println("file error");		
		} catch (IOException e) {
			System.out.println("could not write");
		}
		

	}

}
