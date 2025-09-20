import java.util.Arrays;

// Base class
class Google {
    String username;
    String pass;
    String dob;
    String emailId;
    long contact;
    String gender;

    Google(String username, String pass, String dob, String emailId, long contact, String gender) {
        super(); // Object class constructor
        this.username = username;
        this.pass = pass;
        this.dob = dob;
        this.emailId = emailId;
        this.contact = contact;
        this.gender = gender;
    }

    public void displayGoogle() {
        System.out.println("\nGoogle Details");
        System.out.println("Username      : " + this.username);
        System.out.println("Password      : " + this.pass);
        System.out.println("Date of Birth : " + this.dob);
        System.out.println("Email ID      : " + this.emailId);
        System.out.println("Contact       : " + this.contact);
        System.out.println("Gender        : " + this.gender);
    }
}

// Child class: GooglePay
class GooglePay extends Google {
    String name;
    long accountNumber;
    String ifscCode;
    int upiPin;
    long debitCard;

    GooglePay(String name, long accountNumber, String ifscCode, int upiPin, long debitCard,
              String username, String pass, String dob, String emailId, long contact, String gender) {
        super(username, pass, dob, emailId, contact, gender);
        this.name = name;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.upiPin = upiPin;
        this.debitCard = debitCard;
    }

    public void displayGooglePay() {
        displayGoogle();
        System.out.println("\nGoogle Pay Details");
        System.out.println("Name           : " + this.name);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("IFSC Code      : " + this.ifscCode);
        System.out.println("UPI PIN        : " + this.upiPin);
        System.out.println("Debit Card     : " + this.debitCard);
    }
}

// Child class: GoogleMap
class GoogleMap extends Google {
    String currentLoc;
    String[] bookmarks;
    String modeTravel;

    GoogleMap(String currentLoc, String[] bookmarks, String modeTravel,
              String username, String pass, String dob, String emailId, long contact, String gender) {
        super(username, pass, dob, emailId, contact, gender);
        this.currentLoc = currentLoc;
        this.bookmarks = bookmarks;
        this.modeTravel = modeTravel;
    }

    public void displayGoogleMap() {
        displayGoogle();
        System.out.println("\nGoogle Map Details");
        System.out.println("Current Location : " + this.currentLoc);
        System.out.println("Bookmarks        : " + Arrays.toString(this.bookmarks));
        System.out.println("Mode of Travel   : " + this.modeTravel);
    }
}

// Child class: GoogleMeet
class GoogleMeet extends Google {
    String hostName;
    String joiningLink;
    String schedule;
    String meetId;

    GoogleMeet(String hostName, String joiningLink, String schedule, String meetId,
               String username, String pass, String dob, String emailId, long contact, String gender) {
        super(username, pass, dob, emailId, contact, gender);
        this.hostName = hostName;
        this.joiningLink = joiningLink;
        this.schedule = schedule;
        this.meetId = meetId;
    }

    public void displayGoogleMeet() {
        displayGoogle();
        System.out.println("\nGoogle Meet Details");
        System.out.println("Host Name    : " + this.hostName);
        System.out.println("Joining Link : " + this.joiningLink);
        System.out.println("Schedule     : " + this.schedule);
        System.out.println("Meet ID      : " + this.meetId);
    }
}

// Child class: GoogleClassroom
class GoogleClassroom extends Google {
    String className;
    String subject;
    String teacherName;
    String classId;
    int countStudent;

    GoogleClassroom(String className, String subject, String teacherName, String classId, int countStudent,
                    String username, String pass, String dob, String emailId, long contact, String gender) {
        super(username, pass, dob, emailId, contact, gender);
        this.className = className;
        this.subject = subject;
        this.teacherName = teacherName;
        this.classId = classId;
        this.countStudent = countStudent;
    }

    public void displayGoogleClassroom() {
        displayGoogle();
        System.out.println("\nGoogle Classroom Details");
        System.out.println("Class Name       : " + this.className);
        System.out.println("Subject          : " + this.subject);
        System.out.println("Teacher Name     : " + this.teacherName);
        System.out.println("Class ID         : " + this.classId);
        System.out.println("Count of Student : " + this.countStudent);
    }
}

// Driver class
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {

        GooglePay obj1 = new GooglePay(
            "Akshay", 123456789L, "MODNIM007", 7809, 878967551234L,
            "Akshay", "Akshay@123", "06/08/1999", "akshaymali1137@gamil.com", 8007929317L, "Male"
        );
        obj1.displayGooglePay();

        System.out.println();

        GoogleMap obj2 = new GoogleMap(
            "JM road Deccan Pune", new String[] { "FC Road", "JM Road" }, "Bike",
            "Akshay", "Akshay@123", "06/08/1999", "akshaymali1137@gamil.com", 8007929317L, "Male"
        );
        obj2.displayGoogleMap();

        System.out.println();

        GoogleMeet obj3 = new GoogleMeet(
            "HR Qspiders", "meeet.google.com/abghfk123..//kjk", "09:00 AM", "ABC777",
            "Akshay", "Akshay@123", "06/08/1999", "akshaymali1137@gamil.com", 8007929317L, "Male"
        );
        obj3.displayGoogleMeet();

        System.out.println();

        GoogleClassroom obj4 = new GoogleClassroom(
            "M-17", "JAVA", "Shrikant Kokate", "jet89", 150,
            "Akshay", "Akshay@123", "06/08/1999", "akshaymali1137@gamil.com", 8007929317L, "Male"
        );
        obj4.displayGoogleClassroom();
    }
}
