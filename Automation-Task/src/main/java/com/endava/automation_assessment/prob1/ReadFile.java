package com.endava.automation_assessment.prob1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

	public String readResourceFile(String fileName) throws IOException, URISyntaxException {
		return new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource(fileName).toURI())));
	}

}