package project1;

public class JapanDTO {
	String name; //음료 이름
	int price; // 가격
	int count; // 남은 갯수
	int money; // 현재 들이있는 금액
	
	public JapanDTO() {
		
	}
	
	public JapanDTO(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	

}
