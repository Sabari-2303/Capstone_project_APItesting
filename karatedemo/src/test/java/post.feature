@post
Feature: Sample API tests
Scenario: Test a sample POST API
Given url 'https://jsonplaceholder.typicode.com/posts'
When method POST
Then status 201