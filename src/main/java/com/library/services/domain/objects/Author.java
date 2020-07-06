package com.library.services.domain.objects;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Author implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6166479271216325480L;
	
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	
	/*@OneToMany(targetEntity=Book.class,mappedBy="author")
	List<Book> book;
*/

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}

