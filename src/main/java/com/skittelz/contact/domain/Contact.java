package com.skittelz.contact.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Domain class for the contact information
 */
@Entity
@Table(name = "CONTACTS")
@SequenceGenerator(sequenceName = "contact_id_seq", name = "contact_seq_gen")
@NamedQueries({
		@NamedQuery(name = "CONTACTS.findAll", query = "SELECT c FROM Contact c order by c.createdOn DESC"),
		@NamedQuery(name = "CONTACTS.findById", query = "SELECT c FROM Contact c WHERE c.contactId = :id"),
		@NamedQuery(name = "CONTACTS.findByName", query = "SELECT c FROM Contact c WHERE c.name = :name") })
public class Contact {

	public Contact() {

	}

	public Contact(Long contactId, String name, String email, String message) {

		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.message = message;
	}

	@Id
	@Column(name = "CONTACTID")
	@GeneratedValue(generator = "contact_seq_gen", strategy = GenerationType.AUTO)
	Long contactId;

	@NotEmpty
    @Size(max = 50)
	@Column(name = "NAME")
	String name;

	@NotEmpty
    @Email
    @Size(min = 3,max = 100)
	@Column(name = "EMAIL")
	String email;

	@NotEmpty
	@Column(name = "MESSAGE")
	String message;

	@Column(name = "CREATEDBY")
	Long createdBy;

	//@DateTimeFormat(pattern="MM/dd/yyyy")
    //@NotNull @Past   
	@Column(name = "CREATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	Date createdOn;

	@Column(name = "LASTUPDATEDBY")
	Long lastUpdatedBy;

	@Column(name = "LASTUPDATEDON")
	@Temporal(TemporalType.TIMESTAMP)
	Date lastUpdatedOn;

	/**
	 * @return the contact Id
	 */
	public Long getContactId() {
		return contactId;
	}

	/**
	 * @param contactId
	 *            the contact Id to set
	 */
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the name of the contact
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email of contact
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contactId == null) ? 0 : contactId.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (contactId == null) {
			if (other.contactId != null)
				return false;
		} else if (!contactId.equals(other.contactId))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name
				+ ", email=" + email + ", message=" + message + "]";
	}

}
