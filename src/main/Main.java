package main;
import list.List;
import add.Add;
import input.Input;
import model.Student;
import output.Output;
import validator.Validator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        static int optionMenu;
        final static int USER_ADD =1;
        final static int USER_DELETE=2;
        final static int MODIFY_SCORE =3;
        final static int USER_LIST=4;
        final static int EXIT =5;
        public final static int STUDENT_NUMBER =2;
        public static HashMap<Integer, Student>students;
        public static Iterator<Map.Entry<Integer, Student>> iterate;
    public static void main(String[] args) {

        boolean userWantToExit= false;

        do {

            boolean correctOption = false;

            do {
                showMenu();
                optionMenu=selectValue();
                correctOption = validateOpcion();
            }while(!correctOption);

            if (optionMenu==EXIT){
                userWantToExit=true;
            }else {
                switch (optionMenu) {
                    case USER_ADD:
                        addUser();
                        list();
                        break;
                    case USER_DELETE:
                        break;
                    case MODIFY_SCORE:
                        break;
                    case USER_LIST:
                        list();
                        break;
                }
            }

        }while(!userWantToExit);

    }

    private static void list(){
        List.listStudent();
    }

    private static void addUser() {
        Add.adduser();
    }

    private static int selectValue() {

            Output.valueRequest();
            return Input.scanValue();

    }

    public static boolean validateOpcion(){
        return Validator.validateOpcion(optionMenu);
    }

    private static void showMenu() {
        Output.welcomeMessage();
    }


}