## 本项目实现的最终作用是基于JSP汽车出租管理系统
## 分为2个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 会员管理
 - 管理员登录
 - 订单管理
 - 车辆管理
### 第2个角色为用户角色，实现了如下功能：
 - 历史订单查询
 - 提交租车订单
 - 用户登录
 - 用户首页
 - 进行中的订单
## 数据库设计如下：
# 数据库设计文档

**数据库名：** car_zujie

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [admin](#admin) | 管理员表 |
| [carport](#carport) |  |
| [corder](#corder) |  |
| [user](#user) | 用户表 |

**表名：** <a id="admin">admin</a>

**说明：** 管理员表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | username |   varchar   | 255 |   0    |    N     |  Y   |       | 用户名  |
|  2   | password |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 密码  |

**表名：** <a id="carport">carport</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | cid |   int   | 10 |   0    |    N     |  Y   |       | 分类ID  |
|  2   | cimg |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | cinfo |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | cname |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 分类名称  |
|  5   | crent |   double   | 256 |   0    |    Y     |  N   |   NULL    |   |
|  6   | status |   int   | 10 |   0    |    Y     |  N   |   NULL    | 状态  |

**表名：** <a id="corder">corder</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | oid |   int   | 10 |   0    |    N     |  Y   |       | 订单ID  |
|  2   | cid |   int   | 10 |   0    |    Y     |  N   |   NULL    | 分类ID  |
|  3   | cname |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | email |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 邮箱  |
|  5   | crent |   double   | 256 |   0    |    Y     |  N   |   NULL    |   |
|  6   | takeTime |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  7   | getTime |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  8   | status |   int   | 10 |   0    |    Y     |  N   |   NULL    | 状态  |

**表名：** <a id="user">user</a>

**说明：** 用户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | email |   varchar   | 255 |   0    |    N     |  Y   |       | 邮箱  |
|  2   | username |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 用户名  |
|  3   | pwd |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 密码  |
|  4   | sex |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 性别  |
|  5   | tel |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 电话  |
|  6   | address |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 地址  |
|  7   | status |   int   | 10 |   0    |    Y     |  N   |   NULL    | 状态  |

**运行不出来可以微信 javape 我的公众号：源码码头**
