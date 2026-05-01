class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(String op : ops){
            if(op.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b);
            }
…        int sum = 0;
        for(int num : st) {
            sum += num;
        }
        return sum;
    }
    }
