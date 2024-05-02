package com.entity.view;

import com.entity.ChufangshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 厨房设备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
@TableName("chufangshebei")
public class ChufangshebeiView  extends ChufangshebeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChufangshebeiView(){
	}
 
 	public ChufangshebeiView(ChufangshebeiEntity chufangshebeiEntity){
 	try {
			BeanUtils.copyProperties(this, chufangshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
