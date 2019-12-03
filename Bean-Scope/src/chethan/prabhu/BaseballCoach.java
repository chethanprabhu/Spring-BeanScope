package chethan.prabhu;

public class BaseballCoach implements Coach{

	Coupon coupon;
	public BaseballCoach(Coupon coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Play Baseball for 30min";
	}
	
	public String getCouponCode() {
		return coupon.getCoupon();
	}
}
