# Travel Club 
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.

## How Do I Use It? 
Travel Club app has many functionalities available. Deploy this application locally to your machine and start using the following endpoints avaialble. Here are a few:
<br />
<br />
> All flight numbers and it's corresponding details will be retrieved. 
```java 
GET http://localhost:8080/flight_numbers
```
> The expected payload response will look like: 
```json
[
    {
        "id": 8,
        "members": null,
        "flightNumber": null,
        "destination": null,
        "arrivalDestinationId": 1200,
        "departureTime": 1400,
        "arrivalTime": 1600
    },
    ...
```
<br />

> All itineraries and it's corresponding details will be retrieved. 
```java 
GET http://localhost:8080/itinerary
```
> The expected payload response will look like: 
```json
[
    {
        "id": 12,
        "airline": null,
        "itineraries": [],
        "departureTime": 1400,
        "arrivalTime": 1600
    },
    ...
```
<br />

> Create a flight number entry with the following endpoint, and pass in the following json payload in this format: 
```java 
POST http://localhost:8080/flight_numbers/create
```
```json
{
    "departureTime": 1845.02,
    "arrivalTime": 2300.35
}
```
> The expected payload response will look like: 
```json
{
    "id": 17,
    "airline": null,
    "itineraries": null,
    "departureTime": 1845,
    "arrivalTime": 2300
}
```
<br />


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Contributors 
