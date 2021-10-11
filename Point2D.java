public class Point2D {
private int x=10,y=20;
public Point2D(int x, int y)
{
this.x=x;
this.y=y;
} public String getDetails()
{
System.out.println("Point for X co-ordinate is:"+ x + "Point for Y co-ordinate is:" +y);
return null;
//return "Point ("+x+","+y+")";
}
public boolean isEqual(Point2D P1,Point2D P2)
{ if(P1.x==P2.x && P1.y==P2.y)
{
return true;
}
else
{
return false;
}
}
public static void main(String[] args) {
Point2D P=new Point2D(40,20);
P.getDetails();
//P.isEqual(P, P);
}
}

