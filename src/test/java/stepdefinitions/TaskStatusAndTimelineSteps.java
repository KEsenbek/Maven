package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskStatusAndTimelineSteps {

    private Map<String, Task> tasks = new HashMap<>();
    private Task currentTask;

    private static class Task {
        String title;
        String status;
        LocalDate startDate;
        LocalDate dueDate;
        LocalDate completionDate;
        LocalDate deferredDate;

        public String getFormattedTimeline() {
            if ("Completed".equals(status)) {
                return String.format("Start Date: %s Completion Date: %s", startDate, completionDate);
            } else if ("Deferred".equals(status)) {
                return String.format("Start Date: %s Deferred Date: %s", startDate, deferredDate);
            } else {
                return String.format("Start Date: %s Due Date: %s", startDate, dueDate);
            }
        }
    }

    @Given("the task with the title {string} exists")
    public void createTask(String title) {
        Task task = new Task();
        task.title = title;
        task.dueDate = LocalDate.now(); // Initialize dueDate with the current date or provide a default value
        tasks.put(title, task);
        currentTask = task;
    }

    @Given("the task's current status is {string}")
    public void setTaskStatus(String status) {
        currentTask.status = status;
    }

    @Given("the task's start date is {string}")
    public void setTaskStartDate(String startDateString) {
        currentTask.startDate = LocalDate.parse(formatTimeline(startDateString));
    }

    @Given("the task's due date year is {int}")
    public void setTaskDueDateYear(int year) {
        if (currentTask.dueDate == null) {
            throw new RuntimeException("Due date is not initialized.");
        }
        currentTask.dueDate = currentTask.dueDate.withYear(year);
    }

    @Given("the task's due date month is {int}")
    public void setTaskDueDateMonth(int month) {
        if (currentTask.dueDate == null) {
            throw new RuntimeException("Due date is not initialized.");
        }
        currentTask.dueDate = currentTask.dueDate.withMonth(month);
    }

    @When("the user changes the task status to {string}")
    public void changeTaskStatus(String newStatus) {
        currentTask.status = newStatus;
        if ("Completed".equals(newStatus)) {
            currentTask.completionDate = LocalDate.now();
        } else if ("Deferred".equals(newStatus)) {
            currentTask.deferredDate = LocalDate.now();
        }
    }

    @Then("the task's status should be {string}")
    public void verifyTaskStatus(String expectedStatus) {
        assertEquals(expectedStatus, currentTask.status);
    }

    @Then("the task's timeline should be updated with {string}")
    public void verifyTimelineUpdate(String expectedTimeline) {
        String formattedExpectedTimeline = formatTimeline(expectedTimeline);
        String formattedActualTimeline = formatTimeline(currentTask.getFormattedTimeline());
        assertEquals(formattedExpectedTimeline, formattedActualTimeline);
    }

    private String formatTimeline(String timeline) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedTimeline = timeline
                .replaceAll("Start Date: \\d{4}-\\d{2}-\\d{2}", "Start Date: " + formatDate(currentTask.startDate, formatter))
                .replaceAll("Due Date: \\d{4}-\\d{2}-\\d{2}", "Due Date: " + formatDate(currentTask.dueDate, formatter))
                .replaceAll("Completion Date: \\[Today's Date\\]", "Completion Date: " + LocalDate.now().format(formatter))
                .replaceAll("Deferred Date: \\[Today's Date\\]", "Deferred Date: " + LocalDate.now().format(formatter));

        return formattedTimeline;
    }

    private String formatDate(LocalDate date, DateTimeFormatter formatter) {
        return date != null ? formatter.format(date) : "[null]";
    }


}