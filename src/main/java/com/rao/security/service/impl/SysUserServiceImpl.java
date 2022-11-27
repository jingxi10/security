package com.rao.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rao.security.domain.SysUser;
import com.rao.security.service.SysUserService;
import com.rao.security.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 86180
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2022-11-26 19:26:03
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




