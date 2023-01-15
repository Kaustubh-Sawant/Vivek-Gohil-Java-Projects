package com.citibank.main;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;

public class MyFileMetadataMain {
	public static void main(String[] args) {
//		MyFileMetadata fileMetadata = new MyFileMetadata();
//		fileMetadata.printFileMetadata();

		ReadMyFile readMyFile = new ReadMyFile();
		readMyFile.readFile();

	}
}
