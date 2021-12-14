package tech.wetech.admin.modules.example.po;

import javax.persistence.*;

@Table(name = "sys_role")
public class Role {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色名
     */
    private String role;

    /**
     * 描述
     */
    private String description;

    /**
     * 资源编号列表
     */
    @Column(name = "resource_ids")
    private String resourceIds;

    /**
     * 是否有效
     */
    private Boolean available;

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
     * 获取角色名
     *
     * @return role - 角色名
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置角色名
     *
     * @param role 角色名
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取资源编号列表
     *
     * @return resource_ids - 资源编号列表
     */
    public String getResourceIds() {
        return resourceIds;
    }

    /**
     * 设置资源编号列表
     *
     * @param resourceIds 资源编号列表
     */
    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
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
}