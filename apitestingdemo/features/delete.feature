@delete
Feature: Testing DELETE request
Scenario: Testing the API
Given The user is in the URL delete which is 'https://jsonplaceholder.typicode.com/posts/1'
When he sends Delete request
Then The system sends a status code of 200 to the user
