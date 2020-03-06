package interpreter;

import interpreter.bytecode.ByteCode;

import java.util.Stack;

public class VirtualMachine {

    private RunTimeStack   runTimeStack;
    private Stack<Integer> returnAddress;
    private Program        program;
    private int            programCounter;
    private boolean        isRunning;
    private boolean        isDump;

    protected VirtualMachine(Program program) {
        this.program = program;
    }


    public void executeProgram(){
        programCounter = 0;
        runTimeStack = new RunTimeStack();
        returnAddress = new Stack<Integer>();
        isRunning = true;
        isDump = false;

        while (isRunning){
            ByteCode code = program.getCode(programCounter);
            code.execute(this);
            if(isDump){ //add more for bytecodes that dont dump
                System.out.println(code);
                this.runTimeStack.dump();
            }
            programCounter++;
        }
    }

    public void push(int value){ runTimeStack.push(value); }
    public int pop(){
        return runTimeStack.pop();
    }
    public int popFramePointer(){return runTimeStack.popFramepointer();}
    public int frameBoundaryCheck(){ return runTimeStack.numTillBoundary(); }
    public void toggleDumpON(){ isDump = true;}
    public void toggleDumpOFF(){ isDump = false;}
    public void makeFrame(int offset){ runTimeStack.newFrameAt(offset); }
    public int storeToRuntimeStack(int offset){ return runTimeStack.store(offset); }
    public int loadFromRuntimeStack(int offset){ return runTimeStack.load(offset);}
    public void write(){System.out.println(runTimeStack.peek());}
    public void halt(){isRunning = false;}
    public void setProgramCounter(int count) {this.programCounter = count;}
    public void addToReturnAddressStack(int returnAddr){this.returnAddress.push(returnAddr);}
    public int getCurrCount(){return programCounter; }
    public  void emptyFrame() {runTimeStack.popFrame();}
    public int popReturnAddress(){return returnAddress.pop();}
}
