package com.example;

import java.util.*;

public class Practicing {

	public static void main(String[] args) {
		Practicing obj = new Practicing();
		int[] arr = { 5, 6, 7, 8, 9 };
		System.out.println(obj.countSubArray(arr, 2));

	}

	public int maxAscendingSum(int[] nums) {
		int last = nums[0];
		int sum = 0, max = Integer.MIN_VALUE;
		for (int idx = 1; idx < nums.length; idx++) {
			if (last < nums[idx]) {
				sum += nums[idx];
			}
			if (sum > max) {
				max = sum;
			}
			last = nums[idx];
		}

		return max;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		int sum = 0, carry = 0;

		while (l1 != null || l2 != null) {
			int val1 = l1 == null ? 0 : l1.val;
			int val2 = l2 == null ? 0 : l2.val;
			sum = val1 + val2 + carry;
			carry = sum / 10;
			curr.next = new ListNode(sum);
			curr = curr.next;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}

		return dummy.next;
	}

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		return result;
	}

	public int countNegatives(int[][] grid) {

		int m = grid.length, n = grid[0].length, r = m - 1, c = 0, cnt = 0;
		while (r >= 0 && c < n) {
			if (grid[r][c] < 0) {
				--r;
				cnt += n - c; // there are n - c negative numbers in current row.
			} else {
				++c;
			}
		}
		return cnt;
	}

	private TreeNode result = null;

	public TreeNode searchBST(TreeNode root, int val) {
		bstSearch(root, val);
		return result;
	}

	private void bstSearch(TreeNode root, int val) {
		if (root == null)
			return;
		if (root.val == val) {
			result = new TreeNode(val);
			result.left = root.left;
			result.right = root.right;
		}
		bstSearch(root.left, val);
		bstSearch(root.right, val);
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

	public String largestOddNumber(String num) {

		for (int i = num.length() - 1; i >= 0; i--) {
			if ((num.charAt(i) - '0') % 2 != 0) {
				return num.substring(0, i + 1);
			}
		}
		return "";

	}

	class LRUCache {
		private Deque<Integer> queue;
		private int capacity;
		private Map<Integer, Integer> map;

		public LRUCache(int capacity) {
			this.queue = new LinkedList<>();
			this.capacity = capacity;
			map = new HashMap<>();
		}

		public int get(int key) {
			if (!map.containsKey(key)) {
				return -1;
			}
			int value = map.get(key);
			queue.remove(value);
			map.remove(key);
			queue.addFirst(value);
			return value;
		}

		public void put(int key, int value) {
			if (map.containsKey(key)) {
				queue.remove(map.get(key));
				map.remove(key);
			} else {
				if (capacity == queue.size()) {
					int temp = queue.removeLast();
					map.remove(temp);
				}
			}
			queue.addFirst(value);
			map.put(key, value);
		}
	}

	public boolean validPalindrome(String s) {

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
		while (start < end && start < s.length() && end >= 0) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			++start;
			--end;
		}
		return true;
	}

	public int mySqrt(int x) {

		int low = 1, high = x;
		int result = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (mid <= x / mid) {
				low = mid + 1;
				result = mid;
			} else {
				high = mid - 1;
			}
		}

		return result;
	}

	public int strStr(String haystack, String needle) {

		for (int i = 0; (i + needle.length()) < haystack.length(); i++) {
			if (haystack.substring(0, i + needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
		for (ListNode node : lists) {
			if (node != null) {
				pq.offer(node);
			}
		}
		ListNode dummyNode = new ListNode(0);
		ListNode curr = dummyNode;
		while (!pq.isEmpty()) {
			ListNode temp = pq.poll();
			curr.next = temp;
			curr = curr.next;
			if (temp.next != null) {
				pq.offer(temp.next);
			}
		}

		return dummyNode.next;
	}

	public int longestSubstring(String s, int k) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			Integer val = map.getOrDefault(s.charAt(i), 0);
			map.put(s.charAt(i), val + 1);
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) >= k) {
				builder.append(s.charAt(i));
			}
		}

		return builder.toString().length();
	}

	// 5,3,5,7,8 k=3
	public int countSubArray(int[] arr, int k) {
		int count = 0, result = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				count++;
			} else {
				if (count + 1 >= k) {
					result += count - k + 2;
					count = 0;
				}
			}
		}
		if (count + 1 >= k) {
			result += count - k + 2;
		}
		return result;
	}

	public int maxPathSum(TreeNode root) {

		return 0;
	}

	public ListNode reverseBetween(ListNode head, int left, int right) {
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

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		Map<Integer, List<Integer>> map = new HashMap<>();
		buildGraph(numCourses, prerequisites, map);
		int[] visited = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			if (!dfs(i, numCourses, map, visited)) {
				return false;
			}
		}

		return true;
	}

	private boolean dfs(int i, int numCourses, Map<Integer, List<Integer>> map, int[] visited) {
		if (visited[i] == -1)
			return false;
		if (visited[i] == 1)
			return true;
		visited[i] = -1;
		if (map.containsKey(i)) {
			for (int val : map.get(i)) {
				if (!dfs(val, numCourses, map, visited)) {
					return false;
				}

			}
		}
		visited[i] = 1;
		return true;
	}

	private void buildGraph(int numCourses, int[][] prerequisites, Map<Integer, List<Integer>> map) {
		for (int i = 0; i < numCourses; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int[] arr : prerequisites) {
			map.get(arr[1]).add(arr[0]);
		}
	}
}
