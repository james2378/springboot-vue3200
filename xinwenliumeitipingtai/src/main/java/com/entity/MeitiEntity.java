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
 * 媒体
 *
 * @author 
 * @email
 */
@TableName("meiti")
public class MeitiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeitiEntity() {

	}

	public MeitiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 媒体姓名
     */
    @TableField(value = "meiti_name")

    private String meitiName;


    /**
     * 头像
     */
    @TableField(value = "meiti_photo")

    private String meitiPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 联系方式
     */
    @TableField(value = "meiti_phone")

    private String meitiPhone;


    /**
     * 邮箱
     */
    @TableField(value = "meiti_email")

    private String meitiEmail;


    /**
     * 假删
     */
    @TableField(value = "meiti_delete")

    private Integer meitiDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：媒体姓名
	 */
    public String getMeitiName() {
        return meitiName;
    }
    /**
	 * 获取：媒体姓名
	 */

    public void setMeitiName(String meitiName) {
        this.meitiName = meitiName;
    }
    /**
	 * 设置：头像
	 */
    public String getMeitiPhoto() {
        return meitiPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setMeitiPhoto(String meitiPhoto) {
        this.meitiPhoto = meitiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getMeitiPhone() {
        return meitiPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setMeitiPhone(String meitiPhone) {
        this.meitiPhone = meitiPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getMeitiEmail() {
        return meitiEmail;
    }
    /**
	 * 获取：邮箱
	 */

    public void setMeitiEmail(String meitiEmail) {
        this.meitiEmail = meitiEmail;
    }
    /**
	 * 设置：假删
	 */
    public Integer getMeitiDelete() {
        return meitiDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setMeitiDelete(Integer meitiDelete) {
        this.meitiDelete = meitiDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Meiti{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", meitiName=" + meitiName +
            ", meitiPhoto=" + meitiPhoto +
            ", sexTypes=" + sexTypes +
            ", meitiPhone=" + meitiPhone +
            ", meitiEmail=" + meitiEmail +
            ", meitiDelete=" + meitiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
