package channels;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get("d:\\input1.txt");
		Path dest = Paths.get("d:\\zzz\\input1-moved.txt");
		
		Files.move(source, dest);
	}

}
