package in.india;

import java.util.*;
import com.example.TreeNode;

public class Practice150Q {

	public static void main(String[] args) {
		// int[] arr = { 5, 6, 7, 8, 9 };
		Practice150Q obj = new Practice150Q();

		int[][] arr = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(obj.islandPerimeter(arr));
	}

	public int[] solution(int n) {
		int[] A = new int[n];
		for (int i = 0; i < n; ++i)
			A[i] = i * 2 - n + 1;
		return A;
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int size = q.size();
			for (int idx = 0; idx < size; idx++) {
				TreeNode node = q.poll();
				list.add(node.val);
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
			}
			if (list.size() % 2 == 1) {
				Collections.reverse(list);
			}
			result.add(list);
		}
		return result;
	}

	Integer res = Integer.MAX_VALUE, pre = null;

	public int minDiffInBST(TreeNode root) {
		if (root.left != null)
			minDiffInBST(root.left);
		if (pre != null)
			res = Math.min(res, root.val - pre);
		pre = root.val;
		if (root.right != null)
			minDiffInBST(root.right);
		return res;
	}

	private TreeNode previousNode = null;

	public boolean isValidBST(TreeNode root) {
		return validateBST(root);
	}

	private boolean validateBST(TreeNode root) {
		if (root == null)
			return true;
		if (!validateBST(root.left)) {
			return false;
		}
		if (previousNode != null && previousNode.val > root.val) {
			return true;
		}
		previousNode = root;
		return validateBST(root.right);
	}

	public int numDecodings(String s) {

		return 0;
	}

	public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
		int[] output = new int[set1.size()];
		int idx = 0;
		for (Integer s : set1)
			if (set2.contains(s))
				output[idx++] = s;

		return Arrays.copyOf(output, idx);
	}

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (Integer n : nums1)
			set1.add(n);
		HashSet<Integer> set2 = new HashSet<Integer>();
		for (Integer n : nums2)
			set2.add(n);

		if (set1.size() < set2.size())
			return set_intersection(set1, set2);
		else
			return set_intersection(set2, set1);
	}

	public ListNode middleNode(ListNode head) {

		if (head == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}

	public void reverseString(char[] s) {
		if (s == null || s.length == 0)
			return;
		int start = 0;
		int end = s.length - 1;
		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}

	public int minAddToMakeValid(String s) {
		int count = 0;
		Stack<Character> st = new Stack<>();
		for (int idx = 0; idx < s.length(); idx++) {
			if (s.charAt(idx) == '(') {
				st.push(s.charAt(idx));
			} else if (!st.empty()) {
				st.pop();
			} else {
				count++;
			}

		}
		while (!st.empty()) {
			st.pop();
			count++;
		}

		return count;
	}

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		buildGraph(graph, 0, graph.length - 1, list, result);

		return result;
	}

	public void buildGraph(int[][] graph, int start, int end, List<Integer> list, List<List<Integer>> result) {

		if (start > end)
			return;
		if (start == end) {
			result.add(list);
		}
		list.add(start);
		for (int index : graph[start]) {
			List<Integer> copy = new ArrayList<>(list);
			buildGraph(graph, index, end, copy, result);
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		ListNode node = new ListNode(0);
		ListNode dummy = node;
		while (head != null) {
			if (head.val != val) {
				dummy.next = new ListNode(head.val);
				dummy = dummy.next;
			}
			head = head.next;
		}
		return node.next;
	}

	public boolean isLongPressedName(String name, String typed) {

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		for (int id = 0; id < name.length(); id++) {
			int val = map1.getOrDefault(name.charAt(id), 1);
			map1.put(name.charAt(id), val);
		}
		for (int id = 0; id < typed.length(); id++) {
			int val = map2.getOrDefault(typed.charAt(id), 1);
			map2.put(typed.charAt(id), val);
		}
		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {

			int key = entry.getKey();
			int value = entry.getValue();
			if (value > map2.get(key)) {
				return false;
			}
		}

		return true;
	}

	public int islandPerimeter(int[][] grid) {

		int sum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					int val1 = 0, val2 = 0, val3 = 0, val4 = 0;
					if (i + 1 < grid.length) {
						val1 = grid[i + 1][j];
					}
					if (j + 1 < grid[i].length) {
						val2 = grid[i][j + 1];
					}
					if (i - 1 >= 0) {
						val3 = grid[i - 1][j];
					}
					if (j - 1 >= 0) {
						val4 = grid[i][j - 1];
					}
					sum += 4 - val1 - val2 - val3 - val4;
				}
			}
		}
		return sum;
	}

	private TreeNode node = null;

	public TreeNode searchBST(TreeNode root, int val) {
		bstSearch(root, val);
		return node;
	}

	public ListNode middleNode1(ListNode head) {

		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public void bstSearch(TreeNode root, int val) {
		if (root == null)
			return;
		if (root.val == val) {
			node = new TreeNode(root.val);
			node.left = root.left;
			node.right = root.right;
		}

		bstSearch(root.left, val);
		bstSearch(root.right, val);

	}
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
