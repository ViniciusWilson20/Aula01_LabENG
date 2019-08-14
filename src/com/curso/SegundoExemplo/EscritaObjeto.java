package com.curso.SegundoExemplo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EscritaObjeto {

	public static void main(String[] args) {

		String[] nomes = { "Wilson", "Beatriz", "Evandson", "Satoshi", "Colevati", "Lobosco" };

		File f = new File("C:/TEMP/nomes.dat");
		try {
			FileOutputStream fount = new FileOutputStream(f);
			ObjectOutputStream objectOut = new ObjectOutputStream(fount);
			objectOut.writeObject(nomes);
			System.out.println("Nomes Gravados no Arquivo");
			objectOut.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
