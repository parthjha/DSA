package com.example;

import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

class MainMethod {
	public static void main(String[] args) {
		Solution solution = new Solution();
//		int trust[][] = { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
//
//		System.out.print(solution.findJudge(4, trust));

//		
//		ListNode listNode = new ListNode();
//		listNode.val = 1;
//		listNode.next = new ListNode();
//		listNode.next.val = 2;
//		listNode.next.next = new ListNode();
//		listNode.next.next.val = 4;
//[1,2,3,4,5]

//		
//		TreeNode tree = new TreeNode();
//		tree = new TreeNode(1);
//		tree.left = new TreeNode(2);
//		tree.right = null;
//		tree.left.left = new TreeNode(3);
//		tree.left.right = null;
//		tree.left.left.right = null;
//		tree.left.left.left = new TreeNode(4);
//		tree.left.left.left.left = new TreeNode(5);
//		System.out.print(solution.hasPathSum(tree, 6));

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
//
//		ListNode res = solution.removeNthFromEnd(node, 3);
//
//		while (res != null) {
//
//			System.out.print("=>" + res.val);
//			res = res.next;
//		}
//

//		StockSpanner stock = new StockSpanner();
//
//		System.out.println(stock.next(29));
//		System.out.println(stock.next(91));
//		System.out.println(stock.next(62));
//		System.out.println(stock.next(79));
//		System.out.println(stock.next(51));

		TreeNode tree = new TreeNode();
		tree = new TreeNode(5);
		tree.left = new TreeNode(3);
		tree.right = new TreeNode(6);
		tree.left.left = new TreeNode(2);
		tree.left.right = new TreeNode(4);
		tree.left.left.right = null;
		tree.left.left.left = new TreeNode(1);
		System.out.print(solution.hasPathSum(tree, 3));

	}
}

class Solution {

	public int[] maxSlidingWindow(int[] nums, int k) {

		// A deque which holds the max elements for window size of k
		Deque<Integer> maxWindowQueue = new LinkedList<>();

		// Max window to be returned
		int[] maxWindow = new int[nums.length + 1 - k];

		int left = 0, right = 0, mwCtr = 0;

		while (right < nums.length) {
			int dig = nums[right];

			// Remove from the end, those elements which are smaller than dig.
			while (!maxWindowQueue.isEmpty() && dig > maxWindowQueue.getLast()) {
				maxWindowQueue.removeLast();
			}

			// Add the new found element.
			maxWindowQueue.addLast(dig);

			// We have reached the window size
			if (right - left + 1 == k) {
				maxWindow[mwCtr] = maxWindowQueue.getFirst();
				mwCtr++;

				// Now we need to slice the left corner
				// Doing so, If you find the number being removed is the max element we need to
				// pop
				// that element as well from the dequeue
				if (nums[left] == maxWindowQueue.getFirst()) {
					maxWindowQueue.removeFirst();
				}
				// Slice the left corner
				left++;
			}

			// Increment right as usual
			right++;
		}
		return maxWindow;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// 1->2->3->4->5
		// 3
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
			ListNode temp = head;
			ListNode prev = null;

			for (int i = 0; i < diff; i++) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = temp.next;
			return head;
		}

	}

	public ListNode oddEvenList(ListNode head) {

		// Input: 1->2->3->4->5->NULL
		// Output: 1->3->5->2->4->NULL
		List<Integer> list = new ArrayList<>();

		int count = 0;
		ListNode temp1 = head;
		while (temp1 != null) {
			count++;
			if (count % 2 != 0) {
				list.add(temp1.val);
			} else {

			}
			temp1 = temp1.next;
		}
		count = 0;
		temp1 = head;
		while (temp1 != null) {
			count++;
			if (count % 2 == 0) {
				list.add(temp1.val);
			}
			temp1 = temp1.next;
		}
		count = 0;
		ListNode res = null;
		ListNode tail = null;
		for (int i = 0; i < list.size(); i++) {
			// Checks if the list is empty
			ListNode newNode = new ListNode(list.get(i));
			if (res == null) {
				// If list is empty, both head and tail will point to new node
				res = newNode;
				tail = newNode;
			} else {
				// newNode will be added after tail such that tail's next will point to newNode
				tail.next = newNode;
				// newNode will become new tail of the list
				tail = newNode;
			}
		}

		return res;
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		return mergeList(l1, l2);
	}

	public int findJudge(int N, int[][] trust) {
		int[] count = new int[N + 1];

		for (int[] item : trust) {
			count[item[0]]--;
			count[item[1]]++;

		}

		for (int i = 1; i <= N; i++) {
			if (count[i] == N - 1) {
				return i;
			}
		}

		return -1;
	}

	private int ListNodeLen(ListNode node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}

		return count;
	}

	public ListNode getIntersectionNode(ListNode l1, ListNode l2) {

		int len1 = ListNodeLen(l1);
		int len2 = ListNodeLen(l2);

		if (len1 > len2) {
			for (int i = 0; i < len1 - len2; i++) {
				l1 = l1.next;
			}
		} else {
			for (int i = 0; i < len2 - len1; i++) {
				l2 = l2.next;
			}
		}
		while (l1 != null && l2 != null) {
			if (l1 == l2) {
				return l2;
			}
			l1 = l1.next;
			l2 = l2.next;
		}

		return null;

	}

	public ListNode mergeList(ListNode l1, ListNode l2) {

		ListNode list = new ListNode();

		ListNode temp = list;

		while (true) {

			if (l1 == null) {
				temp.next = l2;
				break;
			}
			if (l2 == null) {
				temp.next = l1;
				break;
			}
			if (l2.val >= l1.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}

		return list.next;
	}

	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null) {
			return false;
		}

		return checkSummationRootToLeaf(root.left, root.val, sum)
				|| checkSummationRootToLeaf(root.right, root.val, sum);
	}

	public boolean checkSummationRootToLeaf(TreeNode root, int previousSum, int sum) {

		if (root == null) {
			return false;
		}
		int currentSum = root.val + previousSum;
		if (currentSum == sum && root.left == null && root.right == null) {
			return true;
		}
		return checkSummationRootToLeaf(root.right, currentSum, sum)
				|| checkSummationRootToLeaf(root.left, currentSum, sum);
	}

}

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
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

	class MedianFinder {

		List<Integer> list = null;

		/** initialize your data structure here. */
		public MedianFinder() {
			this.list = new ArrayList<>();
		}

		public void addNum(int num) {
			// O (log(n)) finding the lower bound in binary search
			int position = Collections.binarySearch(list, num);

			// Insertion can take O(N) in worst case
			if (position >= 0) {
				list.add(position, num);
			} else {
				int insertionPoint = -position - 1;
				list.add(insertionPoint, num);
			}

		}

		public double findMedian() {
			if (list == null || list.size() == 0)
				return 0;
			if (list.size() == 1)
				return list.get(0);

			double median = 0.0;
			if (list.size() % 2 == 0) {
				int size = list.size();
				if (size == 2) {
					median = (list.get(0) + list.get(1)) / 2;
				} else {
					int mid = ((0 + list.size()) / 2 - 1);
					median = (list.get(mid) + list.get(mid + 1)) / 2;
				}
			} else {
				int mid = ((0 + list.size()) / 2);
				median = list.get(mid);
			}
			return median;
		}
	}

	class StockSpanner {

		// Create a stack and push index of first element
		// to it
		List<Integer> prices;
		List<Integer> spans;

		public StockSpanner() {
			prices = new ArrayList<>();
			spans = new ArrayList<>();
		}

		public int next(int price) {
			int span = 1;
			int index = prices.size() - 1;
			while (index >= 0 && price >= prices.get(index)) {
				span += spans.get(index);
				index -= spans.get(index);
			}
			spans.add(span);
			prices.add(price);
			return span;

		}
	}
}

class Graph {

	private int v;
	private LinkedList<Integer>[] adj;

	Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}

	public void addEdge(int v, int e) {
		adj[v].add(e);
	}

	void BFS(int s) {
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[v];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);

		while (!queue.isEmpty()) {
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	private void DFSUtil(int v, boolean[] isVisited) {
		isVisited[v] = true;
		System.out.print("   " + v);
		Iterator<Integer> list = adj[v].iterator();
		while (list.hasNext()) {
			int val = list.next();
			if (!isVisited[val]) {
				DFSUtil(val, isVisited);
			}
		}

	}

	public void DFS(int s) {
		boolean[] isVisited = new boolean[v];
		DFSUtil(s, isVisited);
	}

}
