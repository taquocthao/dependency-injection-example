
public class SoundFactory {
	public static Animal soundOfAnimal(String animal){
		if(animal.equals("cat")) {
			return new Cat();
		} else if(animal.equalsIgnoreCase("dog")){
			return new Dog();
		} else if(animal.equalsIgnoreCase("bird")) {
			return new Bird();
		}
		return null;
	}
}
