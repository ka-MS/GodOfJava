package chapter26_io.io;

import java.io.File;
import java.io.IOException;

public class FileManageClass {

	public static void main(String[] args) {
		FileManageClass sample = new FileManageClass();
		String pathName = File.separator + "godofjava" + File.separator + "text";
		String fileName = "test.txt";
		sample.checkFile(pathName, fileName);
	}

	// 파일생성
	public void checkFile(String pathName, String fileName) {
		File file = new File(pathName, fileName);
		// createNewFile()은 IOException을 던지므로 트라이캐치로 묶어줘야함
		try {
			System.out.println("Create result : " + file.createNewFile());
			getFIleInfo(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 절대경로 상대경로 확인
	public void getFIleInfo(File file) throws IOException{
		System.out.println("Absolute path : " + file.getAbsolutePath());
		System.out.println("Absolute file : " + file.getAbsoluteFile());
		System.out.println("Canonical path : " + file.getCanonicalPath());
		System.out.println("Canonical file : " + file.getCanonicalFile());
		
	}
}
