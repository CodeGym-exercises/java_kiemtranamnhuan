import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        do {
            System.out.print("Nhap vao nam: ");
            int year = scanner.nextInt();

            boolean isLeapYear = false;
            boolean isDivisibleBy4 = year % 4 == 0;
            boolean isDivisibleBy100 = year % 100 == 0;
            boolean isDivisivleBy400 = year % 400 == 0;

            if(isDivisibleBy4){
                if(isDivisibleBy100){
                    if(isDivisivleBy400){
                        isLeapYear = true;
                    }
                }else {
                    isLeapYear = true;
                }
            }

            if(isLeapYear){
                System.out.printf("%d la nam nhuan!! ",year);
            }else{
                System.out.printf("%d khong phai nam nhuan!! ", year);
            }

            System.out.println("\nCo muon tiep tuc? (y/n)");
            String c = scanner.next();
            if(c.equals("n")){
                isContinue = false;
            }
        }while (isContinue);


    }
}
