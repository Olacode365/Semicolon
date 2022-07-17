public class PhoneLog {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public PhoneLog(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address= address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void output(){
        System.out.printf("%s%n%s%n%s%n%s",name, address, phoneNumber, email);
        System.out.println();
    }
}
