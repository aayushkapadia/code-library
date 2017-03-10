package Test.Graph;

import Source.IO.MyScanner;
import Source.Graph.UnionFind;

import java.util.*;

public class UnionFindTest
{
	public static void main(String[] args)
	{
		MyScanner sc = new MyScanner();
		int t = sc.nextInt();
		for(int j=1;j<=t;j++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();

			UnionFind uf = new UnionFind(n); 
			for(int i=0;i<m;i++)
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				a--;b--;
				uf.join(a,b);
			}

			ArrayList<ArrayList<Integer>> components = uf.getComponents();
			for(ArrayList<Integer> component:components)
			{
				for(Integer ver:component)
				{
					System.out.print((ver+1)+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}