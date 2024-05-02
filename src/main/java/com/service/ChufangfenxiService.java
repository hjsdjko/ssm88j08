package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufangfenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufangfenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufangfenxiView;


/**
 * 厨房分析
 *
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public interface ChufangfenxiService extends IService<ChufangfenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufangfenxiVO> selectListVO(Wrapper<ChufangfenxiEntity> wrapper);
   	
   	ChufangfenxiVO selectVO(@Param("ew") Wrapper<ChufangfenxiEntity> wrapper);
   	
   	List<ChufangfenxiView> selectListView(Wrapper<ChufangfenxiEntity> wrapper);
   	
   	ChufangfenxiView selectView(@Param("ew") Wrapper<ChufangfenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufangfenxiEntity> wrapper);
   	
}

