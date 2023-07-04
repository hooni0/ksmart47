package ksmart.payment.vender;

import ksmart.payment.inter.PaymentVender;

public class NaverPay implements PaymentVender {
	
	@Override
	public void pay(int price) {
		// 네이버페이 결제 로직
		System.out.println("네이버페이 결제금액 : " + price + " 결제되었습니다.");
	}

}
