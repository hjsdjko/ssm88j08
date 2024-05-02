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
 * 厨房信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
@TableName("chufangxinxi")
public class ChufangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChufangxinxiEntity() {
		
	}
	
	public ChufangxinxiEntity(T t) {
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
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 地点
	 */
					
	private String didian;
	
	/**
	 * 预订定金
	 */
					
	private Integer yudingdingjin;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 使用人数
	 */
					
	private Integer shiyongrenshu;
	
	/**
	 * 基本配置
	 */
					
	private String jibenpeizhi;
	
	/**
	 * 详细说明
	 */
					
	private String xiangxishuoming;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：地点
	 */
	public void setDidian(String didian) {
		this.didian = didian;
	}
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
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
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：使用人数
	 */
	public void setShiyongrenshu(Integer shiyongrenshu) {
		this.shiyongrenshu = shiyongrenshu;
	}
	/**
	 * 获取：使用人数
	 */
	public Integer getShiyongrenshu() {
		return shiyongrenshu;
	}
	/**
	 * 设置：基本配置
	 */
	public void setJibenpeizhi(String jibenpeizhi) {
		this.jibenpeizhi = jibenpeizhi;
	}
	/**
	 * 获取：基本配置
	 */
	public String getJibenpeizhi() {
		return jibenpeizhi;
	}
	/**
	 * 设置：详细说明
	 */
	public void setXiangxishuoming(String xiangxishuoming) {
		this.xiangxishuoming = xiangxishuoming;
	}
	/**
	 * 获取：详细说明
	 */
	public String getXiangxishuoming() {
		return xiangxishuoming;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
