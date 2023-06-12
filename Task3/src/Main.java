import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        fullNames();
    }
    private static void fullNames(){
        final String REGEX_NAME ="(([А-я]+-*[А-я]* ){2}[А-я]+-*[А-я]*)";
        System.out.println("Введите ФИО: ");
        String name = new Scanner(System.in).nextLine();
        if(!name.matches(REGEX_NAME)
        ){
            System.out.println("Введенный текст не является ФИО!");
            System.exit(1);
        }
        System.out.println("Фамилия: "+name.split(" ")[0]+"\n"+
                "Имя: "+name.split(" ")[1]+"\n"+
                "Отчество: "+name.split(" ")[2]+"\n");

    }
}