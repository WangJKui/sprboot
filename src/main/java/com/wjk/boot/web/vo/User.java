package com.wjk.boot.web.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName:  User   
 * @Description:用户实体
 * 			简化设计，一个用户只能有一个角色，因此User表中设置一个role_id字段关联角色 
 * @author: WangJKui
 * @date:   2019年1月16日 下午3:52:25   
 *
 */
public class User implements Serializable {

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 8889340350797575449L;

	private String id;
	private String userName;
	private String password;
	private String role_id;
	private String userAccount;

	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", role_id=" + role_id
				+ ", userAccount=" + userAccount + "]";
	}
	
	

}
