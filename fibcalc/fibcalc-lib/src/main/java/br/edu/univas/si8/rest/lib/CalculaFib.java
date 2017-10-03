package br.edu.univas.si8.rest.lib;

public class CalculaFib {
	
	public static int fibonacci(int n) {
	      int lo = 0;
	      int hi = 1;
	      for (int i = 0; i < n; i++) {
	          hi = lo + hi;
	          lo = hi - lo;
	      }
	      return lo;
	  }

}
