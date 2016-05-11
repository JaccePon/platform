package jp.platform.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.platform.main.entity.User;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

   /* @Autowired
    private UserDao userDao;*/
    @Autowired
    private PasswordHelper passwordHelper;
/*    @Autowired
    private RoleService roleService;*/

    /**
     * 创建用户
     * @param user
     */
    public User createUser(User user) {
        //加密密码
        passwordHelper.encryptPassword(user);
       /* return userDao.createUser(user);*/
        return null;
    }

     
    public User updateUser(User user) {
       /* return userDao.updateUser(user);*/
    	return null;
    }

     
    public void deleteUser(Long userId) {
        /*userDao.deleteUser(userId);*/
    }

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    public void changePassword(Long userId, String newPassword) {
       /* User user =userDao.findOne(userId);
        user.setPassword(newPassword);
        passwordHelper.encryptPassword(user);
        userDao.updateUser(user);*/
    }

     
    public User findOne(Long userId) {
        /*return userDao.findOne(userId);*/
    	return null;
    }

     
    public List<User> findAll() {
        /*return userDao.findAll();*/
    	return null;
        
    }

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username) {
       /* return userDao.findByUsername(username);*/
    	return null;
    }

    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    public Set<String> findRoles(String username) {
      /*  User user =findByUsername(username);
        if(user == null) {
            return Collections.EMPTY_SET;
        }
        return roleService.findRoles(user.getRoleIds().toArray(new Long[0]));*/
    	return null;
    }

    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    public Set<String> findPermissions(String username) {
      /*  User user =findByUsername(username);
        if(user == null) {
            return Collections.EMPTY_SET;
        }
        return roleService.findPermissions(user.getRoleIds().toArray(new Long[0]));*/
    	return null;
    }
}
