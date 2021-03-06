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
 *   √ 1032/1032 cases passed (11 ms)
 *   √ Your runtime beats 89.68 % of java submissions
 *   √ Your memory usage beats 77.52 % of java submissions (33.2 MB)
 **/
public class Solution3 {
    public int reverse(int x) {
        StringBuffer reverseStr=new StringBuffer();
        String intStr = String.valueOf(x);
        int n = 1;
        for (int i = 0; i < intStr.length(); i++) {
            if (i == 0 && "-".equals(String.valueOf(intStr.charAt(i)))) {
                reverseStr = reverseStr.append("-");
                n = 0;
                continue;
            }
            String str = String.valueOf(intStr.charAt(intStr.length() - i - n));
            reverseStr = reverseStr.append(str);
        }

        long l = Long.valueOf(reverseStr.toString());

        //判断是否越界
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.valueOf(reverseStr.toString());
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.reverse(2147483647));
    }
}
