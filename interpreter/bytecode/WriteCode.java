package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class WriteCode extends ByteCode {
    @Override
    public void execute(VirtualMachine virtualMachine) {
        virtualMachine.write();
    }

    @Override
    public void init(ArrayList<String> args) {

    }

    @Override
    public String toString() {
        return "WRITE";
    }
}
