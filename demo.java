import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Files;
import java.nio.file.Paths;

public class demo {

    public static void main(String[] args) throws Exception {
        String path = "D:\\TY-SEM-1\\CD\\Project\\Grammer\\asm.txt";

        String inputCode = new String(Files.readAllBytes(Paths.get(path)));
        System.out.println(inputCode);
        // Create a CharStream from the input code
        CharStream codeStream = CharStreams.fromString(inputCode);

        // Create a lexer
        x86asmLexer lexer = new x86asmLexer(codeStream);

        // Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser
        x86asmParser parser = new x86asmParser(tokens);

        // Start parsing from the 'prog' rule
        ParseTree tree = parser.prog();

        // Use grun to view the parse tree in the console
        System.out.println(tree.toStringTree(parser));

        // If you want to create a GUI with the parse tree, you can use third-party
        // tools or build a custom GUI.
    }

};
