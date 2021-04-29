package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// 인터페이스 변수 = 구현객체, 자동타입변환
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;  // 강제형변환, 구현클래스형 <- 인터페이스형
		bus.run();
		bus.checkFare();

	}

}
