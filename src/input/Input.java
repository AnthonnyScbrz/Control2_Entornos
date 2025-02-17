package input;

import java.util.Scanner;

public class Input {
    public static Scanner value = new Scanner(System.in);


    public static int getMenuOption(){
        return value.nextInt();
    }
    public static String getFullName(){
        return value.next();
    }
    public static int getAage(){
        return value.nextInt();
    }
    public static String getBirthday(){
        return value.next();
    }
    public static String getCurse(){
        return value.next();
    }
    public static int getScore(){
        return value.nextInt();
    }
    public static int getStudentId(){
        return value.nextInt();
    }
    public static int scanValue(){
        return value.nextInt();
    }
}
