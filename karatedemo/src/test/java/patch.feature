@patch
Feature: Sample API tests
Scenario: Test a sample PATCH API
Given url 'https://jsonplaceholder.typicode.com/posts'
When method PATCH
Then status 404