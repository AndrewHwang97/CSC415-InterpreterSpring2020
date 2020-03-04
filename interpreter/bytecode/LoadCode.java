package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class LoadCode extends ByteCode {

    int offset;
    int offsetVal;
    String id;

    @Override
    public void execute(VirtualMachine virtualMachine) {
        offsetVal = virtualMachine.loadFromRuntimeStack(offset);
    }

    @Override
    public void init(ArrayList<String> args) {
        this.offset = Integer.parseInt(args.get(0));
        if(args.size() > 1) {
            this.id = args.get(1);
        }
    }

    @Override
    public String toString() {
        String base = "LOAD " + offset;
        if(id != null){
            base = base + id + "   " + id + "=" + offsetVal;
        }
        return base;
    }
}
