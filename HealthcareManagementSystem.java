import java.util.ArrayList;

class Patient {
    //first  patient attributes
    private String id;
    private String name;
    private int age;
    private String medicalHistory;
    private ArrayList<String> medicines;

    //make a constructor to create a new patient
    Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = "no history yet";
        this.medicines = new ArrayList<>();
    }

    //then methods patients can be use
    void changeName(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        }
    }

    void changeAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        }
    }

    // then methods doctors can be use
     void addMedicalInfo(String info, String medicine, boolean isDoctor) {
        if (isDoctor) {
            if (info != null) {
                this.medicalHistory = info;
            }
            if (medicine != null && !medicine.isEmpty()) {
                this.medicines.add(medicine);
            }
            System.out.println("Medical info updated!");
        } else {
            System.out.println("Sorry, only doctors can do this.");
        }
    }

    // then view medical info
     String showMedicalInfo(boolean isDoctor) {
        if (isDoctor) {
            return medicalHistory;
        }
        return "Private - doctor access only";
    }

     ArrayList<String> showMedicines(boolean isDoctor) {
        if (isDoctor) {
            return new ArrayList<>(medicines);
        }
        ArrayList<String> message = new ArrayList<>();
        message.add("Private - doctor access only");
        return message;
    }

    //then show basic info
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
 class SimpleHealthSystem {
    public static void main(String[] args) {
        // create a patient
        Patient p = new Patient("P009", "Jalal", 19);
        
        // then patient updates their info
        p.changeName("Shah Jalal");
        p.changeAge(19);
        System.out.println("Patient info: " + p);
        
        // then try to add medical info (not a doctor)
        p.addMedicalInfo("healthy", "vitamins", false);
        
        // then doctor adds medical info
        p.addMedicalInfo("allergy to peanuts", "antihistamines", true);
        p.addMedicalInfo("broken arm", "painkillers", true);
        
        // then doctor views info
        System.out.println("\ndoctor viewing records:");
        System.out.println("medical Info: " + p.showMedicalInfo(true));
        System.out.println("medicines: " + p.showMedicines(true));
        
        // non-doctor tries to view
        System.out.println("\npatient trying to view medical info:");
        System.out.println(p.showMedicalInfo(false));
        System.out.println(p.showMedicines(false));
    }
}
