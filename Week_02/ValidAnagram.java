/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 *
 */

import java.util.Arrays;

class ValidAnagram {


    public static boolean isAnagram(String s, String t) {


        if(s.length() != t.length()) {
            return false;
        }

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        if(Arrays.toString(sarr).equals(Arrays.toString(tarr))) {
            return true;
        }

        return false;


    }
}