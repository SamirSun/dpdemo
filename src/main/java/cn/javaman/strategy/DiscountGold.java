package cn.javaman.strategy;
/**
 * @author sunxy
 * @version 2016-8-24
 * @des 
 **/
public class DiscountGold implements DiscountBase {

	public double getPrice(double price) {
		System.out.println("进入金牌会员处理流程 ... ");
		return price*0.9;
	}

}
