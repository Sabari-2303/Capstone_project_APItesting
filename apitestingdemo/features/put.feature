@put
Feature: Sample API tests
Scenario: Test a sample PUT API
Given url for put is 'https://jsonplaceholder.typicode.com/posts/1'
When method PUT
Then status for put is 200