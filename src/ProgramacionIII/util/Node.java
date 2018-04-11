package ProgramacionIII.util;

public class Node {
	private Object info;
	private Node next;
	
	public Node() {
	next = null;
	}
	
	public Node(Object o, Node n) {
	setValor(o);
	setSig(n);
	}
	public void setValor(Object o) {
	info = o;
	}
	public void setSig(Node n) {
	next = n;
	}
	public Object valor() {
	return info;
	}
	public Node siguiente() {
	return next;
	}
	
	
}
