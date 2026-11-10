OCTOBER 30 1:40PM
Military Fitness Readiness Dashboard
Current Progress (Day 0 Complete)
Environment Setup
Homebrew installed
Java 21 installed
Node.js installed
npm installed
Git configured
GitHub authentication configured
IntelliJ installed
VS Code configured
Postman installed
Repository Setup
GitHub repository created
Local repository initialized
Remote repository connected
First commit created
First push to GitHub completed
Project Structure
military-fitness-readiness-dashboard/ ├── backend ├── frontend ├── docs └── README.md

Next Session (Day 1)
Goals:

Generate Spring Boot project
Import into IntelliJ
Create Workout model
Create GET /workouts endpoint
Create POST /workouts endpoint
Test endpoints with Postman
Architecture: React Frontend ↓ Spring Boot API ↓ Redis ↓ AWS EC2

October 30 5:40PM
Quick update: I got the backend up and running. Built the Spring Boot project, created my first REST API endpoint (GET /workouts), and have a local server running on port 8080. Next step is creating the workout model and returning actual workout data instead of a simple text response.

Day 1
Date: November 10, 2026

✅ Accomplishments
Created Spring Boot backend application
Learned project structure and Spring Boot architecture
Created Workout model class
Created WorkoutController
Built first REST API endpoint:
GET /workouts
Configured JSON responses
Tested API using browser
Learned how Java objects are automatically converted into JSON
Restored deleted Spring Boot application entry point
Troubleshot duplicate class issues
Troubleshot port 8080 conflicts
Learned basic Git workflow and GitHub integration
Added POST /workouts
Tested POST requests using Postman
Successfully submitted workout data via JSON request body
Verified workouts are returned through API
✅ Current Working Endpoints
GET /workouts
POST /workouts
✅ Sample Response
[
  {
    "date":"2026-10-30",
    "pushups":60,
    "situps":55,
    "runTime":"14:32"
  },
  {
    "date":"2026-11-10",
    "pushups":75,
    "situps":70,
    "runTime":"13:15"
  }
]
🧠 Concepts Learned
REST APIs
Controllers
Models
JSON Serialization
JSON Request Bodies
HTTP GET Requests
HTTP POST Requests
Spring Boot
API Testing with Postman
Git & GitHub Workflow
Debugging Spring Boot Applications
🚧 Current Limitations
Data is stored in memory only
Data is lost when application restarts
No database integration yet
No frontend yet
🎯 Day 2 Goals
Integrate Redis
Store workouts persistently
Learn how Spring Boot connects to databases
Continue preparing application for AWS deployment