# Queue Visualization GUI

## Overview
This project implements a **Queue (FIFO) data structure** using linked lists and provides a GUI visualization for user interaction.

## Features
- Implements a **Queue using linked lists**.
- Supports enqueue, dequeue, size check, and visualization.
- Graphical queue representation using **Swing (JFrame)**.
- Includes **a parser that retrieves financial data**.

## Project Structure

📂 Queue_Visualization_GUI

├── 📂 src

│   ├── 📂 pkg00825_luisalonsocendra_proyecto2

│   │   ├── Main.java          # Entry point, initializes JFrame

│   │   ├── JFrame.java        # GUI for interacting with the Queue

│   │   ├── Cola.java          # Queue implementation using linked lists

│   │   ├── Nodo.java          # Node structure for linked list

│   │   ├── MyCanvas.java      # Graphics for visualizing the queue

│   │   ├── Parser_DSS_CDS.java # Parses financial data from URL

├── 📂 build                   # Compiled Java classes (ignored in Git)

├── 📂 dist                    # Packaged JAR file (ignored in Git)

├── build.xml                  # Apache Ant build file

├── manifest.mf                 # Manifest file for JAR packaging

├── .gitignore                  # Ignore compiled files, NetBeans configs

├── README.md                   # Project documentation

## Installation & Running

Prerequisites:
- Java Development Kit (JDK) 8 or later
- Apache Ant (for building the project)
- NetBeans (optional for development)

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/Queue_Visualization_GUI.git
   cd Queue_Visualization_GUI
   ```
2. Compile and run using NetBeans **or** command line:
   ```sh
   javac -d bin src/pkg00825_luisalonsocendra_proyecto2/*.java
   java -cp bin pkg00825_luisalonsocendra_proyecto2.Main
   ```

## License
This project is licensed under the MIT License.
