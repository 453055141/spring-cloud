package com.zk.controller;

import com.zk.entity.User;
import com.zk.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Description
 * @Author zengkai
 * @Date 2018/8/26 15:52
 */
@RestController
public class MembersController {

    @Autowired
    private UserRepository userRepository;

//    @GetMapping("save")
//    public String save(){
//        User goodsInfo = new User(System.currentTimeMillis(),
//                "商品"+System.currentTimeMillis(),"这是一个测试商品");
//        userRepository.save(goodsInfo);
//        return "success";
//    }

    //http://localhost:8888/delete?id=1525415333329
//    @GetMapping("delete")
//    public String delete(Integer id){
//        userRepository.delete(id);
//        return "success";
//    }

    //http://localhost:8888/update?id=1525417362754&name=修改&description=修改
//    @GetMapping("update")
//    public String update(long id,String name,String description){
//        User goodsInfo = new User(id,
//                name,description);
//        goodsRepository.save(goodsInfo);
//        return "success";
//    }

    //http://localhost:8888/getOne?id=1525417362754
    @GetMapping("getOne")
    public Optional<User> getOne(Integer username){
        Optional<User> user = userRepository.findById(3);
        return user;
    }


    //每页数量
    private Integer PAGESIZE=10;

    //http://localhost:8888/getGoodsList?query=商品
    //http://localhost:8888/getGoodsList?query=商品&pageNumber=1
    //根据关键字"商品"去查询列表，name或者description包含的都查询
//    @GetMapping("getGoodsList")
//    public List<User> getList(Integer pageNumber,String query){
//        if(pageNumber==null){
//            pageNumber = 0;
//        }
//        //es搜索默认第一页页码是0
//        SearchQuery searchQuery=getEntitySearchQuery(pageNumber,PAGESIZE,query);
//        Page<User> goodsPage = userRepository.search(searchQuery);
//        return goodsPage.getContent();
//    }


//    private SearchQuery getEntitySearchQuery(int pageNumber, int pageSize, String searchContent) {
//        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
//                .add(QueryBuilders.matchPhraseQuery("name", searchContent),
//                        ScoreFunctionBuilders.weightFactorFunction(100))
//                .add(QueryBuilders.matchPhraseQuery("description", searchContent),
//                        ScoreFunctionBuilders.weightFactorFunction(100))
//                //设置权重分 求和模式
//                .scoreMode("sum")
//                //设置权重分最低分
//                .setMinScore(10);
//
//        // 设置分页
//        Pageable pageable = new PageRequest(pageNumber, pageSize);
//        return new NativeSearchQueryBuilder()
//                .withPageable(pageable)
//                .withQuery(functionScoreQueryBuilder).build();
//    }


}
