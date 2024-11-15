# Travel Itinerary Planner

The **Travel Itinerary Planner** is a Java-based application designed to assist users in planning their trips. Users can input destinations, travel dates, budgets, and preferences, and the application generates a detailed itinerary. Features include a budget calculator, placeholders for maps and weather information, and a menu-driven interface.

---

## Table of Contents

1. [Features](#features)
2. [Code Structure](#code-structure)
   - [Destination Class](#destination-class)
   - [Itinerary Class](#itinerary-class)
   - [TravelPlanner Class](#travelplanner-class)
3. [Future Considerations](#future-considerations)
   - [API Integration](#api-integration)
   - [Error Handling](#error-handling)
   - [User Preferences](#user-preferences)
   - [Advanced Budgeting](#advanced-budgeting)
4. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
5. [Usage](#usage)


---

## Features

- **Add Destinations**: Input destination names, travel dates, budgets, and additional details.
- **View Itinerary**: Displays a complete list of planned destinations with relevant details.
- **Budget Calculator**: Calculates the total estimated budget for the trip.
- **Placeholders for APIs**: Placeholders for integrating Google Maps and OpenWeather APIs for real-time maps and weather updates.
- **Simple Menu Interface**: Easy-to-use interface for managing destinations and itineraries.

---

## Code Structure

### Destination Class

**Attributes:**
- `name`: The name of the destination.
- `date`: The travel date.
- `budget`: The estimated budget for the destination.
- `mapLink`: The URL for the destination's map (currently a placeholder).
- `weatherInfo`: A summary of the weather forecast for the destination (currently a placeholder).

**Methods:**
- **Constructor**: Initializes the destination details.
- **`toString()`**: Returns a formatted string with destination details for display.

---

### Itinerary Class

**Attributes:**
- A list of `Destination` objects to manage multiple destinations.

**Methods:**
- **`addDestination()`**: Adds a new destination to the itinerary.
- **`displayItinerary()`**: Displays the complete itinerary with all destination details.
- **`calculateTotalBudget()`**: Calculates the total estimated budget for all destinations in the itinerary.

---

### TravelPlanner Class

- **Main Class**: Provides a menu-driven interface for interacting with the application.
  - **Features**:
    - Add destinations.
    - View the itinerary.
    - Calculate the total estimated budget.
    - Exit the program.

---

## Future Considerations

### API Integration
- Integrate **Google Maps API** for dynamic map generation.
- Use **OpenWeatherMap API** for real-time weather data.

### Error Handling
- Add input validation for:
  - Ensuring the budget is non-negative.
  - Enforcing valid date formats.

### User Preferences
- Enhance user experience by allowing the specification of:
  - Transportation modes.
  - Preferred activities.
  - Accommodation types.

### Advanced Budgeting
- Include detailed budget categories:
  - Transportation costs.
  - Accommodation expenses.
  - Activity fees.
  - Meal costs.

---

## Getting Started

### Prerequisites
- Java 8 or later installed on your system.

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Nikhith-08/CodeAlpha_Travel-Itinerary-Planner.git
2. Navigate to the project directory:
   ```bash
   cd CodeAlpha_Travel-Itinerary-Planner
3. Compile the application:
   ```bash
   javac Travel_Itinerary_Planner.java
4. Run the application:
   ```bash
   java Travel_Itinerary_Planner

### Usage
1. Run the Application: Start the program and navigate through the menu options.
2. Add Destinations: Input details such as destination name, date, budget, map link, and weather information.
3. View Itinerary: See the list of added destinations with all their details.
4. Calculate Budget: View the total estimated budget for all destinations in your itinerary.
5. Exit: End the application.


