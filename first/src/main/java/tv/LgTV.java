package tv;

public class LgTV implements TVinterface {
	
	
	public void powerOn() {
		System.out.println("lg 전원키기");	
	}

	public void powerOff() {
		System.out.println("lg 전원끄기");	
	}
	
	public void volumeUp(int i) {
		System.out.println("lg"+ i*3 + "만큼 볼륨올리기");	
	}

	public void volumeDown(int i) {
		System.out.println("lg"+ i*3 + "만큼 볼륨내리기");	
	}
	
	
	
	

}
