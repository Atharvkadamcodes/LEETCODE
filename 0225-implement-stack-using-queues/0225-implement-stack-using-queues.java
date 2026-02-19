import java.util.ArrayList;

class MyStack {

    private ArrayList<Integer> list;

    public MyStack() {
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public int pop() {
        if (empty()) return -1;
        return list.remove(list.size()-1);
    }
    
    public int top() {
        if (empty()) return -1;
        return list.get(list.size()-1);
    }
    
    public boolean empty() {
        return list.size() == 0;
    }
}
