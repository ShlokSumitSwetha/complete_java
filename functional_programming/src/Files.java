import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Files {

	public static void main(String[] args) throws IOException, URISyntaxException {

		 java.nio.file.Files.lines(Path.of(ClassLoader.getSystemResource("file.txt").toURI()))
				 .map(str -> str.split(" "))
				 .flatMap(Arrays::stream)
				 .distinct()
				 .sorted()
				 .forEach(System.out::println);
		
		java.nio.file.Files.list(Paths.get(".")).filter(java.nio.file.Files::isDirectory).forEach(System.out::println);

	}

}
