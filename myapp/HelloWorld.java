import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");

        Console console = System.console();
        // String name = console.readLine("What is your name?");

        // System.out.println("your name is ..." + name);

        // String sport = console.readLine("What is the sport that you like to do?");

        // if (sport.toUpperCase().equals("SWIMMING")) {
        //     System.out.println("That's a nice water sport");
        // } else if (sport.toUpperCase().equals("SOCCER")) {
        //     System.out.println("It's a worldy accepted sport");
        // } else {
        //     System.out.println("I am not sure about the sports you like");
        // }
        
        // String replacedName = name.replace('a','e');
        // System.out.printf("your name ... %s \n", replacedName);

        // String valueString = console.readLine("Enter your score between 0 to 100: ");
        // Integer score = Integer.parseInt(valueString);

        // switch (score) {
        //     case 100:
        //         System.out.println("Perfect Score");
        //         break;
        //     case 90:
        //     case 91:
        //     case 92:
        //     case 93:
        //     case 94:
        //     case 95:
        //         System.out.println("You score A!");
        //         break;
        //     default:
        //         System.out.println("Not acceptable");
        //         break;
        // }

        // int i = 0;
        // while (i < score) {
        //     System.out.println(i + ",");
        //     i++; // i = i + 1
        // }

        // do { 
        //     System.out.println(i + ",");
        //     i++;
        // } while (i < score);

        // Integer[] numbers = new Integer[5];

        // for(int j = 0; j < numbers.length; j++){
        //     Integer inputNumber = Integer.parseInt(console.readLine("Enter your %d number", j));
        //     numbers[j] = inputNumber;
        // }

        // for (Integer pI : numbers) {
        //     System.out.println(pI);
        // }

        // if (args.length > 0) {

        //     String[] names = new String[5];
            
        //     int x = 0;
        //     while (x < args.length) {
        //         names[x] = args[x];
        //         x++;

        //         if (x > 4) {
        //             break;
        //         }
        //     }

        //     for (int y = 0; y < names.length; y++){
        //         System.out.printf("Name[%d]: %s \n", y, names[y]);
        //     }
        // } else {
        //     System.out.println("No argument passed");
        // }

        // List<String> names = new ArrayList<>();
        // String input = "";

        // do { 
        //     input = console.readLine("Enter a name: ");
        //     if (!input.equals("quit")) {
        //         names.add(input);
        //     }
        // } while (!input.equals("quit"));

        // for (String name:names) {
        //     System.out.println(name);
        // }

        List<String> words = new ArrayList<>();
        String keyboardInput = console.readLine("Enter a sentence: ");
        Scanner scanner = new Scanner(keyboardInput);

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        scanner.close();

        for (int z = 0; z < words.size(); z++) {
            System.out.printf("%d : %s \r\n", z+1, words.get(z));
        }
        
    }
}