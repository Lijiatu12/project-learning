package com.entity.vo;

import com.entity.ShouyinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 收银信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-08-01 14:15:21
 */
public class ShouyinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
