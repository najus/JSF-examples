package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
import shopping.ShoppingCart;

@ManagedBean
@RequestScoped
public class Cart {
	private ShoppingCart shoppingCart;
	private double totalPrice = 0;

	public Cart() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		shoppingCart = (ShoppingCart) session.getAttribute("cart");
		if (shoppingCart == null) {
			shoppingCart = new ShoppingCart();
			session.setAttribute("cart", shoppingCart);
		}
	}

	public void removeFromCart(ActionEvent event) {
		UIParameter component = (UIParameter) event.getComponent().findComponent("itemcode");
		String itemcode = component.getValue().toString();
		shoppingCart.removeFromCart(itemcode);
	}

	public String showProducts() {
		return "shop";
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

}
