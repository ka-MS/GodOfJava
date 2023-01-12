package timeComplexity;

import java.util.Arrays;

public class TimeComplexity {
	// 상수 시간 O(1)
	// 로그시간 O(log N)
	// 직선형 시간 O(N)
	// 2차 시간 O(n^2)
	// 지수 시간 O(C^n)-> 재귀로 구현하는 피보나치 수열이 O(c^n)의 대표적인 알고리즘이다
	public static void main(String[] args) {
		TimeComplexity tc = new TimeComplexity();
//		int[] arr = new int[100_000_000];
//
//		for (int i = 0; i < 100_000_000; i++) {
//			arr[i] = (int) Math.random();
//		}

		long before = System.currentTimeMillis(); // 코드 실행 전 시간

		// 실행할 소스코드
//		Arrays.sort(arr);
		
//		tc.timeEx1();
		// 상수 시간 O(1)
//		tc.O1Algorithm(3);
		// 로그시간 O(log N)
//		tc.OLogAlgorithm(1000000000);
		// 직선형 시간 O(N)
		tc.OnAlgorithm(100000);
		// 2차 시간 O(n^2)
//		tc.On2Algorithm(30);

		long after = System.currentTimeMillis(); // 코드 실행 후 시간
		long diff = (after - before); // 두 시간에 차이
		System.out.println("시간차이(밀리세컨즈) : " + diff);
	}

	public int timeEx1() {
		int sum = 0; // 대입 연산 1회
		int n = 100; // 대입 연산 1회

		for (int i = 0; i < n; i++) // 반복문 n+1회
			sum += i; // 덧셈 연산 n회
		for (int i = 0; i < n; i++) // 반복문 n+1회
			sum += i; // 덧셈 연산 n회

		return sum; // 리턴 연산 1회

		// 총 연산횟수 T(N) = 4n+5 = O(n)
	}

	// O(1)의 시간 복잡도를 가진 알고리즘
	// arr 의 크기가 아무리 커져도 즉시 출력값 얻어낼 수 있음
	public int O1Algorithm(int index) {
		int[] arr = { 1, 2, 3, 4, 5 };

		return arr[index];
	}

	// O(log n)
	// n 이 절반씩 줄어들어 최대 7번 안에 값을 도출
	public void OLogAlgorithm(int n) {
		while (n > 0) {
			n = n / 2;
		}
	}

	// O(n)
	// 입력값에따라 n배만큼 더 오래걸리게 됨 100배 증가시키면 100배
	public void OnAlgorithm(int n) {
		for (int i = 0; i < n; i++) {

		}
	}

	// O(n^2)
	// 2차 복잡도라고 부르며 입력값이 증가함에 따라 n의 제곱수로 증가하는것
	// n^4 n^3 도 모두 n^2로 표기한다  
	public void On2Algorithm(int n) {
		//3중첩 for문으로 n이 증가할 때 마다 n^3 비율로 증가하게됨
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					System.out.println(i);
				}
			}
		}
	}
	
	
}
