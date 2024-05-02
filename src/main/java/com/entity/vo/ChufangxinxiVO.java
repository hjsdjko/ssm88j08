package com.entity.vo;

import com.entity.ChufangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 厨房信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 10:31:35
 */
public class ChufangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
