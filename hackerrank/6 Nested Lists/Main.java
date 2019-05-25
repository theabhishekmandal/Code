/*
Given the names and grades for each student in a Physics class of

students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the same grade, order their names alphabetically and print each name on a new line.

Input Format

The first line contains an integer,
, the number of students.
The subsequent lines describe each student over

lines; the first line contains a student's name, and the second line contains their grade.

Constraints

    There will always be one or more students having the second lowest grade.

Output Format

Print the name(s) of any student(s) having the second lowest grade in Physics; if there are multiple students, order their names alphabetically and print each one on a new line.

Sample Input 0

5
Harry
37.21
Berry
37.21
Tina
37.2
Akriti
41
Harsh
39

Sample Output 0

Berry
Harry

Explanation 0

There are

students in this class whose names and grades are assembled to build the following list:

python students = [['Harry', 37.21], ['Berry', 37.21], ['Tina', 37.2], ['Akriti', 41], ['Harsh', 39]]

The lowest grade of
belongs to Tina. The second lowest grade of belongs to both Harry and Berry, so we order their names alphabetically and print each name on a new line.
*/



// Comparator<stud> comp = (stud one, stud two) ->{
        //     return Float.valueOf(one.marks).compareTo(two.marks);
        // } ;
        // Arrays.sort(arr, comp);
        // for(Map.Entry<Float, Integer> iter: map.entrySet()){
        //     if(iter.getKey() > mini){
        //         mini = iter.getKey();
        //         break;
        //     }
        // }
 // static class stud{
    //     String name;
    //     float marks;
    //     stud(String name, float marks){
    //         this.name = name;
    //         this.marks = marks;
    //     }
    // }

//stud[] arr = new stud[size];
//arr[i] = new stud(name, marks);

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        float mini = Float.MAX_VALUE;
        Map<Float, Integer> map = new TreeMap<>();
        Map<String, Float> arr = new TreeMap<>();
        for(int i = 0; i < size; i++){
            String name = s.next().trim();
            float marks = s.nextFloat();
            arr.put(name, marks);
            map.put(marks, 1);
            mini = Math.min(mini, marks);
        }
        if(size == 1) {
            System.out.println(new ArrayList<String>(arr.keySet()).get(0));
            return;
        }
        mini = new ArrayList<Float>(map.keySet()).get(1);
        StringBuilder br = new StringBuilder();
        for(Map.Entry<String, Float> iter : arr.entrySet()){
            if(iter.getValue() == mini) br.append(iter.getKey()).append("\n");
        }
        System.out.println(br);
    }
}