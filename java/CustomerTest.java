package kr.co.ezenac.membership;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>(); //함께 결과내기위해 어레이리스트 부름
		
		Customer customerL = new Customer(202302, "이순신");
		Customer customerS = new Customer(202303, "신사임당");
		Customer customerJ = new GoldCustomer(202304, "진도준");
		Customer customerM = new GoldCustomer(202305, "모현민");
		Customer customerR = new VIPCustomer(202306, "유지나", 77777);
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerJ);
		customerList.add(customerM);
		customerList.add(customerR);
		
		System.out.println("=========고객 정보 출력=========");
		for (Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println("======할인율 계산 출력======");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" 님이 "+
									cost + "원 지불하셨습니다.");
		}
		
		System.out.println("======보너스 포인트 계산 출력======");
		for (Customer customer : customerList) {
			customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+" 님의 "+
								"현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}

}







