package org.example.pos_backend.dao.custom;

import com.example.bootstrapposbackend.dao.CrudDAO;
import com.example.bootstrapposbackend.entity.User;

import java.sql.Connection;

public interface UserData extends CrudDAO<User> {
    boolean isExistsUser(String email, String password, Connection connection);
}
