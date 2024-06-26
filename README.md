# DREAMS Program Module
The DREAMS (Determined, Resilient, Empowered, AIDS-free, Mentored and Safe) Program

## Introduction
The DREAMS (Determined, Resilient, Empowered, AIDS-free, Mentored and Safe) partnership is an ambitious public-private partnership aimed at reducing rates of HIV among adolescent girls and young women (AGYW) in the highest HIV burden countries.

## Prerequisites
Make sure you have the following installed:
- Java (version 1.8)
- Maven (version 3.9.6)

## Building the Project
To build the project, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/Ondenge/openmrs-module-kenyadreams.git
   cd openmrs-module-kenyadreams


2. **Build**:
   ```sh
   mvn clean install

You'll find your .omod file in /omod/target/ directory.
Copy the file to your /OpenMRS/modules/ directory

Restart your webserver (tomcat 9)