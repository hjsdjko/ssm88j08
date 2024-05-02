package com.entity.vo;

import com.entity.ChufangfenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 厨房分析
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public class ChufangfenxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 厨房编号
	 */
	
	private String chufangbianhao;
		
	/**
	 * 厨房名称
	 */
	
	private String chufangmingcheng;
		
	/**
	 * 使用次数
	 */
	
	private Integer shiyongcishu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：厨房编号
	 */
	 
	public void setChufangbianhao(String chufangbianhao) {
		this.chufangbianhao = chufangbianhao;
	}
	
	/**
	 * 获取：厨房编号
	 */
	public String getChufangbianhao() {
		return chufangbianhao;
	}
				
	
	/**
	 * 设置：厨房名称
	 */
	 
	public void setChufangmingcheng(String chufangmingcheng) {
		this.chufangmingcheng = chufangmingcheng;
	}
	
	/**
	 * 获取：厨房名称
	 */
	public String getChufangmingcheng() {
		return chufangmingcheng;
	}
				
	
	/**
	 * 设置：使用次数
	 */
	 
	public void setShiyongcishu(Integer shiyongcishu) {
		this.shiyongcishu = shiyongcishu;
	}
	
	/**
	 * 获取：使用次数
	 */
	public Integer getShiyongcishu() {
		return shiyongcishu;
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
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
