@get
Feature: Testing GET request
Scenario: Testing the API
Given the user in the URL which get is 'https://jsonplaceholder.typicode.com/posts/1'
When he sends the get request
Then he gets the response as 200