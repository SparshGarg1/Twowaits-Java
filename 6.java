
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
import java.util.Scanner;
public class Diamond 
{
 
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
System.out.println("Enter N : ");
int n=sc.nextInt(); 
System.out.print("Enter Symbol : ");
 
char c = sc.next().charAt(0);
 
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
 
{
System.out.print(" ");
}
 
for(int j=1;j<=i*2-1;j++)
 
{
System.out.print(c);
}
System.out.println();
 
} 
for(int i=n-1;i>0;i--)
{
for(int j=1;j<=n-i;j++)
 
{
System.out.print(" ");
}
for(int j=1;j<=i*2-1;j++)
 
{
System.out.print(c);
}
System.out.println();
}
 
}
}