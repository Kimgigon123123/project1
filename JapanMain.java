package project1;

public class JapanMain {
	public static void main(String[] args) {
		JapanDAO dao= new JapanDAO();
		
		JapanDTO[] drinkArr = new JapanDTO[3];
		drinkArr[0]= new JapanDTO("콜라", 800, 8);
		drinkArr[1]= new JapanDTO("사이다", 1000, 5);
		drinkArr[2]= new JapanDTO("환타", 900, 1);
		
		dao.display(drinkArr);
	}
}
