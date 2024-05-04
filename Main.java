import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args){
        try{
            Person person = new Person("Konrad", 19);
            System.out.println("Imię: "+ person.getName());
            System.out.println("Wiek: "+ person.getAge());
        }catch(InvalidAgeException exc){
            System.out.println("Błąd: " + exc.getMessage());
            exc.printStackTrace();
        }
    }
    
}
