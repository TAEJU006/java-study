package ch06;

public class ArrayForEx01 {
	
	static void 남은금액계산(int[] coin, int restMoney) {
		for(int i=0;i<4;i++) {
			System.out.println(coin[i]+"원 : " + (restMoney/coin[i])); // 180원 남음
			restMoney = restMoney%coin[i];
			System.out.println("남은금액 : " + restMoney);
		}
	}

	public static void main(String[] args) {
		// 최소 동전 구하기 500, 100, 50, 10
				int coin[] = {500,100,50,10};
				int money = 1370;
				int restMoney = money;
				
				// 아래의 스텝 4개를 배열과 for문을 이용해 수정하세요
						
				남은금액계산(coin,restMoney);
					
				}
				
				
			}
				
		

