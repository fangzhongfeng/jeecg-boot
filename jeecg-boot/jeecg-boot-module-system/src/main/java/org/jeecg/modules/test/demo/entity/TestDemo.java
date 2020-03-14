package org.jeecg.modules.test.demo.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 测试用户表
 * @Author: jeecg-boot
 * @Date:   2020-03-14
 * @Version: V1.0
 */
@Data
@TableName("test_demo")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="test_demo对象", description="测试用户表")
public class TestDemo implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ID_WORKER_STR)
    @ApiModelProperty(value = "主键")
    private String id;
	/**创建人登录名称*/
	@Excel(name = "创建人登录名称", width = 15)
    @ApiModelProperty(value = "创建人登录名称")
    private String createBy;
	/**创建日期*/
	@Excel(name = "创建日期", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建日期")
    private Date createTime;
	/**更新人登录名称*/
	@Excel(name = "更新人登录名称", width = 15)
    @ApiModelProperty(value = "更新人登录名称")
    private String updateBy;
	/**更新日期*/
	@Excel(name = "更新日期", width = 15)
    @ApiModelProperty(value = "更新日期")
    private Date updateTime;
	/**用户名*/
	@Excel(name = "用户名", width = 15)
    @ApiModelProperty(value = "用户名")
    private String name;
	/**性别*/
	@Excel(name = "性别", width = 15, dicCode = "sex")
	@Dict(dicCode = "sex")
    @ApiModelProperty(value = "性别")
    private String sex;
	/**年龄*/
	@Excel(name = "年龄", width = 15)
    @ApiModelProperty(value = "年龄")
    private Integer age;
	/**描述*/
	@Excel(name = "描述", width = 15)
    @ApiModelProperty(value = "描述")
    private String descc;
	/**生日*/
	@Excel(name = "生日", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "生日")
    private Date birthday;
	/**用户编码*/
	@Excel(name = "用户编码", width = 15)
    @ApiModelProperty(value = "用户编码")
    private String userCode;
	/**头像*/
	@Excel(name = "头像", width = 15)
    @ApiModelProperty(value = "头像")
    private String topPic;
	/**附件*/
	@Excel(name = "附件", width = 15)
    @ApiModelProperty(value = "附件")
    private String fileKk;
}
