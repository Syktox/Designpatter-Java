package Abstract_Factory_Pattern;

public abstract class CompanyFactory {
    public Company showCompanyName() {
        Company c = createCompany();
        c.showName();
        return c;
    }

    public abstract Company createCompany();
}
