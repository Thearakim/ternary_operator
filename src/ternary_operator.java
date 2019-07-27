class ternary_operator
{
	public static void main(String[] args)
	{
		int leap_year = 28;
		String result;
		result = (leap_year == 29)?"is a leap year" : "is not a leap year";
		System.out.println(result);
	}
}