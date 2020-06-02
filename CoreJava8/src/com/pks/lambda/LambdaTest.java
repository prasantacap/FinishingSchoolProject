package com.pks.lambda;

interface Game {

	public void play();
}
// Imperitive style
/*
 * class A implements Game {
 * 
 * @Override public void play() {
 * System.out.println("Hello!! Welcome to Lambda Expression");
 * 
 * }
 * 
 * }
 */

public class LambdaTest {

	public static void main(String[] args) {

		// Anonymous inner class
		/*
		 * Game ob = new Game() {
		 * 
		 * public void play() {
		 * 
		 * System.out.println("Hello!! Welcome to Lambda Expression"); } }; ob.play();
		 */

		// Lambda Expression
		Game ob = () -> System.out.println("Hello!! Welcome to Lambda Expression\"");
		ob.play();

	}

}
