import java.util.Scanner;

public class HumanInfo {
    public static void main(String[] args) {  
       String[] month = {"Января","Февраля","Марта","Апреля","Мая","Июня","Июля","Августа","Сентября","Октября","Ноября","Декабря"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String FirstName = scanner.nextLine();
        System.out.println("Введите фамилию");
        String LastName = scanner.nextLine();
        System.out.printf("Введите личный код");
        String isikukood = scanner.nextLine();
        String firstLetter = isikukood.substring(0,1);
        String birthCentury="";
        String year=isikukood.substring(1,3);
        String months=isikukood.substring(3,5);
        String day=isikukood.substring(5,7);
        int monthsInt=new Integer(months);
        
        if (firstLetter.equals("5")){
            birthCentury = "20";
        }else if(firstLetter.equals("6")){
            birthCentury = "20";
        }else if (firstLetter.equals("3")){
            birthCentury = "19";
        }else if (firstLetter.equals("4")){
                birthCentury = "19";
        }
        System.out.printf("%s %s родился %s %s %s года",FirstName,LastName,day,month[monthsInt-1],birthCentury+year);
        System.out.println("");
       
    }
}
