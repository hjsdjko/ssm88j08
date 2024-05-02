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
 * 厨房分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
@TableName("chufangfenxi")
public class ChufangfenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChufangfenxiEntity() {
		
	}
	
	public ChufangfenxiEntity(T t) {
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
	 * 分析编号
	 */
					
	private String fenxibianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：分析编号
	 */
	public void setFenxibianhao(String fenxibianhao) {
		this.fenxibianhao = fenxibianhao;
	}
	/**
	 * 获取：分析编号
	 */
	public String getFenxibianhao() {
		return fenxibianhao;
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
