package company.utils;
import company.implementations.EmailMessenger;

public class MathUtils {
    public static int add(int a, int b){
        return MathUtils.add(a, b);
    }
     public static void main(String[] args) {
        int suma = add(10, 5);
        System.out.println("Suma: " + suma);
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Suma dwóch liczb wynosi: " + suma);
    }
}
