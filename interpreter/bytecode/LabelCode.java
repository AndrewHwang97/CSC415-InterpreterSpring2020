package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class LabelCode extends ByteCode {
     public String name;
    @Override
    public void execute(VirtualMachine virtualMachine) {

    }

    @Override
    public void init(ArrayList<String> args) {
        this.name = args.get(0);
    }

    @Override
    public String toString() {
        return name;
    }
}
