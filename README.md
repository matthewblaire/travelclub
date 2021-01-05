# Travel Club 
Do you love to travel? Has the pandemic been disturbing your travel plans? Here is how the Travel Club Admin App works!
The administrator manages the members of the travel club and manage their travel plans by searching for airlines and destinations that can get members to their destination from a list of airlines. Two destinations and an airline creates a flight number for each airline. Members build out their own itineraries that includes the date they are travelling to which destination on what airline. Members can also be a member of a loyalty club where the higher their points, the more prestigeous their mememberships would be in the club.

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
