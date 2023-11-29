package com.li.services.impl;

import com.li.dao.IAdminDao;
import com.li.dao.impl.AdminDaoImpl;
import com.li.domain.Admin;
import com.li.services.IAdminServices;

/**
 * @Program: car_zujie
 * @ClassName: AdminServicesImpl
 * @Description:
 * @Author: admin
 * @Create: 2020-06-24 09:53
 */
public class AdminServicesImpl implements IAdminServices {
    IAdminDao dao = new AdminDaoImpl();

    @Override
    public int Login(Admin admin) {
        if(dao.queryAdminByUsername(admin.getUsername())){
            if(dao.queryAdmin(admin)){
                return 1;
            }else {
                return -1;
            }
        }else {
            return 0;
        }
    }
}
