import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Reserva[] reserva = new Reserva[10];

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 0; i < reserva.length; i++){

            System.out.println("Rent #" +(1+i));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println();

            reserva[room] = new Reserva(name, email, room);
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < reserva.length; i++){
            if(reserva[i] != null){
                System.out.println(reserva[i].toString());
            }
        }

    }
}
