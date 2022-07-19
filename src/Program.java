import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        String[] email = new String[n];
        int[] room = new int[10];

        for (int i = 0; i < name.length; i++){
            System.out.println("Rent " +(1+i));
            System.out.println("Name: ");
            name[i] = sc.next();
            System.out.println("Email: ");
            email[i] = sc.next();
            System.out.println("Room: ");
            int i1 = room[sc.nextInt()];

        }

    }
}
