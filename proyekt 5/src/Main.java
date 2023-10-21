import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("reqem sayini secin:");
        int count=scanner.nextInt();
        System.out.println("reqemler");
        int number ,sum=0;
        for (int i=0;i<count;i++){
            number= scanner.nextInt();
            sum=sum+number;
        }
            System.out.println("daxil edilen reqemlerin cemi");
        System.out.println(sum);

    }
}