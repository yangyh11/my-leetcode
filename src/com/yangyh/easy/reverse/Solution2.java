package com.yangyh.easy.reverse;

/**
 * [7] 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/description/
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * @author: yangyh
 * @create: 2019-03-11 14:56
 * √ Accepted
 *   √ 1032/1032 cases passed (6 ms)
 *   √ Your runtime beats 98.4 % of java submissions
 *   √ Your memory usage beats 77.85 % of java submissions (33.2 MB)
 **/
public class Solution2 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x= x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && rev%10 >7) ) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && rev%10 < 8)) {
                return 0;
            }
            rev = rev *10 +pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.reverse(2147483647));
    }
}
