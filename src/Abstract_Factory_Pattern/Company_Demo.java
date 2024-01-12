package Abstract_Factory_Pattern;

public class Company_Demo {
    public static void main(String[] args) {
        CompanyFactory amazon = new AmazonFactory();
        Company a = amazon.showCompanyName();
        CompanyFactory bosch = new BoschFactory();
        Company b = bosch.showCompanyName();
    }
}
