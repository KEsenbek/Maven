package models;

public class USTradingCompaniesAnalysis {

     private  String companyName;
    private  String headquarters;
    private int companyAssets;
    private int topShares;
    private int companyEmployees;
    private String representativeName;
    private int establishmentYear;
    private int expectedAssets;
    private int expectedTopShares;
    private int expectedEmployees;

    private String expectedHeadquarters;
    private String expectedRepresentative;
    private int expectedEstablishmentYear;
    private int expectedShareValue;
    private String expectedHighestPaid;
    private int expectedTotalAssets;

    public USTradingCompaniesAnalysis(String companyName, String headquarters, int companyAssets, int topShares, int companyEmployees, String representativeName, int establishmentYear, int expectedAssets, int expectedTopShares, int expectedEmployees, String expectedHeadquarters, String expectedRepresentative, int expectedEstablishmentYear, int expectedShareValue, String expectedHighestPaid, int expectedTotalAssets) {
        this.companyName = companyName;
        this.headquarters = headquarters;
        this.companyAssets = companyAssets;
        this.topShares = topShares;
        this.companyEmployees = companyEmployees;
        this.representativeName = representativeName;
        this.establishmentYear = establishmentYear;
        this.expectedAssets = expectedAssets;
        this.expectedTopShares = expectedTopShares;
        this.expectedEmployees = expectedEmployees;
        this.expectedHeadquarters = expectedHeadquarters;
        this.expectedRepresentative = expectedRepresentative;
        this.expectedEstablishmentYear = expectedEstablishmentYear;
        this.expectedShareValue = expectedShareValue;
        this.expectedHighestPaid = expectedHighestPaid;
        this.expectedTotalAssets = expectedTotalAssets;
    }

    public USTradingCompaniesAnalysis(String headquarters, int companyAssets, int topShares, int companyEmployees, String representativeName, int establishmentYear) {
        this.headquarters = headquarters;
        this.companyAssets = companyAssets;
        this.topShares = topShares;
        this.companyEmployees = companyEmployees;
        this.representativeName = representativeName;
        this.establishmentYear = establishmentYear;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public int getCompanyAssets() {
        return companyAssets;
    }

    public void setCompanyAssets(int companyAssets) {
        this.companyAssets = companyAssets;
    }

    public int getTopShares() {
        return topShares;
    }

    public void setTopShares(int topShares) {
        this.topShares = topShares;
    }

    public int getCompanyEmployees() {
        return companyEmployees;
    }

    public void setCompanyEmployees(int companyEmployees) {
        this.companyEmployees = companyEmployees;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public int getExpectedAssets() {
        return expectedAssets;
    }

    public void setExpectedAssets(int expectedAssets) {
        this.expectedAssets = expectedAssets;
    }

    public int getExpectedTopShares() {
        return expectedTopShares;
    }

    public void setExpectedTopShares(int expectedTopShares) {
        this.expectedTopShares = expectedTopShares;
    }

    public int getExpectedEmployees() {
        return expectedEmployees;
    }

    public void setExpectedEmployees(int expectedEmployees) {
        this.expectedEmployees = expectedEmployees;
    }

    public String getExpectedHeadquarters() {
        return expectedHeadquarters;
    }

    public void setExpectedHeadquarters(String expectedHeadquarters) {
        this.expectedHeadquarters = expectedHeadquarters;
    }

    public String getExpectedRepresentative() {
        return expectedRepresentative;
    }

    public void setExpectedRepresentative(String expectedRepresentative) {
        this.expectedRepresentative = expectedRepresentative;
    }

    public int getExpectedEstablishmentYear() {
        return expectedEstablishmentYear;
    }

    public void setExpectedEstablishmentYear(int expectedEstablishmentYear) {
        this.expectedEstablishmentYear = expectedEstablishmentYear;
    }

    public int getExpectedShareValue() {
        return expectedShareValue;
    }

    public void setExpectedShareValue(int expectedShareValue) {
        this.expectedShareValue = expectedShareValue;
    }

    public String getExpectedHighestPaid() {
        return expectedHighestPaid;
    }

    public void setExpectedHighestPaid(String expectedHighestPaid) {
        this.expectedHighestPaid = expectedHighestPaid;
    }

    public int getExpectedTotalAssets() {
        return expectedTotalAssets;
    }

    public void setExpectedTotalAssets(int expectedTotalAssets) {
        this.expectedTotalAssets = expectedTotalAssets;
    }
}
