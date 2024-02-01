package com.entity.view;

import com.entity.ShouyinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收银信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-08-01 14:15:21
 */
@TableName("shouyinxinxi")
public class ShouyinxinxiView  extends ShouyinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouyinxinxiView(){
	}
 
 	public ShouyinxinxiView(ShouyinxinxiEntity shouyinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shouyinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
