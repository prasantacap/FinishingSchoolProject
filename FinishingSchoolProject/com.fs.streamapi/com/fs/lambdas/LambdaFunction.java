package com.fs.lambdas;

@FunctionalInterface
interface Display {

	public String show();
}

public class LambdaFunction {

	public static void main(String[] args) {

		Display display = () -> {
			System.out.println("Hello Lambda Test");

			return "Capgemini";

		};

		display.show();

	}

}
