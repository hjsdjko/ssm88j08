package com.dao;

import com.entity.ChufangyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufangyudingVO;
import com.entity.view.ChufangyudingView;


/**
 * 厨房预订
 * 
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface ChufangyudingDao extends BaseMapper<ChufangyudingEntity> {
	
	List<ChufangyudingVO> selectListVO(@Param("ew") Wrapper<ChufangyudingEntity> wrapper);
	
	ChufangyudingVO selectVO(@Param("ew") Wrapper<ChufangyudingEntity> wrapper);
	
	List<ChufangyudingView> selectListView(@Param("ew") Wrapper<ChufangyudingEntity> wrapper);

	List<ChufangyudingView> selectListView(Pagination page,@Param("ew") Wrapper<ChufangyudingEntity> wrapper);
	
	ChufangyudingView selectView(@Param("ew") Wrapper<ChufangyudingEntity> wrapper);
	
}
