package cn.fcsca.dao;

import cn.fcsca.beans.NewsLabel;

import java.util.List;

public interface INewsLabelDao {

    /*根据子节点查询父节点*/
    List<NewsLabel> selectChildrenByParent(int pid);

    /*根据ID查询其对应的子节点*/
    NewsLabel selectNewsLabelById(int id);


}
