package com.utn.vista;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class Main {

	public static void main(String[] args) {
		
		Path aWeb = Paths.get(args[0]);
		URI u = URI.create(args[1]);
		
		try (InputStream in = u.toURL().openStream()){
			Files.copy(in, aWeb, StandardCopyOption.REPLACE_EXISTING);
			String lines = " ";
			Charset cs = Charset.defaultCharset();
			BufferedReader reader = Files.newBufferedReader(aWeb,cs);
			try{
				while (lines != null) {
					System.out.println(lines);										
					lines = reader.readLine();				
					}
			}catch (Exception a) {
				return ;
			}
		}catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
	}

}

