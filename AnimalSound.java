
public class AnimalSound {
	private Animal animal;
	public AnimalSound(String arg0) {
		animal = SoundFactory.soundOfAnimal(arg0);
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public Animal getAnimal() {
		return this.animal;
	}
	
	public void getSound() {
		animal.call();
	}
}
