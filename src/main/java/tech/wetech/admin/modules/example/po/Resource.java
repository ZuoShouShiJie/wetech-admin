package tech.wetech.admin.modules.example.po;

import javax.persistence.*;

@Table(name = "sys_resource")
public class Resource {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 资源类型
     */
    private String type;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 父编号
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 父编号列表
     */
    @Column(name = "parent_ids")
    private String parentIds;

    /**
     * 权限字符串
     */
    private String permission;

    /**
     * 是否有效
     */
    private Boolean available;

    /**
     * 图标
     */
    private String icon;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 叶子节点
     */
    private Boolean leaf;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取资源类型
     *
     * @return type - 资源类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置资源类型
     *
     * @param type 资源类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取链接地址
     *
     * @return url - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取父编号
     *
     * @return parent_id - 父编号
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父编号
     *
     * @param parentId 父编号
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取父编号列表
     *
     * @return parent_ids - 父编号列表
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * 设置父编号列表
     *
     * @param parentIds 父编号列表
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * 获取权限字符串
     *
     * @return permission - 权限字符串
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限字符串
     *
     * @param permission 权限字符串
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * 获取是否有效
     *
     * @return available - 是否有效
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 设置是否有效
     *
     * @param available 是否有效
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取优先级
     *
     * @return priority - 优先级
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置优先级
     *
     * @param priority 优先级
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取叶子节点
     *
     * @return leaf - 叶子节点
     */
    public Boolean getLeaf() {
        return leaf;
    }

    /**
     * 设置叶子节点
     *
     * @param leaf 叶子节点
     */
    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }
}