package com.qf.exam.shiro;


import com.qf.exam.dto.RPermission;
import com.qf.exam.pojo.Admin;
import com.qf.exam.pojo.Permission;
import com.qf.exam.pojo.Role;
import com.qf.exam.service.IAdminService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("myRealm")
public class MyRealm extends AuthorizingRealm {

    @Resource
    private IAdminService as;

    //授权方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo info =null;
        String adminName = getAvailablePrincipal(principalCollection).toString();

        List<RPermission> roles = as.getRoles(adminName);
        System.out.println("roles==>"+roles);
        if(roles != null){
            info = new SimpleAuthorizationInfo();

            for (RPermission r : roles) {
                info.addRole(r.getRname());
            }
        }

        List<RPermission> permission = as.getPermission(adminName);
        System.out.println("permission==>"+permission);
        if(permission != null){
            for (RPermission p : permission) {
                info.addStringPermission(p.getPname());
            }
        }


        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        AuthenticationInfo info = null;

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        String adminName = token.getUsername();
        char[] pwdch = token.getPassword();
        String pwd = new String(pwdch);


//6ea2df357faf1924fd956854a39020ff
//6ea2df357faf1924fd956854a39020ff
//6ea2df357faf1924fd956854a39020ff

        System.out.println("pwd=======>"+pwd);

        Admin admin = as.login(adminName, pwd);
        System.out.println("admin===>" + admin);
        if(admin != null){
            info = new SimpleAuthenticationInfo(adminName,pwd,getName());
            System.out.println(info);
        }


        return info;
    }
}
