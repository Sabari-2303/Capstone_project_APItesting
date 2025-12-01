@patch
Feature: Sample API tests
Scenario: Test a sample PATCH API
Given url for patch is 'https://jsonplaceholder.typicode.com/posts/1'
When method PATCH
Then status for patch is 200

