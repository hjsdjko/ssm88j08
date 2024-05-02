package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufangshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufangshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufangshebeiView;


/**
 * 厨房设备
 *
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface ChufangshebeiService extends IService<ChufangshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufangshebeiVO> selectListVO(Wrapper<ChufangshebeiEntity> wrapper);
   	
   	ChufangshebeiVO selectVO(@Param("ew") Wrapper<ChufangshebeiEntity> wrapper);
   	
   	List<ChufangshebeiView> selectListView(Wrapper<ChufangshebeiEntity> wrapper);
   	
   	ChufangshebeiView selectView(@Param("ew") Wrapper<ChufangshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufangshebeiEntity> wrapper);
   	
}

