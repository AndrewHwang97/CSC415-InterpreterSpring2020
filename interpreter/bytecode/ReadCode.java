package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class ReadCode extends ByteCode {
    @Override
    public void execute(VirtualMachine virtualMachine) {

    }

    @Override
    public void init(ArrayList<String> args) {

    }

    @Override
    public String toString() {
        return "READ";
    }
}
