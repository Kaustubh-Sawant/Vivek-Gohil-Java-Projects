package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteMyFile;

public class WriteMyFileMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter path and file name with extention");
		String path = scanner.next();
		System.out.println("Enter data for file");
		String data = scanner.next();
		File file = new File(path);
		OutputStream outputStream = null;
		WriteMyFile writeMyFile = null;
		try {
			outputStream = new FileOutputStream(file, true);

			writeMyFile = new WriteMyFile(outputStream, data);

			if (writeMyFile.writeFile()) {
				System.out.println("Please check your file");
			} else {
				System.out.println("Failed to write file");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
