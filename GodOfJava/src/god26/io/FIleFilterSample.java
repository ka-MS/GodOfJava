package god26.io;

import java.io.File;

public class FIleFilterSample {

	public static void main(String[] args) {
		FIleFilterSample sample = new FIleFilterSample();
		String pathName = File.separator + "godofjava" + File.separator + "text";
		sample.checkList(pathName);
	}

	public void checkList(String pathName) {
		File file;
		file = new File(pathName);
		// 파일 이름만확인
//		File []mainFileList = file.listFiles(new JPGFileNameFilter());
		// 파일인지 디렉토리인지 확인하여 출력
		File[] mainFileList = file.listFiles(new JPGFileFilter());
		// 있는거 다출력
//		File []mainFileList = file.listFiles();
		for (File i : mainFileList) {
			System.out.println(i.getName());
		}
	}
}
