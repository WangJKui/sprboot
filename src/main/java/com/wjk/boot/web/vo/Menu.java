package com.wjk.boot.web.vo;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */
	private static final long serialVersionUID = 6459978030735867345L;

	private String id;
	private String name;
	private String type;
	private String p_id;
	private String icon;
	private String title;
	private String href;
	private String sort;
	private boolean spread;
	private List<Menu> children;
	
	public Menu() {
		super();
	}
	
	public Menu(String id, String name, String type, String p_id, String icon, String title, String href, String sort,
			boolean spread, List<Menu> children) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.p_id = p_id;
		this.icon = icon;
		this.title = title;
		this.href = href;
		this.sort = sort;
		this.spread = spread;
		this.children = children;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public boolean isSpread() {
		return spread;
	}
	public void setSpread(boolean spread) {
		this.spread = spread;
	}
	public List<Menu> getChildren() {
		return children;
	}
	public void setChildren(List<Menu> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", type=" + type + ", p_id=" + p_id + ", icon=" + icon + ", title="
				+ title + ", href=" + href + ", sort=" + sort + ", spread=" + spread + ", children=" + children + "]";
	}
	
	
}
