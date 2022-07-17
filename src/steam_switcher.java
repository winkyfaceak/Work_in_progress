import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;
public class steam_switcher {
    public static void steam()
    {
        try
        {
//constructor of file class having file as argument
            File file = new File("C:\\Program Files (x86)\\Steam");
            if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())         //checks file exists or not
                desktop.open(file);              //opens the specified file
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void tf2()
    {
        try
        {
//constructor of file class having file as argument
            File file = new File("C:\\Users\\james\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Steam\\Team Fortress 2.url");
            if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())         //checks file exists or not
                desktop.open(file);              //opens the specified file
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void Steam_Selection () {
        System.out.println("1, open Steam " + ("2, open TF2 "));
        Scanner Input_Select = new Scanner(System.in);
        int Input = Integer.parseInt(Input_Select.nextLine());
        switch (Input) {
            case 1:
                steam();
                break;
            case 2:
                tf2();
                break;
            default:
                System.out.println("Try again!");
        }
    }
}
