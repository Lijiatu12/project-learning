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
 * 收银信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-08-01 14:15:21
 */
@TableName("shouyinxinxi")
public class ShouyinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouyinxinxiEntity() {
		
	}
	
	public ShouyinxinxiEntity(T t) {
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
	 * 收银编号
	 */
					
	private String shouyinbianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商品分类
	 */
					
	private String shangpinfenlei;
	
	/**
	 * 收银员工号
	 */
					
	private String shouyinyuangonghao;
	
	/**
	 * 收银员姓名
	 */
					
	private String shouyinyuanxingming;
	
	/**
	 * 收银时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shouyinshijian;
	
	/**
	 * 商品价格
	 */
					
	private Float shangpinjiage;
	
	/**
	 * 购买数量
	 */
					
	private Float goumaishuliang;
	
	/**
	 * 总价格
	 */
					
	private Float zongjiage;
	
	
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
	 * 设置：收银编号
	 */
	public void setShouyinbianhao(String shouyinbianhao) {
		this.shouyinbianhao = shouyinbianhao;
	}
	/**
	 * 获取：收银编号
	 */
	public String getShouyinbianhao() {
		return shouyinbianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：商品分类
	 */
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
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
	 * 设置：收银时间
	 */
	public void setShouyinshijian(Date shouyinshijian) {
		this.shouyinshijian = shouyinshijian;
	}
	/**
	 * 获取：收银时间
	 */
	public Date getShouyinshijian() {
		return shouyinshijian;
	}
	/**
	 * 设置：商品价格
	 */
	public void setShangpinjiage(Float shangpinjiage) {
		this.shangpinjiage = shangpinjiage;
	}
	/**
	 * 获取：商品价格
	 */
	public Float getShangpinjiage() {
		return shangpinjiage;
	}
	/**
	 * 设置：购买数量
	 */
	public void setGoumaishuliang(Float goumaishuliang) {
		this.goumaishuliang = goumaishuliang;
	}
	/**
	 * 获取：购买数量
	 */
	public Float getGoumaishuliang() {
		return goumaishuliang;
	}
	/**
	 * 设置：总价格
	 */
	public void setZongjiage(Float zongjiage) {
		this.zongjiage = zongjiage;
	}
	/**
	 * 获取：总价格
	 */
	public Float getZongjiage() {
		return zongjiage;
	}

}
