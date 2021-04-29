package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 익명구현객체 생성하여 RemoteControl 인터페이스타입 rc 변수에 대입한다.
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

	}

}
