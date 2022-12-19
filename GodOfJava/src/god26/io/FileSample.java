package god26.io;

import java.io.File;

public class FileSample {

	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String pathName = "C:\\godofjava\\text";
		sample.checkPath(pathName);
		sample.makeDir(pathName);
		sample.checkFileMethods(pathName);
//		sample.deleteFile(pathName);

	}

	// ���ϰ��Ȯ��
	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is exists? = " + file.exists());
	}

	// ���� ����
	public void makeDir(String pathName) {
		File file = new File(pathName);
		System.out.println("Make : " + pathName + ", result : " + file.mkdirs());
	}

	// ���� & ��� Ȯ��
	public void checkFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " : directory? " + file.isDirectory());
		System.out.println(pathName + " : file? " + file.isFile());
		System.out.println(pathName + " : hidden? " + file.isHidden());
		
		//canRead() ��� ����Ȯ�� �޼ҵ�
	}
	
	// ���� ����
	public void deleteFile(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " : delete? " + file.delete());
	}
}
