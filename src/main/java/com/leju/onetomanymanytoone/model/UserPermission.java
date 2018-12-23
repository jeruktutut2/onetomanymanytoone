package com.leju.onetomanymanytoone.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user_permission")
public class UserPermission {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

//    @Column(name = "id_user")
//    private String idUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_permission")
    private Permission permission;

//    @Column(name = "id_permission")
//    private String idPermission;

    public UserPermission() {
    }

    public UserPermission(String id, User user, Permission permission) {
        this.id = id;
        this.user = user;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "UserPermission{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", permission=" + permission +
                '}';
    }
}
