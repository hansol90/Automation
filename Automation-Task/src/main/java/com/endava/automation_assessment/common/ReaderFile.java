package com.endava.automation_assessment.common;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReaderFile {

	public String readResourceFile(String fileName) throws IOException, URISyntaxException {
		return new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource(fileName).toURI())));
	}

}