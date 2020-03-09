package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class FalseBranchCode extends JumpCode {


    String label;
    int jumpAddress;
    @Override
    public void execute(VirtualMachine virtualMachine) {
        if(virtualMachine.pop() == 0)
            virtualMachine.setProgramCounter(jumpAddress);
    }

    @Override
    public void init(ArrayList<String> args) {
        this.label =(args.get(0));
    }


    @Override
    public void setAddress(int jumpAddress) {
        this.jumpAddress = jumpAddress;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        String base = "FALSEBRANCH " + label;
        return base;
    }
}
