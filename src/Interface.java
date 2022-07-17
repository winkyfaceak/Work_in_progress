import java.util.Scanner;

public class Interface {
    public static void word (){
    System.out.println( "Here are all of your options");
    System.out.println("1, play Connect 4\n " + ("2, Calculator\n ") + ("3, date and time\n ") + ("4, open steam or steam games\n ") + ("5, Open music\n ") + ("6, Exit\n  ") );
    }
public static void Selection (){
    Scanner Input_Select = new Scanner(System.in);
    int Input = Integer.parseInt(Input_Select.nextLine());
    switch (Input) {
        case 1:
           Connect_4.main();
            break;
        case 2:
            Calculator.main();
            break;
        case 3:
        Weather_Time.main();
        break;
        case 4:
        steam_switcher.Steam_Selection();
        break;
    }
}
}
