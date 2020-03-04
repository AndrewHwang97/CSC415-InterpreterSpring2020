package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public abstract class JumpCode extends ByteCode  {
    public abstract void execute(VirtualMachine virtualMachine);
    public abstract void init(ArrayList<String> args);
    abstract void setAddress(int jumpAddress);
    abstract String getLabel();
}
