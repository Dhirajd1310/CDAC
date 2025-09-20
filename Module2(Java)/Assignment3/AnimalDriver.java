class Animal{
	public void makeSound(){
		System.out.println("Animal Make A sound");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Dog Sound is :Bark");
	}
}
class Cat extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Cat Sound is :Meow");
	}
}
class AnimalDriver{
	public static void main(String[]args){
		Animal dog = new Dog();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.makeSound();
	}
}