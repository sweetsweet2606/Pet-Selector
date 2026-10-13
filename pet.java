//Hunter Low 10/13/2026
import java.util.Scanner;
//Makes a pet selector based on your fav color, season, and your name
class pet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //makes a scanner object
        //Scans all of the inputs
        System.out.println("Enter your favorite color (Either red, blue or green):");
        String color = scanner.nextLine();
        System.out.println("Enter your favorite season (winter, spring, summer, fall):");
        String season = scanner.nextLine();
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        name.toLowerCase();
        String pet = ""; //sets pet to no value
        //determining your pet based on inputs
        if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
        }
        else if (color.equals("blue") && season.equals("spring")){
            pet = "Ostrich";
        }
        else if (color.equals("green") && ("aeiou".indexOf(name.substring(0,1))==-1) && season.equals("winter")){
            pet = "Giraffe";
        }
        else if (!pet.equals("Giraffe") && color.equals("green") && !season.equals("fall")){
            pet = "Dog";
        }
        else if (color.equals("red") && ("aeiou".indexOf(name.substring(0,1))>=0)){
            pet = "Porcupine";
        }
        else if (color.equals("red") && ("aeiou".indexOf(name.substring(0,1))==-1)){
            pet = "Panda";
        }
        else if (season.equals("summer") && !pet.equals("Dog") && !pet.equals("Panda") && !pet.equals("Porcupine")){
            pet = "Pony";
        }
        else if (("aeiou".indexOf(name.substring(0,1))==-1) && color.equals("blue") && !season.equals("summer") && !season.equals("fall") && !pet.equals("Ostrich")){
            pet = "Axolotl";
        }
        else {
            pet = "Rock"; //if none of the previous conditions are met you get a lousy rock for a pet
        }
        if ((!color.equals("red") && !color.equals("blue") && !color.equals("green")) || (!season.equals("winter") && !season.equals("spring") && !season.equals("summer") && !season.equals("fall")) || "abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) == -1){
            System.out.println("INVALID RESPONSE IDIOT TRY AGAIN!"); //tells the user they are dumb because they put an invalid input for one of their things
        }
        else {
            System.out.println("Your perfect pet is: "+pet); //tells the user their perfect pet
        }
        scanner.close(); //close scanner to avoid resource leaks
    }
}
