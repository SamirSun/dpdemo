package cn.javaman.strategy;

/**
 * @author sunxy
 * @version 2016-8-24
 * @des
 **/
public class DiscountContext {
	private DiscountBase base;
	
	public DiscountContext() {
	}
	public DiscountContext(DiscountBase base) {
		this.base = base;
	}

	public double getDiscountPrice(double price) {
		if (base == null) {
			base = new DiscountNormal();
		}
		return this.base.getPrice(price);
	}

	public void changeDiscount(DiscountBase base) {
		this.base = base;
	}
}
