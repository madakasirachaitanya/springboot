package com.revature.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_inventory")

public class BookInventory {

	@Id
	@GeneratedValue
	@Column(name = "inventory_id")
	private int inventoryId;

	@Column(name = "quantity")
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "isbn")
	private Book book;

	@ManyToOne
	@JoinColumn(name = "id")
	private User user;
		public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
