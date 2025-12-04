@put
Feature: Sample API tests
Scenario: Test a sample PUT API
Given url 'https://jsonplaceholder.typicode.com/posts/1'
When method PUT
Then status 200