package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class LitCode extends ByteCode {
    String id;
    int value;

    @Override
    public void execute(VirtualMachine virtualMachine) {
        virtualMachine.push(value);
    }

    @Override
    public void init(ArrayList<String> args) {
        this.value = Integer.parseInt(args.get(0));
        if(args.size() > 1) {
            this.id = args.get(1);
        }
    }

    @Override
    public String toString() {
        String base = "LIT " + value;
        if(id != null){
            base = base + id + "   int " + id;
        }
        return base;
    }
}
