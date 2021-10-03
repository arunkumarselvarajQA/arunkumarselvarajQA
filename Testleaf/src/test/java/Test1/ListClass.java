package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListClass {

	public static void main(String[] args) {
		
		Integer[] intArr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Integer[] intArr2 = { 10,40, 50, 60, 70, 80, 90 };
		
        List<Integer> arrList1 = new ArrayList<Integer>();
        arrList1.addAll(Arrays.asList(intArr));
        System.out.println(arrList1);
        
        List<Integer> arrList2 = new ArrayList<Integer>();
        arrList2.addAll(Arrays.asList(intArr2));
        System.out.println(arrList2);
        
        System.out.println(arrList1.retainAll(arrList2));
        System.out.println( arrList1.removeAll(arrList2));
	}
	

}
