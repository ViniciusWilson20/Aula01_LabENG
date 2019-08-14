package com.curso.PrimeiroExemplo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TesteGravação {

	public static void main(String[] args) {

		File f = new File("C:/TEMP/teste.txt");
		try {
			
			/*
			 * File f = new File("C:/TEMP/teste.txt"); 
			 * FileWriter fw = new FileWriter(f, true); 
			 * fw.write("Hello \n"); 
			 * fw.flush(); 
			 * fw.write("World \n"); 
			 * fw.close();
			 */
			
			FileReader fr = new FileReader(f);
			int i = fr.read();
			System.out.println("Lendo Caractere: " + (char) i);
			fr.close();

		} catch (IOException io) {
			io.printStackTrace();
			System.out.println(io.getMessage());

		}

	}

}
