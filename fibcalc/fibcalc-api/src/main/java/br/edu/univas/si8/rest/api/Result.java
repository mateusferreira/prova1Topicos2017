package br.edu.univas.si8.rest.api;

public class Result {
	
	private int num;
	private int fib;
	
	public int getN() {
		return num;
	}
	
	public void setN(int num) {
		this.num = num;
	}
	
	public Result withN (int num) {
		this.num = num;
		return this;
	}
	
	public int getFib() {
		return fib;
	}
	
	public void setFib(int fib) {
		this.fib = fib;
	}
	
	public Result withFib(int fib) {
		this.fib = fib;
		return this;
	}
	
	
}
