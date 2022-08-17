package com.kosa.myapp.in;

import java.io.File;

public class FileExample {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/");
		String[] dir = file.list();
		for (String path : dir) {
			File cur = new File(file, path);
			if (cur.isDirectory()) {
				System.out.println("D ");
			} else if (cur.isFile()) {
				System.out.println("- ");
			}else {
				System.out.println("  ");
			}
			System.out.println(path);
		}
	}

}
