package com.demo.exception_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class TryWithResourses {

	
	public static void main(String[] args) throws IOException {
		
		 
		FileWriter fw = new FileWriter("C:\\Users\\varsha.gedam\\Desktop\\Softwares\\xyz.txt");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\varsha.gedam\\Desktop\\Softwares\\xyz.txt");
		Scanner sc = new Scanner(fis);
		try {
			fw.write("Welcome to Java Course......----");

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("Success");
		} finally {
			fw.close();
			fis.close();
			sc.close();
			System.out.println("Resource are closed and message is written");
		}
	}

}
