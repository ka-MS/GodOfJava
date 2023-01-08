package 재귀함수;

import java.util.Stack;

public class FactorialToStack {

	public static void main(String[] args) {
		System.out.println(fact(-1));
	}
	
	public static int fact(int num) {
		Stack<Integer> fact = new Stack<Integer>();
		if(num <= 0 ) {
			return 0;
		}
		int result = 1;
		while(true) {
			if(num >= 1) {
				fact.push(num);
				num--; // stack 영역에 값을 쌓음
			} else if(!fact.isEmpty()) {
				result *= fact.pop(); // stack영역 값을 출력과 동시에 삭제하며 *연산 진행
			} else {
				break; // stack이 비어있게되면 함수 종료
			}
		}
		return result;
	}

}
