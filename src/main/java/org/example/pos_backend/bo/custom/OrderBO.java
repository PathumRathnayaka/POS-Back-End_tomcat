package org.example.pos_backend.bo.custom;

import com.example.bootstrapposbackend.bo.SuperBO;
import com.example.bootstrapposbackend.dto.OrderDTO;

import java.sql.Connection;

public interface OrderBO extends SuperBO {
    boolean saveOrder(OrderDTO orderDTO, Connection connection);
}
