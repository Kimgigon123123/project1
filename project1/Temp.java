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
			System.out.println("음료를 선택하세요");
			System.out.println();
			dao.display(drinkArr);
			System.out.println();
			
			int select;
			
			while(true) {
				select= Integer.parseInt(sc.nextLine());
				
				if(select>drinkArr.length||select<1) {
					System.out.println("1~"+drinkArr.length+"숫자를 입력해주세요");
				}
				else{
					System.out.println(drinkArr[select-1].name+"를 선택했습니다");
					break;
				}
			}
			
			//--------------------------------------//
			
			
			
			//-------자판기에서 출력--------//
			
			
			
			money=money-drinkArr[select-1].price;
			System.out.println("현재잔액: " + money);
			System.out.println();
			drinkArr[select-1].count = drinkArr[select-1].count-1;
			dao.display(drinkArr);
			System.out.println();
			System.out.println(drinkArr[select-1].name+"가 나왔어요!");
			System.out.println();
			
			
			
			
		
			
		
		
		
		
}
}