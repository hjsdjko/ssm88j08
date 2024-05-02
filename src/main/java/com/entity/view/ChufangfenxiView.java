package com.entity.view;

import com.entity.ChufangfenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 厨房分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
@TableName("chufangfenxi")
public class ChufangfenxiView  extends ChufangfenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChufangfenxiView(){
	}
 
 	public ChufangfenxiView(ChufangfenxiEntity chufangfenxiEntity){
 	try {
			BeanUtils.copyProperties(this, chufangfenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
