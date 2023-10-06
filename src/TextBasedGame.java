import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class TextBasedGame {
    static Scanner scan;
    static String name;
    static boolean finish1;
    static boolean finish2;
    static boolean finish3;

    public static void main(String[] args) { // runs firstroom

        scan = new Scanner(System.in);
        introduction();

    }

    static void introduction() {

        println( "Dora, Dora, Dora the explorer! let's go, jump in ¡vámonos! You can lead the way!");
        String userInput = scan.nextLine();

        println("Hola, soy Dora and this is Backpack.\n" + "What is your name?");

        name = scan.nextLine();
        println("Hola " + name + "!" + " Ready to explore?\n" + "Say yes in spanish to continue!");

        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("si")) {
            println("That's not yes in spanish try it again...");
            userInput = scan.nextLine();
        }
        println("¡Vámonos!\n");
        chooseGame();

    }

    public static void chooseGame() {
        println("Where do you want to adventure today?\n" + "1: Dora's Rescue in Mermaid Kingdom\n" +
                "2: Dora Saves Fairytale Land!\n" + "3: Dora & Diego's Rescue Adventures!\n" + "(You have to finish every game to complete this adventure!)");
        int userInt = scan.nextInt();

        while (!isInRange(userInt,3)) {
            println("Sorry no bueno! Please choose again!");
            userInt = scan.nextInt();
        }

        if (userInt == 1) {

            mermaidKingdom();

        } else if (userInt == 2) {

            fairyLand();

        } else if (userInt == 3) {

            rescueAdv();

        } else {

            introduction();

        }
    }

    public static void mermaidKingdom() {
        String userInput = scan.nextLine();

        println("\n(Teleporting to the beach...)\n" + "Reminder: press W to move straight, press D to move right, press A to move left, press S to move back.\n\n" + "Dora: Hola soy Dora!\n" + "Boots: And I'm boots! We're at the beach with our friends! We love building sandcastles and playing volleyball! Eating paletas and collecting seashells!\n" + "Mermaid: ¡Ay no! Help Help!\n" + "Dora: Someone needs help, let's go Boots, turn to the left!" );
        userInput = scan.nextLine();

        while (!userInput.toLowerCase().equals("d")) {
            println("Sorry...that's the wrong side. Please try again.");
            userInput = scan.nextLine();
        }

        println("Dora: See! it's a mermaid girl. Una Sirena. Hola mermaid, soy soy Dora and this is Boots.");
        println("Mermaid: Hi soy Maribel");
        println("Dora: Que pasa Maribel?");
        println("Maribel: I'm lost :-( and I had to get back home to me mommy.");
        println("Boots: Aww you need to be with your mommy. We can help you get back home.");
        println("Maribel: Really?");
        println("Dora: Maribel, where is your home?");
        println("Maribel: I love in mermaid cove. Mermaid Cove a beautiful mermaid kingdom at the bottom of the ocean.");
        println("Boots: We'll help you get back home to Mermaid Cove Maribel." + "Uh Dora, how can we going to get Mermaid Cove...");
        println("Dora: Who do we ask for help when we don't know which way to go?");
        userInput = scan.nextLine();

        while (!userInput.equalsIgnoreCase("the map")) {
            println("Sorry, that's not right... (Hint: a drawing of all or part of Earth's surface!)");
            userInput = scan.nextLine();
        }

        println("Dora: Right! The map!");
        println("The Map: I'm the map I'm the map. Dora and Boots have to take Maribel home to her mommy and Mermaid Cove. " +
                "Oh Mermaid Cove is deep at the bottom of the ocean. Well I know how to get there! " +
                "First you have to go through the Octopus's Garden then pass the ocean rocks and that's how you get to Mermaid Cove. " +
                "So remember Garden rocks Mermaid Cove.");
        println("Dora: We have to find the Octopus's Garden.");
        println("Boots: How are we going to find it under the water.");
        println("Dora: I have my magic mermaid necklace. In English we say transform, in spanish we say?");
        userInput = scan.nextLine();

        while (!userInput.equalsIgnoreCase("transformar")) {
            println("Sorry, that's not transform in spanish.");
            userInput = scan.nextLine();
        }

        println("(You are now a mermaid) Dora: Great! ¡Vámonos! We first need to find the Octopus's Garden. Is the Octopus's Garden on the path with the starfish or the blowfish?");
        userInput = scan.nextLine();

        while (!userInput.equalsIgnoreCase("starfish")) {
            println("");
            userInput = scan.nextLine();
        }



        finish1 = true;
        onFinishedRoom();

    }

    public static void fairyLand() {

        finish2 = true;
        onFinishedRoom();

    }

    public static void rescueAdv() {

        finish3 = true;
        onFinishedRoom();

    }

    public static void ending() {

    }

    public static boolean hasCompletedGame() {
        return finish1 && finish2 && finish3;
    }

    public static void onFinishedRoom() {

        if (hasCompletedGame()) {
            ending();
        } else {
            chooseGame();
        }
    }

    public static boolean isInRange(int num, int max) {

        if (num <= max) {
            return true;
        }

        return false;
    }

    public static void println(String str) {
        System.out.println(str);
    }


}
