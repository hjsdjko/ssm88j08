package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufangyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufangyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufangyudingView;


/**
 * 厨房预订
 *
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface ChufangyudingService extends IService<ChufangyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufangyudingVO> selectListVO(Wrapper<ChufangyudingEntity> wrapper);
   	
   	ChufangyudingVO selectVO(@Param("ew") Wrapper<ChufangyudingEntity> wrapper);
   	
   	List<ChufangyudingView> selectListView(Wrapper<ChufangyudingEntity> wrapper);
   	
   	ChufangyudingView selectView(@Param("ew") Wrapper<ChufangyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufangyudingEntity> wrapper);
   	
}

