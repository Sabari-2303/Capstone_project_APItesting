@patch
Feature: Sample API tests
Scenario: Test a sample PATCH API
Given url 'https://jsonplaceholder.typicode.com/posts/1'
When method PATCH
Then status 200