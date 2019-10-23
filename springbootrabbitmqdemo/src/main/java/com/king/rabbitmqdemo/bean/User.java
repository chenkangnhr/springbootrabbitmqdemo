package com.king.rabbitmqdemo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author King Chen
 */

@ToString
@Data
public class User implements Serializable {

	private static final long serialVersionUID = 2784698843602168556L;

	@ApiModelProperty(value = "用户身份", example = "1003")
	private String userId;
	@ApiModelProperty(value = "用户中文名称", example = "赵飞燕")
	private String userName;
	@ApiModelProperty(value = "用户英文名称", example = "Jam")
	private String userEnglishName;
	@ApiModelProperty(value = "用户年龄", example = "26")
	private Integer userAge;
	@ApiModelProperty(value = "用户净资产", example = "123232.3663")
	private BigDecimal userNetAssert;
	@ApiModelProperty(value = "用户生日", example = "2001-01-01 22:22:22")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date userBirthday;

}
