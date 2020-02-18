package interpreter;

import java.util.ArrayList;

public class Program {

    private ArrayList<ByteCode> program;

    public Program() {
        program = new ArrayList<>();
    }

    protected ByteCode getCode(int programCounter) {
        return this.program.get(programCounter);
    }

    /**
     * This function should go through the program and resolve all addresses.
     * Currently all labels look like LABEL <<num>>>, these need to be converted into
     * correct addresses so the VirtualMachine knows what to set the Program Counter
     * HINT: make note what type of data-structure ByteCodes are stored in.
     */
    public void resolveAddress() {

    }




}
