package project1;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
	
		JapanDAO dao= new JapanDAO();
		
		JapanDTO col = new JapanDTO("콜라", 800, 8);
		JapanDTO sid = new JapanDTO("사이다", 1000, 5);
		JapanDTO fan= new JapanDTO("환타", 900, 1);
				
		JapanDTO[] drinkArr = new JapanDTO[3];
		drinkArr[0]= new JapanDTO("콜라", 800, 8);
		drinkArr[1]= new JapanDTO("사이다", 1000, 5);
		drinkArr[2]= new JapanDTO("환타", 900, 1);
		
		//------돈넣기------------//
		System.out.println("돈을 넣으세요");
		int inputMoney;
		
		while(true) {
		inputMoney= Integer.parseInt(sc.nextLine());
		
			if(inputMoney<0||inputMoney%10!=0) {
				System.out.println("현금을 넣으세요");
				
			}
			else {
				System.out.println(inputMoney+"원을 넣으셨습니다");
				break;
			}
			
		}
		
		int money=inputMoney;//money는 현재 잔액
		//-------------------------//
		
		
		
		
			
		

			//------------------ 음료 선택-----------//
		
		
		int select;
		
		while(true) {
			System.out.println("음료를 선택하세요");
			System.out.println("현재잔액: "+money);
			System.out.println();
			dao.display(drinkArr);
			System.out.println();
			
			
			
			while(true) {
				select= Integer.parseInt(sc.nextLine());
				
				if(select>drinkArr.length||select<1) {
					System.out.println("1~"+drinkArr.length+"숫자를 입력해주세요");
				}
				else{
					break;
				}
			}
			
			int selectMoney;
			
			if(money<drinkArr[select-1].price) {
				System.out.println("잔액이 부족합니다(현재 잔액: "+money);
				System.out.println("돈을 더 넣으시겠습니까?");
				System.out.println("1.O 2.X");
				selectMoney=Integer.parseInt(sc.nextLine());
				if(selectMoney==1) {
					System.out.println("금액을 넣어주세요");
					inputMoney=Integer.parseInt(sc.nextLine());
					money=money+inputMoney;
					System.out.println("현재잔액: "+money+"원");
					System.out.println("다시 골라주세요");
					dao.display(drinkArr);
					select= Integer.parseInt(sc.nextLine());
					
				}
				else if(selectMoney==2) {
					System.out.println("잔돈을 반환합니다");
					System.out.println("잔돈: "+money);
					break;
				}
				else {
					System.out.println("1 또는 2 를 눌러주세요");
				}
			}
			
				
				
			
				
				drinkArr[select-1].count = drinkArr[select-1].count-1;
			
				
				
				while(drinkArr[select-1].count==-1) {
					System.out.println("재고가 떨어졌어요");
					System.out.println(drinkArr[select-1].name + " 말고 다른거 고르세요");
					drinkArr[select-1].count=drinkArr[select-1].count+1;
					select=Integer.parseInt(sc.nextLine());
					drinkArr[select-1].count = drinkArr[select-1].count-1;
			}
			
				
				
			
			
			
			
				money=money-drinkArr[select-1].price;
				System.out.println("현재잔액: " + money);
				System.out.println();
				
				
				
				dao.display(drinkArr);
				System.out.println();
				System.out.println(drinkArr[select-1].name+"가 나왔어요!");
				System.out.println();
				
				System.out.println("계속 할까요?");
				System.out.println("그만할꺼면 0을 눌르세요");
				System.out.println("계속할꺼면 아무 숫자나 누르세요");
				int gostop = Integer.parseInt(sc.nextLine());
				if(gostop==0) {
					System.out.println("잔돈 :" + money);
					break;
				}
		}
		
			
	
			
			
			
			
			
			
			
			
			
			
		
			
		
		
		
		
}
}
