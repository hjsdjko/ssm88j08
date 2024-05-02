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


import com.dao.ChufangyudingDao;
import com.entity.ChufangyudingEntity;
import com.service.ChufangyudingService;
import com.entity.vo.ChufangyudingVO;
import com.entity.view.ChufangyudingView;

@Service("chufangyudingService")
public class ChufangyudingServiceImpl extends ServiceImpl<ChufangyudingDao, ChufangyudingEntity> implements ChufangyudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufangyudingEntity> page = this.selectPage(
                new Query<ChufangyudingEntity>(params).getPage(),
                new EntityWrapper<ChufangyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufangyudingEntity> wrapper) {
		  Page<ChufangyudingView> page =new Query<ChufangyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufangyudingVO> selectListVO(Wrapper<ChufangyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufangyudingVO selectVO(Wrapper<ChufangyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufangyudingView> selectListView(Wrapper<ChufangyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufangyudingView selectView(Wrapper<ChufangyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
