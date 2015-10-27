import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadCVS {

	public static void main(String[] args) {

		ReadCVS obj = new ReadCVS();
		try {
			obj.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void run() throws IOException {

		// Change file path according to your need
		String filePath = "/home/adeel/Downloads/task.csv";
		URI uri = URI.create("file://"+filePath);
		Path sourcePath = Paths.get(uri);

		List<String> taskList = new ArrayList<String>();
		Files.lines(sourcePath).forEach(task -> taskList.add(task));
		for (String string : taskList) {
			System.out.println(string);
		}

	}
}