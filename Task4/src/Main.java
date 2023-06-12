import java.util.Scanner;
public class Main {
    public static final String TEST = "([78])(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    public static void main(String[] args) {
    callNumber();
    }
    //  89999843233
    // +7 (999) 984 32-33
    public static void callNumber(){
        System.out.println("Введите телевонный номер: ");
        String number = new Scanner(System.in).nextLine();
        String newNumber = number.replaceAll("[., \\-()+]","");
        if((newNumber.length()==11)&&((newNumber.charAt(0)=='7')||(newNumber.charAt(0)=='8'))){
            System.out.println(newNumber.replaceAll(TEST,"+7 ($2) $3 $4-$5"));
        }else {System.out.println("Ошибка");}

    }

}