

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="User_Table")
public class User_backup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_id",nullable = false, unique = true)
	int id;
	
	
	@Column(name="User_Name", nullable=false)
	String name;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city",column = @Column(name="officeCity")),
		@AttributeOverride(name="state",column = @Column(name="officeState"))
	})
	Address officeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city",column = @Column(name="homeCity")),
		@AttributeOverride(name="state",column = @Column(name="homeState"))
	})
	Address homeAddress;
	
	
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
