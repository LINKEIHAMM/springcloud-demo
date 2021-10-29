package com.lian.springcloud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Lian
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Dept implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long deptid;
    private String deptname;
    private String dbsource;

    public Dept(String deptname, String dbsource) {
        this.deptname = deptname;
        this.dbsource = dbsource;
    }
}
