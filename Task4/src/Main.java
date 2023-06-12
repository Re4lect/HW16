import java.util.Scanner;
public class Main {
    public static final String TEST = "([78])(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    public static void main(String[] args) {
    callNumber();
    }

    public static void callNumber(){
        System.out.println("Введите телевонный номер: ");
        String number = new Scanner(System.in).nextLine();
        number = number.replaceAll("[., \\-()+]","");

        if(number.length()==10){
            number = "8"+number;
        }
        if((number.length()==11)&&((number.charAt(0)=='7')||(number.charAt(0)=='8'))){
            System.out.println(number.replaceAll(TEST,"+7 ($2) $3 $4-$5"));
        }else {System.out.println("Ошибка");}

    }

}