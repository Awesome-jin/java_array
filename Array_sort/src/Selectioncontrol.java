
public class Selectioncontrol {

	public static void main(String[] args) {
		int ar[] = { 10, 30, 20, 40, 50 };
		int len = ar.length;

		// 선택 정렬
		for (int i = 0; i <= len; i = i + 1) {
			// 비교위치 반복문
			for (int j = i + 1; j < len; j = j + 1) {
				if (ar[i] > ar[j]) { // i가 j보다 크면 바꾼다 (=오름차순). 반대로 내림차순이면 뒤의 데이터가 커야한다!
					// swap (콜라와 사이다 서로 위치를 바꾼다 생각해보자)
					int temp = ar[i]; // 빈컵에다가 i배열 담아놓기
					ar[i] = ar[j]; // 빈 i에다가 j배열 담아놓기
					ar[j] = temp; // 빈 j 배열에다가 temp 넣기
				}
			}
		}
		// 출력
		for (int temp : ar) {
			System.out.print(temp + "\t");
		}

	}
}
