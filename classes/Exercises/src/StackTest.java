import java.util.*;
class Stack
{
	int a[]=new int[10];
	int top;	
	void push(int num)
	{
		if(isfull())
		{
			System.out.println("number cannot be entered");
		}
		else
		{
			top++;
			a[top]=num;
		}	
	}

void pop()
{
	if(isempty())
	{
		System.out.println("stack is empty");
	}
	else
	{
		top--;
		System.out.println("element is deleted");
	}
}
boolean isempty()
{
	if(top=-1)
	{
		return true;
	}
	else
	{
		return false;
	}
}
boolean isfull()
{
	if(top==9)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
class StackTest
{
    public static void main(strings args[])
	{
		Stack S=new Stack();
		int choice,num;
		System.out.println("Enter 1 for push");
		System.out.println("Enter 2 for pop");
		System.out.println("Enter 3 for isempty");
		System.out.println("Enter 4 for isfull");
		System.out.println("Enter for spaceleft");
		choice=S.nextInt();
		do
		{
		switch(choice)
		{
			case 1:System.out.println("Enter the no. ypu want to input");
			num=S.nextInt();
			S.push(num);import java.util.*;
class Stack
{
	int arr[]=new int[10];
	int top;
	Stack()
	{
		top=-1;
	}
	void push(int num)
	{
		if(isfull())
		{
			System.out.println("no. is full");
		}
		else
		{
			top++;
			arr[top]=num;
		}
	}
	void pop()
	{
		if(isempty())
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println(arr[top]);
			top--;
			System.out.println("Element deleted");
		}
	}
	boolean isempty()
	{
		if(top==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isfull()
	{
		if(top==9)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	int spaceleft()
	{
		int k;
		k=9-top;
		return (k);
	}
}

class StackTest
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int choice,num;
		char b;
		Stack S=new Stack();
		System.out.println("Enter 1 for push");
		System.out.println("Enter 2 for pop");
		System.out.println("Enter 3 for isempty");
		System.out.println("Enter 4 for isfull");
		System.out.println("Enter 5 for spaceleft");
		do
		{
			choice=s.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter the no. you want to input");
				num=s.nextInt();
				S.push(num);
				break;
				case 2:	S.pop();
				break;
				case 3: S.isempty();
				break;
				case 4: S.isfull();
				break;
				case 5:	System.out.println(S.spaceleft());
				break;
				default: System.out.println("you have entered the wrong no.");
			}
			System.out.println("Enter Y to run the program again or anything to exit");
			b=s.next().charAt(0);
		}
		while(b=='y' || b=='Y');
	}
}
			break;
			case 2:S.pop();
			break;
			case 3:S.isempty();
			break;
			case 4:S.isfull();
			break;
			case 5:S.spaceleft();
			break;
			default:System.out.println("You have entered a wrong no.");
		}
		System.out.println("If cannot Enter 1 else Enter 2");
		R=S1.nextInt();
		}while(R==1);
	}
}