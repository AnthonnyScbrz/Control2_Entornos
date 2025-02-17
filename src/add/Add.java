package add;
import input.Input;
import model.Student;
import output.Output;
import main.Main;

public class Add {
    public static void adduser(){
        for (int i =0;i<Main.STUDENT_NUMBER;i++){
            Output.nameRequest();
            String fullName = Input.getFullName();
            Output.ageRequest();
            int age = Input.getAage();
            Output.birthdayRequest();
            String birthday= Input.getBirthday();
            Output.curseRequest();
            String firstCurse = Input.getCurse();
            Output.scoreRequest();
            int firstScore = Input.getScore();
            Output.curseRequest();
            String secondCurse = Input.getCurse();
            Output.scoreRequest();
            int secondScore = Input.getScore();

           Main.students.put(i+1, new Student(fullName,age,birthday,firstCurse,firstScore,secondCurse,secondScore));
        }
        Output.addConfirmation();
    }
}
