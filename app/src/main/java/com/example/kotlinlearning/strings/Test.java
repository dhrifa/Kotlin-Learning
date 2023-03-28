package com.example.kotlinlearning.strings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public void Main(){

    }

    public int sumDigit(int d) {
        int sum = 0;
        int num = d;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    public class MyMapComparator implements Comparator<Map <String, Integer>>
    {
        @Override
        public int compare (Map<String, Integer> o1, Map<String, Integer> o2)
        {
            int c;

            c = o1.get ("A").compareTo(o2.get ("A"));
            if (c != 0) return c;

            c = o1.get ("B").compareTo(o2.get ("B"));
            if (c != 0) return c;

            return o1.get ("C").compareTo(o2.get ("C"));
        }
    }
//
//    public void sort(ArrayList<Integer> arr, ArrayList<Integer> sum) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int i;
//        for (i = 0; i < sum.size(); i++) {
//            map.put(sum.get(i), arr.get(i));
//        }
//        System.out.println( map.);
//        List<Integer> temp = new ArrayList<>(map.values());
//        Collections.sort(temp, Comparator.comparing());



//        Map<String, Person> people = new HashMap<>();
//        Person jim = new Person("Jim", 25);
//        Person scott = new Person("Scott", 28);
//        Person anna = new Person("Anna", 23);
//
//        people.put(jim.getName(), jim);
//        people.put(scott.getName(), scott);
//        people.put(anna.getName(), anna);
//
//// not yet sorted
//        List<Person> peopleByAge = new ArrayList<>(people.values());
//
//        Collections.sort(peopleByAge, Comparator.comparing(Person::getAge));



//    }

    public void sort() {
//        ArrayList<Integer> arr = ArrayList<Integer>(Arrays.asList( 12,10,45,3);
//        var sum = arrayListOf(3,1,9,3)
        int arr[] = new int[]{12, 10, 45, 3};
        int sum[] = new int[]{3, 1, 9, 3};
        Arrays.sort(sum);
        int n = arr.length;
        int i = 0;

        int temp[] = new int[]{};
        for (i = 0; i < n / 2; i++) {
            if (sum[i] < sum[i + 1]) temp[i] = arr[i];
            else temp[i] = arr[i++];
        }

    }
}
