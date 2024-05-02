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


import com.dao.ChufangfenxiDao;
import com.entity.ChufangfenxiEntity;
import com.service.ChufangfenxiService;
import com.entity.vo.ChufangfenxiVO;
import com.entity.view.ChufangfenxiView;

@Service("chufangfenxiService")
public class ChufangfenxiServiceImpl extends ServiceImpl<ChufangfenxiDao, ChufangfenxiEntity> implements ChufangfenxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufangfenxiEntity> page = this.selectPage(
                new Query<ChufangfenxiEntity>(params).getPage(),
                new EntityWrapper<ChufangfenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufangfenxiEntity> wrapper) {
		  Page<ChufangfenxiView> page =new Query<ChufangfenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufangfenxiVO> selectListVO(Wrapper<ChufangfenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufangfenxiVO selectVO(Wrapper<ChufangfenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufangfenxiView> selectListView(Wrapper<ChufangfenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufangfenxiView selectView(Wrapper<ChufangfenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
