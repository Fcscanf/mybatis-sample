package cn.fcsca.beans;

import java.util.Set;

public class FCourse {
    private Integer cid;
    private String cname;
    private Set<FStudent> fStudents;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<FStudent> getfStudents() {
        return fStudents;
    }

    public void setfStudents(Set<FStudent> fStudents) {
        this.fStudents = fStudents;
    }

    /*
    * 双向关联关系中toString时显示一方就可以，不能同时被调用*/
    @Override
    public String toString() {
        return "FCourse{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
//                ", fStudents=" + fStudents +
                '}';
    }
}
