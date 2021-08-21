import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
          Scanner in = new Scanner(System.in);
	    int month = in.nextInt();
      float rent =in.nextFloat();
      int days = in.nextInt();

      
  float total=0;
  float p=0;
  
  switch(month)
  {
    case 4:
      case 6:
      case 11:
      case 12:
      {
        total=rent*days;
        p=(float)(total*20)/(float)100;
        total+=p;
        System.out.println(total);
        break;
      }
      case 1:
      case 2:
      case 3:
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
      {
        total=rent*days;
        System.out.println(total);
        break;
      }
    default:
      System.out.println("Invalid Input");
  }
  
	}
}