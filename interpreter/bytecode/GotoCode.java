package interpreter.bytecode;


import interpreter.VirtualMachine;

import java.util.ArrayList;

public class GotoCode extends JumpCode {
    @Override
    public void execute(VirtualMachine virtualMachine) {

    }

    @Override
    public void init(ArrayList<String> args) {

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
