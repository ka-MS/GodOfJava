package 재귀함수구현;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class FIbonacciToStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Fibonacci3(1));
		while (true) {
			try {
				System.out.print("피보나치 값 입력 : ");
				int num = sc.nextInt();
				if (num == 0) {
					System.out.println("종료");
					break;
				}
				System.out.print("for문 " + num + "회 : ");
				for (int i = 1; i <= num; i++) {
					System.out.print(Fibonacci(i) + " ");
				}
				System.out.println();
				System.out.print("재귀 " + num + "회 : ");
				for (int i = 1; i <= num; i++) {// 피보나치 수열 출력
					System.out.print(Fibonacci2(i) + " ");
				}
				System.out.println();
			} catch (InputMismatchException e) {
				System.err.println("숫자만 입력 가능");
				sc.nextLine();
				// 버퍼의 입력값을 지워주지않으면 무한반복하게 됨
				// sc에는 입력값이 남아 계속해서 exception이 발생하고 while문으로 인해 무한반복
				continue;
			}
		}
	}

	public static int Fibonacci(int num) {
		int start = 1;
		int middle = 0;
		int result = 0;
		if(num <= 1) {
			return num;
		}
		for (int i = 1; i <= num; i++) {
			result = start + middle;
			start = middle;
			middle = result;
		}
		return result;
	}

	public static int Fibonacci2(int n) {
		if(n<=0) {
			return 0;
		}
		if (n <= 1) {
			return n;
		} else
			return Fibonacci2(n - 1) + Fibonacci2(n - 2);
	}
	
	public static int Fibonacci3(int n) {
		Stack<Integer> fibo = new Stack<Integer>();
		int result = 0;
		while(true) {
			int k = n;
			while(true) {
				k--;
				if(k <= 0) {
					fibo.add(0);
					break;
				}
				if(k == 1) {
					fibo.add(1);
					System.out.println(k);
					break;
				}else {
					fibo.add(0);
//					System.out.println(k);
				}
			}
			k = n;
			while(true) {
				k -= 2;
				if(k <=0) {
					fibo.add(0);
					break;
				}
				if(k == 1 || k == 2) {
					fibo.add(1);
					break;
				}else {
					fibo.add(0);
				}
			}
			n--;
			if(n == 0) {
				break;
			}
		}
		System.out.println(fibo);
		return result;
	}
}
