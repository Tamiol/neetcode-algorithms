import java.util.ArrayList;
import java.util.List;

public class MinStack155 {
    private List<Integer> minStack;
    private List<Integer> minVal;

    public MinStack155() {
        minStack = new ArrayList<>();
        minVal = new ArrayList<>();
    }

    public void push(int val) {
        if(minVal.isEmpty() || minVal.get(minVal.size()-1) > val){
            minVal.add(val);
        }else{
            minVal.add(minVal.get(minVal.size()-1));
        }
        minStack.add(val);
    }

    public void pop() {
        minStack.remove(minStack.size()-1);
        minVal.remove(minVal.size()-1);

    }

    public int top() {
        return minStack.get(minStack.size()-1);
    }

    public int getMin() {
        return minVal.get(minVal.size()-1);

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */