package interpreter;

import java.util.ArrayList;
import java.util.HashMap;

import interpreter.bytecode.*;

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
        HashMap<String,Integer> jumpMap = new HashMap<>();
        ByteCode code = this.program.get(0);
/*
        for(int i = 0; i < program.size(); i++){
            if(code instanceof LabelCode){
                //look ofr all label codes and store the label and its addr
                //in a hashmap
                //45. Label continue<<9>>
                // (continue<<9>>, 45)
            }

        }

        for(){
            if(code instanceof JumpCode){
                final JumpCode jc = (JumpCode) code;
                //cast the code reference to correct concrete type
                //get label of gotocode
                //find index of label from jump
                //set address of gotocode with the returned index
            }
            //look for falsebranchcode, goto and call
            // and get the next the labels appear in the
            //program arraylist
        }
*/

    }




}
