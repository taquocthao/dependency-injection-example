
public class Program {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
		
//		System.out.print("Sound of: ");
//		String animal = input.nextLine();
		String input = args[0];
		if(input.equalsIgnoreCase("cat") || input.equalsIgnoreCase("dog") 
				|| input.equalsIgnoreCase("bird")) {
			AnimalSound animalSound = new AnimalSound(input);
			animalSound.getSound();
		} else {
			System.out.println("***************HELP***************/n");
			System.out.println("write: java Program <Animal> -> to listen the sound of animal");
			System.out.println("write: java Program <exit> -> to exit program");
			System.exit(1);
		}
	}

}
