package ksmart.payment;

import ksmart.payment.adapter.Payment;
import ksmart.payment.inter.PaymentVender;
import ksmart.payment.vender.KakaoPay;
import ksmart.payment.vender.NaverPay;

public class PaymentService {
	
	// 결제 진행하는 클래스
	public static void main(String[] args) {
		int price = 10000;
		
		/*
		KakaoPay kakaoPay = new KakaoPay();
		kakaoPay.kakaoPay(price);
		
		
		NaverPay naverpay = new NaverPay();
		naverpay.naverPay(price);
		*/
		
		PaymentVender paymentVender = new KakaoPay();
		paymentVender.pay(price);
		
		// 의존관계 설정 -> 외부에서 객체를 주입 받는다.(생성자 메서드 주입 방식)
		Payment payment = new Payment(new KakaoPay());
		// payment.setPaymentVender(new KakaoPay());
		payment.pay(price);
		
	}

}
