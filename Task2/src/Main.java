import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkText(getText());
    }
    private static String getText(){
        System.out.println("Введите текст на английском, не менее 100 слов: ");
        return new Scanner(System.in).nextLine();
    }
    private static void checkText(String text){

        text = text.replaceAll("[,.:;]","");

        for (int i = 0; i < text.length(); i++) {
            if (!String.valueOf(text.charAt(i)).matches("[A-z ]")){
                System.out.println("Введен недопустимый символ!");
                System.exit(1);
        }}
        if (text.split(" ").length<100){
            System.out.println("Вы ввели менее 100 слов!");
            System.exit(1);
        }
        text = text.replaceAll("\\s+","\n");
        System.out.println(text);
    }


}