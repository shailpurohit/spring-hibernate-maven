package com.sample.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@Entity
@Table(name = "\"Users\"")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User extends AbstractTimestampEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "\"userCode\"")
	private int userCode;

	@Column(name = "\"email\"")
	private String email;
	
	@OneToMany
	@JoinColumn(name="\"userCode\"")
	//@JsonIgnore
	private Set<Todo> todos;

	public Set<Todo> getTodos() {
		return todos;
	}
	
	public void setTodos(Set<Todo> todos) {
		this.todos = todos;
	}

	public int getUserCode() {
		return userCode;
	}

	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

