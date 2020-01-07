
public class bubblesort {

	public static void main(String[] args) {
		// bubble sort
		int ar[] = { 10, 30, 20, 40, 50 };
		int len = ar.length;
		
		//최대 n-1회전
		for (int i = 0; i < len - 1; i = i + 1) {
			boolean flag = false; // 1회전동안 데이터의 이동이 없는지 판단하기 위해 필요하다
			for (int j = 0; j < len - i - 1; j = j + 1) // 맨 끝은 어차피 제일 큰 애가 가기 때문에 최대 횟수를 len-i-1로 해주면 된다.
			{
				if (ar[j] > ar[j + 1]) { // 뒤의 데이터가 더 작으면 swap을 하겠다
					int temp = ar[j]; // swap은 콜라와 사이다 잔 바꾸기 생각하자 (genius!!)
					ar[j] = ar[j + 1]; 
					ar[j + 1] = temp; 
					flag = true;
				}
			}
			if (flag == false) {
				break; // flag가 false라면 움직인애가 없다니까 쏘팅이 끝났다는 의미
			}
		}
		
		// 결과 출력해보기
		for (int temp : ar)
		{
			System.out.print(temp +"\t");
		}
	}

}
