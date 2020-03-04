package interpreter.bytecode;

import interpreter.VirtualMachine;

import java.util.ArrayList;

public class PopCode extends  ByteCode {

    String id;
    int numPops;
    int numberToPop = 0;
    @Override
    public void execute(VirtualMachine virtualMachine) {
        int indexUntilBoundary = virtualMachine.frameBoundaryCheck();
        numberToPop = Math.min(numPops,indexUntilBoundary);
        for (int i = 0; i < numberToPop; i++){
            virtualMachine.pop();
        }

    }

    @Override
    public void init(ArrayList<String> args) {
        this.numPops = Integer.parseInt(args.get(0));
        if(args.size() > 1) {
            this.id = args.get(1);
        }
    }

    @Override
    public String toString() {
        String base = "POP " + numberToPop;
        if(id != null){
            base = base + id + "   int " + id;
        }
        return base;
    }
}
