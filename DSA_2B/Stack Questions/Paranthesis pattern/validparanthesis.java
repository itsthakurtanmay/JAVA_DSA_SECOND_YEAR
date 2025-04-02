
class validparanthesis {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else {
                char ch = st.peek();
                if (ch == '(' && s.charAt(i) == ')') {
                    st.pop();
                } else if (ch == '{' && s.charAt(i) == '}') {
                    st.pop();
                } else if (ch == '[' && s.charAt(i) == ']') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
