package len.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

/**
 * <p>
 * 后台管理员表
 * </p>
 *
 * @author len
 * @since 2019-03-23
 */
public class SystemAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 员工ID，后台管理员绑定员工档案
     */
    private Long personnelId;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 登录账号
     */
    private String username;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 单点登录UUID
     */
    private String uuid;

    /**
     * 中文名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 是否属于招聘负责人，也就是HR
     */
    private Integer isHr;

    /**
     * 超级管理员，标识可读数据程度
     */
    private Integer isSuper;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新修改时间
     */
    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Long personnelId) {
        this.personnelId = personnelId;
    }
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Integer getIsHr() {
        return isHr;
    }

    public void setIsHr(Integer isHr) {
        this.isHr = isHr;
    }
    public Integer getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(Integer isSuper) {
        this.isSuper = isSuper;
    }
    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "SystemAdmin{" +
        "id=" + id +
        ", personnelId=" + personnelId +
        ", companyId=" + companyId +
        ", username=" + username +
        ", email=" + email +
        ", password=" + password +
        ", uuid=" + uuid +
        ", name=" + name +
        ", nickname=" + nickname +
        ", isHr=" + isHr +
        ", isSuper=" + isSuper +
        ", gmtCreate=" + gmtCreate +
        ", gmtModified=" + gmtModified +
        "}";
    }
}
