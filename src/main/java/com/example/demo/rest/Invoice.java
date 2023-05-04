package com.example.demo.rest;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
//@Table(name = "REST_DB_ACCESS")
@Table(name = "invoice")
@org.hibernate.annotations.NamedQueries({
    @org.hibernate.annotations.NamedQuery(name = "Invoice.findAll",  query = "SELECT e FROM Invoice e"),
    @org.hibernate.annotations.NamedQuery(name = "Invoice.findDate", query = "SELECT e FROM Invoice e WHERE date = :date"),
	 @org.hibernate.annotations.NamedQuery(name = "Invoice.findId",  query = "SELECT e FROM Invoice e WHERE id = :id")
	
	/*
	@org.hibernate.annotations.NamedQuery(name = "Invoice.findAuthor", query = "SELECT e FROM Invoice e WHERE author = :author"),
	@org.hibernate.annotations.NamedQuery(name = "Invoice.findId", query = "SELECT e FROM Invoice e WHERE id = :id"),
	@org.hibernate.annotations.NamedQuery(name = "Invoice.removeIsbn", query = "DELETE FROM Invoice e WHERE isbn = :isbn"),
	@org.hibernate.annotations.NamedQuery(name = "Invoice.removeAuthor", query = "DELETE FROM Invoice e WHERE author = :author"),
	@org.hibernate.annotations.NamedQuery(name = "Invoice.removeId", query = "DELETE FROM Invoice e WHERE e.id = :id")
	*/

})

@XmlRootElement
public class Invoice {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(length = 6)
  private String elec_index;
  
  @Column(length = 6)
  private String gas_index;
  
  @Column(length = 8)
  private String date;
  
  //Default constructor
  public Invoice(){}
  
  public int getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }

  public String getElec_index() {
    return elec_index;
  }

  public void setElec_index(String elec_index) {
    this.elec_index = elec_index;
  }
  
  public String getGas_index() {
    return gas_index;
  }

  public void setGas_index(String gas_index) {
    this.gas_index = gas_index;
  }
	
	public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
