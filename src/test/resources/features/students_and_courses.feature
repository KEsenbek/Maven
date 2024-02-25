@lessons @regression @smoke
Feature: Student Management

  Background:
    Given a student is logged in with student ID "student789"
    And the platform provides information on available courses
    And the student explores the course offerings

  Scenario: Enrolling in a Course
    Given the student selects a course for enrollment with course code "course101"
    When the student completes the enrollment process
    And the course fee is "$50.00"
    Then the enrollment is successful

  Scenario: Course Progress Tracking
    Given the student accesses a course with course ID "course456"
    When the student views the course materials and marks progress
    And the course completion percentage is "75%"
    Then the progress tracking is successful

  Scenario: Course Withdrawal
    Given the student decides to withdraw from a course with course code "course202"
    When the student confirms the withdrawal
    Then the course withdrawal is successful