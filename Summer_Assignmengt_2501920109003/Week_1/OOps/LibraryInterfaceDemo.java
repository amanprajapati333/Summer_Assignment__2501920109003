package Week_1.OOps;

interface LibraryUser {

    void registerAccount();

    void requestBook();
}

// Kid User Class
class KidUsers implements LibraryUser {

    private int age;
    private String bookType;

    // Constructor
    KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

// Adult User Class
class AdultUser implements LibraryUser {

    private int age;
    private String bookType;

    // Constructor
    AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        // Kid User Test
        KidUsers ku = new KidUsers(10, "Kids");
        ku.registerAccount();
        ku.requestBook();

        System.out.println();

        // Adult User Test
        AdultUser au = new AdultUser(23, "Fiction");
        au.registerAccount();
        au.requestBook();
    }
}
