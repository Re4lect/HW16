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

        String text2 = text.replaceAll("[,.:;]","");

        for (int i = 0; i < text2.length(); i++) {
            if (!String.valueOf(text2.charAt(i)).matches("[A-z ]")){
                System.out.println("Введен недопустимый символ!");
                System.exit(1);
        }}
        if (text2.split(" ").length<100){
            System.out.println("Вы ввели менее 100 слов!");
            System.exit(1);
        }
        String text3 = text2.replaceAll("\\s+","\n");
        System.out.println(text3);
    }


}