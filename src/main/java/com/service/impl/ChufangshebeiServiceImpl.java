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


import com.dao.ChufangshebeiDao;
import com.entity.ChufangshebeiEntity;
import com.service.ChufangshebeiService;
import com.entity.vo.ChufangshebeiVO;
import com.entity.view.ChufangshebeiView;

@Service("chufangshebeiService")
public class ChufangshebeiServiceImpl extends ServiceImpl<ChufangshebeiDao, ChufangshebeiEntity> implements ChufangshebeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufangshebeiEntity> page = this.selectPage(
                new Query<ChufangshebeiEntity>(params).getPage(),
                new EntityWrapper<ChufangshebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufangshebeiEntity> wrapper) {
		  Page<ChufangshebeiView> page =new Query<ChufangshebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChufangshebeiVO> selectListVO(Wrapper<ChufangshebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufangshebeiVO selectVO(Wrapper<ChufangshebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufangshebeiView> selectListView(Wrapper<ChufangshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufangshebeiView selectView(Wrapper<ChufangshebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
