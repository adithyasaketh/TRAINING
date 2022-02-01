import java.util.*;

class person{
    private String name;
    private String dateOfBirth;
    private String gender;
    private String mobileNumber;
    private String bloodGroup;
    
    person(String name , String dateOfBirth , String gender , String mobileNumber , String bloodGroup ){
        this.name = name;
        this.dateOfBirth=dateOfBirth;
        this.gender=gender;
        this.mobileNumber=mobileNumber;
        this.bloodGroup=bloodGroup;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getMobileNumber(){
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    
    public String getBloodGroup(){
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup=bloodGroup;
    }
}


class donor extends person{
    private String	bloodBankName;
    private String	donorType;
    private String	donationDate;
    
    donor(String bloodBankName,String donorType,String donationDate){
        this.bloodBankName=bloodBankName;
        this.donorType=donorType;
        this.donationDate=donationDate;
    }
    
    public String getBloodBankName(){
        return bloodBankName;
    }
    public void setBloodBankName(String bloodBankName){
        this.bloodBankName=bloodBankName;
    }
    
    public String getDonorType(){
        return donorType;
    }
    public void setDonorType(String donorType){
        this.donorType=donorType;
    }
    
    public String getDonationDate(){
        return donationDate;
    }
    public void setDonationDate(String donationDate){
        this.donationDate=donationDate;
    }
    
    
    public void displayDonationDetails(String name,String dateOfBirth,String gender,String mobileNumber,String bloodGroup,String bloodBankName,String donorType,String donationDate){
        System.out.println("Name :"+getName());
        System.out.println("Date Of Birth :"+getDateOfBirth());
        System.out.println("Gender : "+getGender());
        System.out.println("Mobile Number : "+getMobileNumber());
        System.out.println("Blood Group : "+getBloodGroup());
        System.out.println("Blood Bank Name : "+getBloodBankName());
        System.out.println("Donor Type : "+getDonorType());
        System.out.println("Donation Date : "+getDonationDate());
    }
}
public class Main{
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    donor don = new donor();
		System.out.println("Enter the name :");
		String name = in.nextLine();
    don.setName(name);
		
        System.out.println("Enter Date of Birth :");
        String dob = in.nextLine();
        don.setDateOfBirth(dob);
        System.out.println("Enter Gender :");
        String gender = in.nextLine();
        don.setGender(gender);
        System.out.println("Enter Mobile Number :");
        String mob = in.nextLine();
        don.setMobileNumber(mob);
        System.out.println("Enter Blood Group :");
        String bg = in.nextLine();
        don.setBloodGroup(bg);
        
        System.out.println("Enter Blood Bank Name :");
        String bbn = in.nextLine();
        don.setBloodBankName(bbn);
        
        System.out.println("Enter Donor Type :");
        String donor_type = in.nextLine();
        don.setDonorType(donor_type);
        
        System.out.println("Enter Donation Date :");
        String donation_date = in.nextLine();
        don.setDonationDate(donation_date);
        
        displayDonationDetails();
	}
}


