package oop.example;


public class App 
{
    public static void main( String[] args )
    {
        Password userFile = new Password();
        userFile.setUserName();
        userFile.setUserPassword();
        boolean unCheck = userFile.checkUserName();

        if (unCheck){
            System.out.println("Hello "+userFile.getUserName()+".");
            boolean pCheck = userFile.checkUserPassword();
            if(pCheck){
                System.out.println("Welcome!");
            } else
            {
                System.out.println("I don't know you.");
            }
        } else
        {
            System.out.println("Username unknown.\n I don't know you.");
        }



    }
}
