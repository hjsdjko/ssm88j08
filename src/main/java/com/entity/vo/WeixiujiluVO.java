package com.entity.vo;

import com.entity.WeixiujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 维修记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public class WeixiujiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 维修内容
	 */
	
	private String weixiuneirong;
		
	/**
	 * 维修原因
	 */
	
	private String weixiuyuanyin;
		
	/**
	 * 维修状态
	 */
	
	private String weixiuzhuangtai;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：维修内容
	 */
	 
	public void setWeixiuneirong(String weixiuneirong) {
		this.weixiuneirong = weixiuneirong;
	}
	
	/**
	 * 获取：维修内容
	 */
	public String getWeixiuneirong() {
		return weixiuneirong;
	}
				
	
	/**
	 * 设置：维修原因
	 */
	 
	public void setWeixiuyuanyin(String weixiuyuanyin) {
		this.weixiuyuanyin = weixiuyuanyin;
	}
	
	/**
	 * 获取：维修原因
	 */
	public String getWeixiuyuanyin() {
		return weixiuyuanyin;
	}
				
	
	/**
	 * 设置：维修状态
	 */
	 
	public void setWeixiuzhuangtai(String weixiuzhuangtai) {
		this.weixiuzhuangtai = weixiuzhuangtai;
	}
	
	/**
	 * 获取：维修状态
	 */
	public String getWeixiuzhuangtai() {
		return weixiuzhuangtai;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
