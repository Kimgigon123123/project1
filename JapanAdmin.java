package project1;

import java.util.Scanner;

public class JapanAdmin {
	private static final String String = null;

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		
		
		JapanDTO[] dtoArr = new JapanDTO[3];
		dtoArr[0]= new JapanDTO ("콜라",800,8);
		dtoArr[1]= new JapanDTO ("사이다",1000,5);
		dtoArr[2]= new JapanDTO ("환타",900,1);
		
		
		
		
		
		
		
		while(true) {
			
			System.out.println("아이디를 입력하시오");
			String id=sc.nextLine();
			System.out.println("비밀번호를 입력하시오");
			String pw=sc.nextLine();
			
			if(id.equals("master")&&pw.equals("admin")) {
				System.out.println("로그인에 성공하였습니다");
				break;
			}
			else {
				System.out.println("다시 입력해주세요");
			}
		}
		
		
		//--------------------------------------//
		
		
		
		//------------추가기능-----------//
		
		
		
		JapanDTO[] dtoArr2 = new JapanDTO[4];
		dtoArr2[0]= new JapanDTO ("콜라",800,8);
		dtoArr2[1]= new JapanDTO ("사이다",1000,5);
		dtoArr2[2]= new JapanDTO ("환타",900,1);
		
		System.out.println("추가할 음료는?");
		String newDrink=sc.nextLine();
		System.out.println("음료의 가격은?");
		int newPrice=Integer.parseInt(sc.nextLine());
		System.out.println("음료의 갯수는?");
		int newCount=Integer.parseInt(sc.nextLine());
		
		dtoArr2[3]= new JapanDTO(newDrink,newPrice,newCount);
		
		for(int i=0;i<dtoArr2.length;i++) {
			System.out.println(i+1+". "+dtoArr2[i].name+" "+dtoArr2[i].price+"원 "+dtoArr2[i].count+"개 남음");
		}
		
		System.out.println("삭제할 목록 번호를 선택하세요");
		int delete=Integer.parseInt(sc.nextLine());
		
		dtoArr2[delete-1].name="X";
		dtoArr2[delete-1].price=0;
		dtoArr2[delete-1].count=0;
		
		for(int i=0;i<dtoArr2.length;i++) {
			System.out.println(i+1+". "+dtoArr2[i].name+" "+dtoArr2[i].price+"원 "+dtoArr2[i].count+"개 남음");
		}
		
		
		
		
	}
}
