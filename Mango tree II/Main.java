import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	    Scanner in = new Scanner(System.in);
	    int r = in.nextInt();
      int c = in.nextInt();
      int n = in.nextInt();
      
      int flag=0;
     int i=1;

 // int r,c,n,i,flag=0;
  //cin>>r>>c>>n;
  //i=1;
  while(i<c)
  {
    if(n==((i*r)+1))
    {
      flag=1;
    }
    i++;
  }
  int j=1;
  while(j<=r)
  {
    if(n==j)
    {
      flag=1;
    }
    j++;
  }
  if(flag==1)
  {
    System.out.println("yes");
  }
  else
  {
    System.out.println("No");
  }
  
  //Type your code here.
}
}
