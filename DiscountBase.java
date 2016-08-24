package cn.javaman.strategy;

/**
 * @author sunxy
 * @version 2016-8-24
 * @des
 **/
public interface DiscountBase {
	/**
	 * 策略方法
	 */
	public double getPrice(double price);
}
