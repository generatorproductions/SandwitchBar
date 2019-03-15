/**
 * Sets the menu items and their abbreviations based on difficulty.
 *
 * @author: Generator Productions
 * @version: 1.0
 */
import java.util.*;
import SandyParts.*;

public class Menu
{
    private static PartsList l = new PartsList();
    private static ArrayList<String> easyOptions = l.getEasyAbbrev();
    private static ArrayList<String> hardOptions = l.getHardAbbrev();
    private static ArrayList<SandwichParts> parts = l.getParts();
    /*
    private static String[] easyOptions = {"Rb", "Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "On","Pe", "Be", "Tk", "Ci","Tf", "Md", "Ma", "Hs", "Mm"};
    private static String[] hardOptions = {"Sb", "Sr", "Sh", "Pg", "Ev", "Lt", "Cb", "On","Pe", "Be", "Tk", "Ci","Tf", "Md", "Ma", "Hs","Mm", "Rb"};
    private static SandwichParts[] parts = {new RegularBun(),new SeededBun(),new SlicedGrain(),new SlicedWhite(),new PlainBagel(),new EverythingBagel(),new Lettuce(),new Cucumber(),new Onion(),new Pepper(),new Beef(),new Turkey(), new Chicken(),new Tofu(), new Mustard(), new Mayonnaise(), new HotSauce(),new Hummus()};
    */
    private static String menuString = "";
    private static String difficulty = "";
    
    /**
     * Creates the menu.
     */
    public Menu()
    {
    
    }
    
    /**
     * Sets difficulty
     * @param: The difficulty that the user wishes to play on
     */
    public Menu(String diff)
    {
        int i = 0;
        if(diff.equals("e") || diff.equalsIgnoreCase("easy"))
        {
            difficulty = "easy";
            menuString += "\n";
            for(String s : easyOptions)
            {
                menuString += parts.get(i) + " - " + s + "\t";
                if(parts.get(i).toString().length() < 11)
                {
                    menuString += "\t";
                }
                i++;
                if(i % 3 == 0)
                {
                    menuString += "\n";
                }
            }
            menuString += "\n";
        }
        else if(diff.equals("h") || diff.equalsIgnoreCase("hard"))
        {
            difficulty = "hard";
            menuString += "\n";
            for(String s : hardOptions)
            {
                menuString += parts.get(i) + " - " + s + "\t";
                if(parts.get(i).toString().length() < 11)
                {
                    menuString += "\t";
                }
                
                i++;
                if(i % 3 == 0)
                {
                    menuString += "\n";
                }
            }
            menuString += "\n";
        }
    }
    
    /**
     * Gets the difficulty
     * @return: The sandwich parts' abbreviations.
     */
    public String getDifficulty()
    {
       return difficulty;
    }
    
    /**
     * Prints out the menu.
     */
    public void printMenu()
    {
        System.out.print(menuString);
    }
}
