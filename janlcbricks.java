import java.util.*;
class janlcbricks
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        
        while(t-->0)
        {
            int s,a,b,c,c1=0;
            s=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(s>=a+b+c)
            {
                c1=1;
            }
            else if(s<a+b+c)
            {
                if(s>=a+b)
                {
                    c1=2;
                }
                else
                {
                   c1++;
                   if(s>=b+c)
                   {
                       c1++;
                   }
                   else
                   {
                       c1=c1+2;
                   }
                }
            }
            System.out.println(c1);
        }
    }
}