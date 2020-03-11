package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog(null, "What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 3; i++) {
			
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Your pet is not satisfied with your mediocre amount of affection or just not the propper affection, you need to tend properly to your pet or he will leave you and kill your family.", "Special time with my pet!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Throw the bird into a blender at watch it 'go to heaven'", "Run in circles until you collapse or until your pet feels he/she has asserted dominance", "Quietly watch the festval...        of the birth of the devil while you act as a throne for the pet" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
	blenderBird();
}
if (task == 1) {
	circles();
}
if (task == 2) {
	festival();
}
		}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
JOptionPane.showMessageDialog(null, "Finally the human I have trained has now shown the upmost loyalty and affection for me I want to do this again so you will be cast aside into hell, but dont worry I'll make sure your on good terms with boss.");
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void blenderBird() {
	happinessLevel += 1;
			JOptionPane.showMessageDialog(null, "Magnificent, you have shown the first step to your loyalty human.");
	}
	public static void circles() {
		happinessLevel += 2;
				JOptionPane.showMessageDialog(null, "That's right you are below be coward engrave that into your brain before you wake up.");
		}
	public static void festival() {
		happinessLevel += 3;
				JOptionPane.showMessageDialog(null, "This is truly the occation that my only master has been wating for, come boss together me and you will rule this weak world.");
		}
	
	
}