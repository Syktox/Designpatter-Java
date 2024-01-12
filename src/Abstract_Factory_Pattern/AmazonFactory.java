package Abstract_Factory_Pattern;

public class AmazonFactory extends CompanyFactory{
    @Override
    public Company createCompany() {
        return new Amazon();
    }
}
