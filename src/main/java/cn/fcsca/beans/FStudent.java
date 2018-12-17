package cn.fcsca.beans;

import java.util.Set;

public class FStudent {
    private Integer sid;
    private String sname;
    private Set<FCourse> fCourses;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<FCourse> getfCourses() {
        return fCourses;
    }

    public void setfCourses(Set<FCourse> fCourses) {
        this.fCourses = fCourses;
    }

    @Override
    public String toString() {
        return "FStudent{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", fCourses=" + fCourses +
                '}';
    }
}
