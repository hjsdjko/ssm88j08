package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 用户评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
@TableName("yonghupingjia")
public class YonghupingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghupingjiaEntity() {
		
	}
	
	public YonghupingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 评价编号
	 */
					
	private String pingjiabianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：评价编号
	 */
	public void setPingjiabianhao(String pingjiabianhao) {
		this.pingjiabianhao = pingjiabianhao;
	}
	/**
	 * 获取：评价编号
	 */
	public String getPingjiabianhao() {
		return pingjiabianhao;
	}
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
