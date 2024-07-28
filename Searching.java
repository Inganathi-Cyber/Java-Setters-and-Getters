
package MaxOrMin;

import java.util.Locale;
import java.util.Scanner;


public class Searching {
    
    public void print(){
        Scanner kbd = new Scanner(System.in);
        kbd.useLocale(Locale.ENGLISH);
/*
int [ ] tests = {45, 70, 36, 64, 58};
int sum = 0;
String [] names = {"John", "Peter", "Alex", "Vincent", "Dean"};
*/
int [ ] tests = new int[100];
String [ ] names = new String[100];
int temp, x, howMany;
x = 0; //"@"
System.out.print("Please enter first test mark (or -1 to stop):");
temp = kbd.nextInt( );
// there IS more data there IS space in array
while ((temp != -1) && (x < tests.length))
{ tests[x] = temp;
System.out.print("Enter student's name:");
kbd.nextLine();
names[x] = kbd.nextLine( );
x = x + 1; // or x++;
System.out.print("Please enter next test mark (or -1 to stop):");
temp = kbd.nextInt( );
}
howMany = x; //howMany is the number of filled elements in BOTH arrays
System.out.println("Name\t\tMark");
System.out.println("----\t\t----");
for (int j = 0; j < howMany; j++)
System.out.println(names[j]+"\t\t"+tests[j]);
System.out.println("--------------------------------");
int total = 0; //or use tests.length if array is FULL of values
for (int j = 0; j < howMany; j++)
total += tests[j];
double ave = total / howMany;
System.out.println("The average is: "+ave);
int max = 0; // int max = tests[0];
int min = 101; // int min = tests[0];
int posMax = 0;
int posMin = 0;
for (x = 0; x < howMany; x++)//for (x = 1; x < howMany; x++)
{ if (tests[x] > max) // if the "x"th ϵ is larger than the max up till now, it becomes the NEW max
{ max = tests[x]; // current ϵ value
posMax = x; // current ϵ position
}
// same technique for smallest/min
if (tests[x] < min)
{ min = tests[x];
posMin = x;
}
}
// tests[posMax]
System.out.println("The highest mark is :"+max+" and the genius is "+names[posMax]);
System.out.println("The lowest mark is :"+min+" and the student is "+names[posMin]);
System.out.print("Please enter name to search for: ");
kbd.nextLine();
String inName = kbd.nextLine();
boolean found = false;
x = 0;
// tests.length if array is "full"
while (!(found) && (x < howMany))
{ if (inName.equals(names[x]))//if names[x] = inName i.o.w. if the current name is the ONE
found = true;
else
x++;
}
if (found)
System.out.println("Name found - they got "+tests[x]+"%");
else
System.out.println("Name not found");
    }
}
