package com.endava.library.automation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

	// public static final String PASS_FILE_PATH = "D:\\password.txt";
	//
	// public static String readString(String filePath) throws IOException {
	// return new String(Files.readAllBytes(Paths.get(filePath)));
	// }

	public String readResourceFile(String fileName) throws IOException, URISyntaxException {
		return new String(Files.readAllBytes(
				Paths.get(getClass().getClassLoader().getResource(fileName).toURI())));
	}

}