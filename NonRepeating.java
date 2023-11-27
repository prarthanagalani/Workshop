//Java program to find non-repeating elements in an array
//Input : arr[8] = [10, 20, 40, 30, 50, 20, 10, 20]
//Output : 40 30 50

import java.util.*;

public class NonRepeating {

  public static ArrayList<Integer> calNonReapting(ArrayList<Integer> arr) {

    //get max integer from given arraylist
    int mx = arr.get(0);
    for (int it : arr) {
      if (mx < it)
        mx = it;
    }

    //stores the frequency of each integer into freq array
    int[] freq = new int[mx + 1];

    for (int it : arr)
      freq[it]++;

    ArrayList<Integer> ans = new ArrayList<>();
     
    // if freq = 1 for any integer, add it to your answer
    for (int i = 0; i <= mx; i++)

    {
      if (freq[i] == 1) {
        ans.add(i);
      }

    }

    return ans;

  }

  public static void main(String[] args) {

    
    // array to store input
    ArrayList<Integer> arr = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of array:");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int number = sc.nextInt();
      arr.add(number);
    }

    ArrayList<Integer> ans = calNonReapting(arr);

    System.out.println(ans);

    sc.close();

  }
}