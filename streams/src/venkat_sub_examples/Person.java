package venkat_sub_examples;

public class Person {
	private final String name;
	private final int age;
	private SEX sex;
	
	public Person(String name, int age, SEX sex){
	this.name=name;
	this.age=age;
	this.sex=sex;
	}

	public SEX getSex() {
		return sex;
	}

	public void setSex(SEX sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String toString(){
		return String.format("%s --%s -- %s", name, age, sex);
	}
	
	
}
