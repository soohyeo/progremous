package kr.co.ezenac.membership;

/*
 *  1) 일반고객과 VIP 고객 중간 멤버십 요청 발생
 *  	- 일반 고객보다 많이 구매하고, VIP보다는 적게 구매하는 고객에게도 해택을 줌
 *      - Gold 고객 등급 생성
 *      	- 제품 살때 10% 할인
 *      	- 보너스 포인트 2% 적립
 *      
 *  
 */
public class GoldCustomer extends Customer{
	double salesRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
	
		customerGrade = "GOLD";			//값을 정의한다.
		bonusRatio = 0.02;
		salesRatio = 0.1;
			
	}	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * bonusRatio);
	}
	
}














