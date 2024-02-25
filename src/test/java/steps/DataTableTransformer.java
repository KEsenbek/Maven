package steps;

import io.cucumber.java.DataTableType;
import models.*;

import java.util.Map;

public class DataTableTransformer {

    @DataTableType
    public HotelManagementSystem hotelManagementSystemEntity(Map<String,String> entry){
         String hotelName = entry.get("hotelName");
         String location = entry.get("location");
         int startRating = Integer.valueOf(entry.get("starRating"));
         String roomTypes = entry.get("roomTypes");
         double avgGuestRating = Double.valueOf(entry.get("avgGuestRating"));

        return new HotelManagementSystem(hotelName,location,startRating,roomTypes,avgGuestRating);
    }

    @DataTableType
    public EmailAutomationSystem emailAutomationSystem(Map<String,String> entry) {
        String emailType = entry.get("emailType");
        String scheduleFrequency = entry.get("scheduleFrequency");
        String sendTime = entry.get("sendTime");

        return new EmailAutomationSystem(emailType,scheduleFrequency,sendTime);
    }

    @DataTableType
    public EmployeeInformationManagementWithDatatables employeeInformationManagementWithDatatables(Map<String,String> entry){

        int employeeID = Integer.valueOf(entry.get("employeeID"));
        String firstName = entry.get("firstName");
        String lastName = entry.get("lastName");
        String department = entry.get("department");
        String position = entry.get("position");
        double salary = returnDouble(entry.get("salary"));

        return new EmployeeInformationManagementWithDatatables(employeeID,firstName,lastName,department,position,salary);
    }

    public double returnDouble(String var){
        return Double.valueOf(var.replace("$","").replace(",",""));
    }

    @DataTableType
    public SampleOptimization onlineOrderEntry(Map<String,String> entry) {
        String orderId = entry.get("orderId");
        String customerName = entry.get("customerName");
        String shippingAddress = entry.get("shippingAddress");
        String productName = entry.get("productName");
        int quantity = entry.get("quantity") != null ? Integer.valueOf(entry.get("quantity")) : 0;
        double unitPrice = entry.get("unitPrice") != null ? Double.parseDouble(entry.get("unitPrice")) : 0.0;
        double subtotal = entry.get("subtotal") != null ? Double.parseDouble(entry.get("subtotal")) : 0.0;
        double taxRate = entry.get("taxRate") != null ? Double.parseDouble(entry.get("taxRate").replaceAll("%","")) : 0.0;
        double taxAmount = entry.get("taxAmount") != null ? Double.parseDouble(entry.get("taxAmount")) : 0.0;
        double totalAmount = entry.get("totalAmount") != null ? Double.parseDouble(entry.get("totalAmount")) : 0.0;
        return new SampleOptimization(orderId,customerName,shippingAddress,productName,quantity,unitPrice,subtotal,taxRate,taxAmount,totalAmount);
    }

    @DataTableType
    public Shoes shoes(Map<String,String> entry) {
         String orderId = entry.get("orderId");
         String customerName = entry.get("customerName");
         String shippingBillingAddress = entry.get("shippingBillingAddress");
         String shoeModel = entry.get("shoeModel");
         int quantity = entry.get("quantity") != null ? Integer.valueOf(entry.get("quantity")) : 0;
         double unitPrice = entry.get("unitPrice") != null ? Double.valueOf(entry.get("unitPrice")) : 0.00;
         double subtotal = entry.get("subtotal") != null ? Double.valueOf(entry.get("subtotal")) : 0.00;
         int taxRate = entry.get("taxRate") != null ? Integer.valueOf(entry.get("taxRate")) : 0;
         double taxAmount = entry.get("taxAmount") != null ? Double.valueOf(entry.get("taxAmount")) : 0.00;
         double totalAmount = entry.get("totalAmount") != null ? Double.valueOf(entry.get("totalAmount")) : 0.00;

         return new Shoes(orderId,customerName,shippingBillingAddress,shoeModel,quantity,unitPrice,subtotal,taxRate,taxAmount,totalAmount);
    }

    @DataTableType
    public F1DataManagementSystem f1DataManagementSystem(Map<String,String> entry) {
         int totalTeams = Integer.valueOf(entry.get("totalTeams"));
         String teamType = entry.get("teamType");
         String teamName = entry.get("teamName");
         String teamRole = entry.get("teamRole");
         String representativeTitle = entry.get("representativeTitle");
         String representativeName = entry.get("representativeName");
         String team1Name = entry.get("team1Name");
         String team2Name = entry.get("team2Name");

         return new F1DataManagementSystem(totalTeams,teamType,teamName,teamRole,representativeTitle,representativeName,team1Name,team2Name);
    }

    @DataTableType
    public USTradingCompaniesAnalysis usTradingCompaniesAnalysis(Map<String,String> entry) {
         String companyName = entry.get("companyName");
         String headquarters = entry.get("headquarters");
         int companyAssets = (entry.get("companyAssets")) != null ? Integer.valueOf(entry.get("companyAssets")) : 0;
         int topShares = entry.get("topShares") != null ? Integer.valueOf(entry.get("topShares")):0;
         int companyEmployees = entry.get("companyEmployees") != null ? Integer.valueOf(entry.get("companyEmployees")) : 0;
         String representativeName = entry.get("representativeName");
         int establishmentYear = entry.get("establishmentYear") != null ? Integer.valueOf(entry.get("establishmentYear")) :0;
         int expectedAssets = entry.get("expectedAssets") != null ? Integer.valueOf(entry.get("expectedAssets")) : 0;
         int expectedTopShares = entry.get("expectedTopShares") != null ? Integer.valueOf(entry.get("expectedTopShares")) : 0;
         int expectedEmployees = entry.get("expectedEmployees") != null ? Integer.valueOf(entry.get("expectedEmployees")) : 0;
         String expectedHeadquarters = entry.get("expectedHeadquarters");
         String expectedRepresentative = entry.get("expectedRepresentative");
         int expectedEstablishmentYear = entry.get("expectedEstablishmentYear") != null ?Integer.valueOf(entry.get("expectedEstablishmentYear")) : 0;
         int expectedShareValue = entry.get("expectedShareValue") !=null ?Integer.valueOf(entry.get("expectedShareValue")) : 0;
         String expectedHighestPaid = entry.get("expectedHighestPaid");
         int expectedTotalAssets = entry.get("expectedTotalAssets") != null ?Integer.valueOf(entry.get("expectedTotalAssets")) : 0;

         return new USTradingCompaniesAnalysis(companyName,headquarters,companyAssets,
                 topShares,companyEmployees,representativeName,establishmentYear,expectedAssets,
                 expectedTopShares,expectedEmployees,expectedHeadquarters,expectedRepresentative,
                 expectedEstablishmentYear,expectedShareValue,expectedHighestPaid,expectedTotalAssets);
    }

}
