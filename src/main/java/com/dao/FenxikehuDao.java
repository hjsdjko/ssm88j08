package com.dao;

import com.entity.FenxikehuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenxikehuVO;
import com.entity.view.FenxikehuView;


/**
 * 分析客户
 * 
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface FenxikehuDao extends BaseMapper<FenxikehuEntity> {
	
	List<FenxikehuVO> selectListVO(@Param("ew") Wrapper<FenxikehuEntity> wrapper);
	
	FenxikehuVO selectVO(@Param("ew") Wrapper<FenxikehuEntity> wrapper);
	
	List<FenxikehuView> selectListView(@Param("ew") Wrapper<FenxikehuEntity> wrapper);

	List<FenxikehuView> selectListView(Pagination page,@Param("ew") Wrapper<FenxikehuEntity> wrapper);
	
	FenxikehuView selectView(@Param("ew") Wrapper<FenxikehuEntity> wrapper);
	
}
