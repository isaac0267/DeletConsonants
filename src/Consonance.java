import java.util.Scanner;

public class Consonance {
    // In this project I will show you how to delet the Consonant from the sentence.
    // I will use the static.
    // I will use the Scanner, to take the input from the user.
    // For this project I will use a method in java that call replace

    // make the static and use the String as data type for that. I will give my string a name that I will use later
    static String removeConsonants(String str){
     return str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstwyvxz]",""); // In this line I used
        // the return statement and used the replaceAll method.This method is making the search a string for a specified
        // character, and return a new string where the specified character are replaced.

    }

    public static void main(String[] args) {
        boolean choice=true;
        do {
            String str_giveString,display_Consonants;  // make the two variable.
            //str_giveString=""; // it is not a necessary to initialized them.
            //display_Consonants=""; // when I want initialized a String, I can do that "". beacuse it take letter.
            System.out.println("Enter the sentence: ");
            Scanner input=new Scanner(System.in);
            str_giveString=input.nextLine(); // when the user enter something, it will be saved in "str_giveStrn);
            System.out.println();// make the new line.
            System.out.println("The string that you entered: "+str_giveString); // I use this method for saving the user option.
            display_Consonants=removeConsonants(str_giveString); // this line of the code will remove all the consonant.
            System.out.println("The result is:"+display_Consonants);// now I print the consonants.
        }while (choice);

    }

}
