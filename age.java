import java.io.*;
class Age
{
    int y,m,d;//declaring global variables for year month and day
    Age()
    {
        y=0;
        m=0;
        d=0;
    }
    public void input()throws IOException//input the date in dd/mm/yyyy format from the user
    {
      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
      d=Integer.parseInt(br.readLine());
      m=Integer.parseInt(br.readLine());
      y=Integer.parseInt(br.readLine());
    }
    public void calc(Age X,Age Y)//function to calculte the age we pass two dates as objects hence their datatype is class name
    {
        if(X.d<Y.d)
        {
            X.d=X.d+30;
            X.m--;
        }
        if(X.m<Y.m)
        {
            X.m=X.m+12;
            X.y--;
        }
        d=X.d-Y.d;
        m=X.m-Y.m;
        y=X.y-Y.y;
    }
    public void display()
    {
        System.out.println("You are "+y+" years "+m+" months "+d+" days ");
    }
    public static void main()throws IOException
    {
        Age X=new Age();//Creating objects
        Age Y=new Age();
        Age Z=new Age();
        System.out.println("Enter the current date in DD/MM/YYYY format");
        X.input();//input the current date and store the data to object X
        System.out.println("Enter your date of birth in DD/MM/YYYY format");
        Y.input();// input the DOB and store it to the object Y
        Z.calc(X,Y);//passes object X and Y
        Z.display();
    }
}
