package hello;

/**
 * @author najus
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private int result;

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public int getResult() {
		return result;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void add() {
		this.result = firstNumber + secondNumber;
	}

	public void subtract() {
		this.result = firstNumber - secondNumber;
	}

	public void multiply() {
		this.result = firstNumber * secondNumber;
	}

	public void divide() {
		if (firstNumber == 0 || secondNumber == 0) {
			this.result = 0;
		} else {
			this.result = firstNumber / secondNumber;
		}

	}
}
