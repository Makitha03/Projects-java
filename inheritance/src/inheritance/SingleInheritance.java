package inheritance;
class Animal
{
	 public void makeSound() {
	        // Print "The animal makes a sound." to the console
	        System.out.println("The animal makes a sound.");
	    }
}
class Cat extends Animal
{
	public void makeSound() {
        // Print "The cat quarrels." to the console
        System.out.println("The cat quarrels.");
    }
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.makeSound();
		

	}

}
