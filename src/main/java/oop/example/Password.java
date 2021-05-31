package oop.example;

import java.util.Scanner;
import java.util.Arrays;

public class Password {
    private String userName;
    private String userPassword;

    public void setUserName(){
        Scanner input = new Scanner(System.in);
        int stringLength;

        do{
            System.out.println("Set your username: ");
            userName = input.next();

            if (userName.length() < 4){
                System.out.println("Usernames must contain at least 4 characters.");
            }
            stringLength = userName.length();

        }while (stringLength < 4);

    }

    public void setUserPassword(){
        Scanner input = new Scanner(System.in);
        int stringLength;

        do{
            System.out.println("Set your password: ");
            userPassword = input.next();

            if(userPassword.length() < 4){
                System.out.println("Passwords must contain at least 4 characters.");
            }
            stringLength = userPassword.length();
        }while (stringLength < 4);

    }

    public boolean checkUserName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String check = input.next();
        char [] checkArray = check.toCharArray();
        char [] userNameArray = userName.toCharArray();
        return Arrays.equals(checkArray, userNameArray);

    }

    public boolean checkUserPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String check = input.next();
        char [] checkArray = check.toCharArray();
        char [] userPasswordArray = userPassword.toCharArray();
        return Arrays.equals(checkArray, userPasswordArray);
    }

    public String getUserName() {
        return userName;
    }
}
