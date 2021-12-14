package tech.wetech.admin.modules.example.po;

import javax.persistence.*;

@Table(name = "sys_group")
public class Group {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 组名称
     */
    private String name;

    /**
     * 组类型
     */
    private String type;

    /**
     * 描述
     */
    private String description;

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
     * 获取组名称
     *
     * @return name - 组名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置组名称
     *
     * @param name 组名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取组类型
     *
     * @return type - 组类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置组类型
     *
     * @param type 组类型
     */
    public void setType(String type) {
        this.type = type;
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
}