package project1;

public class JapanDAO {
	void display(JapanDTO[] drinkArr) {//남은 음료 보여주기
		for(int i=0;i<drinkArr.length;i++) {
			System.out.println((i+1)+". "+drinkArr[i].name+" "+drinkArr[i].price+"원 "+drinkArr[i].count+"개 남음");
		}
	}

}
