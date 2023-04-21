package project1;

import java.util.Scanner;

public class JapanDAO {
	void display(JapanDTO[] dtoArr, JapanDTO dto) {// 남은 음료 보여주기
		for (int i = 0; i < dtoArr.length; i++) {
			System.out
					.println((i + 1) + ". " + dtoArr[i].name + " " + dtoArr[i].price + "원 " + dtoArr[i].count + "개 남음");

		}
		System.out.println("현재잔액: " + dto.money);
	}

	// ------------------------//

	void inputMoney(JapanDTO[] dtoArr, JapanDTO dto) {
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("돈을 넣어주세요");

		while (true) {

			try {
				int inputMoney = Integer.parseInt(sc.nextLine());
				if (inputMoney < 0 || inputMoney % 10 != 0) {
					System.out.println("현금을 넣어주세요");
				} else {
					dto.money = dto.money+inputMoney;
					System.out.println(inputMoney + "원을 넣으셨습니다!");
					break;
				}
			} catch (Exception e) {
				System.out.println("현금을 넣으세요");
			}

		}

	}

	// ---------------------//

	void selectdrink(JapanDTO[] dtoArr, JapanDTO dto) {
		Scanner sc = new Scanner(System.in);

		display(dtoArr, dto);
		System.out.println();
		System.out.println("음료를 선택하세요");
		int selectDrink = Integer.parseInt(sc.nextLine());

		boolean isExit = false;

		while (dto.money < dtoArr[selectDrink - 1].price) {
			System.out.println("잔액이 부족합니다");
			System.out.println("돈 넣겠습니까?");
			System.out.println("1.O 2.X");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				inputMoney(dtoArr, dto);
				display(dtoArr, dto);
				System.out.println("음료를 고르세요");
				selectDrink = Integer.parseInt(sc.nextLine());
				continue;
			} else if (select == 2) {
				
				isExit = true;
				break;
			}
		}
		
		if(dtoArr[0].count==0&&dtoArr[1].count==0&&dtoArr[2].count==0) {
			isExit =true;
		}



		if (isExit) {

		} else {

			dtoArr[selectDrink - 1].count = dtoArr[selectDrink - 1].count - 1;

			while (dtoArr[selectDrink - 1].count == -1) {
				System.out.println("재고가 떨어졌어요");
				System.out.println(dtoArr[selectDrink - 1].name + " 말고 다른거 고르세요");
				dtoArr[selectDrink - 1].count = dtoArr[selectDrink - 1].count + 1;
				selectDrink = Integer.parseInt(sc.nextLine());
				dtoArr[selectDrink - 1].count = dtoArr[selectDrink - 1].count - 1;
			}

			System.out.println(dtoArr[selectDrink - 1].name + "가 나왔어요!");
			dto.money = dto.money - dtoArr[selectDrink - 1].price;

		}

	}

	// ---------------------//
	

}
