package ksmart.payment.adapter;

import ksmart.payment.inter.PaymentVender;
import ksmart.payment.vender.KakaoPay;
import ksmart.payment.vender.NaverPay;

public class Payment {
	
	private PaymentVender paymentVender;
	
	/*
	public Payment(String vender) {
		if(vender == "kakaoPay") {
			paymentVender = new KakaoPay();
		}else if(vender == "naverPay") {
			paymentVender = new NaverPay();
		}else {
			System.out.println("결제하실 수 없습니다.");
		}
	}
	*/
	
	// 느슨한 결합
	// 단일 책임 원칙, 오픈-폐쇄 원칙이 지켜진 상태
	public Payment(PaymentVender vender) {
		this.paymentVender = vender;
	}
	
	public void pay(int price) {
		paymentVender.pay(price);
	}
}
