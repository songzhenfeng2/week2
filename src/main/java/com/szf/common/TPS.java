package com.szf.common;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
/**
 * 
 * @ClassName: TPS 
 * @Description: TPS服务实体类
 * @author: 宋圳峰
 * @date: 2020年4月27日 上午9:00:37
 */
public class TPS {
	private BigInteger tid;
	private String tname;
	private Integer tage;
	private BigDecimal money;
	private Date tdate;
	public BigInteger getTid() {
		return tid;
	}
	public void setTid(BigInteger tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTage() {
		return tage;
	}
	public void setTage(Integer tage) {
		this.tage = tage;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	public TPS(BigInteger tid, String tname, Integer tage, BigDecimal money, Date tdate) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tage = tage;
		this.money = money;
		this.tdate = tdate;
	}
	public TPS() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TPS [tid=" + tid + ", tname=" + tname + ", tage=" + tage + ", money=" + money + ", tdate=" + tdate
				+ "]";
	}

	

}
