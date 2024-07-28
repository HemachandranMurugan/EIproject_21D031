# Smart Home System Simulation

## Overview
This project is a console-based simulation of a Smart Home System, allowing users to control various smart devices (such as lights, thermostats, and door locks) through a central hub. The system supports turning devices on/off, scheduling device operations, and automating tasks based on specific triggers. The project follows best practices in software design, including the use of design patterns and SOLID principles.

## Features
1. **Device Management**
   - Initialize the system with various devices (light, thermostat, door lock).
   - Turn devices on or off.
   - Schedule device operations at specific times.
   - Automate tasks based on specific conditions (triggers).

2. **Design Patterns Used**
   - **Observer Pattern**: For updating all devices when a change occurs in the system.
   - **Factory Method Pattern**: For creating instances of different smart devices.
   - **Proxy Pattern**: For controlling access to the devices.

3. **OOP Principles**
   - Strong encapsulation, modularity, and the application of inheritance and polymorphism.

## Project Structure
- **SmartDevice.java**: Interface defining common behavior for all smart devices.
- **Light.java**: Class representing a light device.
- **Thermostat.java**: Class representing a thermostat device.
- **DoorLock.java**: Class representing a door lock device.
- **SmartDeviceFactory.java**: Factory class for creating smart devices.
- **Command.java**: Interface for executable commands.
- **TurnOnCommand.java**: Command class for turning a device on.
- **TurnOffCommand.java**: Command class for turning a device off.
- **Trigger.java**: Class for automating tasks based on specific conditions.
- **SmartHomeSystem.java**: Central hub managing devices, schedules, and triggers.
- **Main.java**: Entry point demonstrating the setup and usage of the system.

## How to Run
1. **Clone the Repository**
   ```sh
   git clone https://github.com/yourusername/smart-home-system.git
   cd smart-home-system
