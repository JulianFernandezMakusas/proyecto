package com.utn.vista;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		
		Path pl = Paths.get(args[0]);
		System.out.format("Exist: %b%n", Files.exists(pl));
		System.out.format("getFileName(): %s%n", pl.getFileName());
		System.out.format("getparent(): %s%n", pl.getParent());
		System.out.format("getNameCount(): %d%n", pl.getNameCount());
		System.out.format("getRoot: %s%n", pl.getRoot());
		System.out.format("isAbsolute(): %b%n", pl.isAbsolute());
		System.out.format("toAbsolutePath(): %s%n", pl.toAbsolutePath());
		System.out.format("toURI: %s%n", pl.toUri());
	}

}
