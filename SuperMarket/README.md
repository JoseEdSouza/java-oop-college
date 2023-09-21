# 🚀 SuperMarket Management README 📖

This README provides an overview of the SuperMarket Management project, including the `App`, `Shell`, and `Mercantil` classes. This project simulates a simple shell interface for a Brazilian bar (boteco) where users can call, finish, arrive, and display information about the bar's cashiers.

## Table of Contents

- [Description](#Description%20📄)
- [Usage](#Usage%20🛠️)
- [Commands](#Commands%20💬)
- [Contributors](#Contributors%20👥)
- [License](#License%20📜)

## Description 📄

The SuperMarket Management project is a Java program that provides a simple shell interface for managing a Brazilian bar. Users can interact with the bar by calling cashiers, finishing service, arriving at the bar, and viewing information about the bar's current state. This project aims to demonstrate basic management operations for a bar-like establishment.

## Usage 🛠️

To use this project, follow the steps below:

1. **Setup Instructions**:
   - Ensure you have Java installed on your system to run this program.

2. **Installation**:
   - No specific installation is required. You can compile and run the program using a Java compiler or an integrated development environment (IDE) like Eclipse or IntelliJ IDEA.

3. **How to Run**:
   - Run the `App` class, which serves as the entry point for the program. It will provide a shell interface for entering commands.

4. **Interact with the Project**:
   - Use the following commands to interact with the project:
     - `init [qntdCaixas]`: Initializes the bar with a given number of cashiers (e.g., `init 3`).
     - `call [index]`: Calls a cashier by specifying its index (e.g., `call 0`).
     - `finish [index]`: Finishes service at a cashier specified by its index (e.g., `finish 1`).
     - `arrive [nome]`: Allows a person to arrive at the bar by specifying their name (e.g., `arrive John`).
     - `show`: Displays information about the bar's state, including cashier availability and the waiting queue.
     - `end`: Exits the program.

5. **Review Output**:
   - The program will display the results of the commands you enter, such as the state of the bar or error messages.

## Commands 💬

- `init [qntdCaixas]`: Initializes the bar with the specified number of cashiers.

- `call [index]`: Calls a cashier by specifying its index.

- `finish [index]`: Finishes service at a cashier by specifying its index.

- `arrive [nome]`: Allows a person to arrive at the bar by specifying their name.

- `show`: Displays information about the bar's state, including cashier availability and the waiting queue.

- `end`: Exits the program.

## Contributors 👥

- [JoseEdSouza](https://github.com/JoseEdSouza) 👋

## License 📜

This project is licensed under the MIT License. You can find detailed licensing information in the `LICENSE.md` file included in the project directory.
