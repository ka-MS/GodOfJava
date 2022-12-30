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

	// ���ϻ���
	public void checkFile(String pathName, String fileName) {
		File file = new File(pathName, fileName);
		// createNewFile()�� IOException�� �����Ƿ� Ʈ����ĳġ�� ���������
		try {
			System.out.println("Create result : " + file.createNewFile());
			getFIleInfo(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// ������ ����� Ȯ��
	public void getFIleInfo(File file) throws IOException{
		System.out.println("Absolute path : " + file.getAbsolutePath());
		System.out.println("Absolute file : " + file.getAbsoluteFile());
		System.out.println("Canonical path : " + file.getCanonicalPath());
		System.out.println("Canonical file : " + file.getCanonicalFile());
		
	}
}
