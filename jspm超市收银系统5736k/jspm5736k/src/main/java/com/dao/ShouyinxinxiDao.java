package com.dao;

import com.entity.ShouyinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouyinxinxiVO;
import com.entity.view.ShouyinxinxiView;


/**
 * 收银信息
 * 
 * @author 
 * @email 
 * @date 2022-08-01 14:15:21
 */
public interface ShouyinxinxiDao extends BaseMapper<ShouyinxinxiEntity> {
	
	List<ShouyinxinxiVO> selectListVO(@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
	
	ShouyinxinxiVO selectVO(@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
	
	List<ShouyinxinxiView> selectListView(@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);

	List<ShouyinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
	
	ShouyinxinxiView selectView(@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
}
