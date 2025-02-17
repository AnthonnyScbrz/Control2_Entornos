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
    public static void studentEmpty(){
        System.out.println("No se encontró estudiante");
    }
    public static void tableHeader(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-20s | %-20s | %-2s | %-20s | %-2s |\n","ID","Nombre completo","Primera Asignatura","(nota)","Segunda Asignatura","(nota)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

    }
    public static void tableBody(int id, String nombreCompleto, String Primera_Asignatura, int nota1, String Segunda_Asignatura, int nota2) {
        System.out.printf("| %-2s | %-20s | %-20s | %-2s | %-20s | %-2s |\n", id, nombreCompleto, Primera_Asignatura, nota1, Segunda_Asignatura, nota2);
    }
    public static void tableEnds() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}
