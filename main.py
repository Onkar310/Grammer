import os
import subprocess

# Specify the grammar file
grammar_file = 'x86asm.g4'

# Define the command to run ANTLR
antlr_command = f"java -jar antlr-4.13.1-complete.jar -Dlanguage=Python3 {grammar_file}"

# Run ANTLR to generate lexer and parser
try:
    subprocess.run(antlr_command, shell=True, check=True)
    print("Lexer and parser generated successfully.")
except subprocess.CalledProcessError as e:
    print("Error generating lexer and parser:", e)
