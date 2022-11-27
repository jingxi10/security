package com.rao.security.controller;


import com.rao.security.domain.SysUser;
import com.rao.security.service.SysUserService;
import com.rao.security.util.JwtUtils;
import com.rao.security.util.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/user/list")
    public R userList(@RequestHeader(required = false) String token){
        if (!StringUtils.isEmpty(token)) {
            Map<String, Object> resutMap = new HashMap<>();
            List<SysUser> userList = sysUserService.list();
            resutMap.put("userList", userList);
            return R.ok(resutMap);
        }else {
            return R.error(401,"没有权限访问");
        }
    }

    @GetMapping("/login")
    public R login(){
        String token = JwtUtils.genJwtToken("rxb");
        return R.ok().put("token",token);
    }
}
