package myclasses;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
public static void main(String...s)
{
	int[][] grid= {{2,1,1},{1,1,0},{0,1,1}};
	Queue <O> q=new LinkedList<>();
	int m=grid.length;
	int n=grid[0].length;
	boolean [][] visit=new boolean[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(grid[i][j]==2)
			{
				q.add(new O(i,j,0));
				visit[i][j]=true;
			}
				
		}
	}
	int res=0;
	while(!q.isEmpty())
	{
		System.out.println("inside while");
		O cur=q.poll();
		res=Math.max(res,cur.layer);
		if(inside(grid,cur.x+1,cur.y) && grid[cur.x+1][cur.y]==1 && !visit[cur.x+1][cur.y])
		{
			System.out.println("inside 1");
			q.add(new O(cur.x+1,cur.y,cur.layer+1));
			visit[cur.x+1][cur.y]=true;
			
		}
		if(inside(grid,cur.x-1,cur.y) && grid[cur.x-1][cur.y]==1 && !visit[cur.x-1][cur.y])
		{
			System.out.println("inside 2");

			q.add(new O(cur.x-1,cur.y,cur.layer+1));
			visit[cur.x-1][cur.y]=true;
			
		}
		if(inside(grid,cur.x,cur.y+1) && grid[cur.x][cur.y+1]==1 && !visit[cur.x][cur.y+1])
		{
			System.out.println("inside 3");
			q.add(new O(cur.x,cur.y+1,cur.layer+1));
			visit[cur.x][cur.y+1]=true;
			
		}
		if(inside(grid,cur.x,cur.y-1) && grid[cur.x][cur.y-1]==1 && !visit[cur.x][cur.y-1])
		{
			System.out.println("inside 4");
			q.add(new O(cur.x,cur.y-1,cur.layer+1));
			visit[cur.x][cur.y-1]=true;
			
		}
		System.out.println(res);
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(visit[i][j]==false && grid[i][j]==1)
			{
				System.out.println(i+" "+j);
				System.out.println("Impossible Event");
			}
				
		}
	}
	
}

private static boolean inside(int[][] grid, int i, int y) {
	// TODO Auto-generated method stub
	if(i<0||i>=grid.length || y<0 || y>=grid[0].length)
		return false;
	return true;
}
}
