package com.dao;

import com.entity.ChufangshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufangshebeiVO;
import com.entity.view.ChufangshebeiView;


/**
 * 厨房设备
 * 
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface ChufangshebeiDao extends BaseMapper<ChufangshebeiEntity> {
	
	List<ChufangshebeiVO> selectListVO(@Param("ew") Wrapper<ChufangshebeiEntity> wrapper);
	
	ChufangshebeiVO selectVO(@Param("ew") Wrapper<ChufangshebeiEntity> wrapper);
	
	List<ChufangshebeiView> selectListView(@Param("ew") Wrapper<ChufangshebeiEntity> wrapper);

	List<ChufangshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<ChufangshebeiEntity> wrapper);
	
	ChufangshebeiView selectView(@Param("ew") Wrapper<ChufangshebeiEntity> wrapper);
	
}
