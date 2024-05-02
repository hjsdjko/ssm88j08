package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenxikehuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenxikehuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenxikehuView;


/**
 * 分析客户
 *
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface FenxikehuService extends IService<FenxikehuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenxikehuVO> selectListVO(Wrapper<FenxikehuEntity> wrapper);
   	
   	FenxikehuVO selectVO(@Param("ew") Wrapper<FenxikehuEntity> wrapper);
   	
   	List<FenxikehuView> selectListView(Wrapper<FenxikehuEntity> wrapper);
   	
   	FenxikehuView selectView(@Param("ew") Wrapper<FenxikehuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenxikehuEntity> wrapper);
   	
}

