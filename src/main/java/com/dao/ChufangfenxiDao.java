package com.dao;

import com.entity.ChufangfenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufangfenxiVO;
import com.entity.view.ChufangfenxiView;


/**
 * 厨房分析
 * 
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface ChufangfenxiDao extends BaseMapper<ChufangfenxiEntity> {
	
	List<ChufangfenxiVO> selectListVO(@Param("ew") Wrapper<ChufangfenxiEntity> wrapper);
	
	ChufangfenxiVO selectVO(@Param("ew") Wrapper<ChufangfenxiEntity> wrapper);
	
	List<ChufangfenxiView> selectListView(@Param("ew") Wrapper<ChufangfenxiEntity> wrapper);

	List<ChufangfenxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChufangfenxiEntity> wrapper);
	
	ChufangfenxiView selectView(@Param("ew") Wrapper<ChufangfenxiEntity> wrapper);
	
}
