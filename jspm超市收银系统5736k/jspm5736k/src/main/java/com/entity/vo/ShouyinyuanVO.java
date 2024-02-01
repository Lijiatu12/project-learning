package com.entity.vo;

import com.entity.ShouyinyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 收银员
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-08-01 14:15:21
 */
public class ShouyinyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 收银员姓名
	 */
	
	private String shouyinyuanxingming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 收银员手机
	 */
	
	private String shouyinyuanshouji;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：收银员姓名
	 */
	 
	public void setShouyinyuanxingming(String shouyinyuanxingming) {
		this.shouyinyuanxingming = shouyinyuanxingming;
	}
	
	/**
	 * 获取：收银员姓名
	 */
	public String getShouyinyuanxingming() {
		return shouyinyuanxingming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：收银员手机
	 */
	 
	public void setShouyinyuanshouji(String shouyinyuanshouji) {
		this.shouyinyuanshouji = shouyinyuanshouji;
	}
	
	/**
	 * 获取：收银员手机
	 */
	public String getShouyinyuanshouji() {
		return shouyinyuanshouji;
	}
			
}
