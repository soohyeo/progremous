package kr.co.ezenac.membership;

/*
 *	   < 우수고객 >
 *		- 매출에 더 많은 기여를 하는 고객
 *		- 보너스 포인트는 제품 가격의 5%를 적립해 줌
 *		- 제품을 살때 10% (할인)해 줌 
 *		- 담당 전문 (상담원)이 배정됨		(추가된) 
 *		
 */

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentId;

	//super 이용하여 상위 클래스의 생성자 명시적으로 호출
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;			//초기화 내용 복사 아래 붙여넣기
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentId = 0;
	}
	//읽을 수 있게 게터만 추가
	public int getAgentId() {
		return agentId;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * bonusRatio);
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + "담당 상담원 번호는 " +agentId+ "입니다.";
	}
	
}








