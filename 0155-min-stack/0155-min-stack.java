import java.util.Stack;

class MinStack {

    private Stack<Long> s;
    private long min;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int val) {

        if (s.isEmpty()) {
            s.push((long) val);
            min = val;
        }
        else if (val < min) {
            s.push(2L * val - min);
            min = val;
        }
        else {
            s.push((long) val);
        }
    }

    public void pop() {
        long top = s.pop();

        if (top < min) {
            min = 2 * min - top;
        }
    }

    public int top() {
        long top = s.peek();

        if (top < min)
            return (int) min;

        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}
