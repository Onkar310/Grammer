import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

import java.nio.file.Files;
import java.nio.file.Paths;

public class parseTree {
    public static void main(String[] args) throws Exception {
        // prepare token stream
        String path = "D:\\TY-SEM-1\\CD\\Project\\Grammer\\asm.txt";

        String inputCode = new String(Files.readAllBytes(Paths.get(path)));
        CharStream stream = CharStreams.fromString(inputCode);

        x86asmLexer lexer = new x86asmLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        x86asmParser parser = new x86asmParser(tokenStream);
        ParseTree tree = parser.prog();

        System.out.println(tree.toStringTree(parser));

        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}