package com.endava.library.automation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {

	public void writeToResourceFile(List<String> lines, String fileName) throws IOException, URISyntaxException {
		// Files.write(Paths.get(getClass().getClassLoader().getResource(fileName).toURI()),
		// lines);

		Path path = Paths.get("D:\\" + fileName);
		Files.write(path, lines);
	}
}
