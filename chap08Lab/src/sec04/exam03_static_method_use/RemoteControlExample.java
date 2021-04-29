package sec04.exam03_static_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl.changeBattery();  // 정적 메소드를 사용한다.
		
		// rc 변수에 익명구현객체를 대입한다.
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
			@Override
			public void setVolume(int volume) {
			}
		};
		
		rc.setMute(true);  // 익명구현객체를 생성한 후, 디폴트 메소드를 사용한다.

	}

}
