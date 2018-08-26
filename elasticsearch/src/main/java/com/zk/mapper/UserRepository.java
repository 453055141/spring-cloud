package com.zk.mapper;

import com.zk.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Description
 * @Author zengkai
 * @Date 2018/8/25 15:13
 */

public interface UserRepository extends ElasticsearchRepository<User, Integer> {

//    /**
//     * 查询用户名为username的用户
//     * @param user_name
//     * @return
//     */
//    List<User> findByUser_name(String user_name);


//
//    /**
//     * 查询用户名不是username的所有用户
//     * @param username
//     * @return
//     */
//    List<User> findByUsernameNot(String user_name);
//
//
//
//    /**
//     * 用户名模糊查询
//     * @param username
//     * @return
//     */
//    List<User> findByUsernameLike(String user_name);
//
//
//    /**
//     * 查询以start开头的用户
//     * @param start
//     * @return
//     */
//    List<User> findByUsernameStartingWith(String start);
//
//    /**
//     * 查询以end结尾的用户
//     * @return
//     */
//    List<User> findByUsernameEndingWith(String end);
//
//    /**
//     * 查询用户名包含word的用户
//     * @param word
//     * @return
//     */
//    List<User> findByUsernameContaining(String word);
//
//    /**
//     * 查询名字属于usernames中的用户
//     * @param user_name
//     * @return
//     */
//    List<User> findByUsernameIn(Collection<String> user_name);
//
//    /**
//     * 查询名字不属于usernames中的用户
//     * @param user_name
//     * @return
//     */
//    List<User> findByUsernameNotIn(Collection<String> user_name);

//    /**
//     *最后来个复杂点的：查询年龄小于ageTo,姓名以start开头，id大于idTo的用户，并且按照年龄倒序
//     * @return
//     */
//    List<User> findByAgeBeforeAndUsernameStartingWithAndIdGreaterThanOrderByAgeDesc(Integer ageTo, String start, Long idTo);
}
