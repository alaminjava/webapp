package com.exam;
// Generated Feb 13, 2020 7:48:15 AM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Student implements java.io.Serializable {

    private int sid;
    private String sname;
    private String semail;
    private String password;
    private List<Student> list = new ArrayList<>();
 
    public Student() {
    }

    public Student(int sid) {
        this.sid = sid;
    }

    public Student(int sid, String sname, String semail, String password) {
        this.sid = sid;
        this.sname = sname;
        this.semail = semail;
        this.password = password;
    }

    public int getSid() {
        return this.sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return this.sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSemail() {
        return this.semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public void doInsert() {
        studentDAO d = new studentDAO();
        d.doAdd(this);
        list= d.doShow(this);

    }

    public void doUpdate() {
        studentDAO d = new studentDAO();
        d.doUpdate(this);
        list= d.doShow(this);

    }

    public void dodelete() {
        studentDAO d = new studentDAO();
        d.doDelete(this);
        list= d.doShow(this);

    }

    public void doShowAll() {
        studentDAO d = new studentDAO();
        list= d.doShow(this);

    }
        public void doShowById() {
        studentDAO d = new studentDAO();
        list= d.doShowById(this);

    }


}
