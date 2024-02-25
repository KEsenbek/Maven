@lessons
Feature: Online Learning Platform

  Background:
    Given a teacher is logged in with user ID "teacher123"
    And the platform offers various lessons
    And the teacher navigates to the lessons section
  @regression @smoke
  Scenario: Successful Lesson Creation
    Given the teacher creates a new lesson with lesson name "Math Basics"
    When the teacher adds content and resources to the lesson
    And the lesson duration is "2.5" hours
    Then the lesson creation is successful
  @regression @smoke
  Scenario: Lesson Update
    Given the teacher selects an existing lesson with lesson ID "lesson456"
    When the teacher updates the content of the lesson
    Then the lesson update is successful
  @regression @smoke
  Scenario: Lesson Deletion
    Given the teacher chooses to delete a lesson with lesson ID "lesson789"
    When the teacher confirms the deletion
    Then the lesson is successfully deleted