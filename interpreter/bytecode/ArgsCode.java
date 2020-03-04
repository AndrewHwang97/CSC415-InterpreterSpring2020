package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class ArgsCode extends ByteCode {
    String id;
    int numArgs;
    @Override
    public void execute(VirtualMachine virtualMachine) {
        virtualMachine.makeFrame(numArgs);
    }

    @Override
    public void init(ArrayList<String> args) {
        this.numArgs = Integer.parseInt(args.get(0));
        if(args.size() > 1) {
            this.id = args.get(1);
        }
    }

    @Override
    public String toString() {
        String base = "ARGS " + numArgs;
        if(id != null){
            base = base + id + "   int " + id;
        }
        return base;
    }

}
