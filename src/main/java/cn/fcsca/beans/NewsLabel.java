package cn.fcsca.beans;

import java.util.Set;

//新闻栏目:当前的新闻栏目被看作是一方，即父栏目
//新闻栏目:当前的新闻栏目被看作是多方，即子栏目

public class NewsLabel {
    private Integer id;
    private String name;              //栏目名称
    private Set<NewsLabel> children;  //子栏目
    private NewsLabel parent;         //父栏目

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<NewsLabel> getChildren() {
        return children;
    }

    public void setChildren(Set<NewsLabel> children) {
        this.children = children;
    }


    public NewsLabel getParent() {
        return parent;
    }

    public void setParent(NewsLabel parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "NewsLabel{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", children=" + children +
                ", parent=" + parent +

                '}';
    }
}
