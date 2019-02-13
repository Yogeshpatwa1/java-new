class Pair
{
	int parray[]=new int[10];
	private int x;
	private int y;
	Pair()
	{
		x=0;
		y=0;
	}
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	public void set(int x)
	{
		this.x=x;
	}
	public void set(int y)
	{
		this.y=y;
	}
	public void set(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void sort()
	{
		int temp,i,j;
		for(i=0;i<parray.length;i++)
		{
			for(j=0;i<parray.length;j++)
			{
				if(parray[i]<parray[j])
				{
					temp=parray[i];
					parray[i]=parray[j];
					parray[j]=temp;
				}
				System.out.println(+parray[i]);
			}
		}
	}
}

class Pairtest
{
	public static void main(String[] args) 
	{
		
	}
}
