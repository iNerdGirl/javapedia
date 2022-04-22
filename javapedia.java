import java.util.Scanner;

public class javaPedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n*********Javapedia***********");
        System.out.println("How many historical figures will you register?");
        int value = scan.nextInt();
        String[][] database = new String[value][3];

        scan.nextLine();
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure: " + (i+1));
            System.out.print("\t Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t Date of Birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
        }
        System.out.println("These are the values you stored:\n");
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();
        System.out.print("\n");

        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of Birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }
        System.out.print("\n");

        scan.close();
    }

    private static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
