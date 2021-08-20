/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;
import java.util.LinkedList;
/**
 *
 * @author Acer
 */
public class FCFS {
     public String p;
	public int bt, at;

	public  FCFS (String s, int bt, int at) {
		this.p=s;
		this.bt=bt;
		this.at=at;
	}
	public static void main(String []args) {
           
		LinkedList<FCFS> list = new LinkedList<FCFS>();
		LinkedList<WaitingTime> out = new LinkedList<WaitingTime>();

		list.add(new FCFS("p1",24,0));
		list.add(new FCFS("p2",3,1));
		list.add(new FCFS("p3",3,2));

		int end=0, sum=0;

		System.out.println("Process\t\t"+"Waiting time");
		for(int i=0;i<list.size();i++) {
			out.add(new WaitingTime(list.get(i).p, end-list.get(i).at));
			end+=list.get(i).bt;
		}
		for(int i=0;i<out.size();i++) { 
			System.out.println(out.get(i).pro+"\t\t"+out.get(i).wt);
			sum+=out.get(i).wt;
		}
		System.out.println("\nAverage waiting time: "+(float)sum/out.size());
	}
}

