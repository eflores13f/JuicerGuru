import java.util.ArrayList;
import java.util.Scanner;

public class JuicerFinder {




    public static void main(String[] args) {

        //Array for each element Some arrays need to be updated and verified

        ArrayList<String> brain = new ArrayList<String>();
        brain.add("Beetroot");
        brain.add("Collard Greens");
        brain.add("Blueberries");
        brain.add("Grapes");
        brain.add("Cabbage");
        brain.add("Carrots");
        brain.add("Avocados");
        brain.add("Walnuts");
        brain.add("Apples");

        ArrayList<String> energy = new ArrayList<String>();
        energy.add("Apples");
        energy.add("Cauliflower");
        energy.add("Collard Greens");
        energy.add("Spinach");
        energy.add("Still adding............");

        ArrayList<String> kidney = new ArrayList<String>();
        kidney.add("Basil");
        kidney.add("blueberries");
        kidney.add("Cayenne Pepper");
        kidney.add("Lime");
        kidney.add("Watermelon");

        ArrayList<String> bP = new ArrayList<String>();
        bP.add("Pomegranate");
        bP.add("Alo Vera");
        bP.add("Cauliflower");

        ArrayList<String> detox = new ArrayList<String>();
        detox.add("Ginger");
        detox.add("Garlic");
        detox.add("Cabbage");
        detox.add("Cauliflower");
        detox.add("Kale");
        detox.add("Lime");

        //Application introduction needs to be polished up

        Scanner user_input = new Scanner(System.in);

        String name;
        System.out.println("Hi, what's your name?:  ");
        name = user_input.next();

        String juiceNeed;

        System.out.println("What can I help you with today? Brain , Energy, " +
                "Kidneys, Hypertension, Detox");



        //if statement portion Needs to be updated!

        juiceNeed = user_input.next();

        if(juiceNeed.equals("Brain")) {
            System.out.println(brain + ", These guys work wonders on your brain and can definitely optimize concentation, memory, and mental performance ");
        }
        else if(juiceNeed.equals("Energy")) {
            System.out.println(energy);
        }
        else if(juiceNeed.equals("Kidneys")) {
            System.out.println(kidney + " are excellent in detoxing your kidneys and helping in renal function");
        }
        else if(juiceNeed.equals("Hypertension")) {
            System.out.println(bP + " are the most effective in lowering blood pressure");
        }
        else if(juiceNeed.equals("Detox")) {
            System.out.println(detox);
        }
        else {
            System.out.println("Don't have that yet, " +
                    "try again later as I continue to build my cookbook");
        }
        System.out.println(name + ", consume these guys at least once a day, and you can dramatically change your life");






    }







}
