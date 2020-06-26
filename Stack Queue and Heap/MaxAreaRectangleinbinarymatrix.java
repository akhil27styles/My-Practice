import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxAreaRectangleinbinarymatrix {

	public static void main(String[] args) {
	    int matrix[][]={{ 0,1,1,0},
	                     {1,1,1,1},
	                     {1,1,1,1},
	                     {1,1,0,0}};
	                     int n=matrix.length;
	                     int m=matrix[0].length;
	                     int v[]=new int[n];    
	                     int al[]=new int[n];
	                     for(int i=0;i<n;i++){
	                         v[i]=matrix[0][i];
	                     }
	                     int max=MAA(v);
	                     for(int i=1;i<n;i++){
	                     for(int j=0;j<m;j++){
	                         if(matrix[i][j]==0){
	                             al[j]=0;
	                         }
	                         else{
	                             al[j]=al[j]+matrix[i][j];
	                         }
	                         max=Math.max(max,MAA(al));
	                     }      
	                     }
	                    System.out.println(max);
}

	    public static int MAA(int arr[]){
		int[] width = new int[arr.length];
		int[] area = new int[arr.length];
		
		List<Integer> listNSL = findNearestSmallerToLeft(arr);
		List<Integer> listNSR = findNearestSmallerToRight(arr);
		
		Collections.reverse(listNSR);
		
		for(int i=0; i < listNSL.size(); i++) {
			width[i] = listNSR.get(i) - listNSL.get(i) - 1;
		}
		
		for(int i=0; i < width.length; i++) {
			area[i] = arr[i] * width[i];
		}
		
		int maxArea = findMaxArea(area);
		
		return maxArea;
		
	
	}
	
	private static List<Integer> findNearestSmallerToLeft(int[] arr){
		int pseudoIndex = -1;
		List<Integer> list = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i <= arr.length-1; i++) {
			if(st.size() == 0) { //if stack is empty push -1
				list.add(pseudoIndex);
			}
			
			
			
			else if(st.size() > 0 && arr[st.peek()] < arr[i]){
				list.add(st.peek());
			}
			
			
			else if(st.size() > 0 && arr[st.peek()] >= arr[i]){
				while(st.size() > 0 && arr[st.peek()] >= arr[i]) {
					st.pop();
				}
				
				
				if(st.size() == 0) {
					list.add(pseudoIndex);
				}
				
				
				else {
					list.add(st.peek());
				}
			}
			
			
			st.add(i);
		}
		
		return list;
	}
	
	private static List<Integer> findNearestSmallerToRight(int[] arr){
		int pseudoIndex = arr.length;
		List<Integer> listRight = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = arr.length-1; i >= 0; i--) {
			if(st.size() == 0) { //if stack is empty push -1
				listRight.add(pseudoIndex);
			}
			
			
			
			else if(st.size() > 0 && arr[st.peek()] < arr[i]){
				listRight.add(st.peek());
			}
			
			
			else if(st.size() > 0 && arr[st.peek()] >= arr[i]){
				while(st.size() > 0 && arr[st.peek()] >= arr[i]) {
					st.pop();
				}
				
				
				if(st.size() == 0) {
					listRight.add(pseudoIndex);
				}
				
				
				else {
					listRight.add(st.peek());
				}
			}
			
			//add the element to stack
			st.add(i);
		}
		
		return listRight;
	}
	
	private static int findMaxArea(int[] area) {
		Arrays.sort(area);
		
		return area[area.length - 1];
	}
}