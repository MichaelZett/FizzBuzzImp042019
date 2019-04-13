package de;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import de.feu.FizzBuzzImperativ;

public class TestPackage {
	public static void main(String[] args) {
		FizzBuzzImperativ fizz = new FizzBuzzImperativ();
		try {
			// Absoluten Pfad ermitteln
			List<String> readAllLines1 = readLinesOfFile(TestPackage.class, "test.txt");
			System.out.println("URI: " + readAllLines1);

			// Relativ zum Projekt
			final Path pathToFile = Paths.get("src", "de", "test.txt");

			List<String> readAllLines2 = Files.readAllLines(pathToFile);
			System.out.println("Path: " + readAllLines2);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static List<String> readLinesOfFile(Class<TestPackage> classRelativeTo, String filename) throws URISyntaxException, IOException {
		URL resource = classRelativeTo.getResource(filename);
		Path file = Paths.get(resource.toURI());
		List<String> readAllLines1 = Files.readAllLines(file);
		return readAllLines1;
	}
}
