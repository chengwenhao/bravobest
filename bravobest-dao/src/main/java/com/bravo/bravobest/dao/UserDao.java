package com.bravo.bravobest.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bravo.bravobest.api.entity.User;
import com.bravo.bravobest.common.page.Pager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface UserDao extends BaseMapper<User> {

    /**
     * 查询list
     * @param pmap
     * @return
     * @throws Exception
     */
    List<User> queryList(Map<String, Object> pmap) throws Exception;

    /**
     * 查询当前登录人还没未考评的人
     * @param pmap
     * @return
     * @throws Exception
     */
    List<User> queryUnEvaluatePerson(Map<String, Object> pmap) throws Exception;

    /**
     * 查询
     * @param pmap
     * @return
     * @throws Exception
     */
    User queryOne(Map<String, Object> pmap) throws Exception;

    /**
     * 查询
     * @param pmap
     * @return
     * @throws Exception
     */
    User queryOneWithPassword(Map<String, Object> pmap) throws Exception;

    /**
     * 新增人员
     * @param user
     * @return
     * @throws Exception
     */
    int doSave(User user) throws Exception;


}
