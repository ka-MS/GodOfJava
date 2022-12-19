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

	// 파일경로확인
	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is exists? = " + file.exists());
	}

	// 폴더 생성
	public void makeDir(String pathName) {
		File file = new File(pathName);
		System.out.println("Make : " + pathName + ", result : " + file.mkdirs());
	}

	// 파일 & 경로 확인
	public void checkFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " : directory? " + file.isDirectory());
		System.out.println(pathName + " : file? " + file.isFile());
		System.out.println(pathName + " : hidden? " + file.isHidden());
		
		//canRead() 등등 권한확인 메소드
	}
	
	// 파일 삭제
	public void deleteFile(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " : delete? " + file.delete());
	}
}
