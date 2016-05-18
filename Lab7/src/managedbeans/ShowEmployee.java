package managedbeans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ShowEmployee {
	private Collection employeelist = new ArrayList();
	private Employee selectedEmployee = new Employee("1432", "Frank Brown", "625-345-2635", 45089.50);
	Iterator iterator;

	public ShowEmployee() {
		employeelist.add(new Employee("1432", "Frank Brown", "625-345-2635", 45089.50));
		employeelist.add(new Employee("1321", "John Doe", "625-345-3321", 56003.00));
		employeelist.add(new Employee("1634", "Mary Jones", "625-345-3421", 73998.30));
		iterator = employeelist.iterator();
	}

	public void selectEmployee(ActionEvent event) {
		UIParameter component = (UIParameter) event.getComponent().findComponent("empid");
		String id = component.getValue().toString();
		System.out.println("id = " + id);
		Iterator iter = employeelist.iterator();
		while (iter.hasNext()) {
			Employee emp = (Employee) iter.next();
			if (emp.getId().equals(id)) {
				selectedEmployee = emp;
				System.out.println("employee find= " + selectedEmployee.getName());
			}
		}
	}

	public void setEmployeelist(Collection employeelist) {
		this.employeelist = employeelist;
	}

	public Collection getEmployeelist() {
		return employeelist;
	}

	public void setSelectedEmployee(Employee selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}

	public Employee getSelectedEmployee() {
		return selectedEmployee;
	}

	public String showAll() {
		return "main2";
	}

	public String showMasterDetail() {
		return "main";
	}
}
