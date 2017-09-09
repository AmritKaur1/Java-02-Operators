public class Assignmentoperator
{
public static void main(String[] args)
{
int x=10;//simple
int a,b,c,d ;

a=b=c=d=20;//chained
//int a=b=c=d=20;//CE:can't find symbol

a+=30;//compound
System.out.println(x+"   "+a+"    "+b+"    "+c+"     "+d);//10   50    20    20     20

a=20;
a+= b-= c*= d/=2;//right to left
System.out.println(a+"    "+b+"    "+c+"     "+d);//-160    -180    200     10
}
}