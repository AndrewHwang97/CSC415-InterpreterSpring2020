package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class DumpCode  extends ByteCode{
    String arg;

    @Override
    public void execute(VirtualMachine virtualMachine) {
        if(arg.equals("ON"))
            virtualMachine.toggleDumpON();
        else if(arg.equals("OFF"))
            virtualMachine.toggleDumpOFF();
    }

    @Override
    public void init(ArrayList<String> args) {
        this.arg = (args.get(0));
    }


    @Override
    public String toString() {
        return "DUMP";
    }
}
