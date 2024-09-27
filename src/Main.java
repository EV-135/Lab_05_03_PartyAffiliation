import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String party;
        Scanner in = new Scanner(System.in);

        System.out.println("What is your political party? [D, R, I]");
        party = in.nextLine();

        if (party.equals("D")){
            System.out.println("You get a Democratic Donkey");
        }
        else if (party.equals("R")){
            System.out.println("You get a Republican Elephant");
        }
        else if (party.equals("I")){
            System.out.println("You get an Independent Person");
        }
        else {
            System.out.println("You have chosen Other");
        }

    }
}