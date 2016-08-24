package cn.javaman.strategy;
/**
 * @author sunxy
 * @version 2016-8-24
 * @des 
 **/
public class ClientEnum {
	
	public static void main(String[] args) {
		double price = 100;
		MemberEnum meb = MemberEnum.MEB_GOLD;
		double discountPrice = meb.discount.getPrice(price);
		System.out.println(meb.desc+"折扣价格为："+discountPrice);
		
		meb = MemberEnum.MEB_NORMAL;
		discountPrice = meb.discount.getPrice(price);
		System.out.println(meb.desc+"折扣价格为："+discountPrice);
	}

}
