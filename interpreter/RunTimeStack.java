package interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class RunTimeStack {

    private ArrayList<Integer> runTimeStack;
    private Stack<Integer>     framePointer;

    public RunTimeStack() {
        runTimeStack = new ArrayList<>();
        framePointer = new Stack<>();
        // Add initial Frame Pointer, main is the entry
        // point of our language, so its frame pointer is 0.
        framePointer.add(0);
    }

    public int push(int valueToPush){
        this.runTimeStack.add(valueToPush);
        return this.runTimeStack.get(this.runTimeStack.size()-1);
    }

    public int pop(){
        int returnVal;
        if(!this.runTimeStack.isEmpty()){
            returnVal = peek();
            this.runTimeStack.remove(this.runTimeStack.size()-1);
            return returnVal;
        }
        return 0;
    }

    public int peek(){
        return this.runTimeStack.get(this.runTimeStack.size()-1);
    }

    public int load(int offset){
        int beginningOfFrame = framePointer.peek();
        int number = this.runTimeStack.get(beginningOfFrame + offset);
        runTimeStack.add(number);
        return this.runTimeStack.get(this.runTimeStack.size()-1);
    }

    public int store(int offset){
        int beginningOfFrame = framePointer.peek();
        int number = pop();
        runTimeStack.add(beginningOfFrame + offset, number);
        return number;
    }

    public void newFrameAt(int offset){
        int index = (this.runTimeStack.size()) - offset;
      //  int index = (this.runTimeStack.size()-1) - offset;
        framePointer.push(index);
    }

    public void popFrame(){
        int beginningOfFrame = framePointer.peek();
       // for (int i = this.runTimeStack.size()-1; i >= beginningOfFrame; i--){

        //    this.runTimeStack.remove(this.runTimeStack.size()-1);
        //}
        for (int i = this.runTimeStack.size()-1; i >= beginningOfFrame; i--){

            this.runTimeStack.remove(this.runTimeStack.size()-1);
        }
    }

    public void dump() {

        Iterator itr = framePointer.iterator();
        int beginNextFrame = 0;
        int endFrame = 0;
        if(itr.hasNext())
            beginNextFrame = (Integer)itr.next();

        int i = 0; //for the while loop
        while(i< runTimeStack.size()){
            if(itr.hasNext())
                beginNextFrame = (Integer)itr.next();
            else
                beginNextFrame = runTimeStack.size();
            System.out.print("[");
            while(i < beginNextFrame){
                System.out.print(runTimeStack.get(i));
                i++;
                if(i == beginNextFrame)
                    break;
                else
                    System.out.print(",");
            }
            System.out.print("]");
        }

    }

    public int numTillBoundary(){
       // System.out.println("top: " + (this.runTimeStack.size()-1));
       // System.out.println("toppointer: " + (this.framePointer.peek()));
        return (this.runTimeStack.size()-1) - this.framePointer.peek();
    }

    public int popFramepointer(){
        return framePointer.pop();
    }
    
}
