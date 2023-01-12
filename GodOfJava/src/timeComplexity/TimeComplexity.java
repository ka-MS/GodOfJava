package timeComplexity;

import java.util.Arrays;

public class TimeComplexity {
	// ��� �ð� O(1)
	// �α׽ð� O(log N)
	// ������ �ð� O(N)
	// 2�� �ð� O(n^2)
	// ���� �ð� O(C^n)-> ��ͷ� �����ϴ� �Ǻ���ġ ������ O(c^n)�� ��ǥ���� �˰����̴�
	public static void main(String[] args) {
		TimeComplexity tc = new TimeComplexity();
//		int[] arr = new int[100_000_000];
//
//		for (int i = 0; i < 100_000_000; i++) {
//			arr[i] = (int) Math.random();
//		}

		long before = System.currentTimeMillis(); // �ڵ� ���� �� �ð�

		// ������ �ҽ��ڵ�
//		Arrays.sort(arr);
		
//		tc.timeEx1();
		// ��� �ð� O(1)
//		tc.O1Algorithm(3);
		// �α׽ð� O(log N)
//		tc.OLogAlgorithm(1000000000);
		// ������ �ð� O(N)
		tc.OnAlgorithm(100000);
		// 2�� �ð� O(n^2)
//		tc.On2Algorithm(30);

		long after = System.currentTimeMillis(); // �ڵ� ���� �� �ð�
		long diff = (after - before); // �� �ð��� ����
		System.out.println("�ð�����(�и�������) : " + diff);
	}

	public int timeEx1() {
		int sum = 0; // ���� ���� 1ȸ
		int n = 100; // ���� ���� 1ȸ

		for (int i = 0; i < n; i++) // �ݺ��� n+1ȸ
			sum += i; // ���� ���� nȸ
		for (int i = 0; i < n; i++) // �ݺ��� n+1ȸ
			sum += i; // ���� ���� nȸ

		return sum; // ���� ���� 1ȸ

		// �� ����Ƚ�� T(N) = 4n+5 = O(n)
	}

	// O(1)�� �ð� ���⵵�� ���� �˰���
	// arr �� ũ�Ⱑ �ƹ��� Ŀ���� ��� ��°� �� �� ����
	public int O1Algorithm(int index) {
		int[] arr = { 1, 2, 3, 4, 5 };

		return arr[index];
	}

	// O(log n)
	// n �� ���ݾ� �پ��� �ִ� 7�� �ȿ� ���� ����
	public void OLogAlgorithm(int n) {
		while (n > 0) {
			n = n / 2;
		}
	}

	// O(n)
	// �Է°������� n�踸ŭ �� �����ɸ��� �� 100�� ������Ű�� 100��
	public void OnAlgorithm(int n) {
		for (int i = 0; i < n; i++) {

		}
	}

	// O(n^2)
	// 2�� ���⵵��� �θ��� �Է°��� �����Կ� ���� n�� �������� �����ϴ°�
	// n^4 n^3 �� ��� n^2�� ǥ���Ѵ�  
	public void On2Algorithm(int n) {
		//3��ø for������ n�� ������ �� ���� n^3 ������ �����ϰԵ�
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					System.out.println(i);
				}
			}
		}
	}
	
	
}
