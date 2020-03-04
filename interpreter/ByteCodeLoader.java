
package interpreter;

import interpreter.bytecode.ByteCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;


public class ByteCodeLoader extends Object {

    private BufferedReader byteSource;
    
    /**
     * Constructor Simply creates a buffered reader.
     * YOU ARE NOT ALLOWED TO READ FILE CONTENTS HERE
     * THIS NEEDS TO HAPPEN IN loadCodes.
     */
    public ByteCodeLoader(String file) throws IOException {
        this.byteSource = new BufferedReader(new FileReader(file));
    }
    /**
     * This function should read one line of source code at a time.
     * For each line it should:
     *      Tokenize string to break it into parts. Can also use the split function in the String class.
     *      Grab THE correct class name for the given ByteCode from CodeTable
     *      Create an instance of the ByteCode class name returned from code table.
     *      Parse any additional arguments for the given ByteCode and send them to
     *      the newly created ByteCode instance via the init function.
     */
    public Program loadCodes() {
        String line;
        String codeToken;
        String className;
        Class classBlueprint;
        Constructor byteCodeConstructor;
        ByteCode byteCode;
        ArrayList<String> args;

        try {
            while (this.byteSource.ready()) {
                line = this.byteSource.readLine();
                String[] items = line.split("\\s+");
                codeToken = items[0];
                className = CodeTable.getClassName(codeToken);
                classBlueprint = Class.forName("interpreter.bytecode." + className);
                byteCodeConstructor = classBlueprint.getDeclaredConstructor();
                byteCode = (ByteCode) byteCodeConstructor.newInstance();
            }
            //initialize bytecode
            //add program object

        } catch (Exception e) {
            System.out.print(e);
            System.exit(-1);
        }
        //resolve addresses
        //return progra,
        return null;
    }
}
