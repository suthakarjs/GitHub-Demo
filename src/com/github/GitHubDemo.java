package com.github;

public class GitHubDemo {

	
	
	private void method1() {
		System.out.println("From Method ~ 1");
	}
	
	private void method2() {
		System.out.println("From Method ~ 2");
	}
	
	private void method3() {
		System.out.println("From Method ~ 3");
	}
		
	public static void main(String[] args) {
		
		GitHubDemo demo = new GitHubDemo();
		demo.method1();
		demo.method2();
		demo.method3();	
	}

}
