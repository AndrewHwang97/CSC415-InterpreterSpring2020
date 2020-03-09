package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;
import java.util.Scanner;
public class ReadCode extends ByteCode {
    Scanner input = new Scanner(System.in);
    int num;
    @Override
    public void execute(VirtualMachine virtualMachine) {
        System.out.println("Enter an Integer");
        num = input.nextInt();
        virtualMachine.push(num);
    }

    @Override
    public void init(ArrayList<String> args) {

    }

    @Override
    public String toString() {
        return "READ";
    }
}
