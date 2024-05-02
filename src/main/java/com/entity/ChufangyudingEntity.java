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
 * 厨房预订
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
@TableName("chufangyuding")
public class ChufangyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChufangyudingEntity() {
		
	}
	
	public ChufangyudingEntity(T t) {
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
	 * 厨房编号
	 */
					
	private String chufangbianhao;
	
	/**
	 * 厨房名称
	 */
					
	private String chufangmingcheng;
	
	/**
	 * 预订定金
	 */
					
	private Integer yudingdingjin;
	
	/**
	 * 是否预订
	 */
					
	private String shifouyuding;
	
	/**
	 * 预订时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yudingshijian;
	
	/**
	 * 预订时长
	 */
					
	private Integer yudingshizhang;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：预订定金
	 */
	public void setYudingdingjin(Integer yudingdingjin) {
		this.yudingdingjin = yudingdingjin;
	}
	/**
	 * 获取：预订定金
	 */
	public Integer getYudingdingjin() {
		return yudingdingjin;
	}
	/**
	 * 设置：是否预订
	 */
	public void setShifouyuding(String shifouyuding) {
		this.shifouyuding = shifouyuding;
	}
	/**
	 * 获取：是否预订
	 */
	public String getShifouyuding() {
		return shifouyuding;
	}
	/**
	 * 设置：预订时间
	 */
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	/**
	 * 获取：预订时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
	/**
	 * 设置：预订时长
	 */
	public void setYudingshizhang(Integer yudingshizhang) {
		this.yudingshizhang = yudingshizhang;
	}
	/**
	 * 获取：预订时长
	 */
	public Integer getYudingshizhang() {
		return yudingshizhang;
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
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
