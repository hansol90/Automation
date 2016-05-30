package com.endava.automation_assessment.common;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriterFile {

	public void writeToResourceFile(String line, String fileName) throws IOException, URISyntaxException {
		Path path = getTestResourcePath(fileName);

		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write(line);
		}
	}

	public void writeToResourceFile(List<Double> numbers, String fileName) throws IOException, URISyntaxException {
		Path path = getTestResourcePath(fileName);

		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			for (Double n : numbers) {
				writer.write(n + " ");
			}
		}
	}

	private Path getTestResourcePath(String fileName) {
		Path path = Paths.get("src/test/resources/" + fileName);
		return path;
	}

	

}
