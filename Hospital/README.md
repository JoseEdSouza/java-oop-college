# 🏥 Hospital System README 📖

This README provides an overview of the Hospital System project, including a description of the project, details about its structure, usage instructions, commands, contributors, licensing information, and acknowledgments.

## Table of Contents

- [Description](#Description%20📄)
- [Structure](#Structure%20🏗️)
- [Usage](#Usage%20🛠️)
- [Commands](#Commands%20💬)
- [Contributors](#Contributors%20👥)
- [License](#License%20📜)

## Description 📄

The Hospital System project is a Java program that simulates a hospital management system. It provides a user interface for adding patients and doctors to the hospital, establishing connections between them, and displaying the current state of the hospital. The project's main goal is to manage patients and doctors in a hospital environment efficiently.

## Structure 🏗️

The project consists of the following Java classes and interfaces:

- `App`: The `App` class serves as the main program entry point. It allows users to interact with the hospital system by entering commands through the console. Users can add patients and doctors, establish connections between them, and view the current state of the hospital.

- `Doctor`: The `Doctor` class represents a doctor in the hospital. It includes properties such as ID, specialty, and a collection of patients.

- `Hospital`: The `Hospital` class represents the hospital itself and contains methods to add and remove doctors and patients, as well as to establish connections between them.

- `IDoctor`: The `IDoctor` interface defines the contract for a doctor in the hospital. It includes methods to get the doctor's ID, add and remove patients, get the list of patients, and retrieve the specialty.

- `IPacient`: The `IPacient` interface defines the contract for a patient in the hospital. It includes methods to get the patient's ID, add and remove doctors, get the list of doctors, and retrieve the diagnosis.

- `Pacient`: The `Pacient` class represents a patient in the hospital. It includes properties such as ID, diagnosis, and a collection of doctors.

## Usage 🛠️

To use this project, follow the steps below:

1. **Setup Instructions**:
   - Ensure you have Java installed on your system to run this program.

2. **Installation**:
   - No specific installation is required. You can compile and run the program using a Java compiler or an integrated development environment (IDE) like Eclipse or IntelliJ IDEA.

3. **How to Run**:
   - Run the `App` class, which serves as the entry point for the program. It will provide a console interface for entering commands.

4. **Review Output**:
   - The program will display the results of the commands you enter, including the current state of the hospital or error messages for invalid commands.

## Commands 💬

- `addMeds [doctor1Name-specialty] [doctor2Name-specialty] ...`: Adds doctors to the hospital. Each doctor is specified with their name and specialty.

- `addPacs [patient1Name-diagnosis] [patient2Name-diagnosis] ...`: Adds patients to the hospital. Each patient is specified with their name and diagnosis.

- `tie [doctorName] [patientName]`: Establishes a connection between a doctor and a patient.

- `show`: Displays the current state of the hospital, including doctors, patients, and their connections.

- `end`: Exits the program.

## Contributors 👥

- [JoseEdSouza](https://github.com/JoseEdSouza) 👋

## License 📜

This project is licensed under the MIT License. You can find detailed licensing information in the `LICENSE.md` file included in the project directory.
