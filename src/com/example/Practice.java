package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

public class Practice {

	public static void main(String[] args) {
		Example obj = new Example();

//
//		ListNode node = new ListNode();
//		node.val = 2;
//		node.next = new ListNode();
//		node.next.val = 4;
//		node.next.next = new ListNode();
//		node.next.next.val = 3;
//
//		ListNode node1 = new ListNode();
//		node1.val = 5;
//		node1.next = new ListNode();
//		node1.next.val = 6;
//		node1.next.next = new ListNode();
//		node1.next.next.val = 4;
//		ListNode node = new ListNode();
//		node.val = 1;
//		node.next = new ListNode();
//		node.next.val = 8;
//		ListNode node1 = new ListNode();
//		node1.val = 0;

//		ListNode list = obj.addTwoNumbers(node, node1);
//		while (list != null) {
//			System.out.print("  =>" + list.val);
//			list = list.next;
//		}

//		System.out.println(obj.longestPalindrome("babad"));
//		System.out.println(obj.longestPalindrome("cbbd"));
//		System.out.println(obj.longestPalindrome("ac"));
//		System.out.println(obj.longestPalindrome("bb"));
//		System.out.println(obj.longestPalindrome("abb"));
//		System.out.println(obj.longestPalindrome("babad"));
//		System.out.println(obj.longestPalindrome("ccd"));

//		System.out.println(obj.intToRoman(3));
//
//		System.out.println(obj.intToRoman(4));
//
//		System.out.println(obj.intToRoman(9));
//
//		System.out.println(obj.intToRoman(58));
//
//		System.out.println(obj.intToRoman(1994));

//		System.out.println(obj.frequencySort("tree"));
//		System.out.println(obj.frequencySort("cccaaa"));
//		System.out.println(obj.frequencySort("Aabb"));
//		System.out.println(obj.frequencySort("raaeaedere")); // "eeeeaaarrd"

		// System.out.println(obj.simplifyPath("/home//foo/"));
		// System.out.println(obj.simplifyPath("/..."));

//		int[] nums = { -1, 0, 1, 2, -1, -4 };
//		List<List<Integer>> result = obj.threeSum(nums);
//		for (int i = 0; i < result.size(); i++) {
//			for (int j = 0; j < result.get(i).size(); j++) {
//				System.out.print("  " + result.get(i).get(j));
//			}
//			System.out.println();
//		}

//		int[][] a = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
//		int[][] b = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
//
//		int[][] res = obj.intervalIntersection(a, b);
//		
//		

//		ListNode node = new ListNode();
//		node.val = 1;
//		node.next = new ListNode();
//		node.next.val = 2;
//		node.next.next = new ListNode();
//		node.next.next.val = 3;
//		node.next.next.next = new ListNode();
//		node.next.next.next.val = 4;
//		node.next.next.next.next = new ListNode();
//		node.next.next.next.next.val = 5;
//		//ListNode list = obj.removeNthFromEnd(node, 2);
//		ListNode list = obj.reverse(node);
//		while (list != null) {
//			System.out.print("  =>" + list.val);
//			list = list.next;
//		}

//		int[] nums = { -1, 0, 1, 2, -1, -4 };
//		obj.threeSum(nums);
//		

//		// int[] nums = { 1, 1, 1, 2, 2, 3 };
//		int[] nums = { 0, 0, 0, 0, 0 };
//		// int[] nums = { -3, -1, -1, 0, 0, 0, 0, 0, 2 };
//
//		System.out.println(obj.removeDuplicates(nums));// [-3,-1,-1,0,0,2]

//		ListNode node1 = new ListNode();
//		node1.val = 1;
//		node1.next = new ListNode();
//		node1.next.val = 2;
//		node1.next.next = new ListNode();
//		node1.next.next.val = 4;
//		ListNode node = new ListNode();
//		node.val = 1;
//		node.next = new ListNode();
//		node.next.val = 3;
//		node.next.next = new ListNode();
//		node.next.next.val = 4;
//		ListNode list = obj.mergeTwoLists(node1, node);
//		while (list != null) {
//			System.out.print("  =>" + list.val);
//			list = list.next;
//		}
//

//		int[] nums = { 5, 7, 7, 8, 8, 10 };
//		System.out.println(obj.binarySearch(nums, 5));
//		System.out.println(obj.binarySearch(nums, 10));
//		System.out.println(obj.binarySearch(nums, 7));
//		System.out.println(obj.binarySearch(nums, 1));
//		obj.merge(nums1, 3, nums2, 3);
//
//		for (int i = 0; i < nums1.length; i++) {
//			System.out.print("  " + nums1[i]);
//
//		}
//		int[] A = { 1, 3, 7, 1, 7, 5 };
//		int[] B = { 1, 9, 2, 5, 1 };
//		int[] A = { 2, 5, 1, 2, 5 };
//		int[] B = { 10, 5, 2, 1, 5, 2 };
//		int[] A = { 1, 4, 2 };
//		int[] B = { 1, 2, 4 };
//		int[] A = {3,3 };
//		int[] B = { 3};
//		int[] A = { 3, 3 };
//		int[] B = { 1, 3, 1, 2, 1 };
//		int[] A = { 3, 3, 2 };
//		int[] B = { 3, 3, 1, 2 };
//
//		System.out.println(obj.maxUncrossedLines(A, B));

//		int[] nums = { 0, 1, 0 };
//		System.out.println(obj.findMaxLength(nums));
//		System.out.println(obj.countPrimes(10));
//		System.out.println(obj.countPrimes(3));
//		System.out.println(obj.countPrimes(4));
//		System.out.println(obj.countPrimes(7));
//		System.out.println(obj.countPrimes(499979));

		// -10,-3,0,5,9
//		ListNode node = new ListNode();
//		node.val = -10;
//		node.next = new ListNode();
//		node.next.val = -3;
//		node.next.next = new ListNode();
//		node.next.next.val = 0;
//		node.next.next.next = new ListNode();
//		node.next.next.next.val = 5;
//		node.next.next.next.next = new ListNode();
//		node.next.next.next.next.val = 9;
//
//		obj.sortedListToBST(node);
//
//		List<List<Integer>> result = obj.generate(5);
//
//		for (int i = 0; i < result.size(); i++) {
//			for (int j = 0; j < result.get(i).size(); j++) {
//				System.out.print("  " + result.get(i).get(j));
//			}
//			System.out.println();
//		}
//		result = obj.generate(3);
//
//		for (int i = 0; i < result.size(); i++) {
//			for (int j = 0; j < result.get(i).size(); j++) {
//				System.out.print("  " + result.get(i).get(j));
//			}
//			System.out.println();
//		}

//		String s = "A man, a plan, a canal: Panama";
//		System.out.println(obj.isPalindrome(s));
//		s = "race a car";
//		System.out.println(obj.isPalindrome(s));
//		s = "a.";
//		System.out.println(obj.isPalindrome(s));
//		s = "0P";
//		System.out.println(obj.isPalindrome(s));
		// "A man, a plan, a canal: Panama"

		// int[] nums = { 4, 1, 2, 1, 2 };
		// int nums[]= {2,2,1};
		// System.out.println(obj.singleNumber(nums));
//
//		ListNode node = new ListNode();
//		node.val = -129;
//		node.next = new ListNode();
//		node.next.val = -129;
//		System.out.println(obj.isPalindrome(node));

//		node.next.next.next = new ListNode();
//		node.next.next.next.val = 4;
//		node.next.next.next.next = new ListNode();
//		node.next.next.next.next.val = 5;

//		int[][] points = { { 1, 3 }, { -2, 2 } };
//		// int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
//
//		obj.kClosest(points, 2);
////

//		System.out.println(obj.minDistance("horse", "ros"));
//		System.out.println(obj.minDistance("intention", "execution"));

//		Graph g = new Graph(4);
//
//		g.addEdge(0, 1);
//		g.addEdge(0, 2);
//		g.addEdge(1, 2);
//		g.addEdge(2, 0);
//		g.addEdge(2, 3);
//		g.addEdge(3, 3);
//
//		System.out.println("\n Following is Depth First Traversal " + "(starting from vertex 2)");
//		g.DFS(2);
//		System.out.println();
//		System.out.println();
//		System.out.println(" Following is Breadth First Traversal " + "(starting from vertex 2)\n");
//		g.BFS(2);

//		//  4
//		   /   \
//		   7     2
//		  / \   / \
//		 9   6 3   1

//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(7);
//		root.left.left = new TreeNode(9);
//		root.left.right = new TreeNode(6);
//		root.right = new TreeNode(2);
//		root.right.left = new TreeNode(3);
//		root.right.right = new TreeNode(1);

		// 3,9,20,null,null,15,7
//		TreeNode p = new TreeNode(1);
//		p.left = new TreeNode(9);
//		p.left.left = new TreeNode(15);
//		p.left.left = new TreeNode(15);
//		p.left.left = new TreeNode(15);
//		p.right = new TreeNode(20);
//		p.right.right = new TreeNode(7);
//		p.right.right.right = new TreeNode(7);
//		p.right.right.right = new TreeNode(7);
//
//		System.out.println(obj.isBalanced(p));

//[4,7,2,9,6,3,1]

//		System.out.println(obj.firstUniqChar("leetcode"));
//
//		int[] n1 = { 1, 2, 2, 1 };
//		int[] n2 = { 2, 2 };
//
//		int[] res = obj.intersect(n1, n2);

		// System.out.println(obj.canConstruct("aab", "baa"));

//		System.out.println(obj.countSubstrings("abc"));
//		System.out.println(obj.countSubstrings("aaa"));

		/*
		 * 
		 * 3 / \ 4 5 / \ 1 2
		 * 
		 * 
		 */

//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(4);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(2);
//		//root.left.right.left = new TreeNode(2);
//		root.right = new TreeNode(5);
//
//		TreeNode sub = new TreeNode(4);
//		sub.left = new TreeNode(1);
//		sub.right = new TreeNode(2);

//		int nums[][] = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
//		int result[][] = obj.reconstructQueue(nums);

//
//		   1
//		 /   \
//		2     3
//		 \
//		  5
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.left.right = new TreeNode(5);
//		root.right = new TreeNode(3);
//		root.right.left = new TreeNode(6);
//		List<String> list = obj.binaryTreePaths(root);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(" " + list.get(i));
//	}
		// [1,2]
		// [1,2,3,null,5]
		// [1,2,3,5,6]
		// ["1->2->5","1->2->6","1->3"]
//[1,1,3,5,5]
//		int nums[] = { 1, 1, 3, 5, 5 };
//		int[] res = obj.getStrongest(nums, 2);
//		for (int i = 0; i < res.length; i++) {
//			System.out.print("  " + res[i]);
//		}

		// ["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
		// [["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]

		// [null,null,null,null,"youtube.com","facebook.com","facebook.com",null,null,"facebook.com","leetcode.com"]

		// [null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]

		// List<String> list = obj.letterCombinations("23");
		// int n = obj.numSquares(12);

		// System.out.println(obj.validIPAddress("172.16.254.1"));
		// System.out.println(obj.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
//		int[] nums = { 1, 2, 3, 4 };
//		System.out.println(obj.productExceptSelf(nums));

		// System.out.println(obj.getPermutation(3, 5));

		// System.out.println(obj.longestDiverseString(1, 1, 7));

		// System.out.println(obj.minRemoveToMakeValid("lee(t(c)o)de)"));
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		// root.left.right = new TreeNode(5);
		root.right = new TreeNode(4);
		// root.right.left = new TreeNode(6);
		// System.out.println(obj.sumNumbers(root));
//		List<Integer> list = new ArrayList<>();
//		obj.kthSmallest(root, 1);
//
//		int[][] arr = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
//		obj.twoCitySchedCost1(arr);

		// Input: cells = [0,1,0,1,1,0,0,1], N = 7
//		int[] arr = { 0, 1, 0, 1, 1, 0, 0, 1 };
//		arr = obj.prisonAfterNDays(arr, 7);
		// System.out.print(obj.nthUglyNumber(22));
		// int arr[] = { 9 };
		// obj.plusOne(arr);

		int[] nums = { -1, 0, 1, 2, -1, -4 };
		obj.threeSum(nums);
//		//[
//		  [-1, 0, 1],
//		  [-1, -1, 2]
//		]
	}

}

class Example {

	public int rob(int[] nums) {
		int r = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || i == 1) {
				r = Math.max(r, nums[i]);
			} else {
				r = Math.max(nums[i] + nums[i - 2], nums[i - 1]);
			}

			nums[i] = r;
		}

		return r;
		
		
		/*
		 *
        if(nums.length < 1){
            return 0;
        }
        
        int dp [] = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i+1] = Math.max(dp[i-1] + nums[i], dp[i]);
        }
        return dp[nums.length];
		 * 
		 * 
		 */
	}

	public int climbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 2;
		for (int i = 2; i < n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n - 1];
	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> set = new ArrayList<>();
		set.add(new LinkedList<>());

		if (nums == null || nums.length == 0) {
			return set;
		}

		for (int num : nums) {
			List<List<Integer>> helper = new ArrayList<>();
			for (List<Integer> current : set) {
				List<Integer> temp = new ArrayList<>(current);
				temp.add(num);
				helper.add(temp);
			}

			for (List<Integer> current : helper) {
				set.add(current);
			}
		}

		return set;
	}

	public int widthOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int h = getHeight(root);
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= h; i++) {
			int width = maxWidth(root, i);
			if (width > max) {
				max = width;
			}
		}
		return max;
	}

	int maxWidth(TreeNode root, int level) {
		if (root == null) {
			return level;
		}
		if (level == 1) {
			return 1;
		} else if (level > 1) {
			return (maxWidth(root.left, level - 1) + maxWidth(root.right, level - 1));
		}
		return 0;
	}

	int getHeight(TreeNode root) {

		while (root == null) {
			return 0;
		}
		int lheight = getHeight(root.left);
		int rheight = getHeight(root.right);

		return lheight > rheight ? lheight + 1 : rheight + 1;
	}

	public List<List<Integer>> threeSum(int[] nums) {

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

	public int[] plusOne(int[] d) {

		List<Integer> list = new ArrayList<>();
		int carry = 0;
		for (int i = d.length - 1; i >= 0; i--) {
			int num = d[i];
			if (d[i] == 9 && (carry == 1 || carry == 0)) {
				num = 0;
				carry = 1;
			} else if (carry == 1 || carry == 0) {
				num = num + 1;
				carry = -1;
			}
			list.add(num);
		}
		if (carry == 1) {
			list.add(1);
		}
		int[] res = new int[list.size()];
		for (int j = 0, i = list.size() - 1; i >= 0; j++, i--) {
			res[j] = list.get(i);
		}
		return res;
//9,8,7,6,5,4,3,2,1,1
	}

	public int nthUglyNumber(int n) {
		int num = 1;
		for (int i = 2; i < 1690; i++) {
			if (isUgly(i)) {
				num++;
			}
			if (num == n) {
				num = i;
				break;
			}
		}
		return num;
	}

	private boolean isUgly(int n) {
		int quotient = -1;
		if (n % 2 == 0) {
			quotient = n / 2;
			if ((quotient == 1 || quotient % 2 == 0 || quotient % 3 == 0 || quotient % 5 == 0)
					&& !checkPrimeNo(quotient)) {
				return true;
			}
		}
		if (n % 3 == 0) {
			quotient = n / 3;
			if ((quotient == 1 || quotient % 2 == 0 || quotient % 3 == 0 || quotient % 5 == 0)
					&& !checkPrimeNo(quotient)) {
				return true;
			}
		}
		if (n % 5 == 0) {
			quotient = n / 5;
			if ((quotient == 1 || quotient % 2 == 0 || quotient % 3 == 0 || quotient % 5 == 0)
					&& !checkPrimeNo(quotient)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkPrimeNo(int num) {

		if (num <= 6) {
			return false;
		}
		for (int i = 7; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int[] prisonAfterNDays(int[] cells, int N) {

		cells[0] = 0;
		cells[cells.length - 1] = 0;
		for (int j = 0; j <= N; j++) {
			for (int i = 1; i < cells.length - 1; i++) {
				int val = 0;
				if (cells[i - 1] == cells[i + 1]) {
					val = 1;
				}
				cells[i] = val;
			}

		}
		return cells;
	}

	public int twoCitySchedCost1(int[][] costs) {
		Arrays.sort(costs, (a, b) -> {
			return (a[0] - a[1]) - (b[0] - b[1]);
		});

		int total = 0;
		for (int i = 0; i < costs.length; i++) {
			if (i < costs.length / 2)
				total += costs[i][0];
			else
				total += costs[i][1];

		}
		return total;
	}

	public int numSquares1(int n) {

		int[] dp = new int[n + 1];
		Arrays.fill(dp, n);
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}
		return dp[n];
	}

	public int kthSmallest(TreeNode root, int k) {
		if (root == null) {
			return 0;
		}
		List<Integer> list = new ArrayList<>();

		list = getValuesInOrder(root, list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print("  " + list.get(i));
		}
		return list.get(k - 1);
	}

	List<Integer> getValuesInOrder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return list;
		}
		list = getValuesInOrder(root.left, list);
		list.add(root.val);
		list = getValuesInOrder(root.right, list);
		return list;
	}

	public int sumNumbers(TreeNode root) {
		return sumNode(root, 0);
	}

	private int sumNode(TreeNode root, int val) {
		if (root == null) {
			return 0;
		}
		val = 10 * val + root.val;
		if (root.right == null && root.left == null) {
			return val;
		}
		return sumNode(root.left, val) + sumNode(root.right, val);
	}

	public int rangeSumBST(TreeNode root, int L, int R) {
		int sum = 0;
		return calculateSum(root, L, R, sum);
	}

	int calculateSum(TreeNode root, int L, int R, int sum) {
		if (root == null) {
			return sum;
		}
		if (L <= root.val && root.val <= R) {
			sum = sum + root.val;
		}
		sum = calculateSum(root.left, L, R, sum);
		sum = calculateSum(root.right, L, R, sum);
		return sum;
	}

	public String minRemoveToMakeValid(String s) {
		int i = -1;
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		boolean validIndex[] = new boolean[s.length()];
		while (++i < s.length()) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.push(i);
			} else if (c == ')') {
				if (!stack.isEmpty()) {
					validIndex[stack.pop()] = true;
					validIndex[i] = true;
				}
			} else {
				validIndex[i] = true;
			}
		}

		for (int j = 0; j < validIndex.length; j++) {
			if (validIndex[j]) {
				sb.append(s.charAt(j));
			}
		}
		return sb.toString();
	}

	public String longestDiverseString(int a, int b, int c) {
		int ca = 0, cb = 0, cc = 0;
		int n = a + b + c;
		String res = "";

		for (int i = 0; i < n; i++) {
			if ((a >= b && a >= c && ca != 2) || (cb == 2 && a > 0) || (cc == 2 && a > 0)) {
				res += "a";
				a--;
				ca++;
				cb = 0;
				cc = 0;
			} else if ((b >= a && b >= c && cb != 2) || (ca == 2 && b > 0) || (cc == 2 && b > 0)) {
				res += "b";
				b--;
				cb++;
				ca = 0;
				cc = 0;
			} else if ((c >= a && c >= b && cc != 2) || (ca == 2 && c > 0) || (cb == 2 && c > 0)) {
				res += "c";
				c--;
				cc++;
				ca = 0;
				cb = 0;
			}
		}

		return res;
	}

	public int singleNumber(int[] nums) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer num = hm.get(nums[i]);
			if (num != null) {
				num = num + 1;
			}
			hm.put(nums[i], num);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.addAll(hm.keySet());
		while (!pq.isEmpty()) {
			int num = pq.remove();
			if (hm.get(num) == 1) {
				return hm.get(num);
			}
		}
		return 0;
	}

	public String getPermutation(int n, int k) {

		List<Integer> l = new ArrayList<>();

		for (int i = 1; i <= n; i++)
			l.add(i);

		int fact = factorial(n);

		StringBuilder sb = new StringBuilder();
		k = k - 1;

		for (int i = 0; i < n; i++) {

			int f = fact / (n - i);
			int ind = k / f;
			sb.append(l.get(ind));
			k = k % f;
			fact = f;
			l.remove(ind);

		}
		return sb.toString();
	}

	private int factorial(int n) {
		int p = 1;
		for (int i = 1; i <= n; i++)
			p *= i;
		return p;
	}

	public String getPermutation1(int n, int k) {
		if (n == 0) {
			return null;
		}
		if (n == 1) {
			return "1";
		}
		String s = "";
		for (int i = 1; i <= n; i++) {
			s = s + i;
		}
		System.out.println(s);
		List<String> list = new ArrayList<>();
		list = calculate(s, 0, s.length() - 1, list);
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			if (i + 1 == k) {
				return list.get(i);
			}
		}

		return null;
	}

	public List<String> calculate(String s, int l, int r, List<String> list) {
		if (l == r) {
			list.add(s);
		}
		for (int i = l; i <= r; i++) {
			String swapped = swap(s, l, i);
			calculate(swapped, l + 1, r, list);
		}
		return list;
	}

	public String swap(String s, int i, int j) {
		char[] c = s.toCharArray();
		char temp = c[j];
		c[j] = c[i];
		c[i] = temp;

		return String.valueOf(c);
	}

	public void moveZeroes(int[] nums) {

		if (nums == null || nums.length == 0) {
			return;
		}
		if (nums.length == 1) {
			return;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}
		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0)
			return false;
		int n = matrix.length;
		if (matrix[0].length == 0)
			return false;
		int m = matrix[0].length;
		int i = 0, j = m - 1;
		while (i < n && j >= 0) {
			if (matrix[i][j] == target)
				return true;
			else if (matrix[i][j] < target)
				i++;
			else
				j--;
		}
		return false;
	}

//Input: [10,9,2,5,3,7,101,18]
	public int[] productExceptSelf(int[] nums) {

		// The length of the input array
		int length = nums.length;

		// The left and right arrays as described in the algorithm
		int[] L = new int[length];
		int[] R = new int[length];

		int[] answer = new int[length];
		L[0] = 1;
		for (int i = 1; i < length; i++) {
			L[i] = nums[i - 1] * L[i - 1];
		}

		R[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {
			R[i] = nums[i + 1] * R[i + 1];
		}

		// Constructing the answer array
		for (int i = 0; i < length; i++) {
			answer[i] = L[i] * R[i];
		}

		return answer;
	}

	public String validateIPv4(String IP) {
		String[] nums = IP.split("\\.", -1);
		for (String x : nums) {
			// Validate integer in range (0, 255):
			// 1. length of chunk is between 1 and 3
			if (x.length() == 0 || x.length() > 3)
				return "Neither";
			// 2. no extra leading zeros
			if (x.charAt(0) == '0' && x.length() != 1)
				return "Neither";
			// 3. only digits are allowed
			for (char ch : x.toCharArray()) {
				if (!Character.isDigit(ch))
					return "Neither";
			}
			// 4. less than 255
			if (Integer.parseInt(x) > 255)
				return "Neither";
		}
		return "IPv4";
	}

	public String validateIPv6(String IP) {
		String[] nums = IP.split(":", -1);
		String hexdigits = "0123456789abcdefABCDEF";
		for (String x : nums) {
			// Validate hexadecimal in range (0, 2**16):
			// 1. at least one and not more than 4 hexdigits in one chunk
			if (x.length() == 0 || x.length() > 4)
				return "Neither";
			// 2. only hexdigits are allowed: 0-9, a-f, A-F
			for (Character ch : x.toCharArray()) {
				if (hexdigits.indexOf(ch) == -1)
					return "Neither";
			}
		}
		return "IPv6";
	}

	public String validIPAddress(String IP) {
		if (IP.chars().filter(ch -> ch == '.').count() == 3) {
			return validateIPv4(IP);
		} else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
			return validateIPv6(IP);
		} else
			return "Neither";
	}

	public List<Integer> countSmaller(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return list;
		}
		int start = 0, end = nums.length - 1, count = 0;
		while (nums.length > 1 && start <= end) {
			if (start == end) {
				list.add(count);
				count = 0;
				start++;
				end = nums.length - 1;
			}
			if (nums[start] > nums[end]) {
				count++;
			}
			end--;
		}
		list.add(0);
		return list;
	}

	public int findLeastNumOfUniqueInts(int[] arr, int k) {

		if (arr == null || arr.length == 0) {
			return -1;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return set.size() - k;
	}

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		return getTree(root, val);
	}

	private TreeNode getTree(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (root.val == val) {
			return root;
		}
		TreeNode node = getTree(root.left, val);
		if (node == null) {
			node = getTree(root.right, val);
		}
		return node;
	}

	public int evalRPN(String[] tokens) {

		if (tokens == null || tokens.length == 0) {
			return 0;
		}
		Stack<Integer> stack = new Stack<>();
		Set<String> set = new HashSet<>();

		set.add("+");
		set.add("-");
		set.add("*");
		set.add("/");
		int sum = 0;
		for (int i = 0; i < tokens.length; i++) {
			if (set.contains(tokens[i]) && stack.size() >= 2) {
				int num2 = stack.pop();
				int num1 = stack.pop();
				int result = getResult(num1, num2, tokens[i]);
				stack.push(result);
			} else {
				stack.push(Integer.parseInt(tokens[i]));
			}

		}

		return stack.peek();
	}

	int getResult(int num1, int num2, String token) {
		switch (token) {
		case "+":
			return num1 + num2;
		case "*":
			return num1 * num2;
		case "-":
			return num1 - num2;
		case "/":
			return num1 / num2;
		default:
			return 0;
		}
	}

	public int numSquares(int n) {
		int i = 1;
		ArrayList<Integer> Coins = new ArrayList<Integer>();
		while (i * i <= n) {
			if (i * i == n)
				return 1;
			Coins.add(i * i);
			i++;
		}

		int[] DP = new int[n + 1];
		for (int x = 0; x < DP.length; x++) {
			DP[x] = Integer.MAX_VALUE;
		}
		DP[0] = 0;

		for (int j = 0; j < DP.length; j++) {
			for (int c = 0; c < Coins.size(); c++) {
				if (j >= Coins.get(c)) {
					DP[j] = Math.min(DP[j], DP[j - Coins.get(c)] + 1);
				}
			}
		}

		return DP[n];

	}

	public int findDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		for (int i = 0; i + 1 < nums.length; i++) {
			if (nums[i] == nums[i + 1]) {
				return nums[i];
			}
		}

		return 0;
	}

	Map<String, String> phone = new HashMap<String, String>() {
		{
			put("2", "abc");
			put("3", "def");
			put("4", "ghi");
			put("5", "jkl");
			put("6", "mno");
			put("7", "pqrs");
			put("8", "tuv");
			put("9", "wxyz");
		}
	};

	List<String> output = new ArrayList<String>();

	public void backtrack(String combination, String next_digits) {
		// if there is no more digits to check
		if (next_digits.length() == 0) {
			// the combination is done
			output.add(combination);
		}
		// if there are still digits to check
		else {
			// iterate over all letters which map
			// the next available digit
			String digit = next_digits.substring(0, 1);
			String letters = phone.get(digit);
			for (int i = 0; i < letters.length(); i++) {
				String letter = phone.get(digit).substring(i, i + 1);
				// append the current letter to the combination
				// and proceed to the next digits
				backtrack(combination + letter, next_digits.substring(1));
			}
		}
	}

	public List<String> letterCombinations(String digits) {
		if (digits.length() != 0)
			backtrack("", digits);
		return output;
	}

	public String arrangeWords(String text) {

		if (text == null || text.length() == 0) {
			return null;
		}
		Map<Integer, List<String>> map = new HashMap<>();

		String[] arr = text.split(" ");
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i].length();
			map.putIfAbsent(key, new ArrayList<>());
			map.get(key).add(arr[i]);
			if (max < key) {
				max = key;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= max; i++) {
			if (map.containsKey(i)) {
				for (int j = 0; j < map.get(i).size(); j++) {
					sb.append(map.get(i).get(j));
					sb.append(" ");
				}
			}
		}
		char ch = sb.charAt(0);
		sb.setCharAt(0, (char) (ch - 32));
		return sb.toString().trim();

	}

	public int threeSumClosest(int[] nums, int target) {
		int j = 1;
		for (int i = 0; (i + j + 1) <= nums.length; i++) {
			int sum = nums[i] + nums[j] + nums[j + 1];
			if (sum + 1 == target || sum == target || sum - 1 == target) {
				return sum;
			}
			j++;
		}

		return 0;
	}

	public int[] getStrongest(int[] arr, int k) {
		Arrays.sort(arr);
		int i = 0, j = arr.length - 1, p = 0;
		int median = arr[(arr.length - 1) / 2];
		int[] res = new int[k];
		while (p < k)
			if (Math.abs(arr[i] - median) > Math.abs(arr[j] - median))
				res[p++] = arr[i++];
			else
				res[p++] = arr[j--];
		return res;
	}

	public int[] shuffle(int[] nums, int n) {

		if (nums == null || nums.length == 0) {
			return null;
		}
		int[] arr = new int[nums.length];
		int count = n, j = 0;
		for (int i = 0; i < n; i++) {
			arr[j] = nums[i];
			arr[j + 1] = nums[count++];
			j = j + 2;
		}
		return arr;

	}

	public List<String> binaryTreePaths(TreeNode root) {

		List<String> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		String result = "";
		if (root.left == null && root.right == null) {
			list.add(result + root.val);
			return list;
		}
		if (root.left != null && root.right == null) {
			list.add(getElements(root.left, result + root.val));
			return list;
		}
		if (root.left == null && root.right != null) {
			list.add(getElements(root.right, result + root.val));
			return list;
		}
		list.add(getElements(root.left, result + root.val));
		list.add(getElements(root.right, result + root.val));

		return list;
	}

	private String getElements(TreeNode root, String result) {

		if (root == null) {
			return result;
		}
		result = result + "->" + root.val;
		result = getElements(root.left, result);
		result = getElements(root.right, result);
		return result;
	}

	public int[][] reconstructQueue(int[][] people) {

		if (people == null || people.length == 0) {
			return null;
		}
		// { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
		for (int i = 0; i < people.length; i++) {
			for (int j = i + 1; j < people.length; j++) {
				if (people[i][0] >= people[j][0]) {
					int temp0 = people[i][0];
					int temp1 = people[i][1];
					people[i][0] = people[j][0];
					people[i][1] = people[j][1];
					people[j][0] = temp0;
					people[j][1] = temp1;
				} else if (people[i][0] == people[j][0] && people[i][1] >= people[j][1]) {
					int temp0 = people[i][0];
					int temp1 = people[i][1];
					people[i][0] = people[j][0];
					people[i][1] = people[j][1];
					people[j][0] = temp0;
					people[j][1] = temp1;
				}
			}
		}
		return people;
	}

	public int search(int[] nums, int target) {

		if (nums == null || nums.length == 0) {
			return -1;
		}
		int low = 0, high = nums.length - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > nums[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		int start = low;
		low = 0;
		high = nums.length - 1;
		if (target >= nums[start] && target <= nums[start]) {
			low = start;
		} else {
			high = start;
		}

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;

			}
		}

		return -1;
	}

	public int countSubstrings(String s) {
		if (s == null) {
			return 0;
		}
		int sum = 0, len = s.length();
		sum = sum + s.length();
		int start = 0, end = len;

		while (start <= end) {
			if (start == end) {
				start++;
				end = len;
			}
			String subs = s.substring(start, end);
			if (isPalindromeinSubstring(subs)) {
				sum = sum + 1;
			}
			end--;
		}

		return sum;

	}

	public boolean isPalindromeinSubstring(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return false;
		}
		StringBuilder sb = new StringBuilder(s).reverse();
		return s.equals(sb.toString());
	}

	public boolean isCousins(TreeNode root, int x, int y) {
		int levelX = 0;
		int levelY = 0;
		int parentX = Integer.MIN_VALUE;
		int parentY = Integer.MIN_VALUE;

		if (root == null) {
			return false;
		}

		levelX = getNodeLevel(root, x, levelX);
		levelY = getNodeLevel(root, y, levelY);

		parentX = getParent(root, x);
		parentY = getParent(root, y);

		if (parentX != parentY && levelX == levelY) {
			return true;
		}
		return false;
	}

	public int getParent(TreeNode root, int x) {
		if (root == null) {
			return -1;
		}

		if ((root.left != null && root.left.val == x) || (root.right != null && root.right.val == x)) {
			return root.val;
		}
		int left_parent = getParent(root.left, x);
		if (left_parent == -1) {
			return getParent(root.right, x);
		} else {
			return left_parent;
		}

	}

	private int getNodeLevel(TreeNode root, int x, int level) {
		if (root == null) {
			return 0;
		}

		if (root.val == x) {
			return level;
		}

		int left_height = getNodeLevel(root.left, x, level + 1);
		if (left_height == 0) {
			return getNodeLevel(root.right, x, level + 1);
		} else {
			return left_height;
		}
	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if (color != newColor)
			dfs(image, sr, sc, color, newColor);
		return image;
	}

	public void dfs(int[][] image, int r, int c, int color, int newColor) {
		if (image[r][c] == color) {
			image[r][c] = newColor;
			if (r >= 1)
				dfs(image, r - 1, c, color, newColor);
			if (c >= 1)
				dfs(image, r, c - 1, color, newColor);
			if (r + 1 < image.length)
				dfs(image, r + 1, c, color, newColor);
			if (c + 1 < image[0].length)
				dfs(image, r, c + 1, color, newColor);
		}
	}

	public boolean canConstruct(String r, String m) {
		if (r.equals("") || r.equals(m)) {
			return true;
		}
		if (r.length() == 0 || r.length() > m.length()) {
			return false;
		}
		int[] count = new int[256];
		int[] count1 = new int[256];

		for (int i = 0; i < r.length(); i++) {
			count[r.charAt(i)]++;
		}

		for (int i = 0; i < m.length(); i++) {
			count1[m.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (count1[i] < count[i]) {
				return false;
			}
		}
		return true;
	}

	TreeNode result = null;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null) {
			return null;
		}
		int leftLevel = 1, rightLevel = 1;
		if ((root.left != null && root.left.val == p.val)) {
			leftLevel++;
		}
		if (root.right != null && root.right.val == q.val) {
			rightLevel++;
		}
		leftLevel = getLevel(leftLevel, root.left, p);
		rightLevel = getLevel(rightLevel, root.right, q);

		return null;
	}

	private int getLevel(int level, TreeNode node, TreeNode value) {

		if (node == null) {
			return level;
		}
		if ((node.left != null && node.left.val == value.val) || (node.right != null && node.right.val == value.val)) {
			level++;
		}
		level = getLevel(level, node.left, value);
		level = getLevel(level, node.right, value);
		return level;
	}

	private void getAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null) {
			return;
		}

		if ((root.right != null && root.right.val == q.val) && (root.left != null && root.left.val == p.val)) {
			result = new TreeNode(root.val);
		}
		if ((root.right != null && root.right.val == p.val) && (root.left != null && root.left.val == q.val)) {
			result = new TreeNode(root.val);
		}

		getAncestor(root.left, p, q);
		getAncestor(root.right, p, q);

	}

	public int twoCitySchedCost(int[][] costs) {

		Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));
		int cost = 0;
		for (int i = 0; i < costs.length; i++) {
			cost += costs[i][0]; // send first N to A
			cost += costs[costs.length / 2 + i][1]; // send last N to B
		}
		return cost;
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null) {
			return null;
		}
		List<Integer> list = getIntersection(nums1, nums2);
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}

		return result;
	}

	public List<Integer> getIntersection(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<>();

		if (nums1.length < nums2.length) {
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
		}
		int j = 0, len = nums2.length;
		for (int i = 0; i < nums1.length; i++) {
			if (j == len) {
				break;
			}
			if (nums1[i] == nums2[j]) {
				list.add(nums1[j]);
				j++;
			}
		}

		return list;
	}

	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			Integer value = map.get(s.charAt(i));
			if (value == null) {
				value = 1;
			} else {
				value = 2;
			}
			map.put(s.charAt(i), value);
		}
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		int leftLevel = 1, rightLevel = 1;
//		if (root.left != null) {
//			leftLevel = getLevel(++leftLevel, root.left);
//		}
//
//		if (root.right != null) {
//			rightLevel = getLevel(++rightLevel, root.right);
//		}
		int min = Integer.MIN_VALUE;
//		if (rightLevel < leftLevel) {
//			min = rightLevel;
//		} else {
//			min = leftLevel;
//		}
		return min;
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> values = null;
		list = addIntoList(list, root);
		if (list == null || list.isEmpty()) {
			return result;
		}
		for (int i = list.size() - 1; i - 1 >= 0; i = i - 2) {
			values = new ArrayList<>();
			values.add(list.get(i - 1));
			values.add(list.get(i));
			result.add(values);
		}
		if (list.size() % 2 != 0) {
			values = new ArrayList<>();

			values.add(list.get(0));
			result.add(values);
		}
		return result;
	}

	private List<Integer> addIntoList(List<Integer> list, TreeNode root) {

		if (root == null) {
			return list;
		}
		list.add(root.val);
		list = addIntoList(list, root.left);
		list = addIntoList(list, root.right);
		return list;
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		return checkValues(p, q);
	}

	public boolean checkValues(TreeNode root, TreeNode root2) {

		if (root == null && root2 == null) {
			return true;
		} else if (root == null || root2 == null) {
			return false;
		} else {
			if (root.val != root2.val) {
				return false;
			}
			boolean checkLeftNode = checkValues(root.left, root2.left);
			if (!checkLeftNode)
				return false;

			boolean checkRightNode = checkValues(root.right, root2.right);
			if (!checkRightNode)
				return false;

			return true;
		}
	}

	public int maxEnvelopes(int[][] envelopes) {

		int start_index = 0;
		int end_index = envelopes.length - 1;
		int count = 0;
		int min0 = Integer.MIN_VALUE;
		int min1 = Integer.MIN_VALUE;
		int minIndex = -1;

		for (int i = 1; i < envelopes.length; i++) {
			if (min0 < envelopes[i][0] && min1 < envelopes[i][1]) {
				min0 = envelopes[i][0];
				min1 = envelopes[i][1];
				minIndex = i;
			}
		}

		return 0;
	}

	public boolean isPalindrome(ListNode head) {

		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

		return checkingPalindrome(list);
	}

	private boolean checkingPalindrome(List<Integer> list) {
		int start = 0, end = list.size() - 1;
		while (start < end) {
			if (list.get(start).intValue() != list.get(end).intValue()) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

	public int[][] kClosest(int[][] points, int K) {

		int x = 0;
		int y = 0;
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> values = new HashMap<>();
		for (int i = 0; i < points.length; i++) {
			double sumSquarex = Math.pow((points[i][0] - x), 2);
			double sumSquarey = Math.pow((points[i][1] - y), 2);
			int resultant = (int) Math.sqrt(sumSquarex + sumSquarey);
			list.add(resultant);
		}

		for (int i = 0; i < points.length; i++) {
			values.put(i, list.get(i));
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> values.get(a) - values.get(b));
		pq.addAll(values.keySet());
		int count = 0;
		List<Integer> indices = new ArrayList<>();
		while (!pq.isEmpty()) {
			int index = pq.remove();
			if (K == count) {
				break;
			}
			indices.add(index);
			count++;
		}
		int[][] result = new int[indices.size()][2];

		for (int i = 0; i < indices.size(); i++) {

			result[i][0] = points[indices.get(i)][0];
			result[i][1] = points[indices.get(i)][1];

		}
		return result;
	}

//	public int singleNumber(int[] nums) {
//		int i = 0;
//		for (i = 0; (i + 1) < nums.length;) {
//			if (nums[i] == nums[i + 1]) {
//				i = i + 2;
//			} else {
//				return nums[i];
//			}
//		}
//		return nums[i];
//	}

	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		StringBuilder sb = new StringBuilder(s).reverse();
		return s.equals(sb.toString());
	}

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> input = null;
		int i = 0;
		if (numRows == 0) {
			return null;
		}
		if (numRows >= 1) {
			input = new ArrayList<>();
			input.add(1);
			result.add(input);
			i++;
		}
		if (numRows >= 2) {
			input = new ArrayList<>();
			input.add(1);
			input.add(1);
			result.add(input);
			i++;
		}

		for (i = 2; i < numRows; i++) {
			input = new ArrayList<>();
			List<Integer> list = result.get(i - 1);
			input.add(list.get(0));
			for (int j = 0; (j + 1) < list.size(); j++) {
				input.add(list.get(j) + list.get(j + 1));
			}
			input.add(list.get(list.size() - 1));
			result.add(input);
		}
		return result;
	}

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return consrtuctBSTUsingLinkedList(head, 0, count);
	}

	private TreeNode consrtuctBSTUsingLinkedList(ListNode head, int low, int high) {

		if (low > high || head == null) {
			return null;
		}
		int mid = low + (high - low) / 2;
		ListNode temp = head;
		int count = 0;
		int num = Integer.MAX_VALUE;
		while (temp != null) {
			if (count == mid) {
				num = temp.val;
				break;
			}
			temp = temp.next;
			count++;
		}

		TreeNode root = new TreeNode(num);
		root.left = consrtuctBSTUsingLinkedList(head, low, mid - 1);
		root.right = consrtuctBSTUsingLinkedList(head, mid + 1, high);
		return root;

	}

	public TreeNode sortedArrayToBST11(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		return consrtuctBST(nums, 0, nums.length - 1);
	}

	private TreeNode consrtuctBST(int[] nums, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = low + (high - low) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = consrtuctBST(nums, low, mid - 1);
		root.right = consrtuctBST(nums, mid + 1, high);
		return root;
	}

	public int countPrimes(int n) {
		if (n < 2) {
			return 1;
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			boolean flag = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
			}
		}
		return count;
	}

	public int maxProfit(int[] prices) {
//Input: [7,1,5,3,6,4]

		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice)
				minprice = prices[i];
			else if (prices[i] - minprice > maxprofit)
				maxprofit = prices[i] - minprice;
		}
		return maxprofit;
	}

	public boolean possibleBipartition(int N, int[][] dislikes) {
//[[1,2],[2,3],[3,4],[4,5],[1,5]]

		int[] groups = new int[N];
		Arrays.fill(groups, -1);
		ArrayList<Integer>[] adj = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			adj[i] = new ArrayList();
		}
		for (int[] p : dislikes) {
			adj[p[0] - 1].add(p[1] - 1);
			adj[p[1] - 1].add(p[0] - 1);
		}
		for (int i = 0; i < N; i++) {
			if (groups[i] == -1 && !dfs(adj, groups, i, 0)) {
				return false;
			}
		}
		return true;
	}

	private boolean dfs(ArrayList<Integer>[] adj, int[] groups, int v, int grp) {

		if (groups[v] == -1) {
			groups[v] = grp;
		} else {
			return groups[v] == grp;
		}
		for (int n : adj[v]) {
			if (!dfs(adj, groups, n, 1 - grp)) {
				return false;
			}
		}
		return true;
	}

	public int findMaxLength(int[] nums) {
		int maxlen = 0;
		for (int start = 0; start < nums.length; start++) {
			int zeroes = 0, ones = 0;
			for (int end = start; end < nums.length; end++) {
				if (nums[end] == 0) {
					zeroes++;
				} else {
					ones++;
				}
				if (zeroes == ones) {
					maxlen = Math.max(maxlen, end - start + 1);
				}
			}
		}
		return maxlen;
	}

	public int max(int[] nums) {
		int[] arr = new int[2 * nums.length + 1];
		Arrays.fill(arr, -2);
		arr[nums.length] = -1;
		int maxlen = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = count + (nums[i] == 0 ? -1 : 1);
			if (arr[count + nums.length] >= -1) {
				maxlen = Math.max(maxlen, i - arr[count + nums.length]);
			} else {
				arr[count + nums.length] = i;
			}

		}
		return maxlen;
	}

	public int maxUncrossedLines(int[] A, int[] B) {
		int indexB = 0;
		int count = 0;
		boolean flag = false;
		if (A.length >= B.length) {
			flag = true;
		}
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < A.length && (indexB) < B.length; i++) {
			if (!(flag && indexB + 1 >= B.length)) {
				if (A[i] == B[indexB + 1] && B[indexB + 1] != max) {
					B[indexB + 1] = max;
				}
			}
			if (A[i] == B[indexB] && B[indexB] != max) {
				B[indexB] = max;
			}
			indexB++;
		}

		for (int i = 0; i < B.length; i++) {
			if (B[i] == max) {
				count++;
			}
		}

		return count;
	}

//	private boolean checkPalindrome(String str) {
//		int i = 0, j = str.length() - 1;
//		while (i < j) {
//			if (str.charAt(i) != str.charAt(j))
//				return false;
//			i++;
//			j--;
//		}
//		return true;
//	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int[] res = new int[m + n];
		int size1 = m;
		int size2 = n;
		int i = 0, j = 0, index = 0;
		while (i < size1 && j < size2) {
			if (nums1[i] >= nums2[j]) {
				res[index] = nums2[j];
				j++;
			} else {
				res[index] = nums1[i];
				i++;
			}
			index++;
		}
		while (i < size1) {
			res[index] = nums1[i];
			i++;
			index++;

		}
		while (j < size2) {
			res[index] = nums2[j];
			j++;
			index++;
		}
		for (int iter = 0; iter < res.length; iter++) {
			nums1[iter] = res[iter];
		}

	}

	int count = 0;
	int element = 0;

	public int kthSmallestOld(TreeNode root, int k) {
		kthSmallestHelper(root, k);
		return element;
	}

	public void kthSmallestHelper(TreeNode root, int k) {
		if (root == null) {
			return;
		}
		kthSmallestHelper(root.left, k);
		if (++count == k) {
			element = root.val;
		}
		kthSmallestHelper(root.right, k);

	}

	public int binarySearch(int[] nums, int key) {
		int index = -1;
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == key) {
				index = mid;
				break;
			} else if (nums[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return index;
	}

	private int getIndex(int[] nums, int key, boolean leftFlag) {

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

	public int[] searchRange(int[] nums, int target) {
		// 5,7,7,8,8,10

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

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode list = new ListNode();

		return list;
	}

	public int removeDuplicates(int[] nums) {
		int left = 0;
		int MAX = Integer.MAX_VALUE;

		for (int i = 1; (i + 1) < nums.length; i++) {
			if (nums[left] == nums[i] && nums[i] == nums[i + 1]) {
				nums[left] = MAX;
			}
			left++;
		}
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != MAX) {
				count++;
			}

		}

		return count;
	}

	public List<List<Integer>> threeSum1(int[] nums) {
//-1, 0, 1, 2, -1, -4]

		// -4,-1,-1,0,1,2

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

	public TreeNode bstFromPreorder(int[] preorder) {

		TreeNode root = new TreeNode(preorder[0]);

		for (int i = 1; i < preorder.length; i++) {
			boolean done = false;
			TreeNode current = root;

			while (done == false) {
				if (current.val > preorder[i]) {
					if (current.left == null) {
						current.left = new TreeNode(preorder[i]);
						done = true;
					} else
						current = current.left;
				} else {
					if (current.right == null) {
						current.right = new TreeNode(preorder[i]);
						done = true;
					} else
						current = current.right;
				}
			}
		}
		return root;
	}

	public int duplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}
		// int[] nums = { 1, 1, 1, 2, 2, 3 };
		if (nums.length >= 2 & nums[0] == nums[nums.length - 1]) {
			return 2;
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; (i + 2) < nums.length; i++) {
			if (nums[i] == nums[i + 2]) {
				nums[i + 2] = min;
			}
		}
		Arrays.sort(nums);
		int count = 0, flag = Integer.MIN_VALUE;
		int inital = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != min) {
				count++;
			}

		}

		return count;
	}

	public ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode current = node;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		int count = 0;
		ListNode counter = head;
		while (counter != null) {
			count++;
			counter = counter.next;
		}
		if (count == n) {
			return head.next;
		} else if (count < n) {
			return head;
		} else {
			int diff = count - n;
			ListNode curr = head;
			ListNode prev = null;

			for (int i = 0; i < diff; i++) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			return head;
		}

	}

	public int[][] intervalIntersection(int[][] a, int[][] b) {

		int indexA = 0, indexB = 0;
		int[][] res = new int[a.length][2];
		int count = 0;
		while (indexA < a.length && indexB < b.length) {
			int starting = Math.max(a[indexA][0], b[indexB][0]);
			int ending = Math.min(a[indexA][1], b[indexB][1]);
			if (starting <= ending) {
				res[count][0] = starting;
				res[count][1] = ending;
				count++;
			}

			if (a[indexA][1] > b[indexB][1]) {
				indexB++;
			} else {
				indexA++;
			}
		}

		return res;
	}

	public String simplifyPath(String path) {

		Stack<Character> st = new Stack<>();
		st.push(path.charAt(0));
		int len = path.length();
		for (int i = 1; i < len; i++) {
			if ((path.charAt(i) >= 'a' && path.charAt(i) <= 'z') || (path.charAt(i) >= 'A' && path.charAt(i) <= 'Z')) {
				st.push(path.charAt(i));
			}
			if (path.charAt(i) == '/') {
				char c = st.peek();
				if (c != '/' && i != len - 1)
					st.push('/');
			}
			if (path.charAt(i) == '.') {
				if (i + 1 < len && path.charAt(i + 1) == '.') {
					char c = st.peek();
					st.pop();
					if (st.isEmpty())
						st.push(c);
					else {
						st.pop();
					}

				}
			}

		}
		if (st.peek() == '/') {
			char c = st.pop();
			if (st.isEmpty())
				st.push(c);
		}

		StringBuilder sb = new StringBuilder();

		while (!st.isEmpty()) {
			sb.insert(0, st.pop());
		}

		return sb.toString();
	}

	public String frequencySort(String s) {
		StringBuilder str = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		maxHeap.addAll(map.keySet());

		while (!maxHeap.isEmpty()) {
			char c = maxHeap.remove();
			for (int i = 0; i < map.get(c); i++) {
				str.append(c);
			}

		}
		return str.toString();
	}

	public String longestCommonPrefix(String[] strs) {

		String str = strs[0];

		for (int i = 1; i < strs.length; i++) {

		}

		return null;
	}

	public String intToRoman(int num) {

		/*
		 * 
		 * I 1 V 5 X 10 L 50 C 100 D 500 M 1000
		 */

		String s = "";
		while (num > 0) {
			if (num >= 1000) {
				s = s + "M";
				num = num - 1000;
			} else if (num >= 900) {
				s = s + "CM";
				num = num - 900;
			} else if (num >= 500) {
				s = s + "D";
				num = num - 500;
			} else if (num >= 400) {
				s = s + "CD";
				num = num - 400;
			} else if (num >= 100) {
				s = s + "C";
				num = num - 100;
			} else if (num >= 90) {
				s = s + "XC";
				num = num - 90;
			} else if (num >= 50) { // LVIII 58
				s = s + "L";
				num = num - 50;
			} else if (num >= 40) {
				s = s + "XL";
				num = num - 40;
			} else if (num >= 10) {
				s = s + "X";
				num = num - 10;
			} else if (num == 9) {
				s = s + "IX";
				num = num - 9;
			} else if (num >= 5) {
				s = s + "V";
				num = num - 5;

			} else if (num >= 4) {
				s = s + "IV";
				num = num - 4;
			} else if (num >= 1) {
				s = s + "I";
				num = num - 1;
			}
		}

		return s;

	}

	public Boolean isPalindromeOld(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}

class TestGraph {
	private int v;
	private LinkedList<Integer>[] adj;

	TestGraph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}

	public void addEdge(int e, int v) {
		adj[e].add(v);
	}

	public void BFS(int s) {
		LinkedList<Integer> list = new LinkedList<>();
		boolean[] visited = new boolean[v];
		list.add(s);
		while (!list.isEmpty()) {
			s = list.poll();
			System.out.println(s);
			Iterator<Integer> iter = adj[s].iterator();
			while (iter.hasNext()) {
				int n = iter.next();
				if (!visited[n]) {
					visited[n] = true;
					list.add(n);
				}
			}
		}

	}

	public void DFS(int s) {
		boolean[] visited = new boolean[v];
		DFSUtil(s, visited);
	}

	public void DFSUtil(int s, boolean[] visited) {
		visited[s] = true;
		Iterator<Integer> iter = adj[s].iterator();
		while (iter.hasNext()) {
			int val = iter.next();
			if (!visited[val]) {
				DFSUtil(val, visited);
			}
		}

	}

}

class BrowserHistory {
	int currentIndex = 0;
	List<String> history = new ArrayList<>();

	public BrowserHistory(String homepage) {
		history.add(homepage);
	}

	public void visit(String url) {
		while (currentIndex != history.size() - 1) // Clear the unwanted browser history
			history.remove(history.size() - 1);
		history.add(url);
		currentIndex++;
	}

	public String back(int steps) {
		currentIndex = Math.max(currentIndex - steps, 0);
		return history.get(currentIndex);
	}

	public String forward(int steps) {
		currentIndex = Math.min(currentIndex + steps, history.size() - 1);
		return history.get(currentIndex);
	}
}
