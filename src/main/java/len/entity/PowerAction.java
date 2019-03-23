package len.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

/**
 * <p>
 * 权限功能表
 * </p>
 *
 * @author len
 * @since 2019-03-23
 */
public class PowerAction implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父节点ID
     */
    private Long parentId;

    /**
     * 功能类型(system_action_type)，1 菜单;2 页面(不显示在左侧菜单);3 按钮;
     */
    private Long typeId;

    /**
     * 唯一功能标识；类型为按钮(#开头)，用作定位;类型为菜单和页面，则作为页面路径
     */
    private String actionKey;

    /**
     * 显示名称
     */
    private String name;

    /**
     * 图标字符，默认用antd的图标
     */
    private String icon;

    /**
     * （预留）是否禁用，禁用则全部人无法访问
     */
    private String describe;

    /**
     * 功能等级，暂时用于菜单类型显示排序
     */
    private Integer position;

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
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }
    public String getActionKey() {
        return actionKey;
    }

    public void setActionKey(String actionKey) {
        this.actionKey = actionKey;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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
        return "PowerAction{" +
        "id=" + id +
        ", parentId=" + parentId +
        ", typeId=" + typeId +
        ", actionKey=" + actionKey +
        ", name=" + name +
        ", icon=" + icon +
        ", describe=" + describe +
        ", position=" + position +
        ", gmtCreate=" + gmtCreate +
        ", gmtModified=" + gmtModified +
        "}";
    }
}
