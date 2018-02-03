package cons2.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item")
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper =true, exclude = {"description", "price","amount" })
public class Item extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name = "price")
	private BigDecimal price;
	@Column(name = "amount")
	private int amount;
	
	
	public Item(String name, String description, BigDecimal price, int amount) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.amount = amount;
	}
	
	
}