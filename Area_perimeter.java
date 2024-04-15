import java.util.*;
interface interface1{
	void area();
	void perimeter();
}
class Circle implements interface1{
	public float radius;
	Circle(float rad){
		radius=rad;
	}

	public void area(){
		System.out.println("Area of the circle is:"+(3.14*radius*radius));
	}
	public void perimeter(){
		System.out.println("perimeter of the circle is:"+(2*3.14*radius));
	}
}
class Rectangle implements interface1{
	public float len,bdth;
	Rectangle(float i,float b){
		len=i;
		bdth=b;
	}
	public void area(){
		System.out.println("area of the rectangle is:"+len*bdth);
	}
	public void perimeter(){
		System.out.println("perimeter of the rectangle is:"+2*(len+bdth));
	}
}
class Area_perimeter{
	public static void main(String args[]){
		int ch=1;
		while(ch==1){
			Scanner sc=new Scanner(System.in);
			System.out.println("choose either 1 or 2 to find the area and perimeter of");
			System.out.println("\n 1.circle 2.rectangle");
			System.out.println("enter your choice: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1: System.out.println("enter the radius of the circle: ");
					float r=sc.nextFloat();
					Circle obj1=new Circle(r);
					obj1.area();
					obj1.perimeter();
					break;
				case 2: System.out.println("Enter the length of the rectangle: ");
					float l=sc.nextFloat();
					System.out.println("Enter the breadth of the rectangle: ");
					float b=sc.nextFloat();
					Rectangle obj2=new Rectangle(l,b);
					obj2.area();
					obj2.perimeter();
					break;
			}
			System.out.println("Want to continue? (1(yes) or 0(no))");
			ch=sc.nextInt();
		}
	}
}


