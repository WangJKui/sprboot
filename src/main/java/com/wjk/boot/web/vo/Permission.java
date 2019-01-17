package com.wjk.boot.web.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName:  Permission   
 * @Description:权限实体 
 * @author: WangJKui
 * @date:   2019年1月16日 下午3:49:45   
 *
 */
public class Permission implements Serializable {

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = -9136786603915866982L;

	
	private String id;
	private String code;
	private String name;
	private String parent_id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", code=" + code + ", name=" + name + ", parent_id=" + parent_id + "]";
	}
	

}
