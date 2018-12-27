import java.io.*;
import java.util.*;
	public class CharRev{
		public static void main(String args[]){
			
			Scanner sc=new Scanner(System.in);
			StringBuffer sb=new StringBuffer();
			String str=sc.next();
			char a,b;
			for(int i=0;i<str.length()-1;i=i+2){
			
			a=str.charAt(i);
			b=str.charAt(i+1);
			sb.append(b).append(a);
		  }
			System.out.println(sb);
			
			}
			}
