package org.la.student.asif.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NodeMain {

	public static void main(String[] args) {
		
		List<Node> list = getList();
		print(list);
		Collections.sort(list, (o1, o2) -> o1.getId()-o2.getId());
		System.out.println("after sort -----------------------");
		print(list);
		Collections.sort(list, new SortByName());
		System.out.println("sort by name ----------------------------");
		print(list);
		list = getList();
		System.out.println("sort by name using lambda ----------------------------");
		Comparator<Node> comp = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(list, comp);
		print(list);
	}
	
	static void print(List<Node> list) {
		for(Node node : list) {
			System.out.println(node);
		}
	}
	static List<Node> getList(){
		List<Node> listNode = new ArrayList<>();
		Node node1 = new Node(4, "ab");
		Node node2 = new Node(2, "ze");
		Node node3 = new Node(3, "saif");
		Node node4 = new Node(6, "saint");
		Node node5 = new Node(1, "nile");
		Node node6 = new Node(5, "fellow");
		listNode.add(node1);
		listNode.add(node2);
		listNode.add(node3);
		listNode.add(node4);
		listNode.add(node5);
		listNode.add(node6);
		return listNode;
	}
}
