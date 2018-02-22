import java.io.File;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


public class Histogram{

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(new File("histogram.txt"));

		int[] file = new int[101];
		int x = 0;

		while (scan.hasNextInt()) {
			int nums = scan.nextInt();
			file[x] = nums;
			x++;
		}

		StringBuilder string1 = new StringBuilder();
		string1.append("1-10      |");
		StringBuilder string2 = new StringBuilder();
		string2.append("11-20     |");
		StringBuilder string3 = new StringBuilder();
		string3.append("21-30     |");
		StringBuilder string4 = new StringBuilder();
		string4.append("31-40     |");
		StringBuilder string5 = new StringBuilder();
		string5.append("41-50     |");
		StringBuilder string6 = new StringBuilder();
		string6.append("51-60     |");
		StringBuilder string7 = new StringBuilder();
		string7.append("61-70     |");
		StringBuilder string8 = new StringBuilder();
		string8.append("71-80     |");
		StringBuilder string9 = new StringBuilder();
		string9.append("81-90     |");
		StringBuilder string10 = new StringBuilder();
		string10.append("91-100    |");
		



		for (int i = 0; i < file.length; i++) {
			if (file[i] >= 1 && file[i] <= 10) {
				string1.append("*");
			}
				
			if (file[i] >= 11 && file[i] <= 20) {
				string2.append("*");
			}
				
			if (file[i] >= 21 && file[i] <= 30) {
				string3.append("*");
			}
				
			if (file[i] >= 31 && file[i] <= 40) {
				string4.append("*");
			}
				
			if (file[i] >= 41 && file[i] <= 50) {
				string5.append("*");
			}
				
			if (file[i] >= 51 && file[i] <= 60) {
				string6.append("*");
			}
				
			if (file[i] >= 61 && file[i] <= 70) {
				string7.append("*");
			}
				
			if (file[i] >= 71 && file[i] <= 80) {
				string8.append("*");
			}
				
			if (file[i] >= 81 && file[i] <= 90) {
				string9.append("*");
			}
				
			if (file[i] >= 91 && file[i] <= 100) {
				string10.append("*");
			}		
			
		}

		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
		System.out.println(string5);
		System.out.println(string6);
		System.out.println(string7);
		System.out.println(string8);
		System.out.println(string9);
		System.out.println(string10);

	}

	



}
