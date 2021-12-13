package com.example;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.sound.sampled.ReverbType;

public class Test {

	public static void main(String[] args) {

		String nulll = "uubrkxdeaozgfuektrvocjdguxsfaxtevyoejkblcsdxwrdjduoxxefcrnleqhrmngbmfwdwjtzzqmtpgvzbfgexrikkflmwsjvoprhafswwdqcqntkvweymrxoogmptnudmkohiplaqylqikzlirfobgkdfabvgudsusllmcyjcqqqjifkrxnojureaysszdoyrbsppixtxnpoccddydroqmdbbwqtfsgqmfyrrzecxkiupxwobdotlgaojpfcckomulyaqmuyjggmagulxhmzznnseupwolaaxninhnugzfsrnfjyecvtxhhdbmycbdrqqpwtjbfrlaqaawmtoyofocebvgnfkfjaollgbzmjdduvafcyaatzitutixjllthwcwtbjxmbjkzucanmqhnieqzgvunwvqybtabnotzmwcpzfhhyotwneetjyawvsspdyjbyakrfyqxiikrjibjviqcqapztyfdvoovifdlqjtgfwhlahqqhmjwllnwwwcgadxkeqnemvoscltjlkalhvpttzswuhzkbdbpfqlmzdkwhsetvkxjkpuwwipvolknugjfcdymucziijnakuffbubnoyjzfbuidajegskowqjnhxapokhnpjrtnjyhuvcmzxvfxcmpzcnhhwfbwcrbdsbdhczarvtlpnepbludzxaynsjkjpobvvwriibdibfelgiafoxjianeccrreiywobrxvxdporjdychjntdepvtukaxwnoszvkmmuhemkwwqgdiiykrfnpeqjmzejndysdjhagambiomvyyrstpmoczuwmureytcdpawwrfbsjwfbjbofqiduvikkknocyswsnkmknuiatalvyseactjzbvrrxhikvmjatkolekudjcypldgxpkbfxlnotwracbizvrlhzkybssqiiidjscnxkewcykpockmhnslqprsiajuuuixrovyijpvfsampitbfirbrpfqxydvspqtm";
		;

		// int nums[] = { -1, 0, 1, 2, -1, -4 };
		// int nums[] = { 0, 0, 0, 0 };

//		System.out.println(removeKdigits("1432219", 3));
//		System.out.println(removeKdigits("10200", 1));
//		System.out.println(removeKdigits("10", 2));
//		System.out.println(removeKdigits("0", 0));

//		System.out.println((longestPalindrome("babad")));
//		System.out.println((longestPalindrome("ccc")));
//		System.out.println((longestPalindrome("bc")));
//		System.out.println((longestPalindrome("abcda")));
//		System.out.println((longestPalindrome("abacab")));
//		System.out.println((longestPalindrome("babadada")));

		// System.out.println(myAtoi(" -42"));
		// System.out.println(myAtoi("4193 with words"));
		// System.out.println(myAtoi("words and 987"));
		// System.out.println(myAtoi("-91283472332"));
		// System.out.println(myAtoi("+"));
		// System.out.println(myAtoi(" 0000000000012345678"));
		// System.out.println(myAtoi("3.14"));

		// System.out.println(maxArea(nums));

		// System.out.println(maxSubarraySumCircular(nums));
//		System.out.println(intToRoman(9));
//		System.out.println(intToRoman(58));
//		System.out.println(intToRoman(1994));
//		
		// System.out.println(search(nums, 6));

		// System.out.println(validPalindrome("abac"));

		// System.out.println(validPalindrome(nulll));

//		int nums[] = { 3, 2, 1, 5, 6, 4 };
//		char[] ch = { 'h', 'e', 'l', 'l', 'o' };
//		reverseString(ch);
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print("   " + ch[i]);
//		}

		// List<Integer> list = findAnagrams("cbaebabacd", "abc");
		List<Integer> list = null;

//		list = findAnagrams("abab", "ab");
//		System.out.println(list.size());
//		list = findAnagrams("cbaebabacd", "abc");
//		System.out.println(list.size());
//		list = findAnagrams("baa", "aa");
//		System.out.println(list.size());

		// list = findAnagrams("abacbabc", "abc");
		// System.out.println(list.size());

		// System.out.println(checkInclusion("eidbaooo", "ab"));
//		int nums[] = { 5, 7, 7, 8, 8, 10 };
//		nums = searchRange(nums, 8);
//		

//		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
//		rotate(nums, 3);
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print("   " + nums[i]);
//		}
		// System.out.println(longestCommonSubsequence("psnw", "vozsh"));

		int arr[][] = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } };

		System.out.print(countSquares(arr));

	}

	public static int countSquares(int[][] matrix) {

		/*
		 * 
		 * 
		 * 
		 * 
		 * Matrix = [0,1,1,1], [1,1,1,1], [0,1,1,1]
		 * 
		 * 
		 * 
		 * [1,0,1],
		 *  [1,1,0],
		 *   [1,1,0]
		 * 
		 * 
		 */
		int mat[][] = new int[matrix.length + 1][matrix[0].length + 1];
		int sum = 0;
		for (int i = 1; i <= matrix.length; i++) {
			for (int j = 1; j <= matrix[0].length; j++) {
				if (matrix[i - 1][j - 1] != 0) {
					int min = Math.min(mat[i - 1][j], mat[i][j - 1]);
					int value = mat[i - 1][j - 1];
					mat[i][j] = Math.min(min, value) + 1;
					sum = sum + mat[i][j];
				}
			}
		}

		return sum;
	}

	public static int test(String text1, String text2) {
		int n = text1.length();
		int m = text2.length();
		int dp[][] = new int[n + 1][m + 1];
		int max = 0;
		for (int i = 0; i <= n; i++)
			dp[i][0] = 0;
		for (int i = 0; i <= m; i++)
			dp[0][i] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1))
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				if (dp[i][j] > max)
					max = dp[i][j];
			}
		}
		return max;

	}

	public static int longestCommonSubsequence(String text1, String text2) {
		int count = 0;

		if (text1.length() < text2.length()) {
			String temp = text2;
			text2 = text1;
			text1 = temp;
		}
		int start = 0, end = text1.length() - 1;

		while (start <= end) {
			char c = text1.charAt(start);
			if (count == text2.length()) {
				break;
			}
			if (c == text2.charAt(count)) {
				count++;
			}
			start++;

		}
		return count;
	}

	public static void rotate(int[] nums, int k) {
		int low = 0;
		int high = nums.length - 1;
		reverse(nums, low, high - k);
		reverse(nums, k + 1, high);
		reverse(nums, low, high);

	}

	public static void reverse(int[] nums, int low, int high) {
		while (low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] res = { -1, -1 };
		int first = getIndex(nums, target, true);
		if (first < 0) {
			return res;
		}
		int last = getIndex(nums, target, false);
		res[0] = first;
		res[1] = last;
		return res;
	}

	private static int getIndex(int[] nums, int key, boolean leftFlag) {

		int index = -1;
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (key > nums[mid]) {
				left = mid + 1;
			} else if (key < nums[mid]) {
				right = mid - 1;
			} else {
				index = mid;
				if (leftFlag) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}

			}
		}
		return index;
	}

	public static boolean checkInclusion(String s, String p) {

		int len = p.length() - 1;
		int[] lookup = new int[26];
		int[] dp = new int[26];
		for (char c : p.toCharArray()) {
			lookup[c - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			dp[s.charAt(i) - 'a']++;
			if (i >= len) {
				if (checkAnagram(lookup, dp)) {
					return true;
				}
				dp[s.charAt(i - len) - 'a']--;
			}
		}
		return false;
	}

	public static List<Integer> findAnagrams(String s, String p) {
		int len = p.length() - 1;
		int[] lookup = new int[26];
		int[] dp = new int[26];
		List<Integer> result = new ArrayList<>();
		for (char c : p.toCharArray()) {
			lookup[c - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			dp[s.charAt(i) - 'a']++;
			if (i >= len) {
				if (checkAnagram(lookup, dp)) {
					result.add(i - len);
				}
				dp[s.charAt(i - len) - 'a']--;
			}
		}
		return result;
	}

	private static boolean checkAnagram(int[] lookup, int[] dp) {
		for (int i = 0; i < 26; i++) {
			if (lookup[i] != dp[i]) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> findAnagramsxxx(String s, String p) {
		Set<String> arr = getListString(p);
		List<Integer> list = new ArrayList<>();
		Iterator<String> iter = arr.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			int len = str.length();
			for (int j = 0; (len + j) <= s.length(); j++) {
				String subs = s.substring(j, len + j);
				if (subs.equals(str)) {
					list.add(j);
				}
			}
		}

		return list;
	}

	public static Set<String> getListString(String s) {

		Set<String> res = new HashSet<>();
		res.add(s);
		if (s.length() == 1) {
			return res;
		}
		for (int k = 0; k < s.length(); k++) {
			for (int i = 0; i < s.length(); i++) {
				StringBuilder str = new StringBuilder();
				char[] temp = s.toCharArray();
				char c = temp[k];
				temp[k] = temp[i];
				temp[i] = c;
				res.add(str.append(temp).toString());
			}

		}
		return res;
	}

	public static void reverseString(char[] s) {

		int start = 0, end = s.length - 1;

		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;

		}

	}

	public static int findKthLargest(int[] nums, int k) {

		Arrays.sort(nums);

		return nums[nums.length - k];
	}

	public static boolean validPalindrome(String s) {

		int i = 0;
		int j = s.length() - 1;
		for (; i < j && j > i; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return palindromeChecking(s, i + 1, j) || palindromeChecking(s, i, j - 1);
			}
		}
		return true;
	}

	private static boolean palindromeChecking(String s, int start, int end) {
		for (int i = end; i >= 0; i--) {
			if (s.charAt(i) != s.charAt(start)) {
				return false;
			}
			start++;
		}
		return false;
	}

	public static int search(int[] nums, int target) {

		Arrays.sort(nums);
		return binarySearchIndex(nums, 0, nums.length - 1, target);

	}

	private static int binarySearchIndex(int[] nums, int low, int high, int key) {

		int index = -1;
		while (low <= high) {
			int mid = (low + (high - low)) / 2;
			if (key > nums[mid]) {
				low = mid + 1;
			} else if (key < nums[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return index;
	}

	public static List<String> letterCombinations(String digits) {
		List<String> str_list = new ArrayList<>();
		if (digits == null || digits.length() < 1)
			return str_list;
		String[] str_num = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		StringBuilder str_stack = new StringBuilder();
		diff_str(digits, str_num, str_list, str_stack, 0);

		return str_list;
	}

	private static void diff_str(String digit_str, String[] str_num, List<String> str_list, StringBuilder str_stack,
			int index) {
		if (index >= digit_str.length())
			return;
		if (index == digit_str.length() - 1) {
			for (int i = 0; i < str_num[digit_str.charAt(index) - '0'].length(); i++) {
				str_stack.append(str_num[digit_str.charAt(index) - '0'].charAt(i));
				str_list.add(str_stack.toString());
				str_stack.deleteCharAt(index);
			}
		} else {
			for (int i = 0; i < str_num[digit_str.charAt(index) - '0'].length(); i++) {
				str_stack.append(str_num[digit_str.charAt(index) - '0'].charAt(i));
				diff_str(digit_str, str_num, str_list, str_stack, index + 1);
				str_stack.deleteCharAt(index);
			}
		}
	}

	public static String intToRoman(int num) {
		StringBuilder res = new StringBuilder();

		while (num > 0) {
			if (num >= 1000) {
				num = convert(res, num, "M", 1000);
			}
			if (num >= 900) {
				res = res.append("CM");
				num = num - 900;
			}
			if (num >= 500) {
				num = convert(res, num, "D", 500);
			}

			if (num >= 100) {
				num = convert(res, num, "C", 100);

			}
			if (num >= 90) {
				res.append("XC");
				num = num - 90;
			}
			if (num >= 50) {
				num = convert(res, num, "L", 50);

			}
			if (num >= 40) {
				num = num - 40;
				res.append("XL");
			}
			if (num >= 10) {
				num = convert(res, num, "X", 10);

			}
			if (num >= 9) {
				res.append("IX");
				num = num - 9;
			}
			if (num >= 5) {
				num = convert(res, num, "V", 5);

			}
			if (num >= 4) {
				res.append("IV");
				num = num - 4;
			}
			if (num >= 1) {
				num = convert(res, num, "I", 1);
			}
		}

		return res.toString();
	}

	private static int convert(StringBuilder builder, int num, String symbol, int val) {

		int count = num / val;
		for (int i = 1; i <= count; i++)
			builder.append(symbol);
		num %= val;
		return num;
	}

	public static int maxSubarraySumCircular(int[] A) {

		int max_kadan = kadane(A);
		if (A[0] + 1 == A[A.length - 1] || A[0] - 1 == A[A.length - 1]) {
			return max_kadan;
		}
		int max_non_wrapping = 0;
		for (int i = 0; i < A.length; i++) {
			max_non_wrapping = max_non_wrapping + A[i];
			A[i] = -A[i];
		}
		max_non_wrapping = max_non_wrapping + kadane(A);

		return max_non_wrapping > max_kadan ? max_non_wrapping : max_kadan;

	}

	private static int kadane(int[] A) {

		int size = A.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + A[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;

	}

	public static int maxArea(int[] height) {

		int start = 0, end = height.length - 1;
		int max = Integer.MIN_VALUE;
		while (start < end) {
			int min = (Math.min(height[start], height[end]));
			int area = (min) * (end - start);
			System.out.println(min + "   " + area);
			if (area > max) {
				max = area;
			}
			if (height[start] < height[end]) {
				start++;
			} else {
				end--;
			}
		}

		return max;
	}

	public static int myAtoi(String s) {

		StringBuilder str = new StringBuilder();

		if (s.isEmpty() || !isValidDigits(s.charAt(0))) {
			return 0;
		}
		if (s.length() == 1 && (s.charAt(0) == '-' || s.charAt(0) == '+')) {
			return 0;
		}

		char spaceChar = ' ';
		int min = ("" + Integer.MIN_VALUE).length();
		int max = ("" + Integer.MAX_VALUE).length();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.') {
				break;
			} else if (spaceChar == s.charAt(i) || '+' == s.charAt(i)) {
				continue;
			} else if (isValidDigits(s.charAt(i))) {
				str.append(s.charAt(i));

			}
		}
		double result = 0;
		int i = 0;
		boolean isNegetive = false;
		if (str.toString().charAt(0) == '-') {
			isNegetive = true;
			i++;
		}
		if (!str.toString().isEmpty()) {
			for (; i < str.toString().length(); i++) {
				int digit = (int) (str.toString().charAt(i) - '0');
				result = result * 10 + digit;
			}
		}

		if (isNegetive) {
			result = result * (-1);
		}
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) result;
	}

	private static boolean isValidDigits(char c) {
		char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		if (c == ' ' || c == '-' || c == '+') {
			return true;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == c) {
				return true;
			}
		}
		return false;
	}

	public static String longestPalindrome(String s) {
		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			String str = helper(s, i, i);
			if (str.length() > longest.length())
				longest = str;

			str = helper(s, i, i + 1);
			if (str.length() > longest.length())
				longest = str;
		}

		return longest;
	}

	private static String helper(String s, int i, int j) {
		while (i >= 0 && i < s.length() && j >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return s.substring(i + 1, j);
	}

	private static boolean checkPalindrome(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res = res + s.charAt(i);
		}
		if (s.equals(res)) {
			return true;
		}

		return false;
	}

	public static String removeKdigits(String num, int k) {
		if (num.length() == k)
			return "0";

		StringBuilder sb = new StringBuilder(num);

		// System.out.println(removeKdigits("1432219", 3));

		/*
		 * We will iterate the number k times. In each iteration: 1. Remove the digit
		 * for which the next digit is smaller. 2. If we reach at the end than remove
		 * last digit.
		 */
		for (int j = 0; j < k; j++) {
			int i = 0;
			while (i < sb.length() - 1 && sb.charAt(i) <= sb.charAt(i + 1)) {
				i++;
			}
			sb.delete(i, i + 1);
		}

		// remove leading 0's
		while (sb.length() > 1 && sb.charAt(0) == '0')
			sb.delete(0, 1);

		if (sb.length() == 0) {
			return "0";
		}

		return sb.toString();
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);

		List<List<Integer>> tripletList = new LinkedList<>();

		int previousRoot = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			int previous = Integer.MIN_VALUE;

			while (left < right && nums[i] != previousRoot) {

				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0 && nums[left] != previous) {
					LinkedList<Integer> triplets = new LinkedList<>();
					triplets.add(nums[i]);
					triplets.add(nums[left]);
					triplets.add(nums[right]);
					tripletList.add(triplets);

					previous = nums[left++];
					right--;
				} else if (sum > 0)
					right--;
				else
					previous = nums[left++];

			}
			previousRoot = nums[i];
		}

		return tripletList;
	}

	public static int singleNonDuplicate(int[] nums) {

		int end = 0;
		Set<Integer> set = new HashSet<>();
		for (; end < nums.length; end++) {
			if (!set.contains(nums[end])) {
				set.add(nums[end]);
			} else {
				while (true) {
					set.remove(nums[end]);
					break;
				}
			}
		}
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		return set.iterator().next();
	}

	public static int lengthOfLongestSubstring(String s) {

		// This problem can be easily solved by applying sliding window approach

		// Initializing the starting and ending ptr, initially at the first position of
		// the giving string
		int starting_ptr = 0, ending_ptr = 0;

		if (s.length() == 0) {
			return 0;
		}

		// Initializinng the set for keeping track of the duplicate charachters
		Set<Character> set = new HashSet<Character>();

		// Keeping track of the longest substring
		int result = Integer.MIN_VALUE;

		// for loop for surfing the given string
		for (; ending_ptr < s.length(); ending_ptr++) {

			// If the element is not present in the set, means the unique one, so adding
			// into it and
			// counting the size of the longest subset uptil now.
			if (!set.contains(s.charAt(ending_ptr))) {
				set.add(s.charAt(ending_ptr));
				// Max method to store the longest substring.
				result = Math.max(result, set.size());
			} else

			// Since the next element is present in the set, means we find the short circuit
			// point,
			// and hence need to remove all the element from starting uptil end ending_ptr
			// to find the next longest substring
			{
				while (s.charAt(starting_ptr) != s.charAt(ending_ptr)) {
					set.remove(s.charAt(starting_ptr));
					starting_ptr++;
				}
				starting_ptr++;

			}
		}

		return result;
	}

	public void merge(int[] arr, int low, int mid, int high) {

		int n1 = mid - low + 1;
		int n2 = high - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {

			L[i] = arr[low + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0;
		int k = low;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = L[j];
			j++;
			k++;
		}
	}

	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		public boolean isCousins(TreeNode node, int a, int b) {

			// 1. The two Nodes should be on the same level
			// in the binary tree.
			// 2. The two Nodes should not be siblings (means
			// that they should not have the same parent
			// Node).
			return ((level(node, node.left, 1) == level(node, node.right, 1)) && (!isSibling(node, a, b)));
		}

		// Recursive function to check if two Nodes are
		// siblings
		boolean isSibling(TreeNode node, int a, int b) {

			// Base case
			if (node == null)
				return false;

			return (((node.left != null) && (node.left.val == a || node.right.val == b))
					|| ((node.right != null) && (node.right.val == b || node.right.val == a))
					|| isSibling(node.left, a, b) || isSibling(node.right, a, b));
		}

		// Recursive function to find level of Node 'ptr' in
		// a binary tree
		int level(TreeNode node, TreeNode ptr, int lev) {
			// base cases
			if (node == null)
				return 0;

			if (node.val == ptr.val)
				return lev;

			// Return level if Node is present in left subtree
			int l = level(node.left, ptr, lev + 1);
			if (l != 0)
				return l;

			// Else search in right subtree
			return level(node.right, ptr, lev + 1);
		}

	}

	private static String get1SComplement(int num) {

		String s = "";
		while (num > 0) {
			s = ((num % 2 == 0) ? "1" : "0") + s;
			num = num / 2;
		}

		return s;

	}

	private static int convertDecimal(String s) {

		int res = 0;
		for (int j = 0, i = s.length() - 1; i >= 0; i--, j++) {
			int num = 0;
			if (s.charAt(i) == '1') {
				num = 1;
			}
			int mul = (int) Math.pow(2, j);
			res = res + (int) (num * mul);
		}
		return res;

	}
}

class Trie {

	private List<String> list;

	/** Initialize your data structure here. */
	public Trie() {
		list = new ArrayList<>();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		this.list.add(word);
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		boolean found = false;
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).equals(word)) {
				return true;
			}
		}
		return found;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		boolean found = false;
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).startsWith(prefix)) {
				return true;
			}
		}
		return found;
	}
}



//class Graph {
//	private int V; // No. of vertices
//
//	// Array of lists for Adjacency List Representation
//	private LinkedList<Integer> adj[];
//
//	// Constructor
//	Graph(int v) {
//		V = v;
//		adj = new LinkedList[v];
//		for (int i = 0; i < v; ++i)
//			adj[i] = new LinkedList();
//	}
//
//	// Function to add an edge into the graph
//	void addEdge(int v, int w) {
//		adj[v].add(w); // Add w to v's list.
//	}
//
//	// A function used by DFS
//	void DFSUtil(int v, boolean visited[]) {
//		// Mark the current node as visited and print it
//		visited[v] = true;
//		System.out.print(v + " ");
//
//		// Recur for all the vertices adjacent to this vertex
//		Iterator<Integer> i = adj[v].listIterator();
//		while (i.hasNext()) {
//			int n = i.next();
//			if (!visited[n])
//				DFSUtil(n, visited);
//		}
//	}
//
//	void BFS(int s) {
//		// Mark all the vertices as not visited(By default
//		// set as false)
//		boolean visited[] = new boolean[V];
//
//		// Create a queue for BFS
//		LinkedList<Integer> queue = new LinkedList<Integer>();
//
//		// Mark the current node as visited and enqueue it
//		visited[s] = true;
//		queue.add(s);
//
//		while (queue.size() != 0) {
//			// Dequeue a vertex from queue and print it
//			s = queue.poll();
//			System.out.print(s + " ");
//
//			// Get all adjacent vertices of the dequeued vertex s
//			// If a adjacent has not been visited, then mark it
//			// visited and enqueue it
//			Iterator<Integer> i = adj[s].listIterator();
//			while (i.hasNext()) {
//				int n = i.next();
//				if (!visited[n]) {
//					visited[n] = true;
//					queue.add(n);
//				}
//			}
//		}
//	}
//
//	// The function to do DFS traversal. It uses recursive DFSUtil()
//	void DFS(int v) {
//		// Mark all the vertices as not visited(set as
//		// false by default in java)
//		boolean visited[] = new boolean[V];
//
//		// Call the recursive helper function to print DFS traversal
//		DFSUtil(v, visited);
//	}
//	
//	
//}

