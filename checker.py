from antlr4 import *
from x86asmLexer import x86asmLexer
from x86asmParser import x86asmParser
from antlr4.tree.Trees import Trees


def analyze_assembly_code(input_code):
    lexer = x86asmLexer(InputStream(input_code))
    token_stream = CommonTokenStream(lexer)
    parser = x86asmParser(token_stream)

    # Remove the default error listeners
    parser.removeErrorListeners()

    try:
        tree = parser.prog()  # Use the 'program' rule
        
        print("No syntax errors detected")

        # Print the parse tree using pygrun
        parser.tree = tree
        tree_str = Trees.toStringTree(tree, recog=parser)
        print(tree_str)

        return "No syntax errors detected"
    except Exception as e:
        return f"Syntax errors detected: {e}"

input_code = """
section .data
    num1 dd 5  ; Define a 4-byte (32-bit) integer with value 5
    num2 dd 7  ; Define another 4-byte integer with value 7

section .text
global _start

_start:
    mov eax, [num1]   ; Load the value at address num1 into the eax register
    add eax, [num2]   ; Add the value at address num2 to eax
    ; The result is now in eax

    ; You can add code to do something with the result here

    ; Exit the program
    mov ebx, eax       ; Copy the result to ebx for the exit code
    mov eax, 1         ; syscall number for sys_exit
    int 0x80           ; Call the kernel

section .bss
    ; Define uninitialized data sections if needed
"""

result = analyze_assembly_code(input_code)

print(result)
