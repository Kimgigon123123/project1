package project1;

import java.util.Scanner;

public class JapanMain {
	public static void main(String[] args) {
		JapanDAO dao= new JapanDAO();
		JapanDTO dto= new JapanDTO();
		Scanner sc= new Scanner(System.in);
		
		JapanDTO[] dtoArr = new JapanDTO[3];
		dtoArr[0]= new JapanDTO("콜라", 800, 8);
		dtoArr[1]= new JapanDTO("사이다", 1000, 5);
		dtoArr[2]= new JapanDTO("환타", 900, 1);
		
		dao.display(dtoArr,dto);
		
		dao.inputMoney(dtoArr, dto);
		
		while(true){
			
			System.out.println();
			dao.display(dtoArr, dto);
			
			System.out.println();
			System.out.println("번호를 선택하세요");
			System.out.println("1. 음료 선택");
			System.out.println("2. 돈 더 넣기");
			System.out.println("3. 종료(잔돈반환)");
			
			
				int selectNum=Integer.parseInt(sc.nextLine());
				
				if(selectNum==1) {
					dao.selectdrink(dtoArr, dto);
					
				}
				else if(selectNum==2) {
					dao.inputMoney(dtoArr, dto);
				}
				
				else if(selectNum==3) {
					System.out.println("잔돈을 반환합니다");
					System.out.println("잔돈: "+dto.money);
					break;
				}
				else {
					System.out.println("1~3번 숫자를 입력해주세요");
				}
				
			
			
		}
		
	}
}
