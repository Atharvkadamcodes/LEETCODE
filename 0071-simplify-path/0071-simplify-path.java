import java.util.*;

class Solution {
    public String simplifyPath(String path) {

        Stack<String> s = new Stack<>();

        for (String part : path.split("/")) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!s.isEmpty()) s.pop();
            } 
            else {
                s.push(part);
            }
        }

        if (s.isEmpty()) return "/";

        StringBuilder result = new StringBuilder();

        for (String dir : s) {
            result.append("/").append(dir);
        }

        return result.toString();
    }
}
