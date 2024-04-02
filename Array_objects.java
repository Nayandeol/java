import java.util.*;
class employee
{
int eno;
String ename;
int esalary;
employee(int eno,String ename,int esalary)
{
this.eno=eno;
this.ename=ename;
this.esalary=esalary;
}
}
class Array_objects
{
public static void main(String args[])
{
int i,flag=0;
Scanner Sc=new Scanner(System.in);
Scanner S=new Scanner(System.in);
System.out.println("enter the size: ");
int n=Sc.nextInt();
employee[] obj=new employee[n];
for(i=0;i<n;i++)
{
System.out.println("enter the details of the employee"+(i+1));
System.out.println("employee number: ");
int eno=Sc.nextInt();
System.out.println("Employee Name:");
String ename=S.nextLine();
System.out.println("Employee salary:");
int esalary=Sc.nextInt();
obj[i]=new employee(eno,ename,esalary);
}
System.out.println("enter the employee number to be searched: ");
int no=Sc.nextInt();
for(i=0;i<n;i++)
{
if(obj[i].eno==no)
{
System.out.println("Employee Name:"+obj[i].ename);
}
else
System.out.println("not found");
}
}
}

