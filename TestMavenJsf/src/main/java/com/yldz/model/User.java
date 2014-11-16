package com.yldz.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private int no;

	private String ad;

	private String soyad;

	private String okul;

	public User() {

	}

	public User(int no, String ad, String soyad, String okul) {

		this.no = no;
		this.ad = ad;
		this.soyad = soyad;
		this.okul = okul;
	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return the ad
	 */
	public String getAd() {
		return ad;
	}

	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}

	/**
	 * @return the soyad
	 */
	public String getSoyad() {
		return soyad;
	}

	/**
	 * @param soyad the soyad to set
	 */
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	/**
	 * @return the okul
	 */
	public String getOkul() {
		return okul;
	}

	/**
	 * @param okul the okul to set
	 */
	public void setOkul(String okul) {
		this.okul = okul;
	}

}
