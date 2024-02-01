package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShouyinxinxiDao;
import com.entity.ShouyinxinxiEntity;
import com.service.ShouyinxinxiService;
import com.entity.vo.ShouyinxinxiVO;
import com.entity.view.ShouyinxinxiView;

@Service("shouyinxinxiService")
public class ShouyinxinxiServiceImpl extends ServiceImpl<ShouyinxinxiDao, ShouyinxinxiEntity> implements ShouyinxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouyinxinxiEntity> page = this.selectPage(
                new Query<ShouyinxinxiEntity>(params).getPage(),
                new EntityWrapper<ShouyinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouyinxinxiEntity> wrapper) {
		  Page<ShouyinxinxiView> page =new Query<ShouyinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouyinxinxiVO> selectListVO(Wrapper<ShouyinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouyinxinxiVO selectVO(Wrapper<ShouyinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouyinxinxiView> selectListView(Wrapper<ShouyinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouyinxinxiView selectView(Wrapper<ShouyinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShouyinxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShouyinxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShouyinxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
