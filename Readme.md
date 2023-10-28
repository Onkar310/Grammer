# X86 Assembly Language Suggestion Tool

## Overview

This project aims to create an X86 assembly code suggestion tool that provides context-based code suggestions as you type. It consists of an entry point `x86Suggestion.py`, a `main.py` module for generating lexer and parser, and integrates with ANTLR for parsing X86 assembly code.

## Prerequisites

Before setting up the project, make sure you have the following prerequisites:

- **Python**: Ensure you have Python installed (Python 3.x recommended).

- **ANTLR 4.13.1**: You need ANTLR version 4.13.1 for generating lexer and parser for X86 assembly code.

- **Java**: ANTLR requires a compatible Java Runtime Environment (JRE) installed on your system.

- **ANTLR 4.13.1 JAR File**: Download the ANTLR 4.13.1 JAR file, which will be used for grammar parsing in the project.

## Project Setup

Follow these steps to set up the project:

1. **Clone the Repository**: Clone this project repository from GitHub.

2. **Install Dependencies**: Ensure Python and Java are installed, and set up ANTLR 4.13.1 by downloading the JAR file.

3. **Install Required Python Libraries**: If needed, install Python libraries by specifying them in a `requirements.txt` file and using `pip`.

   ```bash
   pip install -r requirements.txt
   ```

## Using the Tool

### Step 1: Running the Tool

- Execute the entry point `x86Suggestion.py`:

  ```bash
  python x86Suggestion.py
  ```

## Using the Tool

### Step 2: Entering Input

Enter your X86 assembly code in the terminal editor. The tool will provide real-time context-based code suggestions as you type.

### Step 3: Generating Parse Tree

To parse the entered code, press the "Enter" key. The parser will process the input, generate a parse tree, and display the parse tree structure.

### Step 4: Exiting the Tool

To exit the tool, press "Ctrl+C" to send an interrupt signal, and the tool will terminate.

## Grammar and Code Suggestions

The tool offers code suggestions based on the X86 assembly language grammar and context. These suggestions assist you in writing valid X86 assembly code efficiently.

Enjoy using the X86 Assembly Language Suggestion Tool!
