package god26.io;

import java.io.File;

public class FileSample {

	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String pathName = "C:\\godofjava\\text";
		sample.checkPath(pathName);

	}

	// ���ϰ��Ȯ��
	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is exists? = " + file.exists());
	}

}
