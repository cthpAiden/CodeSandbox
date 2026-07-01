package schema;

import java.util.Scanner;

public class Member {

    private String memberID;
    private String memberName;
    private String email;
    private String phoneNumber;
    public static Scanner sc = new Scanner(System.in);

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Member() {
    }

    public Member(String memberID, String memberName, String email, String phoneNumber) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void inputInfor() {
        System.out.print("Enter member ID: ");
        memberID = sc.nextLine();
        System.out.print("Enter member name: ");
        memberName = sc.nextLine();
        System.out.print("Enter email: ");
        email = sc.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = sc.nextLine();
    }

    public static void showHeader() {
        System.out.println("-------------------------------");
        System.out.printf("|%-10s|%-30s|%-20s|%-15s|%n",
                "ID", "Name", "Email", "Phone No.");
    }

    public void showInfor() {
        System.out.printf("|%-10s|%-30s|%-20s|%-15s|%n",
                memberID, memberName, email, phoneNumber);
    }
}
