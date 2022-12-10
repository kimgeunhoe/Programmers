package etc;

import java.util.ArrayList;
import java.util.List;

public class Te {

	public static void main(String[] args) {
		List<c> list = new ArrayList<>();
		List<c> head = new ArrayList<>();
		List<c> copy = new ArrayList<>();
		list.add(new c(1, null));
		list.add(new c(2, 1));
		list.add(new c(3, null));
		list.add(new c(4, 3));
		list.add(new c(5, null));
		list.add(new c(6, 1));
		list.add(new c(7, 5));
		list.add(new c(8, 3));
		list.add(new c(9, 3));
		list.add(new c(10, 1));
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getPid()==null) {
				head.add(list.get(i));
				list.remove(i);
				i--;
			}
		}
		
		for(int i=0; i<head.size(); i++) {
			copy.add(head.get(i));

			for(int j=0; j<list.size(); j++) {
				if(list.get(j).getPid()==head.get(i).getCid()) {
					copy.add(list.get(j));
					list.remove(j);
					j--;
				}
			}
		}
		
		for(c co : copy) {
			System.out.println(co.cid + " " + co.pid);
		}
	}

}

class c {
	int cid;
	Integer pid;
	
	public c(int cid, Integer pid) {
		this.cid = cid;
		this.pid = pid;
	}
	
	public int getCid() {
		return cid;
	}
	
	public Integer getPid() {
		return pid;
	}
}