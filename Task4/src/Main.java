import java.util.Scanner;
public class Main {
    public static final String TEST = "([78])(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    public static void main(String[] args) {
    callNumber();
    }

    public static void callNumber(){
        System.out.println("Введите телевонный номер: ");
        String number = new Scanner(System.in).nextLine();
        String newNumber = number.replaceAll("[., \\-()+]","");
        String lastNumber = "";
        if(newNumber.length()==10){
            lastNumber = "8"+newNumber;
        } else {lastNumber = newNumber;
        }
        if((lastNumber.length()==11)&&((lastNumber.charAt(0)=='7')||(lastNumber.charAt(0)=='8'))){
            System.out.println(lastNumber.replaceAll(TEST,"+7 ($2) $3 $4-$5"));
        }else {System.out.println("Ошибка");}

    }

}