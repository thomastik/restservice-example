package restservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * JPA Entity class for User 
 * Auto generated getters and setters enabled by https://projectlombok.org/
 *  
 * @author thomas
 */
@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String lastName;
    private String firstName;
    
    public User() {
		super();
	}

    public User(Long id, String lastName, String firstName) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
