package com.utn.vista;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) {
		
		Path aWeb = Paths.get(args[0]);
		URI u = URI.create(args[1]);
		
		try (InputStream in = u.toURL().openStream()){
			Files.copy(in, aWeb, StandardCopyOption.REPLACE_EXISTING);
		}catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
	}

}
