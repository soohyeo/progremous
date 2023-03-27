package kr.co.ezenac.membership;

/*
 *  * 일반고객(Customer)과 우수고객(VIPCustomer)
 *  	- 할인율과 적립되는 보너스 포인트의 비율이 다름 
 *  	- 상속을 활용하여 구현하기
 *  * 일반고객
 *  	- 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율 (1%의 포인트 적립)
 *  
 *  * protected 접근 지정자(제어자)
 *  	- 상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근 할수 있음
 *  	- 외부 클래스 접근 할수 없지만, 하위 클래스는 접근할수 있도록 protected 접근 제어자를 사용
 *  	
 */

public class Customer {
	
	protected int customerId;		//private에서 상속받은 곳에 공유해주기 위해서 protected를 사용해준다.
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;				// 여기까지했으면 이 다음은 생성자 만들기다
	//보너스포인트 1프로 적립
	//int형 Id , String형 Name 오버로드
	//<디폴트 생성자를 없애고 매개변수가 있는 생성자 추가>
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		bonusRatio = 0.01;
		customerGrade = "SILVER";
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	
	
	
	
	
	public int getCustomerId() {
		return customerId;
	}







	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}







	public String getCustomerName() {
		return customerName;
	}







	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}







	public String getCustomerGrade() {
		return customerGrade;
	}







	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}







	//물건구매하는 기능추가
	public int calcPrice(int price) {
		bonusPoint	+= price * bonusRatio;
		return price;
	}
	public String showInfo() {
		return(customerName + "님의 등급은 "+ customerGrade +
					"이며, 보너스 포인트는 " +bonusPoint+ "입니다.");
	}

}
	















