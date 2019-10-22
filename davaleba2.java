package HomeWork2;

import java.io.*;
import java.util.*;


class Code2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("function.txt"));
		
		String line;
		
		List<String> list = new ArrayList<String>();
		
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		
		System.out.println("Min: " + list.get(0) + "\n" + "Max: " + list.get(list.size() - 1));
	}
}