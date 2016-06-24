package practice.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "stackBean")
@RequestScoped
public class StackBean {

	@ManagedProperty(value = "#{stack}")
	private Stack stack;

	public String push() {
		stack.push();
		return "";
	}

	public String pop() {
		stack.pop();
		return "";
	}

	public Stack getStack() {
		return stack;
	}

	public void setStack(Stack stack) {
		this.stack = stack;
	}

}
