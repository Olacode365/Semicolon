import java.util.ArrayList;
import java.util.Scanner;

public class PhoneLogTest {
    public static void main(String[] args) {
        ArrayList<PhoneLog> phoneLogs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        String phoneNumber;
        String address;
        String email;
        char add;

        do{
            System.out.print("enter name");
            name = scanner.nextLine();

            System.out.print("enter phoneNumber");
            phoneNumber = scanner.nextLine();

            System.out.print("enter email");
            email = scanner.nextLine();

            System.out.print("address");
            address = scanner.nextLine();

            phoneLogs.add(new PhoneLog(name, address, phoneNumber, email));

            System.out.print("Add");
            add = scanner.next().charAt(0);
            scanner.nextLine();
        }
        while (add == 'y' || add == 'Y');

        for(PhoneLog p: phoneLogs){
            p.output();
            System.out.println();
        }

        System.out.println();



    }
}
