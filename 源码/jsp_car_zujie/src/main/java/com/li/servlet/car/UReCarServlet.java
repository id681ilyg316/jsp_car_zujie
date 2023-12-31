package com.li.servlet.car;

import com.li.domain.Order;
import com.li.services.IOrderServices;
import com.li.services.impl.OrderServicesImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Program: car_zujie
 * @ClassName: ReCarServlet
 * @Description: ${description}
 * @Author: admin
 * @Create: 2020-06-24 19:00
 */
@WebServlet("/UReCarServlet")
public class UReCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oid = request.getParameter("oid");
        String cid = request.getParameter("cid");

        Order order = new Order();
        order.setCid(Integer.parseInt(cid));
        order.setOid(Integer.parseInt(oid));
        IOrderServices services = new OrderServicesImpl();
        services.successOrder(order);

    }
}
