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


import com.dao.FenxikehuDao;
import com.entity.FenxikehuEntity;
import com.service.FenxikehuService;
import com.entity.vo.FenxikehuVO;
import com.entity.view.FenxikehuView;

@Service("fenxikehuService")
public class FenxikehuServiceImpl extends ServiceImpl<FenxikehuDao, FenxikehuEntity> implements FenxikehuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenxikehuEntity> page = this.selectPage(
                new Query<FenxikehuEntity>(params).getPage(),
                new EntityWrapper<FenxikehuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenxikehuEntity> wrapper) {
		  Page<FenxikehuView> page =new Query<FenxikehuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenxikehuVO> selectListVO(Wrapper<FenxikehuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenxikehuVO selectVO(Wrapper<FenxikehuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenxikehuView> selectListView(Wrapper<FenxikehuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenxikehuView selectView(Wrapper<FenxikehuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
