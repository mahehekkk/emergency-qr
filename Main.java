import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("=== Lost Person Emergency System ===");

                // Family details
                System.out.print("Enter family member name: ");
                String familyName = sc.nextLine();

                System.out.print("Enter family contact number: ");
                String familyPhone = sc.nextLine();

                System.out.print("Enter relation: ");
                String relation = sc.nextLine();

                FamilyMember family = new FamilyMember(
                                familyName,
                                familyPhone,
                                relation);

                // Emergency profile
                System.out.print("Enter medical condition: ");
                String condition = sc.nextLine();

                System.out.print("Enter last known location: ");
                String location = sc.nextLine();

                EmergencyProfile profile = new EmergencyProfile(
                                condition,
                                location,
                                family);

                // Person details
                System.out.print("Enter lost person name: ");
                String personName = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine(); // consume newline

                Person person = new Person(
                                personName,
                                age,
                                profile);

                // Finder details
                System.out.print("Enter finder name: ");
                String finderName = sc.nextLine();

                System.out.print("Enter place where person was found: ");
                String foundPlace = sc.nextLine();

                FoundReport report = new FoundReport(
                                finderName,
                                foundPlace);

                // Alert
                AlertService service = new AlertServiceImpl();
                service.notifyFamily(person, report);

                sc.close();
        }
}
