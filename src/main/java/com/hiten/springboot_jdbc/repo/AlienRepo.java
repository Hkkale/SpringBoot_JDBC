package com.hiten.springboot_jdbc.repo;

import com.hiten.springboot_jdbc.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AlienRepo {

    @Autowired
    private JdbcTemplate template;

    public void save(Alien al){
        String sql="insert into alien (id,name, age, domain, exp) values(?,?,?,?,?)";
        int rows=template.update(sql, al.getId(), al.getName(), al.getAge(), al.getDomain(), al.getExp());
        System.out.println(rows+" rows Affected");
    }

    public List<Alien> findAll() {
        String sql = "select * from alien";
        RowMapper<Alien> mapper = (ResultSet rs, int rowNum) -> {
            Alien a = new Alien();
            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setAge(rs.getInt(3));
            a.setDomain(rs.getString(4));
            a.setExp(rs.getInt(5));

            return a;

        };
        List<Alien> al=template.query(sql, mapper);
        return al;
    }
    }


