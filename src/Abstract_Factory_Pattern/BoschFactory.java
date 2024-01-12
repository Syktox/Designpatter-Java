package Abstract_Factory_Pattern;

public class BoschFactory extends CompanyFactory{
    @Override
    public Company createCompany() {
        return new Bosch();
    }
}
