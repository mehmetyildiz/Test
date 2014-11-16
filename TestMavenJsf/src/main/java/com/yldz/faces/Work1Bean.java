package com.yldz.faces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.yldz.facade.Facade;
import com.yldz.model.NameValue;
import com.yldz.model.User;

@ManagedBean(name = "work1")
@ViewScoped
public class Work1Bean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<User> users = new ArrayList<User>();

	private List<NameValue> nameValueList = new ArrayList<NameValue>();

	private NameValue nameValue = new NameValue();

	@Inject
	public Facade facade;

	@PostConstruct
	private void init() {
		users.add(new User(1, "a", "a", "a1"));
		users.add(new User(2, "b", "b", "b1"));
		users.add(new User(3, "c", "c", "c1"));
		users.add(new User(4, "d", "d", "d1"));
		users.add(new User(5, "e", "e", "e1"));
		users.add(new User(6, "f", "f", "f1"));
		users.add(new User(7, "g", "g", "g1"));
		users.add(new User(8, "h", "h", "h1"));
		users.add(new User(9, "i", "i", "i1"));
		users.add(new User(10, "j", "j", "j1"));
		users.add(new User(11, "k", "k", "k1"));
		users.add(new User(12, "l", "l", "l1"));
		nameValue = new NameValue();
		nameValue.setName("aaaa");
		nameValue.setValue(1);
		nameValueList.add(nameValue);

		nameValue = new NameValue();
		nameValue.setName("bbbb");
		nameValue.setValue(2);
		nameValueList.add(nameValue);

		nameValue = new NameValue();
		nameValue.setName("cccc");
		nameValue.setValue(3);
		nameValueList.add(nameValue);
	}

	public void removeAll(User user) {
		users.remove(user);
	}

	public void send() {
		Weld weld = new Weld();
        WeldContainer konteyner = weld.initialize();
		Work1Bean w1 = konteyner.instance().select(Work1Bean.class).get();
		w1.facade.getConnection();
	}

	public void keepValue() {
		System.out.println("Value: " + nameValue.getValue());
		System.out.println("name: " + nameValue.getName());
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * @return the nameValueList
	 */
	public List<NameValue> getNameValueList() {
		return nameValueList;
	}

	/**
	 * @param nameValueList the nameValueList to set
	 */
	public void setNameValueList(List<NameValue> nameValueList) {
		this.nameValueList = nameValueList;
	}

	/**
	 * @return the nameValue
	 */
	public NameValue getNameValue() {
		return nameValue;
	}

	/**
	 * @param nameValue the nameValue to set
	 */
	public void setNameValue(NameValue nameValue) {
		this.nameValue = nameValue;
	}

}
