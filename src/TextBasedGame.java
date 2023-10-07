import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class TextBasedGame {
    static Scanner scan;
    static String name;
    static boolean finish1;
    static boolean finish2;

    public static void main(String[] args) { // runs firstroom

        scan = new Scanner(System.in);
        //introduction();
        ending();

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
                "2: Dora & Diego's Rescue Adventures!\n" + "(You have to finish every game to complete this adventure!)");
        int userInt = scan.nextInt();

        while (!isInRange(userInt,2)) {
            println("Sorry no bueno! Please choose again!");
            userInt = scan.nextInt();
        }

        if (userInt == 1) {

            mermaidKingdom();

        } else if (userInt == 2) {

            rescueAdv();

        } else {

            introduction();

        }
    }

    public static void mermaidKingdom() {
        String userInput = scan.nextLine();

        println("\n(Teleporting to the beach...)\n" + "Reminder: press W to move straight, press D to move right, press A to move left, press S to move back.\n\n" + "Dora: Hola soy Dora!\n" + "Boots: And I'm boots! We're at the beach with our friends! We love building sandcastles and playing volleyball! Eating paletas and collecting seashells!\n" + "Mermaid: ¡Ay no! Help Help!\n" + "Dora: Someone needs help, let's go Boots, turn to the left!" );
        userInput = scan.nextLine();

        while (!userInput.toLowerCase().equals("a")) {
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
            println("Dora: This seems like a dead end, try again! ");
            userInput = scan.nextLine();
        }

        println("Dora: Great job! Gran trabajo! The starfish, estrella de mar, come on let's bring Maribel home!\n");
        println("(Sniff Sniff...Sniff Sniff) Boots: Dora I think that sunken ship is following us.");
        println("Dora: I don't think that's just a sunken ship...");
        println("Boots: I don't think that's just a sunken ship.");
        println("Maribel: Who's inside that ship?");
        userInput = scan.nextLine();
        println("Together: It's swiper!!!!!!");
        println("Dora: He's gonna try to swipe the mermaid necklace and then we won't be able to take Maribel home to her mommy.");
        println("Boots: I know we've got to stop him say Swiper no swiping say it with us! Swiper no swiping!");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("swiper no swiping")) {
            println("Dora: That's not the right phrase! Try it again! Swiper is going to swiper the mermaid's necklace, quick! Say it with me: swiper no swiping!");
            userInput = scan.nextLine();
        }

        println("Swiper: Oh mannnnnnnnn.....");
        println("Dora: Phew that was close thanks for helping us stop swiper!");
        println("Dora: We made it to the Octopus's Garden and there's our friend Val the octopus!");
        println("Val: Genial verte amigas!");
        println("Boots: Hola Val! We have to get our friend Maribel to her mommy. Can we go through your garden?");
        println("Val: Escuchen! To get through the garden you have to follow the flower pattern in this order: Rojo, Amarillo, Rojo, Amarillo. One more thing be sure to look out for the blue lobsters. They are very binchy and they might try to pinch you.");
        println("Dora: Great! Let's go, say it with us: Rojo, Amarillo...");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("rojo, amarillo")) {
            println("Dora: That's not yellow, red in spanish! Please try it again!");
            userInput = scan.nextLine();
        }

        back();
        userInput = scan.nextLine();

        while (true) {

            if (userInput.equals("d")) {

                println("You chose to go right.");
                println("Boots: There are more blue lobsters! It looks like we've been surrounded by blue lobsters...");
                println("blue lobsters: pinchy pinchy...");
                println("(You have been killed by blue lobsters...) Press 1 to go back and choose again.)");
                userInput = scan.nextLine();

                if (userInput.equals("1")) {

                    back();

                }

            } else if (userInput.equals("w")) {

                println("Dora: You chose to go straight.");
                println("Boots: Uh oh! This is a dead end... (You look back and see more blue lobsters)");
                println("blue lobsters: pinchy pinchy...");
                println("(You have been killed by blue lobsters...) Press 1 to go back and choose again.)");
                userInput = scan.nextLine();

                if (userInput.equals("1")) {

                    back();

                }


            } else if (userInput.equals("a")) {

                println("Dora: You chose to go left.");
                println("Boots: Phew that was close!");
                break;

            } else {

                println("That is not a direction... Try again please");
                userInput = scan.nextLine();

            }

        }

        println("Dora: We made it through the Octopus's Garden and we got away from the blue lobsters! Thanks for helping great Spanish speaking.");
        println("Boots: Where do we go next?");
        println("Dora: Garden, rocks, Mermaid Cove. We made it through the Octopus's Garden, check! Where do we go next?");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("rocks")) {
            println("Dora: That's not correct.. Try again.");
            userInput = scan.nextLine();
        }

        println("Dora: The Rocks! Correcto! The ocean rocks.");
        println("Dora: We need to find the ocean rocks are the rocks on the path with the clams or the jellyfish?");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("clams")) {
            println("Dora: Jellyfish stings! Please choose another path! Quick!");
            userInput = scan.nextLine();
        }

        println("Dora: Clams! Correcto! Come on let's bring Maribel home to Mermaid Cove.");
        println("Maribel: These are Snappy clams! Snappy clams!");
        println("Dora: They sure are Snappy clams");
        println("Dora: Boot you got a lot of clams on your tail");
        println("(clam clam clam clam clam clam calm) Boots: Yeah I've got one two three four... How many clams are on my tail?" );
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("siete")) {
            println("Dora: ¡Incorrecto! Count again! Or try saying it in spanish!");
            userInput = scan.nextLine();
        }

        println("Boots: Correct! There are siete almejas on my tail. Let me shake them off. Say menea menea with me!");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("menea menea")) {
            println("Dora: ¡Incorrecto! That's not wiggle wiggle in spanish");
            userInput = scan.nextLine();
        }

        println("Dora: Does your tail feel better much better?");
        println("Boots: " + name + ", muchas gracias! Thanks to you for wiggling and doing the sea monkey dance.");
        println("Dora: Hey look! Ocean rocks!");
        println("Maribel: Wait to see me mommy let's go let's go!");
        println("(THUUUUDDD!!) Dora: NOoo! The rocks are starting to fall!");
        println("Boots: Those rocks are blocking our way!");
        println("Maribel: But but but I have to get home to me mommy...");
        println("Dora: Who do we ask for help when we need tools?");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("backpack")) {
            println("Dora: ¡Incorrecto! Remember our friend backpack? Say backpack!");
            userInput = scan.nextLine();
        }

        println("Dora: Backpack Backpack! What do you have today?");
        println("Backpack: I have the trident, the hammer and the handsaw! What should we use to clear up the path?");
        userInput = scan.nextLine();

        while (true) {


            if (userInput.equals("the trident")) {

                println("Dora: That's correct! Use your mermaid powers Maribel, aim at the fallen rocks!");
                println("(The power was great enough to clear up a path) Maribel: Oh look! That's Mermaid Cove! Let's go Let's go!");
                break;

            } else if (userInput.equals("the hammer")) {

                println("Boots: I don't think a hammer can break the rocks... please choose again.");
                back2();
                userInput = scan.nextLine();

            } else if (userInput.equals("the handsaw")) {

                println("Boots: I don't think a handsaw can break the rocks... please choose again.");
                back2();
                userInput = scan.nextLine();

            } else {

                while (!userInput.equalsIgnoreCase("the trident")) {

                    println("That is not a tool from the backpack... Try again please");
                    userInput = scan.nextLine();

                }

            }

        }

        println("Dora: Wait... There are 2 pathways to mermaid cove, should we turn to the left or turn to the right?");
        userInput = scan.nextLine();

        while (!userInput.equalsIgnoreCase("d")) {

            finish1 = false;
            println("Dora: ¡Incorrecto! That's not Mermaid Cove, try again.");
            userInput = scan.nextLine();

        }

        println("Dora: Correcto!!! Vamos!");
        println("Maribel: We're almost home!");
        println("Dora: That's Mermaid Cove? Maravillosa!!!");
        println("Maribel's Mommy: Oh thank you for taking such good care of Maribel. Muchas gracias...\n" + "(THE END...)\n" + "You have successfully finished game 1, you have to complete all of the games to get a trophy!\n");
        finish1 = true;
        onFinishedRoom();

    }

    public static void rescueAdv() {
        String userInput = scan.nextLine();

        println("\n(Teleporting to the dinosaur era... You are now on a dinosaur, her name is Argentina.)\n" + "Reminder: press W to move straight, press D to move right");
        println("Dora: Hola soy dora! And this is my friend Diego.");
        println("Diego: Hola!");
        println("Together: WEEEEEEE!! (You are are a dinosaur. You have to control the dinosaur to avoid the creatures!)");
        println("Diego: Woah Wait! Pterosaurs! We don't want to bump into them. Please tell Argentina to go down now!");
        userInput = scan.nextLine();

        while (true) {

            if (userInput.equals("s")) {

                println("Dora: Si! Abajo!");
                println("Argentina: Abajo... Going down");
                println("Diego: Phew! That was close.");
                break;

            } else if (userInput.equals("w")) {

                println("Dora: Uh oh! Why are we going up, Pterosaurs are getting closer! oh no!");
                println("(You have been killed by Pterosaurs.)");
                back3();
                userInput = scan.nextLine();

            } else if (userInput.equals("d")) {

                println("Dora: Why are we going left? Uh oh.");
                println("(You have been killed by Pterosaurs.)");
                back3();
                userInput = scan.nextLine();

            } else if (userInput.equals("a")) {

                println("Dora: Why are we going right? Uh oh.");
                println("(You have been killed by Pterosaurs.)");
                back3();
                userInput = scan.nextLine();

            }

        }

        println("Dora: Wait what is that?");
        println("Diego: Oh no snapping turtles");
        println("(Snap Snap Snap Snap)");
        println("Dora: Quick! Say up in spanish!");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("arriba")) {
            println("Dora: ¡Incorrecto! That's not up in spanish! (Snap snap snap snap)");
            userInput = scan.nextLine();
        }

        println("Diego: That was very close! Hey! Great spanish speaking! Hiciste un gran trabajo! Keep up the good work, this adventure is a quick one...");
        println("Diego: Now we're headed for a giant Pteranodon!!");
        println("Dora: We can't bump into it!");
        println("Dora: Please tell Argentina to go down! (use your keyboard)");
        userInput = scan.nextLine();

        while (true) {

            if (userInput.equals("s")) {

                println("Dora: Si! Abajo!");
                println("Argentina: Abajo... Going down");
                println("Diego: Phew! That was close.");
                break;

            } else if (userInput.equals("w")) {

                println("Dora: Uh oh! Why are we going up, Teranewtons are getting closer! oh no!");
                println("(You have been killed by Teranewtons.)");
                back3();
                userInput = scan.nextLine();

            } else if (userInput.equals("d")) {

                println("Dora: Why are we going left? Uh oh.");
                println("(You have been killed by Teranewtons.)");
                back3();
                userInput = scan.nextLine();

            } else if (userInput.equals("a")) {

                println("Dora: Why are we going right? Uh oh.");
                println("(You have been killed by Teranewtons.)");
                back3();
                userInput = scan.nextLine();

            } else {

                back3();
                userInput = scan.nextLine();

            }

        }

        println("Dora: What's next? ¿De nuevo? look at all those teeth it's a Tyrannosaurus!");
        println("Diego: Better go up again what do we say?");
        userInput = scan.nextLine();
        while (!userInput.equalsIgnoreCase("arriba")) {

            finish2 = false;
            println("Dora: ¡Incorrecto! That's not up in spanish! (munch munch munch munch)");
            userInput = scan.nextLine();

        }

            println("Diego: Thanks for helping us get across!");
            println("Dora: yeah you're really good at speaking Spanish! Nos vemos la próxima vez!\n");
            finish2 = true;
            onFinishedRoom();

    }

    private static void back() {

        println("Dora: They want to pinch us we better get out! Where should we go next? There are 3 paths in front of us, go straight? turn left? Or turn right?");

    }

    private static void back2() {

        println("Backpack: What should we use to clear up the rocks? The hammer, the trident or the handsaw?");

    }

    private static void back3() {

        println("Dora: Tell Argentina to go down!");

    }

    public static void ending() {

        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_REST = "\u001B[0m";


        println(ANSI_YELLOW + "You have earned a gran trofeo!" + ANSI_REST + " Good Job!!");
        println("You have now completed Dora's adventure game! Stay tuned for more games in the future! Thank you for playing...");
        println("Don't forget to rate this game! Please enter a number between 1 and 10:");
        int userInt = scan.nextInt();

        if (userInt >= 10) {

            println("Waw...Thank you so much for such high rating!\n");

        } else {

            println("Thank you for your input! I will make sure to improve on it!\n");

        }

        println("Thank you!");

    }

    public static boolean hasCompletedGame() {
        return finish1 && finish2;
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
