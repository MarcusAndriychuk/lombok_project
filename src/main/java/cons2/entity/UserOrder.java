package cons2.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_order")
public class UserOrder extends BaseEntity {
	@Column(name = "createdAt",columnDefinition = "TIMES DEFAULT CURRENT_TIMESTAMP")
	private Date createdAt;

	@Override
	public String toString() {
		return "UserOrder [createdAt=" + createdAt + ", getId()=" + getId()
				+ "]";
	}
	
	
	
}
