# 🚆 Train System README 📖

This README provides an overview of the Train System project, which is a Java program simulating the operation of a train system. It includes a description of the project, details about its structure, usage instructions, commands, contributors, licensing information, and acknowledgments.

## Table of Contents

- [Description](#Description%20📄)
- [Structure](#Structure%20🏗️)
- [Usage](#Usage%20🛠️)
- [Commands](#Commands%20💬)
- [Contributors](#Contributors%20👥)
- [License](#License%20📜)

## Description 📄

The Train System project is a Java program that simulates the operation of a train system. It allows users to perform various operations related to train management, including initializing the train, adding wagons to the train, boarding and disembarking passengers, and tracking passenger movements. The primary objectives of this project are to demonstrate object-oriented programming in Java and simulate the operation of a train system.

## Structure 🏗️

The project is structured into several Java classes, each serving a specific purpose:

- `App`: The `App` class serves as the main program entry point. It allows users to interact with the train system by entering commands through the console.

- `Direction`: The `Direction` enumeration defines two values: `IN` and `OUT`, representing passenger movement directions. It is used to track passenger movements.

- `Movement`: The `Movement` class represents a movement of a passenger in a specific direction (IN or OUT).

- `Register`: The `Register` class manages the registration and movement of passengers in the train system. It maintains lists of registered passengers and their movements.

- `Train`: The `Train` class represents the train itself and provides methods to manage wagons, board and disembark passengers, and track passenger movements. It also uses the `Register` class to maintain passenger information.

- `Wagon`: The `Wagon` class represents a wagon in the train, with a certain capacity and the ability to embark and disembark passengers.

## Usage 🛠️

To use this project, follow the steps below:

1. **Setup Instructions**:
   - Ensure you have Java installed on your system to run this program.

2. **Installation**:
   - No specific installation is required. You can compile and run the program using a Java compiler or an integrated development environment (IDE) like Eclipse or IntelliJ IDEA.

3. **How to Run**:
   - Run the `App` class, which serves as the entry point for the program. It will provide a console interface for entering commands.

4. **Interact with the Project**:
   - Use the following commands to interact with the train system:
     - `init [maxVagoes]`: Initializes the train with the specified maximum number of wagons (e.g., `init 5`).
     - `nwvag [capacidade]`: Adds a new wagon with the specified capacity to the train (e.g., `nwvag 50`).
     - `la`: Displays the current state of the train, including the wagons and passenger information.
     - `entrar [passName]`: Boards a passenger with the specified name onto the train (e.g., `entrar Alice`).
     - `sair [passName]`: Disembarks a passenger with the specified name from the train (e.g., `sair Bob`).
     - `cadastro`: Displays the names of all registered passengers.
     - `movimentacao`: Displays the movements of passengers (IN or OUT) on the train.
     - `end`: Exits the program.

5. **Review Output**:
   - The program will display the results of the commands you enter, such as the current state of the train or error messages.

## Commands 💬

- `init [maxVagoes]`: Initializes the train with the specified maximum number of wagons.

- `nwvag [capacidade]`: Adds a new wagon with the specified capacity to the train.

- `la`: Displays the current state of the train, including the wagons and passenger information.

- `entrar [passName]`: Boards a passenger with the specified name onto the train.

- `sair [passName]`: Disembarks a passenger with the specified name from the train.

- `cadastro`: Displays the names of all registered passengers.

- `movimentacao`: Displays the movements of passengers (IN or OUT) on the train.

- `end`: Exits the program.

## Contributors 👥

- [JoseEdSouza](https://github.com/JoseEdSouza) 👋

## License 📜

This project is licensed under the MIT License. You can find detailed licensing information in the `LICENSE.md` file included in the project directory.
