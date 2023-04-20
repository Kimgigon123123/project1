package project1;

import java.util.Scanner;

public class Japan {
	public static void main(String[] args) {
		String[]name = {"콜라","사이다","환타"};
		int[] price = {800,1000,900};
		int[] count = {8,5,1};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("돈을 넣어주세요");
		int inputMoney=Integer.parseInt(sc.nextLine());
		System.out.println(inputMoney+"원을 넣었습니다");
		while(inputMoney>0&&count[0]>0&&count[1]>0&&count[2]>0) {
			System.out.println("현재 잔액: "+ inputMoney);
			System.out.println("음료를 골라주세요");
			for(int i=0;i<name.length;i++) {
				System.out.println((i+1)+"."+name[i]+" "+price[i]+"원 "+count[i]+"개 남음");
			}
			int select=Integer.parseInt(sc.nextLine());
			System.out.println(name[select-1]+"을 고르셨습니다");
				System.out.println(price[select-1]+"원 입니다");
				inputMoney=inputMoney-price[select-1];
				System.out.println(inputMoney+"원 남으셨습니다");
				count[select-1]=count[select-1]-1;
				for(int i=0;i<name.length;i++) {
					System.out.println((i+1)+"."+name[i]+" "+price[i]+"원 "+count[i]+"개 남음");
				}
				while(true) {
					System.out.println("돈을 더 넣으시겠습니까? \n 1.O 2.X");
					int inputMoneyYes=Integer.parseInt(sc.nextLine());
					if(inputMoneyYes==1) {
						System.out.println("얼마를 넣겠습니까?");
						int inputMoney2=Integer.parseInt(sc.nextLine());
						inputMoney=inputMoney+inputMoney2;
						
				}
					else if(inputMoneyYes==2) {
						break;
					}
		}
		
			
			}
		
	}
		
		
	

}
