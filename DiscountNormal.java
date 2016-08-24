package cn.javaman.strategy;
/**
 * @author sunxy
 * @version 2016-8-24
 * @des 
 **/
public class DiscountNormal implements DiscountBase {

	public double getPrice(double price) {
		System.out.println("进入普通会员处理流程 ... ");
		return price*0.8;
	}

}
