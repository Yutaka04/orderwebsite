package fdmgroup.OrderWebsite.model.customer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String drinkName;
	private String cupSize;
	private String sweetenerLevel;
	private String iceLevel;
	private boolean toppingPresent;
	private String toppingName;
	private boolean lessTopping;
	
	private CupSize cupSizeSelector;
	private HoneyLevel honeyLevelSelector;
	private SugarLevel sugarLevelSelector;
	private ToppingCustomiser toppingSelector;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	public Order() {
		super();
	}
	
	public Order(String drinkName, String cupSize, String sweetenerLevel, String iceLevel,String toppingName, boolean lessTopping) {
		super();
		this.drinkName = drinkName;
		this.cupSize = cupSize;
		this.sweetenerLevel = sweetenerLevel;
		this.iceLevel = iceLevel;
		this.toppingName = toppingName;
		if (toppingName.isEmpty()) {
			this.toppingPresent = false;
		}else {
			this.toppingPresent = true;
		}
		this.lessTopping = lessTopping;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize() {
		this.cupSize = cupSizeSelector.getCupSize();
	}

	public String getSweetenerLevel() {
		return sweetenerLevel;
	}

	public void setSweetenerLevel(String sweetenerLevel) {
		this.sweetenerLevel = sweetenerLevel;
	}

	public String getIceLevel() {
		return iceLevel;
	}

	public void setIceLevel(String iceLevel) {
		this.iceLevel = iceLevel;
	}

	public boolean isToppingPresent() {
		return toppingPresent;
	}

	public String getToppingName() {
		return toppingName;
	}

	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}

	public boolean isLessTopping() {
		return lessTopping;
	}

	public void setLessTopping(boolean lessTopping) {
		this.lessTopping = lessTopping;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
