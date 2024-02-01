package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 收银员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-08-01 14:15:21
 */
@TableName("shouyinyuan")
public class ShouyinyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouyinyuanEntity() {
		
	}
	
	public ShouyinyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 收银员工号
	 */
					
	private String shouyinyuangonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：收银员工号
	 */
	public void setShouyinyuangonghao(String shouyinyuangonghao) {
		this.shouyinyuangonghao = shouyinyuangonghao;
	}
	/**
	 * 获取：收银员工号
	 */
	public String getShouyinyuangonghao() {
		return shouyinyuangonghao;
	}
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
