package HomeWork2;

import java.lang.Math;
import java.io.*;


class Code1 {
	public static double function(double x) {
		return Math.pow(x,2) + x*2 + 3;
	}
	
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("function.txt");
		
		for (double i = 1; i <= 2; i += 0.01) {
			fw.write(String.valueOf(function(i)) + "\n");
		}
			
		fw.flush();
		fw.close();
	}
}