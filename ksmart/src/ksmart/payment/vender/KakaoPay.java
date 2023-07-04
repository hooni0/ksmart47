package ksmart.payment.vender;

import ksmart.payment.inter.PaymentVender;

public class KakaoPay implements PaymentVender {
	
	@Override
	public void pay(int price) {
		// 카카오페이 결제 로직
		System.out.println("카카오페이 결제금액 : " + price + " 결제되었습니다.");
	}
	
}