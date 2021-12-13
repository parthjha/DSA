package com.example;

import java.util.*;
import java.util.Map.Entry;
import java.io.FileReader;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;

import com.example.DSA.Solution.Node;

public class DSA {

	public static void main(String[] args) {

		DSA obj = new DSA();
		// 1 to n+2 // non-rep

		// System.out.println(maxWoodenPieces(arr, k));
		// System.out.println(obj.minRemoveToMakeValid("lee(t(c)o)de)"));
		// System.out.println(obj.isValid("()"));

		// System.out.println(obj.solution("022"));
//Input: nums = [2,7,9,3,1]
		// int[] nums = { 2, 7, 9, 3, 1 };
		// System.out.println(obj.rob(nums));
		// int[] nums = { 1, 2, 3 };
		// System.out.println(obj.subsets(nums).toString());

		// System.out.println(obj.partition("aab"));

		// System.out.println(obj.numSquares(12));
//		int[] nums = { 100, 4, 200, 1, 3, 2 };
//		System.out.println(obj.longestConsecutive(nums));
//		System.out.println(obj.letterCombinations("23"));
		// int[] arr = { -4, -1, 0, 3, 10 };
		// System.out.print(Arrays.toString(obj.sortedSquares(arr)));

		// int[][] grid = { { 2, 1, 3 }, { 6, 5, 4, }, { 7, 8, 9 } };
		// System.out.println(obj.minFallingPathSum(grid));
//		ListNode l = new ListNode(1);
//		l.next = new ListNode(2);
//		l.next.next = new ListNode(3);
//		l.next.next.next = new ListNode(4);
//		l.next.next.next.next = new ListNode(5);
//
//		printNode(l);
//		ListNode node = obj.reverseBetween(l, 2, 4);
//		printNode(node);

//		List<List<Integer>> result = new ArrayList<>();
//		for (int i = 0; i < graph.length; i++) {
//			List<Integer> list = new ArrayList<>();
//			for (int j = 0; j < graph[i].length; j++) {
//				list.add(graph[i][j]);
//			}
//			result.add(list);
//		}
//		// List<List<Integer>> re = obj.allPathsSourceTarget(graph);
//		System.out.println(obj.canVisitAllRooms(result));

		// int[][] graph = { { 2, 1 }, { 3, 4 }, { 3, 2 } };
		// obj.restoreArray(graph);

//
//		printNode(l);
//		ListNode node = obj.deleteDuplicates(l);
//		printNode(node);

//		String beString = "hit";
//		String endString = "cog";
//		String[] arr = { "hot", "dot", "dog", "lot", "log", "cog" };
//		List<String> list = Arrays.asList(arr);
//		System.out.println(obj.ladderLength(beString, endString, list));
//		int[] prices = { 3, 2, 6, 5, 0, 3 };
//		System.out.println(obj.maxProfit(2, prices));
		// System.out.println(obj.generateTrees(3));
		// System.out.println(obj.minDeletions("bbcebab"));
		// int[] time = { 30, 20, 150, 100, 40 };
		// System.out.println(obj.numPairsDivisibleBy60(time));
//		int[] cost = { 1, 2, 3, 4, 5 };
//		System.out.println(obj.minCost("abaac", cost));
		// int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		// System.out.println(obj.trap(arr));
		// System.out.println(obj.validateCreditCard("0123 0012 0011 1124"));
		// int[] arr = { 23, 2, 4, 6, 7 };
		// System.out.println(obj.checkSubarraySum(arr, 6));

//		int[][] trust = { { 1, 2 } };
//
//		obj.findJudge(2, trust);

		// System.out.println(obj.isHappy(3));

//		int[] arr = { 1, 3, 6, 0, 9, 6, 9 };
//		System.out.println(obj.checkSubarraySum122(arr, 7));

//		ListNode l = new ListNode(1);
//		l.next = new ListNode(2);
//		l.next.next = new ListNode(3);
//		l.next.next.next = new ListNode(4);
//		l.next.next.next.next = new ListNode(5);
//		obj.rotateRight133(l, 2);
//		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
//		System.out.println(obj.search(nums, 0));
//		
//		obj.merge1234(intervals);

//		int[][] matrix = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
//		System.out.println(obj.orangesRotting(matrix));
//		int[] nums1 = { 4, 1, 2 };
//		int[] nums2 = { 1, 3, 4, 2 };
//		System.out.println(Arrays.toString(obj.nextGreaterElement(nums1, nums2)));
		// System.out.println(obj.mySqrt(4));

//		TreeNode t = new TreeNode(1);
//		t.left = new TreeNode(2);
//		t.left.left = new TreeNode(3);
//		t.left.right = new TreeNode(4);
//		t.right = new TreeNode(5);
//		t.right.right = new TreeNode(6);
//		obj.flatten(t);
//		TreeNode result = t;
//		System.out.println(result.val);

	}
	
	
	
	
	
	
	
	
	
	
	

	int path = 0;
	int uniqueZeros = 0;

	public int uniquePathsIII_(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0)
					uniqueZeros++;
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					uniquePaths(grid, i + 1, j, 0);
					uniquePaths(grid, i - 1, j, 0);
					uniquePaths(grid, i, j + 1, 0);
					uniquePaths(grid, i, j - 1, 0);

				}
			}
		}

		return 0;
	}

	public void uniquePaths(int[][] grid, int i, int j, int curr) {

		if (i > grid.length || i < 0 || j > grid[0].length || j < 0)
			return;
		if (grid[i][j] == 2 && curr == uniqueZeros) {
			paths++;
			return;
		}
		if (grid[i][j] == -1)
			return;
		if (grid[i][j] == 0) {
			curr++;
			grid[i][j] = -1;
			uniquePaths(grid, i + 1, j, curr);
			uniquePaths(grid, i - 1, j, curr);
			uniquePaths(grid, i, j + 1, curr);
			uniquePaths(grid, i, j - 1, curr);
			grid[i][j] = 0;
		}

	}
	

	public List<List<Integer>> allPathsSourceTarget_(int[][] graph) {
		List<List<Integer>> result = new ArrayList<>();
		allPaths(graph, 0, graph.length - 1, new ArrayList<>(), result);
		return result;
	}

	public void allPaths(int[][] graph, int index, int size, List<Integer> list, List<List<Integer>> result) {
		if (index > size)
			return;
		if (index == size) {
			result.add(list);
		}
		list.add(index);
		for (int val : graph[index]) {
			List<Integer> copied = new ArrayList<>(list);
			allPaths(graph, val, size, copied, result);
		}
	}

	/*
	 * Male Players: M1 (power level: 10) , M2 (power level: 20), M3 (power level:
	 * 25), M4 (power level: 15)
	 * 
	 * Female Players: F1(power level: 25) , F2 (power level: 30), F3(power level:
	 * 15), F4 (power level 20)
	 * 
	 * Required power level = X = 40
	 * 
	 * Output:
	 * 
	 * Teams : (M1, F2), (M3,F3), (M4, F1), (M2, F4)
	 * 
	 * 
	 * 
	 */
	class MalePlayer {
		private int id;
		private String name;
		private int powerLevel;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPowerLevel() {
			return powerLevel;
		}

		public void setPowerLevel(int powerLevel) {
			this.powerLevel = powerLevel;
		}

	}

	class FemalePlayer {
		private int id;
		private String name;
		private int powerLevel;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPowerLevel() {
			return powerLevel;
		}

		public void setPowerLevel(int powerLevel) {
			this.powerLevel = powerLevel;
		}

	}

	// 32132321321
	/// 312321323231
	public String sum(String s1, String s2) {
		String result = "";
		// FileReader f=new Fil
		// 234
		// 3456
		int len1 = s1.length() - 1;
		int len2 = s2.length() - 1;
		int carry = 0;
		while (len1 >= 0 || len2 >= 0) {
			int sum = 0;
			int val1 = 0;
			int val2 = 0;
			if (len1 >= 0) {
				val1 = s1.charAt(len1) - '0';
			}
			if (len2 >= 0) {
				val2 = s2.charAt(len2) - '0';
			}
			sum = val1 + val2 + carry;
			carry = sum / 10;
			result = (sum % 10) + result;
			len1--;
			len2--;
		}

		return result;
	}

	public List<int[]> pairs(MalePlayer[] m, FemalePlayer[] f, int pl) {

		Map<Integer, Integer> map = new HashMap<>();
		List<int[]> result = new ArrayList<>();
		for (int i = 0; i < f.length; i++) {
			map.put(f[i].getPowerLevel(), i);
		}
		for (int i = 0; i < m.length; i++) {
			int diff = pl - m[i].getPowerLevel();
			if (map.containsKey(diff)) {
				int index = map.get(diff);
				int[] pairs = { m[i].getId(), f[index].getId() };
				result.add(pairs);
			}
		}

		return result;
	}

	public void sortColors_(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int low = 0;
		int high = nums.length - 1;
		for (int id = low; id <= high;) {
			if (nums[id] == 0) {
				int temp = nums[id];
				nums[id] = nums[low];
				nums[low] = temp;
				low++;
				id++;
			}
			if (nums[id] == 2) {
				int temp = nums[id];
				nums[id] = nums[high];
				nums[high] = temp;
				high--;
			} else {
				id++;
			}
		}

	}

	class Solution {
		public Node connect(Node root) {
			if (root == null)
				return null;
			root.left.next = root.right;
			if (root.next != null) {
				root.right.next = root.next.left;
			}
			connect(root.left);
			connect(root.right);
			return root;
		}

		// Definition for a Node.
		class Node {
			public int val;
			public Node left;
			public Node right;
			public Node next;

			public Node() {
			}

			public Node(int _val) {
				val = _val;
			}

			public Node(int _val, Node _left, Node _right, Node _next) {
				val = _val;
				left = _left;
				right = _right;
				next = _next;
			}
		}

	}

	int sum = 0;

	public int sumNumbers_(TreeNode root) {
		sumNum(root, "");
		return sum;
	}

	private void sumNum(TreeNode root, String s) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			sum += Integer.parseInt(s);
		}
		s += root.val;
		sumNum(root.left, s);
		sumNum(root.right, s);

	}

	public void flatten(TreeNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null)
			return;
		if (root.left != null) {
			flatten(root.left);
			TreeNode temp = root.right;
			root.right = root.left;
			root.left = null;
			TreeNode t = root.right;
			while (t.right != null) {
				t = t.right;
			}
			t.right = temp;
		}
		flatten(root.right);
	}

	public List<Integer> rightSideView_(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		rightSide(root, list, 0);
		return list;
	}

	private void rightSide(TreeNode root, List<Integer> list, int depth) {
		if (root == null)
			return;
		if (depth == list.size()) {
			list.add(root.val);
		}
		rightSide(root.right, list, depth + 1);
		rightSide(root.left, list, depth + 1);
	}

	public int search_(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while (low <= high) {
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
		if (nums[start] <= target && nums[high] >= target) {
			low = start;
		} else {
			high = start;
		}
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}

	public ListNode rotateRight_(ListNode head, int k) {

		if (head == null || head.next == null || k == 0)
			return head;

		ListNode temp = head;
		int len = 1;
		while (temp.next != null) {
			temp = temp.next;
			len++;
		}
		temp.next = head;
		for (int i = 0; i < (len - k) % len; i++) {
			temp = temp.next;
		}
		ListNode result = temp.next;
		temp.next = null;
		return result;
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<>();
		combine(result, new ArrayList<>(), 1, n, k);
		return result;
	}

	private static void combine(List<List<Integer>> result, List<Integer> list, int start, int n, int k) {
		if (k == 0) {
			result.add(new ArrayList<>(list));
		}
		for (int i = start; i <= n; i++) {
			list.add(i);
			combine(result, list, i + 1, n, k--);
			list.remove(list.size() - 1);
		}
	}

	public boolean rotateString_(String A, String B) {
		if (A.length() != B.length())
			return false;
		if (A.length() == 0)
			return true;

		for (int s = 0; s < A.length();) {
			for (int i = 0; i < A.length(); ++i) {
				if (A.charAt((s + i) % A.length()) != B.charAt(i))
					continue;
			}
			return true;
		}
		return false;
	}

	public boolean hasSubstring(char[] text, char[] pattern) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < text.length && j < pattern.length) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			} else {
				j = 0;
				k++;
				i = k;
			}
		}
		if (j == pattern.length) {
			return true;
		}
		return false;
	}

	private int[] computeTemporaryArray(char pattern[]) {
		int[] lps = new int[pattern.length];
		int index = 0;
		for (int i = 1; i < pattern.length;) {
			if (pattern[i] == pattern[index]) {
				lps[i] = index + 1;
				index++;
				i++;
			} else {
				if (index != 0) {
					index = lps[index - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	/**
	 * KMP algorithm of pattern matching.
	 */
	public boolean KMP(char[] text, char[] pattern) {

		int lps[] = computeTemporaryArray(pattern);
		int i = 0;
		int j = 0;
		while (i < text.length && j < pattern.length) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			} else {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}
		if (j == pattern.length) {
			return true;
		}
		return false;
	}

	public boolean rotateString(String A, String B) {
		int N = A.length();
		if (N != B.length())
			return false;
		if (N == 0)
			return true;

		// Compute shift table
		int[] shifts = new int[N + 1];
		Arrays.fill(shifts, 1);
		int left = -1;
		for (int right = 0; right < N; ++right) {
			while (left >= 0 && (B.charAt(left) != B.charAt(right)))
				left -= shifts[left];
			shifts[right + 1] = right - left++;
		}

		// Find match of B in A+A
		int matchLen = 0;
		for (char c : (A + A).toCharArray()) {
			while (matchLen >= 0 && B.charAt(matchLen) != c)
				matchLen -= shifts[matchLen];
			if (++matchLen == N)
				return true;
		}

		return false;
	}

	public int mySqrt(int x) {

		int low = 1;
		int high = x;
		int result = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (mid <= x / mid) {
				low = mid + 1;
				result = mid;
			} else
				high = mid - 1;
		}

		return result;
	}

	public int longestValidParentheses(String s) {

		Stack<Integer> st = new Stack<>();
		int max = 0;
		st.push(-1);
		for (int id = 0; id < s.length(); id++) {
			if (s.charAt(id) == '(') {
				st.push(id);
			} else {
				st.pop();
				if (st.empty()) {
					st.push(id);
				} else {
					max = Math.max(max, id - st.peek());
				}
			}
		}
		return max;

	}

	public boolean isNumber(String s) {
		try {
			s = s.trim();
			int n = s.length();
			if (n == 0 || (s.charAt(n - 1) != '.' && (s.charAt(n - 1) - '0' < 0 || s.charAt(n - 1) - '0' > 9))) {
				return false;
			}
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public String reverseWords(String s) {
		String[] words = s.trim().split(" +");
		Collections.reverse(Arrays.asList(words));
		return String.join(" ", words);
	}

	public int countSquares_(int[][] matrix) {
		int result = 0;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] > 0 && i > 0 && j > 0) {
					dp[i][j] = Math.min(matrix[i - 1][j], Math.min(matrix[i - 1][j - 1], matrix[i][j - 1])) + 1;
				}
				result += dp[i][j];
			}
		}
		return result;
	}

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < nums2.length; i++) {
			hm.put(nums2[i], i);
		}
		for (int i = 0; i < nums2.length; i++) {
			map.put(hm.get(nums2[i]) - 1, nums2[i]);
		}
		int[] result = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			result[i] = map.get(nums1[i]) == null ? -1 : map.get(nums1[i]);
		}
		return result;
	}

	public int orangesRotting(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int count = 2;
		boolean isChanged = false;
		while (true) {

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (grid[i][j] == count) {
						if (checkValidity(grid, i + 1, j) && grid[i + 1][j] == 1) {
							grid[i + 1][j] = grid[i][j] + 1;
							isChanged = true;
						}
						if (checkValidity(grid, i - 1, j) && grid[i - 1][j] == 1) {
							grid[i - 1][j] = grid[i][j] + 1;
							isChanged = true;
						}
						if (checkValidity(grid, i, j + 1) && grid[i][j + 1] == 1) {
							grid[i][j + 1] = grid[i][j] + 1;
							isChanged = true;
						}
						if (checkValidity(grid, i, j - 1) && grid[i][j - 1] == 1) {
							grid[i][j - 1] = grid[i][j] + 1;
							isChanged = true;
						}
					}
				}
			}
			if (!isChanged) {
				break;
			}
			isChanged = false;
			count++;
		}
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 1)
					return -1;
			}
		return count;
	}

	private boolean checkValidity(int[][] grid, int row, int col) {
		if (row >= grid.length || row < 0 || col < 0 || col >= grid[0].length)
			return false;

		return true;
	}

	public int numDecodings_(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;
		for (int i = 2; i <= s.length(); i++) {
			int oneDigit = Integer.valueOf(s.substring(i - 1, i));
			int twoDigit = Integer.valueOf(s.substring(i - 2, i));
			if (oneDigit > 0 && oneDigit <= 9) {
				dp[i] += dp[i - 1];
			}
			if (twoDigit < 27 && twoDigit > 9) {
				dp[i] += dp[i - 2];
			}
		}
		return dp[s.length()];
	}

	int countDeletions = 0;

	public int minDeletions_(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (Character c : s.toCharArray()) {
			Integer val = map.getOrDefault(map.get(c), 0);
			val += 1;
			map.put(c, val);
		}
		countDeletion(map);
		return countDeletions;
	}

	public void countMinDel(Map<Character, Integer> map) {
		Set<Integer> set = new HashSet<>();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (!set.contains(entry.getValue())) {
				set.add(entry.getValue());
			} else {
				countDeletions++;
				map.put(entry.getKey(), entry.getValue() - 1);
				countDeletion(map);
			}
		}
	}

	public List<List<String>> partition_(String s) {
		List<List<String>> result = new ArrayList<>();
		partition(0, s, new ArrayList<>(), result);
		return result;
	}

	public void partition(int start, String str, List<String> list, List<List<String>> result) {
		if (start <= str.length()) {
			result.add(list);
		}
		for (int i = start; i < str.length(); i++) {
			if (isValidPalindrome(str, start, i + 1)) {
				list.add((str.substring(start, i + 1)));
				partition(i + 1, str, list, result);
				list.remove(list.size() - 1);
			}
		}
	}

	public boolean isValidPalindrome(String str, int start, int end) {
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public int kthSmallest(int[][] matrix, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				queue.offer(matrix[i][j]);
				if (queue.size() > k) {
					queue.poll();
				}
			}
		}

		return queue.peek();
	}

//	public Node copyRandomList1(Node head) {
//
//		Map<Node, Node> map = new HashMap<>();
//		Node dummy = new Node(0);
//		Node prev = dummy, curr = head;
//		while (curr != null) {
//			Node newcurr = map.getOrDefault(curr, new Node(curr.val));
//			map.put(curr, newcurr);
//			if (curr.random != null) {
//				newcurr.random = map.getOrDefault(curr.random, new Node(curr.random.val));
//				map.put(curr.random, newcurr.random);
//			}
//
//			prev.next = newcurr;
//			prev = newcurr;
//			curr = curr.next;
//		}
//
//		return dummy.next;
//	}

	public String largestNumber(int[] nums) {
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			strs[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(strs, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		StringBuilder builder = new StringBuilder();
		for (String str : strs) {
			builder.append(str);
		}
		return builder.toString();
	}

	public int compare(Integer val1, Integer val2) {
		return Integer.parseInt(String.valueOf(val2) + String.valueOf(val1))
				- Integer.parseInt(String.valueOf(val1) + String.valueOf(val2));
	}

	public int rob111(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int first = nums[0];
		if (nums.length == 0)
			return first;
		int next = Math.max(first, nums[1]);
		for (int i = 2; i < nums.length; i++) {
			int val = Math.max(next, first + nums[i]);
			first = next;
			next = val;
		}
		return next;
	}

	TreeNode firstNode = null;
	TreeNode secondNode = null;

	public void recoverTree111(TreeNode root) {
		recoverBST(root);
		int temp = firstNode.val;
		first.val = secondNode.val;
		secondNode.val = temp;
	}

	public void recoverBST(TreeNode root) {
		if (root == null)
			return;
		recoverBST(root.left);
		if (firstNode == null && (prevNode == null || prevNode.val > root.val)) {
			firstNode = prevNode;
		}
		if (firstNode != null && (prevNode == null || prevNode.val > root.val)) {
			secondNode = prevNode;
		}
		prevNode = root;
		recoverBST(root.right);
	}

	/*
	 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]] Output:
	 * [[1,6],[8,10],[15,18]] Explanation: Since intervals [1,3] and [2,6] overlaps,
	 * merge them into [1,6].
	 */
	public int[][] merge1234(int[][] intervals) {
		if (intervals.length <= 1) {
			return intervals;
		}
		Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);
		for (int[] interval : intervals) {
			if (interval[0] <= newInterval[1])
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			else {
				newInterval = interval;
				result.add(newInterval);
			}
		}

		return result.toArray(new int[result.size()][]);

	}

	public int canCompleteCircuit11(int[] gas, int[] cost) {

		for (int i = 0; i < gas.length; i++) {

		}

		return 0;
	}

	public ListNode reverseBetween111(ListNode head, int left, int right) {
		ListNode node = null;
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			if (count >= left && count <= right) {
				ListNode t = new ListNode(temp.val);
				t.next = node;
				node = t;
			}
			temp = temp.next;
		}
		temp = head;
		count = 0;
		ListNode result = new ListNode(0);
		ListNode p = result;
		while (temp != null) {
			count++;
			int val = 0;
			if (count >= left && count <= right) {
				val = node.val;
				node = node.next;
			} else {
				val = temp.val;
			}
			p.next = new ListNode(val);
			p = p.next;
			temp = temp.next;
		}
		return result.next;
	}

	public boolean searchMatrix111(int[][] matrix, int target) {

		int row = matrix.length;
		int col = matrix[0].length;
		int i = 0, j = col - 1;
		while (i < row && j >= 0) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}

	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;
		int low = 0;
		int high = nums.length - 1;
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
		if (nums[start] >= target && target <= nums[high]) {
			low = start;
		} else {
			high = start;
		}

		while (low < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode start = new ListNode(0);
		ListNode slow = start, fast = start;
		slow.next = head;

		// Move fast in front so that the gap between slow and fast becomes n
		for (int i = 1; i <= n + 1; i++) {
			fast = fast.next;
		}
		// Move fast to the end, maintaining the gap
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		// Skip the desired node
		slow.next = slow.next.next;
		return start.next;
	}

	public boolean canJump(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > max) {
				return false;
			}
			max = Math.max(nums[i] + i, max);
		}
		return true;
	}

	public ListNode addTwoNumberssfdff(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode dummyNode = new ListNode(0);
		ListNode curr = dummyNode;
		int sum = 0;

		while (l1 != null || l2 != null) {
			int x = l1 == null ? 0 : l1.val;
			int y = l2 == null ? 0 : l2.val;
			sum += x + y + carry;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}

		return dummyNode.next;
	}

	public int lengthOfLongestSubstring111111(String s) {

		Set<Character> set = new HashSet<>();
		int max = 0;
		int start = 0;
		for (int iter = 0; iter < s.length(); iter++) {
			if (!set.contains(s.charAt(iter))) {
				set.add(s.charAt(iter));
				if (max < set.size()) {
					max = set.size();
				}
			} else {
				while (s.charAt(iter) != s.charAt(start)) {
					set.remove(s.charAt(start));
					start++;
				}
				start++;
			}
		}

		return max;
	}

	public ListNode rotateRight133(ListNode head, int k) {

		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy, slow = dummy;
		int i;
		for (i = 0; fast.next != null; i++)// Get the total length
			fast = fast.next;

		for (int j = i - k % i; j > 0; j--) // Get the i-n%i th node
			slow = slow.next;

		fast.next = dummy.next; // Do the rotation
		dummy.next = slow.next;
		slow.next = null;

		return dummy.next;
	}

	public boolean checkSubarraySum122(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int runningSum = 0;
		for (int i = 0; i < nums.length; i++) {
			runningSum += nums[i];
			if (k != 0)
				runningSum %= k;
			Integer prev = map.get(runningSum);
			if (prev != null) {
				if (i - prev > 1)
					return true;
			} else
				map.put(runningSum, i);
		}
		return false;
	}

	public String removeKdigits1(String num, int k) {
		if (num.length() == k)
			return "0";
		StringBuilder builder = new StringBuilder(num);
		for (int i = 0; i < k; i++) {
			int j = 0;
			while (j < num.length() - 1 && builder.charAt(j) <= builder.charAt(j + 1)) {
				j++;
			}
			builder.deleteCharAt(j);
		}
		int j = 0;
		while (j < builder.length() - 1 && builder.charAt(j) == 0) {
			builder.deleteCharAt(j);
			j++;
		}
		if (builder.toString().length() == 0)
			return "0";

		return builder.toString();
	}

	public TreeNode constructMaximumBinaryTree1(int[] nums) {
		return constructMaximumBT(nums, 0, nums.length - 1);
	}

	private TreeNode constructMaximumBT(int[] nums, int i, int j) {
		if (i > j) {
			return null;
		}
		int max = Integer.MIN_VALUE;
		int start = 0;
		for (int iter = i; iter <= j; iter++) {
			if (max < nums[iter]) {
				max = nums[iter];
				start = iter;
			}
		}
		TreeNode root = new TreeNode(nums[start]);
		root.left = constructMaximumBT(nums, i, start - 1);
		root.right = constructMaximumBT(nums, start + 1, j);

		return root;
	}

	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (set.add(n)) {
			int temp = n;
			int sum = 0;
			while (temp > 0) {
				int rem = temp % 10;
				sum += rem * rem;
				temp /= 10;

			}
			if (n != 1)
				n = sum;
			else
				return true;
		}
		return false;
	}

	public int maxProfit123(int[] prices) {

		int max = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				max += prices[i] - prices[i - 1];
			}
		}
		return max;
	}

	public boolean validPalindrome(String s) {

		for (int i = 0, j = s.length() - 1; i < j && j > i; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return palindromeChecking(s, i + 1, j) || palindromeChecking(s, i, j - 1);
			}
		}
		return true;

	}

	private static boolean palindromeChecking(String s, int start, int end) {
		while (start < end && start < s.length() && end >= 0) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			++start;
			--end;
		}
		return true;
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

	public int findJudge(int N, int[][] trust) {
		int[] isTrusted = new int[N + 1];
		for (int[] person : trust) {
			isTrusted[person[0]]--;
			isTrusted[person[1]]++;
		}
		for (int i = 1; i < isTrusted.length; i++) {
			if (isTrusted[i] == N - 1)
				return i;
		}
		return -1;
	}

	public int countNegatives(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int row = grid.length;
		int col = grid[0].length;
		int i = 0, j = 0, count = 0;
		while (i < row && j < col) {
			if (j == col - 1) {
				i++;
				j = 0;
			}
			if (grid[i][j] == -1) {
				count++;
			}
			j++;
		}
		return count;
	}

	public int minCost1(String s, int[] cost) {
		int sum = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				sum += Math.min(cost[i - 1], cost[i]);
			}
		}
		return sum;
	}

	public int[] dailyTemperatures1(int[] temperatures) {
		int[] result = new int[temperatures.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < temperatures.length; i++) {
			while (!st.empty() && temperatures[i] > temperatures[st.peek()]) {
				int index = st.pop();
				result[index] = i - index;
			}
			st.push(i);
		}

		return result;
	}

	public boolean checkSubarraySum(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (k != 0) {
				sum = sum % k;
			}
			Integer prev = map.get(sum);
			if (prev != null) {
				if (i - prev > 1)
					return true;
			} else {
				map.put(sum, i);
			}
		}

		return false;
	}

	public ListNode rotateRight(ListNode head, int k) {

		if (head == null || head.next == null || k == 0)
			return head;

		// make it a cricle, break from k postion far from the head
		ListNode index = head;
		int len = 1;// int len to record the length of list
		while (index.next != null) {
			index = index.next;
			len++;
		}

		index.next = head;

		for (int i = 0; i < len - k % len; i++) {
			index = index.next;
		}

		ListNode result = index.next;
		index.next = null;
		return result;
	}

	public int numTimesAllBlue(int[] A) {

		int right = 0, res = 0, n = A.length;
		for (int i = 0; i < n; ++i) {
			right = Math.max(right, A[i]);
			if (right == i + 1)
				++res;
		}
		return res;

	}

	public int numTrees(int n) {
		List<int[]> list = new ArrayList<>();
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}
		list.add(arr);

		return 0;

	}

	public String removeKdigits(String num, int k) {
		if (num.length() == k)
			return "0";
		StringBuilder builder = new StringBuilder(num);
		for (int j = 0; j < k; j++) {
			int i = 0;
			while (i < builder.length() - 1 && builder.charAt(i) <= builder.charAt(i + 1)) {
				i++;
			}
			builder.deleteCharAt(i);
		}

		while (builder.length() > 1 && builder.charAt(0) == '0') {
			builder.delete(0, 1);
		}
		if (builder.charAt(0) == '0')
			builder.deleteCharAt(0);

		return builder.toString();
	}

	public void sortColors(int[] A) {
		if (A == null || A.length < 2)
			return;

		int low = 0;
		int high = A.length - 1;
		for (int i = low; i <= high;) {
			if (A[i] == 0) {
				int temp = A[i];
				A[i] = A[low];
				A[low] = temp;
				low++;
				i++;
				low++;
			} else if (A[i] == 2) {
				int temp = A[i];
				A[i] = A[high];
				A[high] = temp;
				high--;
			} else {
				i++;
			}
		}

	}

	public int numDecodings(String s) {
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;
		for (int i = 2; i < s.length(); i++) {
			int oneDigit = Integer.valueOf(s.substring(i - 1, 1));
			int twoDigit = Integer.valueOf(s.substring(i - 2, 1));
			if (oneDigit < 9 && oneDigit > 0) {
				dp[i] += dp[i - 1];
			}
			if (twoDigit < 27 && twoDigit > 9) {
				dp[i] += dp[i - 2];
			}
		}
		return dp[s.length()];

	}

	public int maxProduct(int[] nums) {
		/*
		 * Input: nums = [2,3,-2,4] Output: 6
		 */
		int max = nums[0], sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (sum * nums[i] > max) {
				sum = sum * nums[i];
				max = sum;
			} else {
				sum = nums[i];
			}
		}
		return max;
	}

	Integer prevoius = null;

	public boolean isValidBST1(TreeNode root) {
		if (root == null) {
			return true;
		}
		isValidBST(root.left);
		if (prevoius != null && prevoius >= root.val) {
			return false;
		}
		prevoius = root.val;
		return isValidBST(root.right);
	}

	public boolean checkSubarraySum1(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>(); // key: rolling sum% k, val: array index
		map.put(0, -1);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			int mod = k == 0 ? sum : sum % k; // compute sum%k
			// when map contains mod, it means that there exist an subarray from 0~j
			// (j=map.get(mod)) where its sum%k==mod.
			// which means that subarray sum( j~i) %k==0.
			if (map.containsKey(mod) && i - map.get(mod) > 1)
				return true;
			map.putIfAbsent(mod, i);
		}
		return false;
	}

	public int[] dailyTemperatures(int[] temperatures) {
		/*
		 * Input: temperatures = [73,74,75,71,69,72,76,73] Output: [1,1,4,2,1,1,0,0]
		 */
		int[] result = new int[temperatures.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < temperatures.length; i++) {
			while (!st.empty() && temperatures[i] > temperatures[st.peek()]) {
				int index = st.pop();
				result[index] = i - index;
			}
			st.push(i);
		}

		return result;
	}

	public List<List<Integer>> subsets(int[] nums) {
		/*
		 * Input: nums = [1,2,3] Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
		 */
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		for (int n : nums) {
			List<List<Integer>> temp = new ArrayList<>();
			for (List<Integer> list : result) {
				List<Integer> copiedList = new ArrayList<>(list);
				copiedList.add(n);
				temp.add(copiedList);
			}
			for (List<Integer> list : temp) {
				result.add(list);
			}

		}

		return result;
	}

	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0) {
				list.add(Math.abs(index) + 1);
			}
			nums[index] = -nums[index];
		}

		return list;

	}

	public List<Integer> partitionLabels(String s) {
		List<Integer> list = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			end = Math.max(end, map.get(s.charAt(i)));
			if (end == i) {
				list.add(s.substring(start, end + 1).length());
				start = i + 1;
			}
		}

		return list;
	}

	public boolean validateCreditCard(String creditCardNo) {

		if (creditCardNo == null || creditCardNo.isEmpty())
			return true;
		String updatedString = "";

		for (char ch : creditCardNo.toCharArray()) {
			if (ch == ' ') {
				continue;
			}
			int val = ch - '0';
			System.out.println(val);
			if (!(val >= 0 && val <= 9)) {
				return false;
			}
			updatedString += ch;
		}
		if (updatedString.length() >= 12 && updatedString.length() <= 16)
			return true;

		return false;
	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		if (root != null) {
			createPaths(root, list, "");
		}
		return list;
	}

	public void createPaths(TreeNode root, List<String> list, String path) {
		if (root.left == null && root.right == null) {
			list.add(path + root.val);
		}
		if (root.left != null) {
			createPaths(root.left, list, root.val + "->" + path);
		}
		if (root.right != null) {
			createPaths(root.right, list, root.val + "->" + path);
		}
	}

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		return depth(root, 0) != -1;
	}

	private int depth(TreeNode root, int level) {
		if (root == null)
			return 0;
		int left = depth(root.left, level + 1);
		int right = depth(root.right, level + 1);
		if (left == -1 || right == -1)
			return -1;
		return Math.abs(left - right) <= 1 ? Math.max(left, right) : -1;

	}

	public int trap(int[] height) {

		// 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
		int ans = 0, current = 0;
		Stack<Integer> st = new Stack<>();
		while (current < height.length) {
			while (!st.empty() && height[current] > height[st.peek()]) {
				int top = st.peek();
				st.pop();
				if (st.empty())
					break;
				int distance = current - st.peek() - 1;
				int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
				ans += distance * bounded_height;
			}
			st.push(current++);
		}
		return ans;
	}

	public boolean checkValidString(String s) {

		if (!s.contains("*") && isValidString(s)) {
			return true;
		} else {

		}

		return false;
	}

	private boolean isValidString(String str) {

		return false;
	}

	public int[][] merge(int[][] intervals) {
		if (intervals.length <= 1) {
			return intervals;
		}
		Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);
		for (int[] interval : intervals) {
			if (interval[1] <= newInterval[1]) {
				newInterval[1] = Math.max(interval[1], newInterval[1]);
			} else {
				newInterval = interval;
				result.add(newInterval);
			}
		}

		return result.toArray(new int[result.size()][]);
	}

	public int minCost(String s, int[] cost) {
		int res = 0, max_cost = 0, n = cost.length;
		for (int i = 0; i < n; i++) {
			if (i > 0 && s.charAt(i) != s.charAt(i - 1))
				max_cost = 0;

			res += Math.min(max_cost, cost[i]);
			max_cost = Math.max(max_cost, cost[i]);
		}
		return res;
	}

	public int numPairsDivisibleBy60(int[] time) {
		int ans = 0;
		if (time == null || time.length == 0)
			return ans;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < time.length; i++) {
			int rem = time[i] % 60;
			Integer temp = map.get((60 - rem) % 60);
			if (temp == null) {
				temp = 0;
			}
			ans += temp;
			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}
		return ans;

	}

	int minDeletions = 0;

	public int minDeletions(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Integer val = map.get(s.charAt(i));
			if (val == null)
				val = 0;
			val += 1;
			map.put(s.charAt(i), val);
		}
		countDeletion(map);
		return minDeletions;
	}

	private void countDeletion(Map<Character, Integer> map) {
		Set<Integer> set = new HashSet<>();
		for (Character ch : map.keySet()) {
			if (!set.contains(map.get(ch))) {
				set.add(map.get(ch));
			} else {
				if (map.get(ch) > 0) {
					minDeletions++;
					map.put(ch, map.get(ch) - 1);
					countDeletion(map);
				}
			}
		}

	}

	public List<TreeNode> generateTrees(int n) {
		if (n == 0)
			return new ArrayList<TreeNode>();
		return generateTrees(1, n);
	}

	List<TreeNode> generateTrees(int start, int end) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		if (start > end) {
			result.add(null);
			return result;
		}
		for (int i = start; i <= end; i++) {
			List<TreeNode> leftSubTrees = generateTrees(start, i - 1);
			List<TreeNode> rightSubTrees = generateTrees(i + 1, end);
			for (TreeNode left : leftSubTrees) {
				for (TreeNode right : rightSubTrees) {
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					result.add(root);
				}
			}
		}
		return result;
	}

	private TreeNode construct(TreeNode root, int val) {
		if (root == null)
			return new TreeNode(val);
		if (root.val >= val) {
			construct(root.left, val);
		}
		if (root.val <= val) {
			construct(root.right, val);
		}
		return root;
	}

	TreeNode first = null;
	TreeNode second = null;
	TreeNode prevNode = new TreeNode(Integer.MIN_VALUE);

	public void recoverTree(TreeNode root) {
		recover(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}

	private void recover(TreeNode root) {
		if (root == null)
			return;
		recover(root.left);
		if (first == null && prevNode.val >= root.val) {
			first = root;
		}
		if (first != null && prevNode.val >= root.val) {
			second = root;
		}
		prevNode = root;
		recover(root.right);
	}

	public int maxProfit(int k, int[] prices) {
		if (k >= prices.length / 2) {
			return maxProfit(prices);
		}
		int maxProfit = 0;
		for (int j = 0; j < k; j++) {
			int max = Integer.MIN_VALUE;
			int minPrice = Integer.MAX_VALUE;
			for (int i = 0; i < prices.length; i++) {
				if (minPrice > prices[i]) {
					minPrice = prices[i];
				} else if (prices[i] - minPrice > max) {
					max = prices[i] - minPrice;

				}
			}

			maxProfit = Math.max(maxProfit, max + maxProfit);

		}

		return maxProfit;
	}

	private int maxProfit(int[] prices) {
		int max = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				max += prices[i] - prices[i - 1];
			}
		}
		return max;
	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord))
			return 0;

		List<String> updatedList = new ArrayList<>();
		updatedList.add(beginWord);
		updatedList.addAll(wordList);
		updatedList.add(endWord);
		int count = 0;

		for (int i = 1; i < updatedList.size() - 1; i++) {
			String start = updatedList.get(i - 1);
			String mid = updatedList.get(i);
			String end = updatedList.get(i + 1);
			if (isValid(mid, start) && isValid(mid, end)) {
				count++;
			}

		}
		count++;
		return count;
	}

	private boolean isValid(String str, String t) {
		Set<Character> set = new HashSet<>();
		for (Character c : t.toCharArray()) {
			set.add(c);
		}
		int count = 0;
		for (Character c : str.toCharArray()) {
			if (!set.contains(c)) {
				count++;
			}
			if (count > 1) {
				return false;
			}
		}

		return true;
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode node = new ListNode(0);
		ListNode temp = node;
		ListNode fast = head.next;
		while (head != null) {
			int val = head.val;
			if (fast != null && head.val == fast.val) {
				while (fast != null && head.val == fast.val) {
					fast = fast.next;
					head = head.next;
				}
				if (fast != null) {
					fast = fast.next;
				}
				head = head.next;
			} else {
				temp.next = new ListNode(val);
				temp = temp.next;
				head = head.next;
				fast = fast.next;
			}
		}

		return node.next;
	}

	Map<Integer, List<Integer>> map = null;

	public int[] restoreArray1(int[][] adjacentPairs) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		map = new HashMap<>();
		for (int i = 0; i < adjacentPairs.length; i++) {
			adjList(adjacentPairs[i][0], adjacentPairs[i][1]);
			adjList(adjacentPairs[i][1], adjacentPairs[i][0]);
		}

		int start = 0;
		for (int key : map.keySet()) {
			if (map.get(key).size() == 1) {
				start = key;
				break;
			}
		}
		dfs(start, list, set);
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	private void dfs(int start, List<Integer> list, Set<Integer> set) {
		list.add(start);
		set.add(start);
		if (map.containsKey(start)) {
			for (int ver : map.get(start)) {
				if (!set.contains(ver)) {
					dfs(ver, list, set);
				}
			}
		}
	}

	private void adjList(int key, int val) {

		List<Integer> list = map.get(key);
		if (list == null) {
			list = new ArrayList<>();
		}
		list.add(val);
		map.put(key, list);
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode curr = q.poll();
				list.add(curr.val);
				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
			}
			result.add(list);
		}

		return result;

	}

	public List<String> generateParenthesis1(int n) {
		List<String> list = new ArrayList<String>();
		generate(0, new char[2 * n], list);
		return list;
	}

	private void generate(int i, char[] cs, List<String> list) {
		if (i == cs.length) {
			if (isValid(cs)) {
				list.add(new String(cs));
			}
		} else {
			cs[i] = '(';
			generate(i + 1, cs, list);
			cs[i] = ')';
			generate(i + 1, cs, list);
		}
	}

	private boolean isValid(char[] cs) {
		int count = 0;
		for (char c : cs) {
			if (c == '(')
				count++;
			else
				count--;
			if (count < 0)
				return false;
		}
		return count == 0;
	}

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {

		boolean[] visited = new boolean[rooms.size()];
		adjList(rooms);
		visit(0, rooms.size(), visited);
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i])
				return false;
		}
		return true;
	}

	private void visit(int i, int size, boolean[] visited) {
		if (size == i) {
			return;
		}
		visited[i] = true;
		if (map.containsKey(i)) {
			for (int index : map.get(i)) {
				if (!visited[index]) {
					visit(index, size, visited);
				}
			}
		}

	}

	private void adjList(List<List<Integer>> rooms) {
		map = new HashMap<>();
		for (int i = 0; i < rooms.size(); i++) {
			for (int val : rooms.get(i)) {
				List<Integer> list = map.get(i);
				if (list == null) {
					list = new ArrayList<>();
				}
				list.add(val);
				map.put(i, list);
			}
		}
	}

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> result = new ArrayList<>();
		pathsSourceTarget(graph, 0, graph.length - 1, new ArrayList<>(), result);
		return result;
	}

	private void pathsSourceTarget(int[][] grid, int i, int size, List<Integer> list, List<List<Integer>> result) {
		if (i == size) {
			result.add(list);
			return;
		}
		for (int val : grid[i]) {
			List<Integer> copied = new ArrayList<>(list);
			pathsSourceTarget(grid, val, size, copied, result);
		}

	}

	public List<Integer> partitionLabels1(String s) {
		if (s == null || s.length() == 0)
			return null;
		List<Integer> list = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++)
			map.put(s.charAt(i), i);

		int start = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			end = Math.max(end, map.get(s.charAt(i)));
			if (end == i) {
				list.add(end - start + 1);
				start = end + 1;
			}
		}

		return list;
	}

	int paths = 0;
	int count = 0;

	public int uniquePathsIII(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 0) {
					count++;
				}
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					countPaths(i + 1, j, grid, 0);
					countPaths(i - 1, j, grid, 0);
					countPaths(i, j + 1, grid, 0);
					countPaths(i, j - 1, grid, 0);
				}
			}
		}
		return paths;
	}

	private void countPaths(int i, int j, int[][] grid, int curr) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) {
			return;
		}
		if (grid[i][j] == 2 && curr == count) {
			paths++;
			return;
		}
		if (grid[i][j] == -1)
			return;
		if (grid[i][j] == 0) {
			curr++;
			grid[i][j] = -1;
			countPaths(i + 1, j, grid, curr);
			countPaths(i - 1, j, grid, curr);
			countPaths(i, j + 1, grid, curr);
			countPaths(i, j - 1, grid, curr);
			grid[i][j] = 0;

		}

	}

	public ListNode reverseBetween(ListNode head, int left, int right) {

		ListNode node = null;
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			if (left <= count && count <= right) {
				ListNode t = new ListNode(temp.val);
				t.next = node;
				node = t;
			}
			temp = temp.next;
		}
		temp = head;
		count = 0;
		ListNode result = new ListNode(0), p = result;
		while (temp != null) {
			count++;
			int val = 0;
			if (left <= count && count <= right) {
				val = node.val;
				node = node.next;
			} else {
				val = temp.val;

			}
			p.next = new ListNode(val);
			p = p.next;

			temp = temp.next;
		}

		return result.next;
	}

	private ListNode reversedNode(ListNode head) {
		ListNode node = null;
		while (head != null) {
			ListNode temp = new ListNode(head.val);
			temp.next = node;
			node = temp;
			head = head.next;
		}
		return node;
	}

	public ListNode sortList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode slow = head, fast = head.next;
		ListNode l1 = null, l2 = null;

		return mergeListNode(l1, l2);
	}

	private ListNode mergeListNode(ListNode l1, ListNode l2) {

		return null;
	}

	public int numberOfRounds(String startTime, String finishTime) {
		String[] str1 = startTime.split(":");
		String[] str2 = finishTime.split(":");

		return 0;
	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode fast = head.next;
		ListNode node = head;
		while (node != null && fast != null) {
			int temp = node.val;
			node.val = fast.val;
			fast.val = temp;
			if (node.next != null) {
				node = node.next.next;
			}
			if (fast.next != null) {
				fast = fast.next.next;
			}
		}
		return head;
	}

	private static void printNode(ListNode node) {
		while (node != null) {
			System.out.print(" " + node.val + " --- ");
			node = node.next;
		}
		System.out.print(" \n\n");

	}

	private ListNode reverse(ListNode l) {
		ListNode node = null;
		while (l != null) {
			ListNode temp = new ListNode(l.val);
			temp.next = node;
			node = temp;
			l = l.next;
		}
		return node;
	}

	public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		while (l1 != null) {
			st1.push(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			st2.push(l2.val);
			l2 = l2.next;
		}
		int carry = 0;
		ListNode list = null;
		while (st1.empty() || st2.empty() || carry > 0) {
			int sum = carry;
			if (!st1.empty()) {
				sum += st1.pop();
			}
			if (!st2.empty()) {
				sum += st2.pop();
			}

			ListNode temp = new ListNode(sum % 10);
			temp.next = list;
			list = temp;
			carry = sum / 10;
		}

		return list;
	}

	public ListNode oddEvenList(ListNode head) {

		ListNode node = head, oddNode = null, evenNode = null;
		while (node != null) {
			if (node.val % 2 == 0) {
				if (oddNode == null) {
					oddNode = new ListNode(node.val);
				} else {
					oddNode.next = new ListNode(node.val);
				}
			} else {
				if (evenNode == null) {
					evenNode = new ListNode(node.val);
				} else {
					evenNode.next = new ListNode(node.val);
				}
			}
		}
		oddNode.next = evenNode;
		return oddNode;
	}

	class LRUCache {
		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
		int capacity;

		public LRUCache(int capacity) {
			this.capacity = capacity;
		}

		public int get(int key) {
			if (!map.containsKey(key)) {
				return -1;
			}
			int val = map.get(key);
			map.remove(key);
			map.put(key, val);
			return val;
		}

		public void put(int key, int value) {
			if (map.containsKey(key)) {
				map.remove(key);
			} else {
				if (map.size() == capacity) {
					for (Integer keyToRemove : map.keySet()) {
						map.remove(keyToRemove);
					}
				}
			}
			map.put(key, value);
		}
	}

	class MyHashMap {
		ListNodeHashMap[] arr;

		/** Initialize your data structure here. */
		public MyHashMap() {
			arr = new ListNodeHashMap[100000];
		}

		/** value will always be non-negative. */
		public void put(int key, int value) {

		}

		/**
		 * Returns the value to which the specified key is mapped, or -1 if this map
		 * contains no mapping for the key
		 */
		public int get(int key) {

			return 0;
		}

		/**
		 * Removes the mapping of the specified value key if this map contains a mapping
		 * for the key
		 */
		public void remove(int key) {

		}

		private class ListNodeHashMap {
			private int key;
			private int val;
			private ListNodeHashMap next;

			ListNodeHashMap(int key, int val) {
				this.key = key;
				this.val = val;
			}
		}

	}
	/*
	 * (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
	 */

	public int removeDuplicates(int[] nums) {
		int count = 0;
		for (int i = 0; (i + 1) < nums.length; i++) {
			if (nums[i] == nums[i + 1]) {
				nums[i + 1] = Integer.MAX_VALUE;
			} else {
				count++;
			}
		}
		Arrays.sort(nums);
		return count;
	}

	public boolean makeEqual(String[] words) {
		Map<Character, Integer> map = new HashMap<>();
		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
			}
		}
		for (Character str : map.keySet()) {
			int freq = map.get(str);
			if (freq % words.length != 0) {
				return false;
			}
		}
		return true;
	}

	public int minFallingPathSum(int[][] matrix) {
		int minVal = Integer.MAX_VALUE;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int j = 0; j < matrix[0].length; j++) {
			int curr = calPathSum(matrix, 0, j, dp);
			if (minVal > curr) {
				minVal = curr;
			}
		}
		return minVal;
	}

	private int calPathSum(int[][] matrix, int row, int col, int[][] dp) {
		if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (row == matrix.length - 1) {
			return matrix[row][col];
		}
		if (dp[row][col] != 0) {
			return dp[row][col];
		}
		int left = calPathSum(matrix, row + 1, col - 1, dp);
		if (left != Integer.MAX_VALUE) {
			left += matrix[row][col];
		}
		int mid = calPathSum(matrix, row + 1, col, dp);
		if (mid != Integer.MAX_VALUE) {
			mid += matrix[row][col];
		}
		int right = calPathSum(matrix, row + 1, col + 1, dp);
		if (right != Integer.MAX_VALUE) {
			right += matrix[row][col];
		}
		dp[row][col] = Math.min(left, Math.min(mid, right));

		return dp[row][col];
	}

	public int minPathSum(int[][] grid) {
		int[][] memo = new int[grid.length][grid[0].length];
		return pathsum(grid, 0, 0, memo);
	}

	private int pathsum(int[][] grid, int i, int j, int[][] memo) {

		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return grid[i][j];
		}
		if (memo[i][j] != 0) {
			return memo[i][j];
		}
		int rowMin = Integer.MAX_VALUE, colMin = Integer.MAX_VALUE;
		if (i < grid.length - 1) {
			rowMin = pathsum(grid, i + 1, j, memo);
		}
		if (j < grid[0].length - 1) {
			colMin = pathsum(grid, i, j + 1, memo);

		}
		memo[i][j] = grid[i][j] + Math.min(rowMin, colMin);

		return memo[i][j];
	}

	public int[] twoSum(int[] nums, int target) {
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			if (nums[start] + nums[end] == target) {
				int[] indexes = { start, end };
				return indexes;
			} else if (nums[start] + nums[end] > target) {
				end--;
			} else {
				start++;
			}
		}
		int[] invalidIndexes = { -1, -1 };
		return invalidIndexes;
	}

	public int maxSubArray(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			max = Math.max(max, dp[i]);
		}

		return max;
	}

	public void rotate(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return;
		int size = matrix.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[size - j - 1][i];
				matrix[size - j - 1][i] = temp;
			}
		}

	}

	public List<List<Integer>> subsets12(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		for (int num : nums) {
			List<List<Integer>> temp = new ArrayList<>();
			for (List<Integer> list : result) {
				List<Integer> curr = new ArrayList<>(list);
				curr.add(num);
				temp.add(curr);
			}
			for (List<Integer> list : temp) {
				result.add(list);
			}
		}

		return result;
	}

	class MedianFinder {

		PriorityQueue<Integer> max;
		PriorityQueue<Integer> min;
		boolean even = false;

		/** initialize your data structure here. */
		public MedianFinder() {

			max = new PriorityQueue<>((a, b) -> (b - a));
			min = new PriorityQueue<>((a, b) -> (a - b));
		}

		public void addNum(int num) {
			if (even) {
				max.offer(num);
				min.offer(max.poll());
			} else {
				min.offer(num);
				max.offer(min.poll());
			}
			even = !even;
		}

		public double findMedian() {
			if (even) {
				return (double) (min.peek() + max.peek()) / 2.0;
			}
			return (double) min.peek();
		}
	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		if (n == 0 || k == 0) {
			return new int[0];
		}
		int numOfWindow = n - k + 1;
		int[] result = new int[numOfWindow];

		Deque<Integer> win = new ArrayDeque<Integer>();
		for (int i = 0; i < n; ++i) {

			while (win.size() > 0 && win.peekFirst() <= i - k) {
				win.pollFirst();
			}
			// remove indices whose corresponding values are less than nums[i]
			while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
				win.pollLast();
			}
			// add nums[i]
			win.offerLast(i);
			// add to result
			if (i >= k - 1) {
				result[i - k + 1] = nums[win.peekFirst()];
			}

		}
		return result;

	}

	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		int sumA = 0, sumB = 0;
		for (int val : aliceSizes) {
			sumA += val;
		}
		for (int val : bobSizes) {
			sumB += val;
		}
		int diff = sumB - sumA / 2;

		Set<Integer> setB = new HashSet<>();
		for (int val : bobSizes) {
			sumA += val;
		}

		for (int val : aliceSizes) {
			if (setB.contains(val)) {
				return new int[] { val, diff + val };
			}
		}

		return null;
	}

	public int[] sortedSquares(int[] arr) {

		if (arr == null || arr.length == 0)
			return null;
		int[] result = new int[arr.length];
		int start = 0, i = arr.length - 1;
		int end = arr.length - 1;

		while (start < end) {
			if (Math.abs(arr[start]) > Math.abs(arr[end])) {
				result[i] = arr[start] * arr[start];
				start++;
			} else {
				result[i] = arr[end] * arr[end];
				end--;
			}
			i--;
		}

		return result;

	}

	public boolean isSymmetric(TreeNode root) {

		return true;
	}

	private Integer prev = null;

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		isValidBST(root.left);
		if (prev != null && root.val <= prev)
			return false;
		prev = root.val;

		return isValidBST(root.right);
	}

//	public Node connect(Node root) {
//		if (root == null)
//			return null;
//		root.left.next = root.right;
//		if (root.next != null) {
//			root.right.next = root.next.left;
//		}
//		connect(root.left);
//		connect(root.right);
//		return root;
//	}

	List<String> output;

	public List<String> letterCombinations(String digits) {
		output = new ArrayList<>();
		generateLetterCombinations("", digits);
		return output;
	}

	private void generateLetterCombinations(String s, String digits) {
		if (digits.length() == 0) {
			return;
		}
		for (String str : getA(digits.charAt(0))) {
			String start = s + str;
			if (digits.length() == 0) {
				output.add(s);
			} else {
				generateLetterCombinations(start, digits.substring(1, digits.length()));
			}
		}
	}

	String[] getA(char ch) {
		if (ch == '2')
			return new String[] { "a", "b", "c" };
		if (ch == '3')
			return new String[] { "d", "e", "f" };
		if (ch == '4')
			return new String[] { "g", "h", "i" };
		if (ch == '5')
			return new String[] { "j", "k", "l" };
		if (ch == '6')
			return new String[] { "m", "n", "o" };
		if (ch == '7')
			return new String[] { "p", "q", "r", "s" };
		if (ch == '8')
			return new String[] { "t", "u", "v" };
		else
			return new String[] { "w", "x", "y", "z" };
	}

	public List<String> generateParenthesi1s(int n) {
		List<String> combinations = new ArrayList<>();
		generate(new char[2 * n], 0, combinations);
		return combinations;
	}

	private void generate(char[] cs, int pos, List<String> combinations) {

		if (pos == cs.length) {
			if (isValidCombinations(cs)) {

			}
		} else {
			cs[pos] = '(';
			generate(cs, pos + 1, combinations);
			cs[pos] = ')';
			generate(cs, pos + 1, combinations);
		}
	}

	public boolean isValidCombinations(char[] current) {
		int balance = 0;
		for (char c : current) {
			if (c == '(')
				balance++;
			else
				balance--;
			if (balance < 0)
				return false;
		}
		return (balance == 0);
	}

	public int rob(TreeNode root) {
		return robHouse(root);
	}

	public int robHouse(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int rootSum = root.val;
		if (root.left != null) {
			rootSum += robHouse(root.left.left);
			rootSum += robHouse(root.left.right);
		}
		if (root.right != null) {
			rootSum += robHouse(root.right.left);
			rootSum += robHouse(root.right.right);
		}

		return Math.max(rootSum, robHouse(root.left) + robHouse(root.right));
	}

	int maxVal = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		pathSum(root);
		return maxVal;
	}

	private int pathSum(TreeNode node) {
		if (node == null)
			return 0;

		int left = Math.max(pathSum(node.left), 0);
		int right = Math.max(pathSum(node.right), 0);
		maxVal = Math.max(maxVal, node.val + left + right);

		return Math.max(node.val + left, node.val + right);
	}

	public int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		int result = 0;
		for (int num : nums) {
			int count = 0;
			while (set.contains(num++)) {
				count++;
			}
			result = Math.min(result, count);
		}
		return result;
	}

	public int coinChange(int[] coins, int c) {
		int[] cache = new int[c + 1];
		for (int i = 1; i <= c; i++) {
			int minCoins = Integer.MAX_VALUE;
			// Try removing each coin from the total
			// and see which requires the fewest
			// extra coins
			for (int coin : coins) {
				if (i - coin >= 0) {
					int currCoins = cache[i - coin] + 1;
					if (currCoins < minCoins) {
						minCoins = currCoins;
					}
				}
			}
			cache[i] = minCoins;
		}
		return cache[c];
	}
//
//	public Node connect1(Node root) {
//
//		return connectNext(root);
//	}

//	private Node connectNext(Node root) {
//		Node curr = root, nextLevel;
//		while (curr != null) {
//			nextLevel = curr.left;
//			while (curr != null) {
//				if (curr.left != null) {
//					curr.left.next = curr.right;
//				}
//				if (curr.right != null) {
//					curr.right.next = curr.left;
//				}
//				curr = curr.next;
//			}
//			curr = nextLevel;
//		}
//
//		return root;
//	}

	private int min;

	public int numSquares(int n) {
		min = n;
		List<Integer> memory = new ArrayList<>();
		for (int i = 1; i * i <= n; i++) {
			memory.add(i * i);
		}
		recursive(memory, memory.size() - 1, n, 0);
		return min;
	}

	public void recursive(List<Integer> memory, int end, int n, int count) {
		if (n == 0) {
			min = Math.min(min, count);
			return;
		}
		for (int i = end; i >= 0; i--) {
			if (n / memory.get(i) + count >= min) {
				break;
			}
			int rest = n - memory.get(i);
			if (rest >= 0) {
				recursive(memory, i, rest, count + 1);
			}
		}
	}

	public List<List<String>> partition(String s) {

		List<List<String>> result = new ArrayList<>();
		partition(s, 0, new ArrayList<>(), result);

		return result;
	}

	private void partition(String s, int start, List<String> arrayList, List<List<String>> result) {
		if (start >= s.length()) {
			result.add(new ArrayList<>(arrayList));
			return;
		}
		for (int i = start; i < s.length(); i++) {
			if (isPalindrome(s, start, i)) {
				arrayList.add(s.substring(start, i + 1));
				partition(s, i + 1, arrayList, result);
				arrayList.remove(arrayList.size() - 1);
			}
		}
		return;
	}

	private boolean isPalindrome(String s, int low, int high) {

		while (low < high) {
			if (s.charAt(low++) != s.charAt(high--)) {
				return false;
			}
		}

		return true;
	}

	public List<List<Integer>> subsets132(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		result.add(new ArrayList<Integer>());

		if (nums == null || nums.length == 0)
			return result;

		for (int num : nums) {
			List<List<Integer>> helper = new ArrayList<List<Integer>>();
			for (List<Integer> curr : result) {
				List<Integer> temp = new ArrayList<Integer>(curr);
				temp.add(num);
				helper.add(temp);
			}

			for (List<Integer> curr : helper) {
				result.add(curr);
			}
		}

		return result;
	}

	List<List<Integer>> result;

	public List<List<Integer>> permute(int[] nums) {
		result = new ArrayList<>();
		permute(nums, new ArrayList<>());
		return result;
	}

	private void permute(int[] nums, List<Integer> list) {
		if (nums.length == list.size()) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int num : nums) {
			if (list.contains(num)) {
				continue;
			}
			list.add(num);
			permute(nums, list);
			list.remove(list.size() - 1);
		}
	}

	public Node copyRandomList(Node head) {

		Map<Node, Node> map = new HashMap<>();
		Node dummy = null;
		Node prev = dummy, newcurr = null, curr = head;
		while (curr != null) {
			// newcurr = map.getOrDefault(curr, new Node(curr.val));
			map.put(curr, newcurr);

//			if (curr.random != null) {
//				newcurr.random = map.getOrDefault(curr.random, new Node(curr.random.val));
//				map.put(curr.random, newcurr.random);
//			}

			prev.next = newcurr;
			prev = newcurr;
			curr = curr.next;
		}

		return dummy.next;
	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		if (numCourses == 0 || prerequisites == null || prerequisites.length == 0)
			return true;

		Map<Integer, List<Integer>> adj = new HashMap<>();
		boolean[] visited = new boolean[numCourses];
		buildGraph(numCourses, prerequisites, adj);
		for (int i = 0; i < numCourses; i++) {
			if (!dfs(i, visited, adj)) {
				return false;
			}
		}
		return true;
	}

	private boolean dfs(int i, boolean[] visited, Map<Integer, List<Integer>> adj) {
		if (visited[i]) {
			return true;
		}
		visited[i] = false;
		if (adj.containsKey(i)) {
			for (Integer val : adj.get(i)) {
				if (!dfs(val, visited, adj))
					return false;
			}
		}
		visited[i] = true;
		return true;
	}

	private void buildGraph(int numCourses, int[][] prerequisites, Map<Integer, List<Integer>> adj) {
		for (int i = 0; i < numCourses; i++) {
			adj.put(i, new ArrayList<>());
		}

		for (int[] arr : prerequisites) {
			adj.get(arr[1]).add(arr[0]);
		}
	}

	public int numDecodings1(String s) {
		int[] dp = new int[s.length() + 1];

		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;
		for (int i = 2; i <= s.length(); i++) {
			int oneDigit = Integer.valueOf(s.substring(i - 1, i));
			int twoDigit = Integer.valueOf(s.substring(i - 2, i));

			if (oneDigit >= 1) {
				dp[i] += dp[i - 1];
			}
			if (twoDigit >= 10 && twoDigit <= 26) {
				dp[i] += dp[i - 2];
			}
		}

		return dp[s.length()];
	}

	class LRUCache1 {
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new LinkedHashSet<>();
		int capacity = 0;

		public LRUCache1(int capacity) {
			this.capacity = capacity;
		}

		public int get(int key) {
			if (!set.contains(key))
				return -1;
			set.remove(key);
			set.add(key);
			return map.get(key);
		}

		public void put(int key, int value) {
			if (set.contains(key)) {
				set.remove(key);
			} else {
				if (set.size() == capacity) {
					Iterator<Integer> iter = set.iterator();
					int rem = iter.next();
					set.remove(rem);
					map.remove(rem);
				}
			}
			set.add(key);
			map.put(key, value);
		}
	}

	public List<List<Integer>> subsets1(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());

		for (int num : nums) {

		}

		return null;
	}

	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.') {
					if (!isValid(board, i, j, board[i][j]))
						;
				}
			}
		}

		return true;
	}

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				while (slow != fast) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}

		return null;
	}

	private boolean isValid(char[][] board, int row, int col, char val) {

		for (int i = row + 1; i <= 9; i++) {
			if (board[i][col] == val) {
				return false;
			}
		}
		for (int j = col + 1; j <= 9; j++) {
			if (board[row][j] == val) {
				return false;
			}
		}
		int x = row - row % 3, y = col - col % 3;

		for (int i = x + 1; i < x + 3; i++) {
			for (int j = y + 1; j < y + 3; j++) {
				if (board[x][y] == val && !(i == row && y == col)) {
					return false;
				}
			}
		}

		return true;
	}

	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				map.put(nums1[i] + nums2[j], map.getOrDefault(nums1[i] + nums2[j], 0) + 1);
			}
		}

		for (int i = 0; i < nums3.length; i++) {
			for (int j = 0; j < nums4.length; j++) {
				count += map.getOrDefault(-(nums3[i] + nums4[j]), 0);
			}
		}

		return count;
	}

	public TreeNode buildTree1(int[] preorder, int[] inorder) {
		List<Integer> list = new ArrayList<>();

		Collections.sort(list, Collections.reverseOrder());

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		return build(preorder, 0, preorder.length - 1, map, 0);
	}

	private TreeNode build(int[] preorder, int i, int j, Map<Integer, Integer> map, int index) {
		if (i > j)
			return null;
		int val = preorder[index];
		TreeNode root = new TreeNode(val);
		root.left = build(preorder, i, map.get(val) - 1, map, index);
		root.right = build(preorder, map.get(val) + 1, j, map, index);
		return root;
	}

	public int rob(int[] nums) {

		int start = 0;
		int end = nums.length - 1;
		int max = Integer.MIN_VALUE;
		while (start < end) {
			int index = start + 2;
			int sum = nums[start];
			while (index < end) {
			}
			start++;
		}
		return max;
	}

	public int rob1(int[] nums) {

		int _l = nums.length;
		int first = nums[0];
		if (_l == 1)
			return first;
		int next = Math.max(first, nums[1]);
		if (_l == 2)
			return next;

		int temp = 0;
		for (int i = 2; i < _l; i++) {

			/*
			 * we're simply asking a question here: which gets me a greater value? current
			 * house + two houses down or the house next to me
			 */
			temp = Math.max(next, nums[i] + first);
			first = next;
			next = temp;

		}

		return temp;
	}

	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		int previousRoot = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			int prev = Integer.MIN_VALUE;
			while (left < right && nums[i] != previousRoot) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0 && nums[left] != prev) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);
					result.add(list);
					prev = nums[left++];
					right--;
				} else if (sum > 0) {
					right--;
				} else {
					prev = nums[left++];
				}
			}
			previousRoot = nums[i];
		}

		return result;
	}

	public boolean isSubsequence(String x, String y) {
		int j = 0;
		for (int i = 0; i < y.length() && j < x.length(); i++)
			if (x.charAt(j) == y.charAt(i))
				j++;
		return j == x.length();
	}

	public String findLongestWord(String s, List<String> d) {
		String max_str = "";
		for (String str : d) {
			if (isSubsequence(str, s)) {
				if (str.length() > max_str.length() || (str.length() == max_str.length() && str.compareTo(max_str) < 0))
					max_str = str;
			}
		}
		return max_str;
	}

	public String minRemoveToMakeValid(String s) {

		Stack<Integer> stack = new Stack<>();
		boolean[] indexes = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				stack.push(i);
			} else if (ch == ')') {
				if (!stack.isEmpty()) {
					indexes[stack.pop()] = true;
					indexes[i] = true;
				}
			} else {
				indexes[i] = true;
			}
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (indexes[i]) {
				builder.append(s.charAt(i));
			}
		}
		return builder.toString();
	}

	public ListNode sortList1(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode mid = getMid(head);
		ListNode left = sortList(head);
		ListNode right = sortList(mid);
		return merge(left, right);
	}

	ListNode merge(ListNode list1, ListNode list2) {
		ListNode dummyHead = new ListNode();
		ListNode tail = dummyHead;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				list1 = list1.next;
				tail = tail.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
				tail = tail.next;
			}
		}
		tail.next = (list1 != null) ? list1 : list2;
		return dummyHead.next;
	}

	ListNode getMid(ListNode head) {
		ListNode midPrev = null;
		while (head != null && head.next != null) {
			midPrev = (midPrev == null) ? head : midPrev.next;
			head = head.next.next;
		}
		ListNode mid = midPrev.next;
		midPrev.next = null;
		return mid;
	}

	public ListNode reverseList(ListNode head) {
		ListNode result = null;
		while (head != null) {
			ListNode node = new ListNode(head.val);
			node.next = result;
			result = node;
			head = head.next;
		}

		return result;
	}

	public int solution(String S) {
		// write your code in Java SE 8
		if (S == null || S.length() == 0)
			return 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < S.length(); i++) {
			StringBuilder builder = new StringBuilder(S);
			for (int j = 0; j < 10; j++) {
				char ch = (char) (j + '0');
				builder.setCharAt(i, ch);
				int val = Integer.parseInt(builder.toString());
				if (val % 3 == 0) {
					set.add(val);
				}
			}

		}
		return set.size();

	}

	public String longestPalindrome(String s) {

		// Input: s = "babad"
		if (s == null || s.length() == 0)
			return null;
		if (s.length() > 1000)
			return "";
		for (int i = s.length(); i > 0; i--) {
			int start = 0;
			int end = i;
			while (end <= s.length()) {
				if (isPalindrome(s.substring(start, end)))
					return s.substring(start, end);
				start++;
				end++;
			}

		}

		return null;
	}

	private boolean isPalindrome(String s) {
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

	public boolean isValid(String S) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == ')' && s.peek() == '(') {
				s.pop();
			} else if (c == '}' && s.peek() == '{') {
				s.pop();
			} else if (c == ']' && s.peek() == '[') {
				s.pop();
			} else {
				s.push(c);
			}

		}
		return s.empty();

	}

	public String addBinary(String a, String b) {
		int carry = 0;
		int i = a.length() - 1;
		int j = b.length() - 1;
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		while (i < 0 || j < 0) {
			carry = sum;
			if (i >= 0)
				sum += a.charAt(i) - '0';
			if (j >= 0)
				sum += b.charAt(j) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

	public String arrangeWords(String text) {

		text = text.toLowerCase();
		String[] arr = text.split(" ");
		Map<Integer, ArrayList<String>> map = new HashMap<>();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i].length();
			ArrayList<String> temp = map.get(key);
			if (temp == null) {
				temp = new ArrayList<>();
			}
			temp.add(arr[i]);
			map.put(key, temp);
			if (max < key) {
				max = key;
			}

		}

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < max; i++) {
			if (map.containsKey(i)) {
				for (int j = 0; j < map.get(i).size(); j++) {
					boolean flag = true;
					String s = map.get(i).get(j);
					if (flag) {
						char newChar = (char) ((char) s.charAt(0) - 32);
						s = s.replace(s.charAt(0), newChar);
						flag = false;
					}
					builder.append(s);
					builder.append(" ");
				}
			}

		}

		return builder.toString().trim();
	}

	public String minRemoveToMakeValid1(String s) {
		if (s == null || s.length() == 0)
			return s;
		Stack<Integer> stack = new Stack<>();
		boolean validIndex[] = new boolean[s.length()];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
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

	public int findMin(int[] nums) {

		if (nums == null || nums.length == 0)
			return -1;
		int low = 0, high = nums.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > nums[high]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return nums[low];
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> inorderIndexMap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			inorderIndexMap.put(inorder[i], i);
		}
		return buildTree(preorder, 0, preorder.length - 1, inorderIndexMap, 0);
	}

	private TreeNode buildTree(int[] preorder, int left, int right, Map<Integer, Integer> inorderIndexMap,
			int preorderIndex) {

		if (left > right)
			return null;

		int rootValue = preorder[preorderIndex];
		TreeNode root = new TreeNode(rootValue);

		root.left = buildTree(preorder, left, inorderIndexMap.get(rootValue) - 1, inorderIndexMap, preorderIndex + 1);
		root.right = buildTree(preorder, inorderIndexMap.get(rootValue) + 1, right, inorderIndexMap, preorderIndex + 1);

		return root;
	}

	public int twoCitySchedCost(int[][] costs) {

		Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));

		int cost = 0;
		for (int i = 0; i < costs.length / 2; i++) {
			cost += costs[i][0];
			cost += costs[costs.length / 2 + i][1];
		}

		return cost;

	}

	public String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {
			Integer val = map.get(c);
			if (val == null) {
				val = 0;
			}
			val += 1;
			map.put(c, val);
		}
		PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
		queue.addAll(map.keySet());
		StringBuilder str = new StringBuilder();
		while (!queue.isEmpty()) {
			char c = queue.remove();
			for (int i = 0; i < map.get(c); i++) {
				str.append(c);
			}
		}

		return str.toString();
	}

	public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		List<TreeNode> result = new ArrayList<>();
		for (int i = 0; i < to_delete.length; i++) {
			delNodes(root, result, to_delete[i]);
		}
		return result;
	}

	private void delNodes(TreeNode root, List<TreeNode> result, int val) {
		if (root == null) {
			return;
		}
		if (root != null && root.left.val == val) {
			result.add(root.left.left);
			result.add(root.left.right);
			root.left = null;
		}
		if (root != null && root.right.val == val) {
			result.add(root.right.left);
			result.add(root.right.right);
			root.right = null;
		}
		delNodes(root.left, result, val);
		delNodes(root.right, result, val);

	}

	public List<Integer> findDuplicates1(int[] nums) {
		List<Integer> l = new ArrayList<>(); // output array
		for (int i = 0; i < nums.length; i++) {
			int ind = Math.abs(nums[i]) - 1;
			if (nums[ind] < 0) {
				l.add(ind + 1);
			}
			nums[ind] = -nums[ind];
		}
		return l;
	}

	public List<List<Integer>> allPathsSourceTarget1(int[][] graph) {

		if (graph == null || graph.length == 0)
			return null;
		List<List<Integer>> result = new ArrayList<>();
		allPathsSourceTarget(graph, 0, graph.length - 1, new ArrayList<>(), result);
		return result;
	}

	private void allPathsSourceTarget(int[][] graph, int i, int j, List<Integer> list, List<List<Integer>> result) {
		if (i == j) {
			result.add(list);
		}
		list.add(i);
		for (int vertex : graph[i]) {
			List<Integer> copiedList = new ArrayList<>(list);
			allPathsSourceTarget(graph, vertex, j, copiedList, result);
		}
	}

	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		// inorder to get two sorted list
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		inorder(root1, list1);
		inorder(root2, list2);
		while (list1.size() > 0 && list2.size() > 0) {
			int val1 = Integer.MAX_VALUE, val2 = Integer.MAX_VALUE;
			if (list1.size() > 0)
				val1 = list1.get(0);
			if (list2.size() > 0)
				val2 = list2.get(0);
			if (val1 > val2) {
				result.add(val2);
				list2.remove(0);
			} else {
				result.add(val1);
				list1.remove(0);
			}
		}

		return result;
	}

	private void inorder(TreeNode node, List<Integer> list) {
		if (node == null)
			return;
		inorder(node.left, list);
		list.add(node.val);
		inorder(node.right, list);
	}

	public TreeNode bstFromPreorder(int[] preorder) {
		return bstFromPreorder(preorder, 0, preorder.length - 1);
	}

	private TreeNode bstFromPreorder(int[] preorder, int start, int end) {
		if (start > end) {
			return null;
		}
		TreeNode root = new TreeNode(start);
		int index = start + 1;
		while (index <= end) {
			if (preorder[index] > root.val) {
				break;
			}
			index++;
		}

		root.left = bstFromPreorder(preorder, start + 1, index - 1);
		root.right = bstFromPreorder(preorder, index, preorder.length - 1);

		return root;
	}

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;

		return constructMaximumBinaryTree(nums, 0, nums.length - 1);
	}

	private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {

		if (start == end) {
			return new TreeNode(nums[start]);
		}
		if (start < end) {
			int index = maxIndex(nums, start, end);
			TreeNode root = new TreeNode(nums[index]);
			root.left = constructMaximumBinaryTree(nums, start, index - 1);
			root.right = constructMaximumBinaryTree(nums, index + 1, end);
			return root;
		}
		return null;
	}

	public int maxIndex(int[] nums, int start, int end) {
		int max = Integer.MIN_VALUE, index = -1;
		for (int i = start; i <= end; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		return index;
	}

	public int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = x % 10 + result * 10;
			x = x / 10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) result;
	}

	/*
	 * long result = 0; while(x!=0){ result = result*10 + x%10; x = x/10; }
	 * 
	 * if(result<Integer.MIN_VALUE || result>Integer.MAX_VALUE) return 0; else
	 * return (int)result;
	 */

	/*
	 * 
	 * 
	 * Input: nums = [-1,2,1,-4], target = 1 Output: 2 Explanation: The sum that is
	 * closest to the target is 2. (-1 + 2 + 1 = 2).
	 */
	public int threeSumClosest(int[] nums, int target) {

		int min = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int start = i + 1;
			int end = nums.length - 1;
			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];

			}
		}

		return min;
	}

	public int[] sortedSquares12ss(int[] nums) {
		int len = nums.length;
		int left = 0, right = len - 1;
		int res[] = new int[len];

		for (int i = len - 1; i >= 0; i--) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				res[i] = nums[left] * nums[left];
				left++;
			} else {
				res[i] = nums[right] * nums[right];
				right--;
			}
		}

		return res;
	}

	public int[] sortedSquares1(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);

		for (int i = 0; i < nums.length; i++) {
			int val = nums[i] * nums[i];
			queue.add(val);
		}
		int count = 0;
		while (!queue.isEmpty()) {
			nums[count] = queue.poll();
			count++;
		}
		return nums;
	}

	public static int maxWoodenPieces(int[] arr, int k) {
		if (arr == null || arr.length == 0)
			return 0;
		Arrays.sort(arr);
		return calculate(arr, 0, k, 0, 1);
	}

	public static int calculate(int[] arr, int pos, int k, int count, int element) {
		if (arr.length == pos) {
			return element;
		}
		if (k == count)
			return element;

		int val = arr[pos];
		for (int i = 1; i <= val; i++) {
			if (element == i) {
				count++;
				calculate(arr, pos + 1, k, count, i);
			}

		}

		return 0;
	}
}
