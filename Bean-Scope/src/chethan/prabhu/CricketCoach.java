package chethan.prabhu;

public class CricketCoach implements Coach{
	
	Coupon coupon;
	String name;
	String gamingName;
	int age;
	
	public void setCouponCode(Coupon coupon) {
		this.coupon = coupon;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void initMyClass() {
		System.out.println("init method called");
	}
	
	public void destroyMyClass() {
		System.out.println("destroy method called");
	}
	
	public void setGamingName(String gamingName) {
		this.gamingName = gamingName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice bowling and batting";
	}
	
	public String getCouponCode() {
		return coupon.getCoupon();
	}
	
	public String getDetails() {
		return "My name is " + name + ", I am " + age +" years old. My Gaming id is " + gamingName + ".";
	}
}
