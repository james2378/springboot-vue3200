package com.entity.view;

import com.entity.NewsEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 新闻信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("news")
public class NewsView extends NewsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 新闻类型的值
		*/
		private String newsValue;
		/**
		* 新闻审核的值
		*/
		private String newsYesnoValue;



		//级联表 meiti
			/**
			* 媒体姓名
			*/
			private String meitiName;
			/**
			* 头像
			*/
			private String meitiPhoto;
			/**
			* 联系方式
			*/
			private String meitiPhone;
			/**
			* 邮箱
			*/
			private String meitiEmail;
			/**
			* 假删
			*/
			private Integer meitiDelete;

	public NewsView() {

	}

	public NewsView(NewsEntity newsEntity) {
		try {
			BeanUtils.copyProperties(this, newsEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 新闻类型的值
			*/
			public String getNewsValue() {
				return newsValue;
			}
			/**
			* 设置： 新闻类型的值
			*/
			public void setNewsValue(String newsValue) {
				this.newsValue = newsValue;
			}
			/**
			* 获取： 新闻审核的值
			*/
			public String getNewsYesnoValue() {
				return newsYesnoValue;
			}
			/**
			* 设置： 新闻审核的值
			*/
			public void setNewsYesnoValue(String newsYesnoValue) {
				this.newsYesnoValue = newsYesnoValue;
			}










				//级联表的get和set meiti

					/**
					* 获取： 媒体姓名
					*/
					public String getMeitiName() {
						return meitiName;
					}
					/**
					* 设置： 媒体姓名
					*/
					public void setMeitiName(String meitiName) {
						this.meitiName = meitiName;
					}

					/**
					* 获取： 头像
					*/
					public String getMeitiPhoto() {
						return meitiPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setMeitiPhoto(String meitiPhoto) {
						this.meitiPhoto = meitiPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getMeitiPhone() {
						return meitiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setMeitiPhone(String meitiPhone) {
						this.meitiPhone = meitiPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getMeitiEmail() {
						return meitiEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setMeitiEmail(String meitiEmail) {
						this.meitiEmail = meitiEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getMeitiDelete() {
						return meitiDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setMeitiDelete(Integer meitiDelete) {
						this.meitiDelete = meitiDelete;
					}








}
