package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class SmartphoneComparisonWithDatatablesSteps {
    private List<Map<String, String>> smartphoneCharacteristics;
    private String bestOperatingSystem;
    private Double largestDisplaySize;
    private Integer mostRAM;
    private Integer highestStorageCapacity;
    private Double lowestPrice;

    @Given("a list of smartphones with their characteristics:")
    public void populateSmartphoneCharacteristics(List<Map<String,String>> listOfSmartPhone) {
        smartphoneCharacteristics = listOfSmartPhone;
        System.out.println(smartphoneCharacteristics.get(1).get("Operating System"));
        System.out.println(Double.parseDouble(smartphoneCharacteristics.get(1).get("Display Size (inches)")));
        System.out.println(Integer.parseInt(smartphoneCharacteristics.get(1).get("RAM (GB)")));
        System.out.println(Integer.parseInt(smartphoneCharacteristics.get(1).get("Storage (GB)")));
        System.out.println(Double.parseDouble(smartphoneCharacteristics.get(1).get("Price ($)")));


    }

    @When("the user compares the smartphones based on the following characteristics:")
    public void compareSmartphones(DataTable dataTable) {
        List<String> characteristicsToCompare = dataTable.asList(String.class);
        // Let's initialize variables with the first smartphone values for comparison
        bestOperatingSystem = smartphoneCharacteristics.get(1).get("Operating System");
        largestDisplaySize = Double.parseDouble(smartphoneCharacteristics.get(1).get("Display Size (inches)"));
        mostRAM = Integer.parseInt(smartphoneCharacteristics.get(1).get("RAM (GB)"));
        highestStorageCapacity = Integer.parseInt(smartphoneCharacteristics.get(1).get("Storage (GB)"));
        lowestPrice = Double.parseDouble(smartphoneCharacteristics.get(1).get("Price ($)"));

        // Compare smartphones and update variables accordingly
        for (Map<String, String> smartphone : smartphoneCharacteristics) {
            updateBestOperatingSystem(smartphone.get("Operating System"));
            updateLargestDisplaySize(Double.parseDouble((smartphone.get("Display Size (inches)"))));
            updateMostRAM(Integer.parseInt(smartphone.get("RAM (GB)")));
            updateHighestStorageCapacity(Integer.parseInt(smartphone.get("Storage (GB)")));
            updateLowestPrice(Double.parseDouble(smartphone.get("Price ($)")));
        }
    }

    @Then("the user should be able to make comparisons between the smartphones and determine which smartphone has:")
    public void makeComparisons(List<String> listOfMakeCompares) {
        List<String> comparisons = listOfMakeCompares;

        for (String comparison : comparisons) {
            System.out.println(comparison + ": " + getComparisonResult(comparison));
        }

        // Additional print statements for the best Price, RAM size, and Display size
        System.out.println("\nBest Price: " + lowestPrice);
        System.out.println("Best RAM size: " + mostRAM + " GB");
        System.out.println("Best Display size: " + largestDisplaySize + " inches");
    }

    private void updateBestOperatingSystem(String currentOperatingSystem) {
        // Implement logic to determine the latest operating system
        // You can use version comparison or any other logic suitable for your scenario
        if (currentOperatingSystem.compareToIgnoreCase(bestOperatingSystem) > 0) {
            bestOperatingSystem = currentOperatingSystem;
        }
    }

    private void updateLargestDisplaySize(double currentDisplaySize) {
        // Implement logic to determine the largest display size
        if (currentDisplaySize > largestDisplaySize) {
            largestDisplaySize = currentDisplaySize;
        }
    }

    private void updateMostRAM(int currentRAM) {
        // Implement logic to determine the most RAM
        if (currentRAM > mostRAM) {
            mostRAM = currentRAM;
        }
    }

    private void updateHighestStorageCapacity(int currentStorageCapacity) {
        // Implement logic to determine the highest storage capacity
        if (currentStorageCapacity > highestStorageCapacity) {
            highestStorageCapacity = currentStorageCapacity;
        }
    }

    private void updateLowestPrice(double currentPrice) {
        // Implement logic to determine the lowest price
        if (currentPrice < lowestPrice) {
            lowestPrice = currentPrice;
        }
    }

    private String getComparisonResult(String comparison) {
        switch (comparison) {
            case "The latest operating system":
                return bestOperatingSystem;
            case "The largest display size":
                return String.valueOf(largestDisplaySize);
            case "The most RAM":
                return String.valueOf(mostRAM);
            case "The highest storage capacity":
                return String.valueOf(highestStorageCapacity);
            case "The lowest price":
                return String.valueOf(lowestPrice);
            default:
                return "Comparison not supported";
        }
    }
}