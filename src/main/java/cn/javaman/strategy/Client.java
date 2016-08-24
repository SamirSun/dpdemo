package cn.javaman.strategy;
/**
 * @author sunxy
 * @version 2016-8-24
 * @des 
 **/
public class Client {

	public static void main(String[] args) {
		double price = 100;
		DiscountContext context = new DiscountContext();
		double discountPrice = context.getDiscountPrice(price);
		System.out.println("折扣价格为："+discountPrice);
		
		context.changeDiscount(new DiscountGold());
		discountPrice = context.getDiscountPrice(price);
		System.out.println("折扣价格为："+discountPrice);
	}

}
