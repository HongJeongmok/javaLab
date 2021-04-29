package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle v = new Vehicle();
		
		// 매개변수의 다형성
		// Vehicle v = bus;		
		driver.drive(bus);  // 자동형변환, 부모형<-자식형
		driver.drive(taxi);
		driver.drive(v);

	}

}
