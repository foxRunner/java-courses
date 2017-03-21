import java.util.*;

public class Calculate{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		System.out.println("sum " + summ);
		System.out.println("Вычитание: " + (first - second));
		System.out.println("Умножение: " + (first * second));
		System.out.println("Деление: " + (first / second));
		System.out.print("Введите степень возведения чисел: ");
		int stepen = input.nextInt();
		System.out.println(Math.pow(first,stepen));
		System.out.println(Math.pow(second,stepen));
		
	} 
}