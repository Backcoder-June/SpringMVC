package tv;

public class SamsungTV implements TVinterface {
	

	public void powerOn() {
		System.out.println("삼성 전원키기");	
	}

	public void powerOff() {
		System.out.println("삼성 전원끄기");	
	}
	
	public void volumeUp(int i) {
		System.out.println("삼성"+ i + "만큼 볼륨올리기");	
	}

	public void volumeDown(int i) {
		System.out.println("삼성"+ i + "만큼 볼륨내리기");	
	}
	

	
	
	
	//
}
