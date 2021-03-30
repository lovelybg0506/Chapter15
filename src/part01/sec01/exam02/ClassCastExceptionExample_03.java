package part01.sec01.exam02;

class Animal{ }
class Dog extends Animal{}
class Cat extends Animal{}

public class ClassCastExceptionExample_03 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
//		}
//		System.out.println("형변환이 안됩니다.");
	}

}
