package chapter13_interface_enum.enumclass;

public class OverTimeManager2 {

	public static void main(String[] args) {
		OverTimeValues2 ot = OverTimeValues2.FIVE_HOUR; // 이렇게 객체 선언하여 사용가능
		System.out.println(OverTimeValues2.FIVE_HOUR.getAmount()); // 값 출력은 만들어놓은 메소드 사용
		System.out.println(ot);
		System.out.println(ot.getAmount());
		
		OverTimeValues2[] ot2 = OverTimeValues2.values(); //values메소드를 사용하면 배열형태로 enum을 볼 수 있다
		System.out.println(ot.compareTo(ot2[0])); // 같은지 체크하는 메소드
		System.out.println(ot2[0]); 

	}

}
