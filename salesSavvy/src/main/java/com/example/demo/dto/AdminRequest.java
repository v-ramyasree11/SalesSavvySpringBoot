
package com.example.demo.dto;

public class AdminRequest {
	private String username;
    private String password;
    public AdminRequest() {
		// TODO Auto-generated constructor stub
	}
	public AdminRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
