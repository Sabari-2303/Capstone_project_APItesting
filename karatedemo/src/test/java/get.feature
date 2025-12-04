Feature: Sample API tests
Scenario: Test a sample GET API
Given url 'https://jsonplaceholder.typicode.com/posts'
When method GET
Then status 200