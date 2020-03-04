package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class FalseBranchCode extends JumpCode {

    String id;
    int label;
    @Override
    public void execute(VirtualMachine virtualMachine) {

    }

    @Override
    public void init(ArrayList<String> args) {
        this.label = Integer.parseInt(args.get(0));
        if(args.size() > 1) {
            this.id = args.get(1);
        }
    }

    @Override
    void setAddress(int jumpAddress) {

    }

    @Override
    String getLabel() {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }
}
