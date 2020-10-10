package org.la.student.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "creditcard")
public class CreditCard implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cc_id;
	
	@Column(name="cc_num")
	private String cc_num;
	
	@Column(name="holder_name")
	private String holder_name;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date expiry_date;
	
	public CreditCard() {}

	public long getCc_id() {
		return cc_id;
	}

	public void setCc_id(long cc_id) {
		this.cc_id = cc_id;
	}

	public String getCc_num() {
		return cc_num;
	}

	public void setCc_num(String cc_num) {
		this.cc_num = cc_num;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	
}

