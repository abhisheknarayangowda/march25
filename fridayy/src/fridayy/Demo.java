package fridayy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Radha";
		String s2 = "Krishna";
		String s3 = s1+s2;
		String s4 = s1+s2;
		if(s3==s4)
		{
			System.out.println("R are  Equal");
		}
			else
			{
				System.out.println("R are  unequal");
			}
		}
	}


//concatenation of 2 refrences must always be stored in non constant pool.