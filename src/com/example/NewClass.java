package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.ietf.jgss.Oid;

public class NewClass {
	public static void main(String[] args) {
		NewClassImplementation obj = new NewClassImplementation();

		// System.out.println(obj.partition("aab").toString());
		// System.out.println(3 + 4 + "parth" + 4);

//		int[] arr = { 1, 2, 3 };
//		// obj.nextPermutation(arr);
//		obj.permute(arr);
//		int[] result = arr;
		// int[] arr = { 3, 30, 34, 5, 9 };
		// System.out.println(obj.largestNumber(arr));
		// int[] gas = { 1, 2, 3, 4, 5 };
		// int[] cost = { 3, 4, 5, 1, 2 };
		// System.out.println(obj.canCompleteCircuit(gas, cost));

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		obj.rotate(arr);

	}
}

class NewClassImplementation {

	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		Map<Integer, Integer> map = new HashMap();
		for (int d : D)
			map.put(d, map.getOrDefault(d, 0) + 1);
		int count = 0;
		for (int a : A)
			for (int b : B)
				for (int c : C)
					count += map.getOrDefault(-(a + b + c), 0);
		return count;
	}

	class Solution1 {

		public void gameOfLife(int[][] board) {

			// Neighbors array to find 8 neighboring cells for a given cell
			int[] neighbors = { 0, 1, -1 };

			int rows = board.length;
			int cols = board[0].length;

			// Create a copy of the original board
			int[][] copyBoard = new int[rows][cols];

			// Create a copy of the original board
			for (int row = 0; row < rows; row++) {
				for (int col = 0; col < cols; col++) {
					copyBoard[row][col] = board[row][col];
				}
			}

			// Iterate through board cell by cell.
			for (int row = 0; row < rows; row++) {
				for (int col = 0; col < cols; col++) {

					// For each cell count the number of live neighbors.
					int liveNeighbors = 0;

					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {

							if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
								int r = (row + neighbors[i]);
								int c = (col + neighbors[j]);

								// Check the validity of the neighboring cell.
								// and whether it was originally a live cell.
								// The evaluation is done against the copy, since that is never updated.
								if ((r < rows && r >= 0) && (c < cols && c >= 0) && (copyBoard[r][c] == 1)) {
									liveNeighbors += 1;
								}
							}
						}
					}

					// Rule 1 or Rule 3
					if ((copyBoard[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
						board[row][col] = 0;
					}
					// Rule 4
					if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
						board[row][col] = 1;
					}
				}
			}
		}
	}

	class MedianFinder {

		private PriorityQueue<Integer> maxHeap = null;
		private PriorityQueue<Integer> minHeap = null;
		private double median = Double.MAX_VALUE;

		/** initialize your data structure here. */
		public MedianFinder() {
			maxHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);
			minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
		}

		public void addNum(int num) {
			if (num <= median) {
				maxHeap.offer(num);
			} else {
				minHeap.offer(num);
			}
			int len1 = maxHeap.size();
			int len2 = minHeap.size();
			if (Math.abs(len2 - len1) > 1) {
				if (len1 > len2) {
					minHeap.offer(maxHeap.poll());
				} else {
					maxHeap.offer(minHeap.poll());
				}
			}
			if (len1 == len2) {
				median = (maxHeap.peek() + minHeap.peek()) / 2d;
			} else {
				if (len1 > len2) {
					median = maxHeap.peek();
				} else {
					median = minHeap.peek();
				}
			}

		}

		public double findMedian() {
			return median;
		}
	}

	class MedianFinder1 {

		PriorityQueue<Integer> maxHeap = null;
		PriorityQueue<Integer> minHeap = null;
		private double median = Double.MAX_VALUE;

		/** initialize your data structure here. */
		public MedianFinder1() {
			maxHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);
			minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
		}

		// 10 , 15, 20 , 30 , 40
		public void addNum(int num) {
			if (num <= median) {
				maxHeap.offer(num);
			} else
				minHeap.offer(num);
			int len1 = maxHeap.size();
			int len2 = minHeap.size();

			if (Math.abs(len1 - len2) > 1) {
				// rebalance
				if (len1 > len2) {
					minHeap.offer(maxHeap.poll());
				} else
					maxHeap.offer(minHeap.poll());
			}
			len1 = maxHeap.size();
			len2 = minHeap.size();

			if (len1 == len2) {
				median = (minHeap.peek() + maxHeap.peek()) / (double) 2;
			} else {
				if (len1 > len2)
					median = maxHeap.peek();
				else
					median = minHeap.peek();
			}

		}

		public double findMedian() {
			return median;
		}
	}

	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0)
			return null;
		Map<String, List<String>> map = new HashMap<>();
		for (String st : strs) {
			char[] c = st.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			List<String> list = map.get(key);
			if (list == null) {
				list = new ArrayList<>();
			}
			list.add(st);
			map.put(key, list);
		}

		return new ArrayList<>(map.values());
	}

	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;
		int start = 0;
		int max = Integer.MIN_VALUE;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				if (set.size() > max) {
					max = set.size();
				}
			} else {
				while (s.charAt(start) != s.charAt(i)) {
					set.remove(s.charAt(start));
					start++;

				}
				start++;
			}
		}

		return max;
	}

	public boolean canJump(int[] nums) {
		return canJump(0, nums);
	}

	private boolean canJump(int pos, int[] nums) {

		if (nums.length - 1 >= pos) {
			return true;
		}
		int max = Math.min(pos + nums[pos], nums.length - 1);
		for (int i = max; i >= pos + 1; i--) {
			if (canJump(i, nums)) {
				return true;
			}
		}

		return false;
	}

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int index = -1;
		for (int i = 1; i < gas.length; i++) {
			int val = gas[i - 1] - cost[i - 1];
			if (gas[i] <= val) {
				index = i - 1;
			}
		}
		int total = 0;
		for (int i = index; i < index + gas.length; i++) {
			int idx = i % gas.length;
			total += gas[idx] = cost[idx];
			if (total < 0)
				return -1;
		}

		return index;
	}

	public int canCompleteCircuit1(int[] gas, int[] cost) {
		int numStations = gas.length;
		int minGas = 0;
		int startIdx = 0;
		int milesRem = 0;
		for (int i = 1; i < numStations; i++) {
			int prevCost = cost[i - 1];
			int gasFilled = gas[i - 1];
			milesRem += gasFilled - prevCost;
			if (milesRem < minGas) {
				minGas = milesRem;
				startIdx = i;
			}
		}
		int tank = 0;
		for (int i = startIdx; i < startIdx + numStations; i++) {
			int idxRotated = i % numStations;
			tank += gas[idxRotated] - cost[idxRotated];
			if (tank < 0)
				return -1;
		}
		return startIdx;

	}

	public boolean isMatch(String s, String p) {

		boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];

		for (int i = 0; i <= p.length(); i++) {
			for (int j = 0; j <= s.length(); j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false;
				} else if (j == 0) {
					if (i - 1 >= 0 && p.charAt(i - 1) == '*') {
						dp[i][j] = dp[i - 1][j];
					}
				} else {
					if (p.charAt(i - 1) == s.charAt(j - 1) || p.charAt(i - 1) == '?') {
						dp[i][j] = dp[i - 1][j - 1];
					} else if (p.charAt(i - 1) == '*') {
						dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
					}
				}
			}
		}
		return dp[p.length()][s.length()];

	}

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	public Node copyRandomList(Node head) {
		Map<Node, Node> map = new HashMap<Node, Node>();
		Node temp = head;
		while (temp != null) {
			map.put(temp, new Node(temp.val));
			temp = temp.next;
		}

		temp = head;
		while (temp != null) {
			Node clone = map.get(temp);
			clone.next = map.get(temp.next);
			clone.random = map.get(temp.random);
			temp = temp.next;
		}
		return map.get(head);
	}

	public ListNode sortList(ListNode head) {
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

	public int longestIncreasingPath(int[][] matrix) {

		int[][] cache = new int[matrix.length][matrix[0].length];
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				int len = maxLen(i, j, -1, matrix, cache);
				result = Math.max(result, len);
			}
		}
		return result;
	}

	private int maxLen(int i, int j, int k, int[][] matrix, int[][] cache) {
		if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || k >= matrix[i][j]) {
			return 0;
		}
		if (cache[i][j] > 0) {
			return cache[i][j];
		}
		int up = maxLen(i + 1, j, matrix[i][j], matrix, cache);
		int down = maxLen(i - 1, j, matrix[i][j], matrix, cache);
		int left = maxLen(i, j - 1, matrix[i][j], matrix, cache);
		int right = maxLen(i, j + 1, matrix[i][j], matrix, cache);
		int result = Math.max(Math.max(up, down), Math.max(left, right)) + 1;

		cache[i][j] = result;

		return result;
	}

	class TrieNode {
		Map<Character, TrieNode> child;
		String word;

		public TrieNode() {
			word = null;
			child = new HashMap();
		}
	}

	List<String> res;
	int M, N;

	public List<String> findWords(char[][] board, String[] words) {
		// root Node of trie
		TrieNode root = new TrieNode();
		this.M = board.length;
		this.N = board[0].length;

		res = new ArrayList();

		for (String w : words)
			insert(root, w);

		TrieNode node = root;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				node = hasPrefix(node, board[i][j]);
				if (node != null) {
					boolean[][] visited = new boolean[M][N];
					dfs(board, visited, i, j, root);
				}
				node = root;
			}
		}

		return res;
	}

	public void insert(TrieNode root, String word) {
		if (word == null)
			return;

		TrieNode cur = root;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			cur.child.putIfAbsent(c, new TrieNode());
			cur = cur.child.get(c);
		}

		cur.word = word;
	}

	public TrieNode hasPrefix(TrieNode node, char c) {
		return node.child.getOrDefault(c, null);
	}

	public boolean dfs(char[][] board, boolean[][] visited, int i, int j, TrieNode node) {
		if (i < 0 || i >= M || j < 0 || j >= N || visited[i][j]) {
			return false;
		}

		visited[i][j] = true;
		TrieNode curnode = hasPrefix(node, board[i][j]);

		if (curnode == null) {
			visited[i][j] = false;
			return false;
		}

		if (curnode.word != null) {
			res.add(curnode.word);
			curnode.word = null;
		}

		boolean result = dfs(board, visited, i + 1, j, curnode) || dfs(board, visited, i - 1, j, curnode)
				|| dfs(board, visited, i, j + 1, curnode) || dfs(board, visited, i, j - 1, curnode);

		visited[i][j] = false;
		return result;

	}

	class TrieNode1 {

		// R links to node children
		private TrieNode[] links;

		private final int R = 26;

		private boolean isEnd;

		public TrieNode1() {
			links = new TrieNode[R];
		}

		public boolean containsKey(char ch) {
			return links[ch - 'a'] != null;
		}

		public TrieNode get(char ch) {
			return links[ch - 'a'];
		}

		public void put(char ch, TrieNode node) {
			links[ch - 'a'] = node;
		}

		public void setEnd() {
			isEnd = true;
		}

		public boolean isEnd() {
			return isEnd;
		}
	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		if (numCourses == 0 || prerequisites == null || prerequisites.length == 0)
			return true;

		HashMap<Integer, List<Integer>> adjList = new HashMap<>();
		buildGraph(numCourses, prerequisites, adjList);
		int[] visited = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			if (!searchingusingDFS(i, visited, adjList))
				return false;
		}
		return false;
	}

	private boolean searchingusingDFS(int i, int[] visited, HashMap<Integer, List<Integer>> adjList) {

		if (visited[i] == -1)
			return false;
		if (visited[i] == 1)
			return true;

		visited[i] = -1;

		// Explore DEPTH
		if (adjList.containsKey(i)) {
			for (Integer node : adjList.get(i))
				if (!searchingusingDFS(node, visited, adjList))
					return false;
		}
		// Done visiting, now set in case multiple prereqs
		visited[i] = 1;
		return true;

	}

	private void buildGraph(int numCourses, int[][] prerequisites, HashMap<Integer, List<Integer>> adjList) {
		for (int i = 0; i < numCourses; i++) {
			adjList.put(i, new ArrayList<>());
		}
		for (int[] pre : prerequisites) {
			adjList.get(pre[1]).add(pre[0]);
		}
	}

	public void xxxx() {
		int[] ints = { -1, 8, 6, 0, 7, 3, 8, 9, -1, 6, 1 };
		int max = 1;
		int arrLen = ints.length;
		for (int i = 0; i < ints.length; i++) {
			int a = i;
			int counter = 1;
			while (ints[a] > -1 && ints[a] < arrLen && counter < arrLen) {
				a = ints[a];
				counter++;
			}

			if (counter > max)
				max = counter;
		}
		System.out.println(max);
		// return max;
	}

	public boolean canJump1(int[] nums) {

		int lastPos = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i + nums[i] >= lastPos) {
				lastPos = i;
			}
		}
		return lastPos == 0;
	}

	public boolean canJumpFromPosition(int position, int[] nums) {
		if (position == nums.length - 1) {
			return true;
		}

		int furthestJump = Math.min(position + nums[position], nums.length - 1);
		for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
			if (canJumpFromPosition(nextPosition, nums)) {
				return true;
			}
		}

		return false;
	}

	public boolean canJump12(int[] nums) {
		return canJumpFromPosition(0, nums);
	}

	public class Solution3 {
		public int lengthOfLIS(int[] nums) {
			if (nums.length == 0) {
				return 0;
			}
			int[] dp = new int[nums.length];
			dp[0] = 1;
			int maxans = 1;
			for (int i = 1; i < dp.length; i++) {
				int maxval = 0;
				for (int j = 0; j < i; j++) {
					if (nums[i] > nums[j]) {
						maxval = Math.max(maxval, dp[j]);
					}
				}
				dp[i] = maxval + 1;
				maxans = Math.max(maxans, dp[i]);
			}
			return maxans;
		}
	}

	public int lengthOfLIS(int[] nums) {
		int memo[][] = new int[nums.length + 1][nums.length];
		for (int[] l : memo) {
			Arrays.fill(l, -1);
		}
		return lengthofLIS(nums, -1, 0, memo);
	}

	public int lengthofLIS(int[] nums, int previndex, int curpos, int[][] memo) {
		if (curpos == nums.length) {
			return 0;
		}
		if (memo[previndex + 1][curpos] >= 0) {
			return memo[previndex + 1][curpos];
		}
		int taken = 0;
		if (previndex < 0 || nums[curpos] > nums[previndex]) {
			taken = 1 + lengthofLIS(nums, curpos, curpos + 1, memo);
		}

		int nottaken = lengthofLIS(nums, previndex, curpos + 1, memo);
		memo[previndex + 1][curpos] = Math.max(taken, nottaken);
		return memo[previndex + 1][curpos];
	}

	public int lengthOfLIS1(int[] nums) {
		return lengthofLIS(nums, Integer.MIN_VALUE, 0);
	}

	public int lengthofLIS(int[] nums, int prev, int curpos) {
		if (curpos == nums.length) {
			return 0;
		}
		int taken = 0;
		if (nums[curpos] > prev) {
			taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
		}
		int nottaken = lengthofLIS(nums, prev, curpos + 1);
		return Math.max(taken, nottaken);
	}

	public int[] searchRange1(int[] nums, int target) {

		int[] result = new int[2];
		result[0] = binarySearchIndex(nums, target, true);
		result[1] = binarySearchIndex(nums, target, false);
		return result;

	}

	private int binarySearchIndex(int[] nums, int key, boolean flag) {

		int low = 0;
		int index = -1;
		int high = nums.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > key) {
				high = mid - 1;
			} else if (nums[mid] > key) {
				low = mid + 1;
			} else {
				index = mid;
				if (flag) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return index;
	}

	int trap2(int[] height) {
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

	public int trap1(int[] height) {
		if (height == null || height.length == 0)
			return 0;

		return 0;
	}

	class Solution {
		public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
			if (words1.length != words2.length) {
				return false;
			}
			// Build the graph of pairs
			HashMap<String, Set<String>> pairMap = new HashMap<>();
			for (String[] pair : pairs) {
				// Create keys(words in [][]pairs without duplication) and empty set
				if (!pairMap.containsKey(pair[0])) {
					pairMap.put(pair[0], new HashSet<String>());
				}
				if (!pairMap.containsKey(pair[1])) {
					pairMap.put(pair[1], new HashSet<String>());
				}
				// Add the corresponding pairs to each other
				pairMap.get(pair[0]).add(pair[1]);
				pairMap.get(pair[1]).add(pair[0]);
			}

			// Iterate throught each word in both input strings and do DFS search
			for (int i = 0; i < words1.length; i++) {
				// If same, then we don't need to do DFS search
				if (words1[i].equals(words2[i]))
					continue;
				// If they are not the same and no such strings in the pairs
				if (!pairMap.containsKey(words1[i]) || !pairMap.containsKey(words2[i]))
					return false;
				// Do DFS search, initialize the set to prevent revisiting.
				if (!dfs(words1[i], words2[i], pairMap, new HashSet<>()))
					return false;
			}
			return true;
		}

		public boolean dfs(String source, String target, HashMap<String, Set<String>> pairMap,
				HashSet<String> visited) {
			if (pairMap.get(source).contains(target)) {
				return true;
			}
			// Mark as visited
			visited.add(source);
			for (String next : pairMap.get(source)) {
				// DFS other connected node, except the mirrowed string
				if (!visited.contains(next) && next.equals(target)
						|| !visited.contains(next) && dfs(next, target, pairMap, visited)) {
					return true;
				}
			}
			// We've done dfs still can't find the target
			return false;
		}
	}

	List<String> list = new ArrayList<>();

	public List<String> generateParenthesis(int n) {
		generate("", 0, n);
		return list;
	}

	private void generate(String s, int pos, int n) {
		if (pos == n) {
			if (isValid(s)) {
				list.add(s);
			}
		} else {
			s += "(";
			generate(s, pos + 1, n);
			s += ")";
			generate(s, pos + 1, n);
		}

	}

	private boolean isValid(String s) {
		char[] current = s.toCharArray();
		int count = 0;
		for (char c : current) {
			if (c == '(')
				count++;
			else
				count--;
			if (count < 0)
				return false;
		}
		return count == 0;
	}

	public int[] maxSlidingWindow(int[] nums, int k) {

		int n = nums.length;
		int[] arr = new int[n];
		arr[n - 1] = n;

		Stack<Integer> st = new Stack<>();
		st.push(n - 1);

		for (int i = n - 2; i >= 0; --i) {
			while (!st.empty() && nums[st.peek()] <= nums[i])
				st.pop();
			arr[i] = st.empty() ? n : st.peek();
			st.push(i);
		}

		return arr;
	}

	public int[] maxSlidingWindow1(int[] nums, int k) {
		List<Integer> list = new ArrayList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < k; i++)
			map.put(nums[i], i);
		list.add(map.lastKey());
		for (int i = k; i < nums.length; i++) {
			if (map.get(nums[i - k]) == i - k)
				map.remove(nums[i - k]);
			map.put(nums[i], i);

			// res[i - k + 1] = map.lastKey();
		}

		return null;
	}

	public int longestSubstring(String s, int k) {
		char[] str = s.toCharArray();
		int[] countMap = new int[26];
		int maxUnique = getMaxUniqueLetters(s);
		int result = 0;
		for (int currUnique = 1; currUnique <= maxUnique; currUnique++) {
			// reset countMap
			Arrays.fill(countMap, 0);
			int windowStart = 0, windowEnd = 0, idx = 0, unique = 0, countAtLeastK = 0;
			while (windowEnd < str.length) {
				// expand the sliding window
				if (unique <= currUnique) {
					idx = str[windowEnd] - 'a';
					if (countMap[idx] == 0)
						unique++;
					countMap[idx]++;
					if (countMap[idx] == k)
						countAtLeastK++;
					windowEnd++;
				}
				// shrink the sliding window
				else {
					idx = str[windowStart] - 'a';
					if (countMap[idx] == k)
						countAtLeastK--;
					countMap[idx]--;
					if (countMap[idx] == 0)
						unique--;
					windowStart++;
				}
				if (unique == currUnique && unique == countAtLeastK)
					result = Math.max(windowEnd - windowStart, result);
			}
		}

		return result;
	}

	// get the maximum number of unique letters in the string s
	int getMaxUniqueLetters(String s) {
		boolean map[] = new boolean[26];
		int maxUnique = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!map[s.charAt(i) - 'a']) {
				maxUnique++;
				map[s.charAt(i) - 'a'] = true;
			}
		}
		return maxUnique;
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

	public List<String> letterCombinations(String digits) {
		if (digits.length() != 0)
			backtracing("", digits);
		return output;
	}

	private void backtracing(String combi, String digits) {
		if (digits.length() == 0)
			output.add(combi);
		else {
			String letters = phone.get(digits.substring(0, 1));
			for (int i = 0; i < letters.length(); i++) {
				String letter = phone.get(digits.substring(0, 1)).substring(i, i + 1);
				backtracing(combi + letter, digits.substring(1));
			}
		}

	}

	public void backtrack1(String combination, String next_digits) {
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
				backtrack1(combination + letter, next_digits.substring(1));
			}
		}
	}

	public List<String> letterCombinations1(String digits) {
		if (digits.length() != 0)
			backtrack1("", digits);
		return output;
	}

	public List<Integer> spiralOrder1(int[][] matrix) {
		List ans = new ArrayList();
		if (matrix.length == 0)
			return ans;
		int R = matrix.length, C = matrix[0].length;
		boolean[][] seen = new boolean[R][C];
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int r = 0, c = 0, di = 0;
		for (int i = 0; i < R * C; i++) {
			ans.add(matrix[r][c]);
			seen[r][c] = true;
			int cr = r + dr[di];
			int cc = c + dc[di];
			if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]) {
				r = cr;
				c = cc;
			} else {
				di = (di + 1) % 4;
				r += dr[di];
				c += dc[di];
			}
		}
		return ans;
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List ans = new ArrayList();
		if (matrix.length == 0)
			return ans;
		int r1 = 0, r2 = matrix.length - 1;
		int c1 = 0, c2 = matrix[0].length - 1;
		while (r1 <= r2 && c1 <= c2) {
			for (int c = c1; c <= c2; c++)
				ans.add(matrix[r1][c]);
			for (int r = r1 + 1; r <= r2; r++)
				ans.add(matrix[r][c2]);
			if (r1 < r2 && c1 < c2) {
				for (int c = c2 - 1; c > c1; c--)
					ans.add(matrix[r2][c]);
				for (int r = r2; r > r1; r--)
					ans.add(matrix[r][c1]);
			}
			r1++;
			r2--;
			c1++;
			c2--;
		}
		return ans;
	}

	/*
	 * Input: nums = [1,5,1,1,6,4] Output: [1,6,1,5,1,4] Explanation: [1,4,1,5,1,6]
	 * is also accepted.
	 */
	public void wiggleSort(int[] nums) {

		Arrays.sort(nums);
		int[] arr = new int[nums.length];
		int i = 1, j = nums.length - 1;
		while (i < nums.length) { // put largest at odd index
			arr[i] = nums[j--];
			i = i + 2;
		}
		i = 0;
		while (i < nums.length) { // put remaining large index from starting
			arr[i] = nums[j--];
			i = i + 2;
		}
		for (i = 0; i < nums.length; i++)
			nums[i] = arr[i];

	}

	public void gameOfLife(int[][] board) {

		int rows = board.length;
		int cols = board[0].length;

		// Iterate through board cell by cell.
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {

				int liveNeighbors = liveNeighbour(board, row, col);
				// Rule 1 or Rule 3
				if ((board[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
					// -1 signifies the cell is now dead but originally was live.
					board[row][col] = -1;
				}
				// Rule 4
				if (board[row][col] == 0 && liveNeighbors == 3) {
					// 2 signifies the cell is now live but was originally dead.
					board[row][col] = 2;
				}
			}
		}
	}

	private int liveNeighbour(int[][] board, int row, int column) {

		int liveNeighbour = 0;

		if (row + 1 > board.length && board[row + 1][column] == 1) {
			liveNeighbour++;
		}
		if (column + 1 > board.length && board[row][column + 1] == 1) {
			liveNeighbour++;
		}
		if (row - 1 > -1 && board[row - 1][column] == 1) {
			liveNeighbour++;
		}
		if (column - 1 > -1 && board[row][column - 1] == 1) {
			liveNeighbour++;
		}
		if ((row + 1 > board.length) && (column + 1 > board[0].length) && board[row + 1][column + 1] == 1) {
			liveNeighbour++;
		}
		if ((row - 1 > -1) && (column + 1 > board[0].length) && board[row - 1][column + 1] == 1) {
			liveNeighbour++;
		}

		if ((row + 1 > board.length) && (column - 1 > -1) && board[row + 1][column + 1] == 1) {
			liveNeighbour++;
		}

		return liveNeighbour;

	}

	public void gameOfLife11(int[][] board) {

		// Neighbors array to find 8 neighboring cells for a given cell
		int[] neighbors = { 0, 1, -1 };

		int rows = board.length;
		int cols = board[0].length;

		// Iterate through board cell by cell.
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {

				// For each cell count the number of live neighbors.
				int liveNeighbors = 0;

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
							int r = (row + neighbors[i]);
							int c = (col + neighbors[j]);

							// Check the validity of the neighboring cell.
							// and whether it was originally a live cell.
							if ((r < rows && r >= 0) && (c < cols && c >= 0) && (Math.abs(board[r][c]) == 1)) {
								liveNeighbors += 1;
							}
						}
					}
				}

				// Rule 1 or Rule 3
				if ((board[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
					// -1 signifies the cell is now dead but originally was live.
					board[row][col] = -1;
				}
				// Rule 4
				if (board[row][col] == 0 && liveNeighbors == 3) {
					// 2 signifies the cell is now live but was originally dead.
					board[row][col] = 2;
				}
			}
		}

		// Get the final representation for the newly updated board.
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (board[row][col] > 0) {
					board[row][col] = 1;
				} else {
					board[row][col] = 0;
				}
			}
		}
	}

	public List<List<String>> groupAnagrams1(String[] strs) {
		if (strs.length == 0)
			return new ArrayList();
		Map<String, List> ans = new HashMap<String, List>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key))
				ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}

	private class LargerNumberComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			String order1 = a + b;
			String order2 = b + a;
			return order2.compareTo(order1);
		}
	}

	public String largestNumber(int[] nums) {
		// Get input integers as strings.
		String[] asStrs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			asStrs[i] = String.valueOf(nums[i]);
		}

		// Sort strings according to custom comparator.
		Arrays.sort(asStrs, new LargerNumberComparator());

		// If, after being sorted, the largest number is `0`, the entire number
		// is zero.
		if (asStrs[0].equals("0")) {
			return "0";
		}

		// Build largest number from sorted array.
		String largestNumberStr = new String();
		for (String numAsStr : asStrs) {
			largestNumberStr += numAsStr;
		}

		return largestNumberStr;
	}

	public List<String> generateParenthesis122(int n) {
		List<String> ans = new ArrayList();
		backtrack(ans, "", 0, 0, n);
		return ans;
	}

	public void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}

		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);
	}

	public List<String> generateParenthesis123(int n) {
		List<String> ans = new ArrayList();
		if (n == 0) {
			ans.add("");
		} else {
			for (int c = 0; c < n; ++c)
				for (String left : generateParenthesis(c))
					for (String right : generateParenthesis(n - 1 - c))
						ans.add("(" + left + ")" + right);
		}
		return ans;
	}

	public List<String> generateParenthesis1(int n) {
		List<String> combinations = new ArrayList();
		generate(new char[2 * n], 0, combinations);
		return combinations;

	}

	private void generate(char[] current, int pos, List<String> combinations) {
		if (pos == current.length) {
			if (valid(current)) {
				combinations.add(new String(current));
			}
		} else {
			current[pos] = '(';
			generate(current, pos + 1, combinations);
			current[pos] = ')';
			generate(current, pos + 1, combinations);
		}

	}

	private boolean valid(char[] current) {
		int count = 0;
		for (char c : current) {
			if (c == '(')
				count++;
			else
				count--;
			if (count < 0)
				return false;
		}
		return count == 0;
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtracking(nums, result, new ArrayList<>());
		return result;
	}

	private void backtracking(int[] nums, List<List<Integer>> result, ArrayList<Integer> answer) {
		if (answer.size() == nums.length) {
			result.add(new ArrayList(answer));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (answer.contains(nums[i]))
				continue;
			answer.add(nums[i]);
			backtracking(nums, result, answer);
			answer.remove(answer.size() - 1);
		}
	}

	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				slow = head;
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}

		return null;

	}

	int sum = 0;

	public int sumEvenGrandparent(TreeNode root) {
		preOrderTraversal(root);
		return sum;
	}

	public void preOrderTraversal(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return;
		if (root.val % 2 == 0) {
			if (root.left != null) {
				if (root.left.left != null)
					sum = sum + root.left.left.val;
				if (root.left.right != null) {
					sum = sum + root.left.right.val;
				}
			}
			if (root.right != null) {
				if (root.right.left != null)
					sum = sum + root.right.left.val;
				if (root.right.right != null) {
					sum = sum + root.right.right.val;
				}
			}
		}

		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}

	public void nextPermutation(int[] nums) {
		int i = nums.length - 2;
		while (i >= 0 && nums[i + 1] <= nums[i]) {
			i--;
		}
		if (i >= 0) {
			int j = nums.length - 1;
			while (j >= 0 && nums[j] <= nums[i]) {
				j--;
			}
			swap(nums, i, j);
		}
		reverse(nums, i + 1);
	}

	private void reverse(int[] nums, int start) {
		int i = start, j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		serializeHelper(root, sb);
		return sb.toString();
	}

	private void serializeHelper(TreeNode root, StringBuilder sb) {
		if (root == null) {
			sb.append("," + "#");
			return;
		}
		if (sb.length() == 0) {
			sb.append(Integer.toString(root.val));
		} else {
			sb.append("," + Integer.toString(root.val));
		}
		serializeHelper(root.left, sb);
		serializeHelper(root.right, sb);
	}

	private TreeNode deserializeHelper(List<String> list) {
		if (list.isEmpty()) {
			return null;
		}
		if (list.get(list.size() - 1).equals("#")) {
			// poping from the tail of the list, O(1) time complexity
			list.remove(list.size() - 1);
			return null;
		}
		TreeNode root = new TreeNode(Integer.valueOf(list.remove(list.size() - 1)));
		root.left = deserializeHelper(list);
		root.right = deserializeHelper(list);
		return root;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if (data == null) {
			return null;
		}
		String[] array = data.split(",");
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		// we need to reverse list inorder to have O(1) time for poping from the tail of
		// the list
		Collections.reverse(list);
		TreeNode root = deserializeHelper(list);
		return root;

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> set = new HashSet<>();
		for (String str : wordList) {
			set.add(str);
		}
		if (!set.contains(endWord)) {
			return 0;
		}
		Set<String> list = new HashSet<>();
		list.add(beginWord);
		list.add(endWord);
		for (String str : wordList) {
			if (isValidString(str, beginWord) || isValidString(str, endWord)) {
				list.add(str);
			}
		}
		if (list.size() > 2)
			return list.size();

		return 0;
	}

	private boolean isValidString(String str, String word) {
		int i = 0, count = 0;
		if (str.equals(word))
			return true;
		if (str.length() > 1) {
			while (i < str.length()) {
				if (str.charAt(i) != word.charAt(i)) {
					count++;
				}
				i++;
			}
			if (count > 1)
				return false;
			return true;
		} else {
			if (str.equals(word))
				return true;
			return false;
		}
	}

	public List<List<Integer>> verticalTraversal(TreeNode root) {

		return null;
	}

	int maxVal = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		calculateSum(root);
		return maxVal;
	}

	private void calculateSum(TreeNode root) {
		if (root == null) {
			return;
		}
		int sum = root.val;
		sum += root.left == null ? 0 : root.left.val;
		sum += root.right == null ? 0 : root.right.val;
		if (maxVal < sum) {
			maxVal = sum;
		}
		calculateSum(root.left);
		calculateSum(root.right);

	}

	/*
	 * preorder = [3,9,20,15,7] inorder = [9,3,15,20,7]
	 */

//	inorder = [9,3,15,20,7]
//	postorder = [9,15,7,20,3]

	Map<Integer, Integer> hm = new HashMap<>();

	private TreeNode buildBinaryTree(int[] postorder, int[] inorder, int start, int end, int index) {
		if (start > end)
			return null;
		TreeNode root = new TreeNode(postorder[index]);
		int inIndex = hm.get(root.val);
		root.left = buildBinaryTree(postorder, inorder, start, inIndex - 1, index - 1);
		root.right = buildBinaryTree(postorder, inorder, inIndex + 1, end, index - (inIndex - start + 1));
		return root;
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		for (int i = 0; i < inorder.length; i++)
			hm.put(inorder[i], i);
		return buildBinaryTree(postorder, inorder, 0, inorder.length - 1, inorder.length - 1);
	}

	public TreeNode buildTree1(int[] preorder, int[] inorder) {
		return buildBinaryTree1(preorder, inorder, 0, inorder.length - 1, 0);
	}

	private TreeNode buildBinaryTree1(int[] preorder, int[] inorder, int start, int end, int index) {
		if (start > end)
			return null;
		TreeNode root = new TreeNode(preorder[index]);
		int startLeft = 0;
		for (int i = 0; i < inorder.length; i++) {
			if (root.val == inorder[i]) {
				startLeft = i - 1;
				break;
			}
		}

		root.left = buildBinaryTree(preorder, inorder, start, startLeft, index + 1);
		root.right = buildBinaryTree(preorder, inorder, startLeft, end, index + startLeft - start + 1);

		return root;
	}

	public List<List<String>> partition(String s) {
		List<List<String>> result = new ArrayList<>();
		dfs(0, result, new ArrayList<>(), s);
		return result;

	}

	public void dfs(int start, List<List<String>> result, List<String> curr, String s) {
		if (start >= s.length())
			result.add(new ArrayList<>(curr));
		for (int i = start; i < s.length(); i++) {
			if (isPalindrom(s, start, i)) {
				curr.add(s.substring(start, i + 1));
				dfs(i + 1, result, curr, s);
				curr.remove(curr.size() - 1);
			}
		}
	}

	private boolean isPalindrom(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low++) != s.charAt(high--)) {
				return false;
			}
		}
		return true;
	}

	public List<Integer> largestValues(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int max = Integer.MIN_VALUE;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode curr = queue.remove();
				max = Math.max(curr.val, max);
				if (curr.left != null)
					queue.add(curr.left);
				if (curr.right != null)
					queue.add(curr.right);
			}
			result.add(max);
		}

		return result;
	}

	public int maxLevelSum(TreeNode root) {
		if (root == null)
			return 0;
		int max = Integer.MIN_VALUE;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int level = 0, currlevel = 0;
		while (!queue.isEmpty()) {
			int sum = 0;
			int size = queue.size();
			currlevel++;
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				sum += node.val;
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

			}
			if (max < sum) {
				max = sum;
				level = currlevel;
			}
		}
		return level;
	}

	public boolean checkSubarraySum(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return false;
		}

		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				sum += nums[j];
				if (k != 0 && sum % k == 0)
					return true;
				if (k == 0 && sum == 0)
					return true;

			}
		}
		return false;
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;

		if (p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else if (p.val > root.val && q.val > root.val) {
			return lowestCommonAncestor(root.right, p, q);
		} else {
			return root;
		}

	}

	public int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int num : nums) {
			queue.add(num);
			if (queue.size() > k)
				queue.poll();
		}
		return queue.peek();
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		int actualsize = 0;
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		ListNode temp = head;
		while (temp != null) {
			actualsize++;
			temp = temp.next;
		}
		int size = actualsize - n;
		if (size == 0) {
			return head.next;
		} else if (size < 0) {
			return null;
		} else {
			int count = 0;
			while (head != null) {
				if (count != size) {
					curr.next = new ListNode(head.val);
					curr = curr.next;
				}
				head = head.next;
				count++;
			}

		}

		return dummy.next;
	}
}