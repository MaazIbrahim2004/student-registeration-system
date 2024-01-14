# Student Registration System

## Overview
This web application is designed to facilitate the management of student data. It employs a robust Spring Boot backend, a MongoDB database, and a React frontend, providing a seamless full-stack solution. The system allows for comprehensive student management capabilities, including adding new student records, updating existing information, and deleting records as necessary.

The frontend showcases a clean and intuitive interface where the user can interact with the system. Built with modern React practices, it uses Axios for efficient and promise-based HTTP requests to connect with the backend API.

The Source code for the front-end can be found in this repository: https://github.com/MaazIbrahim2004/student-registeration-system-react-code

## Prerequisites
- Java JDK 17
- MongoDB 5.0 or higher
- Node.js 16.x or higher
- npm 8.x or higher

## Setup and Installation

### Backend Setup
1. **Clone the Backend Repository**
   ```bash
   git clone [backend-repository-url]

   ```
2. **Navigate to the Project Directory**
   ```bash
   cd [backend-directory]
   ```
3. **Build the Project**
   ```bash
   mvn clean install
   ```
4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

### Frontend Setup
1. **Clone the Repository**
   ```bash
   git clone [frontend-repository-url]
   ```
2. **Navigate to the Project Directory**
   ```bash
   cd [frontend-directory]
   ```
3. **Install Dependencies**
   ```bash
   npm install
   ```
4. **Start the Application**
   ```bash
   npm start
   ```

## Usage

### Running the Backend
- **Start the Spring Boot Application**
  ```bash
  mvn spring-boot:run
  ```
- **Access Swagger UI**: To access the API documentation and test the endpoints, navigate to `http://localhost:8080/swagger-ui.html` in your browser.

### Running the Frontend
- **Start the React Application**
  ```bash
  npm start
  ```
- **Accessing the Application**: The frontend will be available at `http://localhost:3000` in your browser.

## Features
- CRUD operations for student data.
- Responsive user interface with React.
- Backend API documentation with Swagger.

## Contributing
Explain how others can contribute to this project. Provide guidelines for submitting pull requests or issues.

## License
Specify the license under which your project is released, if applicable.

## Contact
Provide your contact information or any other means for users to reach out for support or inquiries.
