# 📈 LoanShark Application README 📖

This README provides an overview of the LoanShark project, including a description of the project, its structure, usage instructions, available commands, contributors, licensing information, and acknowledgments.

## Table of Contents

- [Description](#Description%20📄)
- [Structure](#Structure%20🏗️)
- [Usage](#Usage%20🛠️)
- [Commands](#Commands%20💬)
- [Contributors](#Contributors%20👥)
- [License](#License%20📜)

## Description 📄

The LoanShark project is a Java application that simulates an Loan Shark system. This application allows the management of clients, lending and receiving money, and tracking transaction history. The main goal of the project is to provide a simplified system for loan management.

## Structure 🏗️

The project consists of several Java classes:

- `App`: The `App` class serves as the main program entry point. It enables users to interact with the Agiota system by entering commands through the console. Users can create a new Agiota object, add clients, perform lending and receiving operations, view transaction history, and terminate the program.

- `Client`: The `Client` class represents a client in the Agiota system. It includes properties such as the client's name, credit limit, and balance.

- `LoanShark`: The `LoanShark` class represents the Agiota object and serves as the core of the system. It keeps track of the overall balance, client information, and transaction history. This class includes methods for adding clients, performing lending and receiving operations, and displaying the system's current state.

- `Transaction`: The `Transaction` class represents a transaction made by a client. It includes properties such as the transaction ID, client ID, and transaction value.

- `Main`: The `Main` class demonstrates the functionality of the Agiota system by adding clients, performing lending and receiving operations, and checking the system's status.

## Usage 🛠️

To use this project, follow the steps below:

1. **Setup Instructions**:
   - Ensure you have Java installed on your system to run this program.

2. **Installation**:
   - No specific installation is required. You can compile and run the program using a Java compiler or an integrated development environment (IDE) like Eclipse or IntelliJ IDEA.

3. **How to Run**:
   - Run the `App` class, which serves as the entry point for the program. It will provide a console interface for entering commands.

4. **Review Output**:
   - The program will display the results of the commands you enter, including the current state of the Agiota system or error messages for invalid commands.

## Commands 💬

- `init [initialBalance]`: Initializes the Agiota system with an initial balance.

- `addCli [clientName] [creditLimit]`: Adds a new client to the system with a specified name and credit limit.

- `lend [clientName] [amount]`: Lends a specified amount of money to a client.

- `receive [clientName] [amount]`: Receives a specified amount of money from a client.

- `kill [clientName]`: Removes a client and all associated transactions from the system.

- `show`: Displays the current state of the Agiota system, including clients, transactions, and balance.

- `end`: Exits the program.

## Contributors 👥

- [JoseEdSouza](https://github.com/JoseEdSouza) 👋

## License 📜

This project is licensed under the MIT License. You can find detailed licensing information in the `LICENSE.md` file included in the project directory.
