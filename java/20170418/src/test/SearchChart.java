package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhg-pc on 17/8/4.
 * description : Given a string,
 *              find the first non-repeating character in it and return it's index.
 *              If it doesn't exist, return -1.
 */
public class SearchChart {
    public static void main(String []args){
        SearchChart s1 = new SearchChart();
        //System.out.println(s1.firstUniqChar1("cc"));
        //System.out.println(s1.firstUniqChar2("dddccdbba"));
        System.out.println(s1.firstUniqChar3("iafaehgsgkajbndker"));
    }

    /**
     * 方法一
     * @param s
     * @return
     */
    public int firstUniqChar1(String s) {
        System.out.println(s);
        char s_arr[] = s.toCharArray();
        for (int i = 0;i<s_arr.length;i++) {
            List list = new ArrayList();
            char c_Arr[] = s.substring(i+1,s.length()).toCharArray();
            for (int j = 0;j<c_Arr.length;j++){
                list.add(j,c_Arr[j]);
            }

            //System.out.println(list.toString());
            if(list.size() > 0 && !list.contains(s_arr[i])){
                return i;
            }
        }
        return -1;
    }

    /**
     * 方法二
     * @param s
     * @return
     */
    public int firstUniqChar2(String s) {
        System.out.println(s);
        char s_arr[] = s.toCharArray();
        String c_s = "";
        if(s.length()==1){
            return  0;
        }
        String old_s = "";
        for (int i = 0;i<s_arr.length;i++) {
            c_s = s.substring(i+1,s.length());
            System.out.println(c_s+"==="+"++"+s_arr[i]+"---"+old_s);
            if(c_s.indexOf(s_arr[i]) == -1
                    && old_s.indexOf(s_arr[i]) == -1){
                return i;
            }
            old_s += s_arr[i];
        }
        return -1;
    }

    /**
     * 方法三
     * @param s
     * @return
     */
    public int firstUniqChar3(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
