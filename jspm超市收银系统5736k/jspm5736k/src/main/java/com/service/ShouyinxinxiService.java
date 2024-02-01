package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouyinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouyinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouyinxinxiView;


/**
 * 收银信息
 *
 * @author 
 * @email 
 * @date 2022-08-01 14:15:21
 */
public interface ShouyinxinxiService extends IService<ShouyinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouyinxinxiVO> selectListVO(Wrapper<ShouyinxinxiEntity> wrapper);
   	
   	ShouyinxinxiVO selectVO(@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
   	
   	List<ShouyinxinxiView> selectListView(Wrapper<ShouyinxinxiEntity> wrapper);
   	
   	ShouyinxinxiView selectView(@Param("ew") Wrapper<ShouyinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouyinxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShouyinxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShouyinxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShouyinxinxiEntity> wrapper);
}

