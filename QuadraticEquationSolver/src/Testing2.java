import java.util.Scanner;

public class Testing2 {

	public static void main(String[] args) {
		System.out.println(Quadratic());
	}
	public static String Quadratic() {
		System.out.println("enter a, b, c");
		Scanner input = new Scanner(System.in);
		double[] nums = new double[4];
		int count = 1;
		while (count < nums.length) {
		nums[count] = input.nextDouble();
		count++;
		}
		double quadratic1 = (-1*nums[2]);
		double quadratic2 = (Math.pow(nums[2], 2))-4*nums[1]*nums[3];
		double quadratic3 = (2*nums[1]);
		if ((Math.pow(nums[2], 2))-4*nums[1]*nums[3] > 0) {
			quadratic2 = Math.sqrt((Math.pow(nums[2], 2))-4*nums[1]*nums[3]);
			double quadratic5 = quadratic1 + quadratic2;
			double quadratic6 = quadratic1 - quadratic2;
			String quadratic4 =
	"The solutions are: " + quadratic5 + "/" + Double.toString(quadratic3)
				+ " and " + quadratic6 + "/" + Double.toString(quadratic3);
		return quadratic4;
		}
		
		String quadratic4 =
	"The solutions are: " + "(" + Double.toString(quadratic1) + "+" + "sqrt(" + Double.toString(quadratic2) + ")" + ")" + "/" + Double.toString(quadratic3)
  + " and " + "(" + Double.toString(quadratic1) + "-" + "sqrt(" + Double.toString(quadratic2) + ")" + ")" + "/" + Double.toString(quadratic3)
		;
		return quadratic4;
	}
  }
