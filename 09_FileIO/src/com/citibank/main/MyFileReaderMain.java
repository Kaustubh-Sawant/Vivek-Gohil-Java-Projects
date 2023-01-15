package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;
import com.citibank.main.domain.WriteMyFile;

public class MyFileReaderMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter path and file name with extention");
		String path = scanner.next();

		File file = new File(path);
		FileReader fileReader = null;
		MyFileReader myFileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			myFileReader = new MyFileReader(bufferedReader);

			String data = myFileReader.readFileLineByLine();
			System.out.println(data);

		} catch (FileNotFoundException e) {
			System.out.println("Error while opening file");
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing file and buffer");
			}
		}

//		try {
//			fileReader = new FileReader(file);
//
//			myFileReader = new MyFileReader(file, fileReader);
//			String data = myFileReader.readFile();
//			if (data.equals("")) {
//				System.out.println("Failed to write file");
//
//			} else {
//				System.out.println(data);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fileReader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
