package practice.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "stack")
public class Stack {

	private List<String> list = new ArrayList<String>();
	private String value;

	public void push() {
		list.add(this.value);
	}

	public void pop() {
		list.remove(list.size() - 1);
	}

	public void setValue(String value) {
		this.value = value;
	}

}
