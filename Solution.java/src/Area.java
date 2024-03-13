class Area 
{
	public static void area(int a)
	{
		int AreaS=a*a;
		System.out.println("Area of square is"+AreaS);
	}	
	public static void area(int l,int b)
	{
		int AreaR=l*b;
		System.out.println("Area of rectangle is"+AreaR);
	}
	public static void area(float  a,int r)
	{
		int AreaC=(int)(a*r*r);
		System.out.println("Area of circle is"+AreaC);
	}
	public static void area(int l,int w,int h)
	{
		int AreaP=l*w*h;
		System.out.println("area of pyramid is"+AreaP);
	}
	public static void main(String[] args)
	{
		area(4);
		area(5,6);
		area(3.14f,2);
		area(2,3,4);
	}
}
