package persistance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import models.Wine;

public class FileManager {

	public static final String SEPARATOR = ",";
	public static final String QUOTE = "\"";
	
	public ArrayList<Wine> readCSV() {
		
		ArrayList<Wine> list = new ArrayList<>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src/data/WineDataset.csv"));
			String line = reader.readLine();
			while(line!=null) {
				String[] fields = line.split(SEPARATOR);
				fields = removeTrailingQuotes(fields);
				list.add(new Wine(fields[0], fields[1], Integer.parseInt(fields[2]), fields[3], Integer.parseInt(fields[4]), Integer.parseInt(fields[5])));
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	private String[] removeTrailingQuotes(String[] fields) {
		String[] result = new String[fields.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
		}
		return result;
	}
	
	public static void main(String[] args) {
		FileManager m = new FileManager();
		m.readCSV();
	}
	
}
