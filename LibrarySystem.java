
class LibraryUser {
    protected String userID;
    protected String name;
    protected String email;
    //constractor use it
    LibraryUser(String userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }
    
    void displayDetails() {
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

//next is  Librarian class
class Librarian extends LibraryUser {
    private String employeeID;
    private String workShift;
    
    // constractor for librarian class
    Librarian(String userID, String name, String email, 
                    String employeeID, String workShift) {
        super(userID, name, email);
        this.employeeID = employeeID;
        this.workShift = workShift;
    }
    
    @Override   //use ovrride function
    void displayDetails() {
        super.displayDetails();
        System.out.println("employee ID: " + employeeID);
        System.out.println("work shift: " + workShift);
        System.out.println("role: librarian");
    }
}

// other class is Member class
class Member extends LibraryUser {
    private String membershipID;
    private int borrowedBooksCount;
    
    Member(String userID, String name, String email, 
                 String membershipID, int borrowedBooksCount) {
        super(userID, name, email);
        this.membershipID = membershipID;
        this.borrowedBooksCount = borrowedBooksCount;
    }
    
    @Override              //use ovrride function
    public void displayDetails() {
        super.displayDetails();
        System.out.println("membership ID: " + membershipID);
        System.out.println("borrowed Books: " + borrowedBooksCount);
        System.out.println("role: Member");
    }
}

//other class is Guest class
class Guest extends LibraryUser {
    private String visitPurpose;
    
    Guest(String userID, String name, String email, 
                String visitPurpose) {
        super(userID, name, email);
        this.visitPurpose = visitPurpose;
    }
    
    @Override    //use ovrride function
    public void displayDetails() {
        super.displayDetails();
        System.out.println("visit Purpose: " + visitPurpose);
        System.out.println("role: Guest");
    }
}
  //runner class
 class LibrarySystem {
    public static void main(String[] args) {
        // first create different types of users
        Librarian librarian = new Librarian("9991", "Shoaib Riaz", 
                                          "shoaib@library.com", "EMP003", "Morning");
        Member member = new Member("9891", "Tayyab", 
                                  "tayab@email.com", "MEM456", 3);
        Guest guest = new Guest("6781", "Atiq", 
                               "atiq@email.com", "Research");
        
        // Display their details
        System.out.println("Librarian Details:");
        librarian.displayDetails();
        
        System.out.println("\nMember Details:");
        member.displayDetails();
        
        System.out.println("\nGuest Details:");
        guest.displayDetails();
    }
}
