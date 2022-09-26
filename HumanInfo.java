import java.util.Scanner;

public class HumanInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String FirstName = scanner.nextLine();
        System.out.println("Введите фамилию");
        String LastName = scanner.nextLine();
        System.out.printf("Введите личный код");
        long isikukood = scanner.nextLong();
        if (isikukood.charAt[0]==5){
            String month = "Декабря";
        
        
        System.out.printf("%s %s родился %s ",FirstName,LastName,month);
        }
    }
    
}
