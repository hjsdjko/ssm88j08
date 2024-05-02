package com.entity.model;

import com.entity.YonghupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public class YonghupingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 厨房评价
	 */
	
	private String chufangpingjia;
		
	/**
	 * 服务评价
	 */
	
	private String fuwupingjia;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：厨房评价
	 */
	 
	public void setChufangpingjia(String chufangpingjia) {
		this.chufangpingjia = chufangpingjia;
	}
	
	/**
	 * 获取：厨房评价
	 */
	public String getChufangpingjia() {
		return chufangpingjia;
	}
				
	
	/**
	 * 设置：服务评价
	 */
	 
	public void setFuwupingjia(String fuwupingjia) {
		this.fuwupingjia = fuwupingjia;
	}
	
	/**
	 * 获取：服务评价
	 */
	public String getFuwupingjia() {
		return fuwupingjia;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
