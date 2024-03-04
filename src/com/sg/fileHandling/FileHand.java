package com.sg.fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHand {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("C:\\Users\\P3058727\\eclipse-workspace\\SGProject\\src\\com\\sg\\fileHandling\\prakhar.txt");	
			String s = f.createNewFile() ? "Created" : "Already exists";
			System.out.println(s);
			
			
			FileWriter fw = new FileWriter("C:\\Users\\P3058727\\eclipse-workspace\\SGProject\\src\\com\\sg\\fileHandling\\testing.txt");
		
			BufferedWriter bw;
			try {
				bw = new BufferedWriter(fw);
				System.out.println("Writing...");
				bw.write(65);
				bw.write(66);
				bw.write(67); 
				bw.write("\nMy name is Prakhar");
				System.out.println("Written!");
				bw.close();
			}
			catch(IOException e){
				try {
					//read a local file
				}
				catch(Exception t) {
					t.printStackTrace();
				}
				e.printStackTrace();
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}

