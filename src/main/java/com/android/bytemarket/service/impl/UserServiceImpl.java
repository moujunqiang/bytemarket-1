package com.android.bytemarket.service.impl;

import com.android.bytemarket.entity.User;
import com.android.bytemarket.dao.UserDao;
import com.android.bytemarket.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lequal
 * @since 2019-11-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
