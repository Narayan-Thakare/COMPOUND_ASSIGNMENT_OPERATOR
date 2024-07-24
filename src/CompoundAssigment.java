
public class CompoundAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{

			int salary = 10000;
			salary += 6786;

			System.out.println("This is for addition :" + salary);
		}
		{
			int salary = 10000;
			salary -= 8788;
			System.out.println("This is for subtract :" + salary);
		}
		{
			int salary = 10000;
			salary *= 9000;
			System.out.println("This is for multyplication :" + salary);
		}
		{
			int salary = 10000;
			salary /= 2000;
			System.out.println("This is for division :" + salary);
		}
		{
			int salary = 14000;
			salary %= 2000;
			System.out.println("This is for modules: " + salary);
		}

	}

}
