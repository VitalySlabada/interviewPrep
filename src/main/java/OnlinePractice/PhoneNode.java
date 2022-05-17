package OnlinePractice;

public class PhoneNode {
    public String email;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    PhoneNode next;

    public PhoneNode(String email, String firstName, String lastName, String phoneNumber) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }



    @Override
    public String toString() {
        return "PhoneNode{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
