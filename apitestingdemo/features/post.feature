@post
Feature: Sample API tests
Scenario: Test a sample POST API
Given url is 'https://jsonplaceholder.typicode.com/posts'
When method POST
Then status is 201