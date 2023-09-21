# 🍫 Vending Machine README 📖

This README provides an overview of the Vending Machine project, including a description of the project, details about its structure, usage instructions, commands, contributors, licensing information, and acknowledgments.

## Table of Contents

- [Description](#Description%20📄)
- [Structure](#Structure%20🏗️)
- [Usage](#Usage%20🛠️)
- [Commands](#Commands%20💬)
- [Contributors](#Contributors%20👥)
- [License](#License%20📜)

## Description 📄

The Vending Machine project is a Java program that implements a vending machine, allowing users to interact with it through a command-line interface. The vending machine simulates the operation of buying items, inserting cash, managing inventory, and tracking profits.

## Structure 🏗️

The project is structured into several Java classes, each serving a specific purpose:

- `App`: The `App` class serves as the main program entry point. It allows users to interact with the vending machine by entering commands through the console.

- `Slot`: The `Slot` class represents a slot in the vending machine, with properties such as name, price, and quantity. It is used to store item information.

- `VendingMachine`: The `VendingMachine` class represents the vending machine itself. It contains slots to store items, and it allows users to insert cash, buy items, and manage the machine's inventory and profit.

## Usage 🛠️

To use this project, follow the steps below:

1. **Setup Instructions**:
   - Ensure you have Java installed on your system to run this program.

2. **Installation**:
   - No specific installation is required. You can compile and run the program using a Java compiler or an integrated development environment (IDE) like Eclipse or IntelliJ IDEA.

3. **How to Run**:
   - Run the `App` class, which serves as the entry point for the program. It will provide a console interface for entering commands.

4. **Review Output**:
   - The program will display the results of the commands you enter, such as the current state of the vending machine or error messages.

## Commands 💬

- `init [capacity]`: Initializes the vending machine with the specified capacity.

- `show`: Displays the current state of the vending machine.

- `set [index] [name] [quantity] [price]`: Sets item information for a specific slot in the vending machine.

- `limpar [index]`: Clears item information in a slot.

- `dinheiro [cash]`: Inserts cash into the vending machine.

- `troco`: Withdraws any available cash as change.

- `comprar [index]`: Buys an item from the vending machine.

- `end`: Exits the program.

## Contributors 👥

- [JoseEdSouza](https://github.com/JoseEdSouza) 👋

## License 📜

This project is licensed under the MIT License. You can find detailed licensing information in the `LICENSE.md` file included in the project directory.
