package com.algorithm;

import java.util.Scanner;
import java.util.Arrays;

/*public class MergeSort {
	
	//static int n;
	//static String[] a;
	
	public static void getArray() {
		 String[] a;
		 int n;
		System.out.println("Enter the size of array");
		n=r.nextInt();
		a=new String[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			a[i]=r.next();
		}
		print(a);
		
		sort(a);
		print(a);
	}
	
	public static void merge(String a[], String[] b, String[] c) {
		/*int mid,i,j;
		if(n>1) {
			mid=n/2;
			String[] b = new String[mid];
			String[] c = new String[n-mid];
			for(i=0;i<mid;i++)
			{
				for(j=0;j<mid;j++) {
					b[j]=arr[i];
				}
			}
			
			for(i=mid;i<n;i++)
			{
				for(j=0;j<n-mid;j++) {
					c[j]=arr[i];
				}
			}
			
			merge(b,mid);
			merge(c,n-mid);
			mergeSort(b,c,arr,mid,(n-mid));
			
			
		}*/

		/*
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i].compareTo(b[j])<0) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			c[k] = a[j];
			j++;
			k++;
		}
		
		
		
		
	}

	private static void sort(String[] a) {
		// TODO Auto-generated method stub

		if (a.length == 1)
			return;
		String[] l = new String[a.length / 2];
		String[] r = new String[a.length - l.length];
		int i;
		for (i = 0; i < l.length; i++) {
			l[i] = a[i];
		}
		for (int j = 0; j < r.length; j++) {
			r[j] = a[i];
			i++;
		}
		sort(l);
		sort(r);
		merge(l, r, a);
	}

	private static void mergeSort(String[] b, String[] c, String[] a,int p, int q) {
		int i,j,k;
		i=j=k=0;
		while((i<p) && (j<q)) {
			
			 if(b[i].compareTo(c[j])<0){
				a[k]=b[i];
				i++;
				
			}
			else {
				a[k]=c[j];
				j++;
			}
			k++;
		}
		if(i==p) {
			while((j<p) && (k<(p+q))) {
				a[k]=c[j];
				k++;
				j++;
			}
		}
		
		else 
			while((i<p) && (k<(p+q))) {
				a[k]=b[i];
				i++;
				k++;
			}
			
		
		
		
	}

	public static void print(String[] a) {
		for (String string : a) {
			System.out.print(string);
			
		}
		System.out.println();
		
	}
	
	
	

}
*/


public class MergeSort {
	static Scanner r = new Scanner(System.in);
    public static void getArray() {
    System.out.println("Enter the size of array");
    int n=r.nextInt();
    String values[]=new String[n];
    System.out.println("Enter the array");
    for(int i=0;i<n;i++) {
    	values[i]=r.next();
    }
       
        mergeSort(values, 0, values.length - 1);
        System.out.println("Result " + Arrays.toString(values));
    }

    public static void mergeSort(String[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
      
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }


    public static void merge(String[] a, int from, int mid, int to) {
        int n = to - from + 1;       
        String[] b = new String[n];   
        int i1 = from;              
        int i2 = mid + 1;           
        int j = 0;                  

        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }

}
