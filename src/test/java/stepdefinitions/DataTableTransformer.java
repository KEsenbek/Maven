package stepdefinitions;

import io.cucumber.java.DataTableType;
import models.EmailAutomationSystem;
import models.EmployeeInformationManagementWithDatatables;
import models.HotelManagementSystem;
import models.SampleOptimization;

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
}
