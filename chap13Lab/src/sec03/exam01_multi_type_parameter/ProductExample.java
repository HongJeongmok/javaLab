<<<<<<< HEAD
package sec03.exam01_multi_type_parameter;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		// Product<Tv, String> product1 = new Product<>();  //  new Product<생략가능>
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
=======
package sec03.exam01_multi_type_parameter;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		// Product<Tv, String> product1 = new Product<>();  //  new Product<생략가능>
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
