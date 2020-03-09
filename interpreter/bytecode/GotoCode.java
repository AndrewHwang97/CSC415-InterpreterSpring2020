package interpreter.bytecode;


import interpreter.VirtualMachine;

import java.util.ArrayList;

public class GotoCode extends JumpCode {
    String label;
    int jumpAddress;
    @Override
    public void execute(VirtualMachine virtualMachine) {
        virtualMachine.setProgramCounter(jumpAddress);
    }

    @Override
    public void init(ArrayList<String> args) {
        this.label = (args.get(0));
    }

    @Override
    public void setAddress(int jumpAddress) {
        this.jumpAddress = jumpAddress;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "GOTO " + label;
    }


}
