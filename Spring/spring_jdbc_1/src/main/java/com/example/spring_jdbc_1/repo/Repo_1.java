package com.example.spring_jdbc_1.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.spring_jdbc_1.model.Holidays;

@Repository
public class Repo_1 {

    private JdbcTemplate temp;

    @Autowired
    public void setTemp(JdbcTemplate temp) {
        this.temp = temp;
    }

    public void save(Holidays h1) {
        String sql = "INSERT INTO Batch1 (Id, Name, Ticket_ID, Lunch) VALUES (?, ?, ?, ?)";
        int x = temp.update(sql, h1.getId(), h1.getName(), h1.getTicket_ID(), h1.getLunch());
        System.out.println("Number of rows affected is " + x);
    }

    public List<Holidays> findAll() {
        String sql = "SELECT * FROM Batch1";

        RowMapper<Holidays> mapper = new RowMapper<Holidays>() {
            @Override
            public Holidays mapRow(ResultSet rs, int rowNum) throws SQLException {
                Holidays h1 = new Holidays();
                h1.setId(rs.getInt("Id"));
                h1.setName(rs.getString("Name"));
                h1.setTicket_ID(rs.getInt("Ticket_ID"));
                h1.setLunch(rs.getString("Lunch"));
                return h1;
            }
        };
        
        List<Holidays> holi = temp.query(sql, mapper);

        return holi;
    }
}
