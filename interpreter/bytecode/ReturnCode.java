package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class ReturnCode extends ByteCode {
    int returnValue;
    int returnAddr;
    String arg;

    /*TODO
        1.store top of RTS
        2.empty currFrame
        3.pop top of framepointer stack
        4.pop returnAddress stack and change program counter
        5.store value of function to rts
     */
    @Override
    public void execute(VirtualMachine virtualMachine) {
        returnValue = virtualMachine.pop();
        virtualMachine.emptyFrame();
        virtualMachine.popFramePointer();
        returnAddr = virtualMachine.popReturnAddress();
        virtualMachine.setProgramCounter(returnAddr);
        virtualMachine.push(returnValue);
    }

    @Override
    public void init(ArrayList<String> args) {
        this.arg = args.get(0);
    }

    @Override
    public String toString() {
        return "RETURN     EXIT " + arg + " : " + returnValue;
    }
}
