package cn.javaman.strategy;
/**
 * @author sunxy
 * @version 2016-8-24
 * @des 
 **/
public enum MemberEnum {
	MEB_NORMAL("普通会员",new DiscountNormal()),
	MEB_GOLD("金牌会员",new DiscountGold()),
	;
	DiscountBase discount;
	String desc;
	private MemberEnum(String desc,DiscountBase discount){
		this.discount = discount;
		this.desc = desc;
	}
}
