package output;

public class Output {
    public static void welcomeMessage(){
        System.out.print("""
                
                ***********************************************
                ********* <<Gestor de estudiantes>> ***********
                ***********************************************
                
                Ingrese las opciones del menú:
                
                1) Alta de estudiante
                2) Baja de esttudiante
                3) Modificar estudiante
                4) Listar estudiante
                5) Salir
                
                """);
    }

    public static void nameRequest() {
        System.out.println("Ingrese el nombre del estudiante: ");
    }

    public static void ageRequest(){
        System.out.println("Ingrese la edad del estudiante: ");
    }

    public static void birthdayRequest(){
        System.out.println("Ingrese la fecha de nacimiento del estudiante: ");
    }

    public static void curseRequest(){
        System.out.println("Ingrese la asignatura del estudiante: ");
    }

    public static void scoreRequest(){
        System.out.println("Ingrese la nota de la asignatura: ");
    }
    public static void addConfirmation(){
        System.out.println("Los datos fueron guardados con éxito!!!!!!!!");
    }
    public static void  studentSelect(){
        System.out.println("Por favor, seleccione al estudiante: ");
    }
    public static void valueRequest(){
        System.out.println("Ingrese el número de operación a realizar: ");
    }
}
