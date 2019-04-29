import java.util.Scanner;
import java.util.Set;

public class UI {
    private Scanner reader;
    private PhoneBook pb;

    public UI(Scanner reader) {
        this.reader = reader;
        this.pb = new PhoneBook();
    }

    public void start() {
        this.welcome();
        System.out.println();
        this.takeCommand();
    }

    public void takeCommand() {
        String reading = "";
        boolean fl = true;
        while (fl) {
            System.out.println("command: ");
            reading = reader.nextLine();

            if (reading.equals("1")) {
                String number, name;
                System.out.println("whose number: ");
                name = reader.nextLine();
                System.out.println("number: ");
                number = reader.nextLine();
                pb.addEntry(name, number);
            }

            if (reading.equals("2")) {
                Set<String> nbs;
                System.out.println("whose number: ");
                nbs = pb.findEntry(reader.nextLine());
                if (!(nbs == null)) {
                    for (String s : nbs) {
                        System.out.println(s);
                    }
                } else {
                    System.out.println("not found");
                }
            }

            if (reading.equals("3")) {
                System.out.println("number: ");
                String result = pb.findEntryByPerson(reader.nextLine());
                if (result == null ) {
                    System.out.println("not found");
                } else {
                    System.out.println(result);
                }
            }

            if (reading.equals("4")) {
                System.out.println("not implemented");
            }

            if (reading.equals("5")) {
                System.out.println("not implemented");
            }

            if (reading.equals("x")) {
                fl = false;
            }
        }
    }

    private void welcome() {
        System.out.printf("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
    }
}
