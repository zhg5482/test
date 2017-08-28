package test;

import java.io.Console;
import java.util.*;

/**
 * Created by zhg-pc on 17/8/4.
 * description : Given an integer n, return 1 - n in lexicographical order.
                 For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
                 Please optimize your algorithm to use less time and space.
                 The input size may be as large as 5,000,000.
 */
public class LexicographicalNumbers {
    public static void main(String []args){
        LexicographicalNumbers s1 = new LexicographicalNumbers();
        //System.out.println(s1.lexicalOrder(23));
        //System.out.println(s1.lengthLongestPath("dir\\n\\tsubdir1\\n\\tsubdir2\\n\\t\\tfile.ext"));
        //System.out.println(s1.findTheDifference2("abcde","abcdef"));
//        int [][] a = new int[4][4];
//        for (int i = 0;i < 4;i++){
//            for (int j = 0;j < 4;j++){
//                a[i][j] = j;
//            }
//        }
//        System.out.println(s1.isRectangleCover(a));
          //System.out.println(s1.isSubsequence("aes","abcefs"));
          //System.out.println(s1.decodeString("3[a]2[bc]"));
          //System.out.println(s1.longestSubstring("aaabbc",2));
//          int []a = {4, 3, 2, 6};
//          System.out.println(s1.maxRotateFunction(a));
//          System.out.println(s1.integerReplacement(7));
          System.out.println(s1.pick(3));
    }

    /**
     * @param n
     * @return ArrayList
     */
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>(n);
        int curr = 1;
        for (int i = 1; i <= n; i++) {
            list.add(curr);
            if (curr * 10 <= n) {
                curr *= 10;
            } else if (curr % 10 != 9 && curr + 1 <= n) {
                curr++;
            } else {
                while ((curr / 10) % 10 == 9) {
                    curr /= 10;
                }
                curr = curr / 10 + 1;
            }
            System.out.println("i: " + i + " curr: " + curr+"\n");
        }
        return list;
    }

    /**
     *
     * @param input
     * @return
     */
    public int lengthLongestPath(String input){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0); // "dummy" length
        int maxLen = 0;
        for(String s:input.split("\n")){
            int lev = s.lastIndexOf("\t")+1; // number of "\t"
            while(lev+1<stack.size()) stack.pop(); // find parent
            int len = stack.peek()+s.length()-lev+1; // remove "/t", add"/"
            stack.push(len);
            // check if it is file
            if(s.contains(".")) maxLen = Math.max(maxLen, len-1);
        }
        return maxLen;
    }

    /**
     * find str different
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (int i = 0; i < s.length(); ++i) {
            System.out.println("==>>>s.charAt(i): "+s.charAt(i));
            c ^= s.charAt(i);
            System.out.println("c: "+c);
        }
        for (int i = 0; i < t.length(); ++i) {
            c ^= t.charAt(i);
        }
        return c;
    }

    /**
     * find str different 2
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference2(String s, String t) {
        int n = t.length();
        char c = t.charAt(n - 1);
        System.out.println("s: "+s);
        System.out.println("t: "+t);
        System.out.println("c: "+c);
        System.out.println('f'^'a');
        for (int i = 0; i < n - 1; ++i) {
            c ^= s.charAt(i);
            System.out.println("c: "+c+" s.charAt: "+s.charAt(i));
            c ^= t.charAt(i);
            System.out.println("c: "+c+"====");
        }
        return c;
    }

    /**
     *
     * @param rectangles
     * @return
     */
    public boolean isRectangleCover(int[][] rectangles) {

        System.out.println(rectangles.toString());
        if (rectangles.length == 0 || rectangles[0].length == 0) return false;

        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y1 = Integer.MAX_VALUE;
        int y2 = Integer.MIN_VALUE;

        HashSet<String> set = new HashSet<String>();
        int area = 0;

        for (int[] rect : rectangles){
            x1 = Math.min(rect[0],x1);
            y1 = Math.min(rect[1],y1);

        }

        if (!set.contains(x1 + " " + y1)
                || !set.contains(x1 + " " + y2)
                || !set.contains(x2 + " " + y1) || !set.contains(x2 + " " + y2)
                || set.size() != 4) return false;

        return area == (x2-x1) * (y2 - y1);
    }

    public boolean isSubsequence(String s ,String t){
        if (s.length() == 0 ) return true;
        System.out.println("s: "+s + "\nt: "+t);
        int indexS = 0, indexT = 0;
        while (indexT < t.length()){
            System.out.println("t.charAt(indexT): "+t.charAt(indexT) + " ===== s.charAt(indexS): "+s.charAt(indexS));
            if (t.charAt(indexT) == s.charAt(indexS)){
                indexS++;
                if (indexS == s.length()) return true;
            }
            indexT++;
        }
        return false;
    }

    /**
     *
     * @param s
     * @return
     */
    public String decodeString(String s){
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx++);
            }
        }
        return res;
    }

    public int longestSubstring(String s, int k) {
        char[] str = s.toCharArray();
        return helper(str,0,s.length(),k);
    }
    private int helper(char[] str, int start, int end,  int k){
        if(end-start<k) return 0;//substring length shorter than k.
        int[] count = new int[26];
        for(int i = start;i<end;i++){
            int idx = str[i]-'a';
            count[idx]++;
        }
        for(int i = 0;i<26;i++){
            if(count[i]<k&&count[i]>0){ //count[i]=0 => i+'a' does not exist in the string, skip it.
                for(int j = start;j<end;j++){
                    if(str[j]==i+'a'){
                        int left = helper(str,start,j,k);
                        int right = helper(str,j+1,end,k);
                        return Math.max(left,right);
                    }
                }
            }
        }
        return end-start;
    }

    public int maxRotateFunction(int[] A){
        if (A.length == 0){
            return 0;
        }
        int sum = 0,iteration = 0,len = A.length;

        for (int i = 0;i < len;i++){
            sum += A[i];
            iteration += (A[i] * i);
        }

        int max = iteration;
        for (int j = 1;j < len;j++){
            iteration = iteration - sum + A[j-1]*len;
            max = Math.max(max,iteration);
        }
        return max;
    }

    public int integerReplacement(int n) {
        System.out.println(Integer.bitCount(n + 1));
        System.out.println(Integer.bitCount(n - 1));
        int c = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>>= 1;
            } else if (n == 3 || Integer.bitCount(n + 1) > Integer.bitCount(n - 1)) {
                --n;
            } else {
                ++n;
            }
            ++c;
        }
        return c;
    }

    /**
     *
     * @param target
     * @return
     */
    public int pick(int target) {
        int[] nums = new int[] {1,2,3,3,3};
        Random rnd = new Random();
        int result = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target)
                continue;
            if (rnd.nextInt(++count) == 0)
                result = i;
        }

        return result;
    }
}
