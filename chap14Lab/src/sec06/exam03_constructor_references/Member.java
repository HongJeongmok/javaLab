<<<<<<< HEAD
package sec06.exam03_constructor_references;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 角青");
	}
	public Member(String id) { 
		System.out.println("Member(String id) 角青");
		this.id = id; 
	}
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	}
	
	public String getId() { return id; }
}
=======
package sec06.exam03_constructor_references;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 角青");
	}
	public Member(String id) { 
		System.out.println("Member(String id) 角青");
		this.id = id; 
	}
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	}
	
	public String getId() { return id; }
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
