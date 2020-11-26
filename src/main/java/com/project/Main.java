package com.project;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        try(Scanner fileScanner = new Scanner(new File("Numbers.txt"))){
            while(fileScanner.hasNext()){
                String number = fileScanner.nextLine();
                System.out.println(number + " is regular " +
                        isRegularNumber(number));
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static boolean isRegularNumber(String number){
        String regex = "^((\\+?375|80)[\\- (]?)((29|25|33|44|17)[\\- )]?)(\\d{3})-?(\\d{2})-?(\\d{2})$";
        return Pattern.matches(regex,number);
    }
}
