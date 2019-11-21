package cn.yunhe.seckill.entity;

import java.io.Serializable;
import java.util.Date;

public class Successseckilled{
	
	private int seckillId;
	private long userPhone;
	private int state;
	private Date createTime;
	//一对一
	private Seckill seckill;
	
	
	
	public int getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(int seckillId) {
		this.seckillId = seckillId;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Seckill getSeckill() {
		return seckill;
	}
	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}
	@Override
	public String toString() {
		return "Successseckilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
				+ ", createTime=" + createTime + ", seckill=" + seckill + "]";
	}
	public Successseckilled(int seckillId, long userPhone, int state, Date createTime, Seckill seckill) {
		super();
		this.seckillId = seckillId;
		this.userPhone = userPhone;
		this.state = state;
		this.createTime = createTime;
		this.seckill = seckill;
	}
	public Successseckilled() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
