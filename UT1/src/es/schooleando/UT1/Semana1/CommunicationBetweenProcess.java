package es.schooleando.UT1.Semana1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CommunicationBetweenProcess {

	public static void main(String[] args) throws IOException {
		//esta bien para empezar
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		
		Process process = new ProcessBuilder(args).start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		
		System.out.println("Salida del proceso " + Arrays.toString(args) + ":");
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

}

