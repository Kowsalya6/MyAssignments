package week1.day1;

public class Mobile {
	public void  makeCall(String mobileModel, float mobileWeight) {
		System.out.println("This is my mobile");
	}
	
	public void sendMsg(boolean isFullCharged, int mobileCost) {
		System.out.println("This is my mobile"); 		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		m.makeCall("nokia", 10.5f);
		m.sendMsg(true, 20000);
	}

}
