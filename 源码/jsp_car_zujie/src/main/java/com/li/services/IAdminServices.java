package com.li.services;

import com.li.domain.Admin;

/**
 * @Program: car_zujie
 * @ClassName: IAdminServices
 * @Description:
 * @Author: admin
 * @Create: 2020-06-24 09:51
 */
public interface IAdminServices {
    /**
     * @Description: 管理员登陆
     * @Author: admin
     * @Create: 2019/7/24-9:51
     * @param admin
     * @Return int 1:帐号密码争取 0:帐号不存在 -1:密码错误
     */
    int Login(Admin admin);
}
