package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="User_Detailstable")
public class User {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="User_id")
int id;


@Column(name="User_Name")
String name;

public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}

}
