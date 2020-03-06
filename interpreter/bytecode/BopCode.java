package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class BopCode extends ByteCode{
    String operator;
    int op1;
    int op2;

    @Override
    public void execute(VirtualMachine virtualMachine) {
        op2 = virtualMachine.pop();
        op1 = virtualMachine.pop();

        switch (operator){
            case "+":
                virtualMachine.push(op1+op2);
                break;
            case "-":
                virtualMachine.push(op1 - op2);
                break;
            case "/":
                virtualMachine.push(op1/op2);
                break;
            case "*":
                virtualMachine.push(op1*op2);
                break;
            case "==":
                if(op1 == op2)
                    virtualMachine.push(1);
                else
                    virtualMachine.push(0);
                break;
            case "!=":
                if(op1 != op2)
                    virtualMachine.push(1);
                else
                    virtualMachine.push(0);
                break;
            case "<=":
                if(op1 <= op2)
                    virtualMachine.push(1);
                else
                    virtualMachine.push(0);
                break;
            case ">":
                if(op1 > op2)
                    virtualMachine.push(1);
                else
                    virtualMachine.push(0);
                break;
            case ">=":
                if(op1 >= op2)
                    virtualMachine.push(1);
                else
                    virtualMachine.push(0);
                break;
            case "<":
                if(op1 < op2)
                    virtualMachine.push(1);
                else
                    virtualMachine.push(0);
                break;
            case "|":
                virtualMachine.push(op1 | op2);
                break;
            case "&":
                virtualMachine.push(op1 & op2);
        }

    }

    @Override
    public void init(ArrayList<String> args) {
        this.operator = args.get(0);
    }

    @Override
    public String toString() {
        String base = "BOP " + op1 + operator + op2;

        return base;
    }

}
