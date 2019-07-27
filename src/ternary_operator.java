class ternary_operator  // declare java that it is a class 
{
	public static void main(String[] args)  //every java must have main 
	{
		int leap_year = 28;  //declear leap_year is integer, it is statically_type
		String result;  // result as String
		result = (leap_year == 29)?"is a leap year" : "is not a leap year";  // reuslt = if leap_yeat = 29  true -> is a leap year but we declared equal 28 so it is false so display is not a leap year 
		System.out.println(result); // print or display standard output of the result
	}
}
