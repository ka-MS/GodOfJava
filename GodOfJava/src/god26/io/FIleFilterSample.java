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
		// ���� �̸���Ȯ��
//		File []mainFileList = file.listFiles(new JPGFileNameFilter());
		// �������� ���丮���� Ȯ���Ͽ� ���
		File[] mainFileList = file.listFiles(new JPGFileFilter());
		// �ִ°� �����
//		File []mainFileList = file.listFiles();
		for (File i : mainFileList) {
			System.out.println(i.getName());
		}
	}
}
