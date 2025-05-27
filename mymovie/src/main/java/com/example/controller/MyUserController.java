package com.example.controller;

import com.example.beans.MyUser;
import com.example.service.MyUserInterface;
import com.example.service.MyUserInterfaceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyUserController {



    //实例化一个service
    private MyUserInterface myUserInterface=new MyUserInterfaceImpl() ;
      @RequestMapping("/alluser")
    public String findalluser(){
          return  myUserInterface.findalluser().toString();
      }
      @RequestMapping("/adduser")
    public String addUser(MyUser myuser){
          if (myUserInterface.addUser(myuser)) {
              return  "增加用户成功";
          }else {
              return "增加用户失败";
          }
      }

      //在定义一个删除用户的方法
    @RequestMapping("/deluser")
    public synchronized String delUser(int id){
        if (myUserInterface.delUser(id)) {
            return "删除用户成功";
        }else {
            return "删除用户失败";
        }
    }
    //在定义一个更新用户的方法
    @RequestMapping("/updateuser")
    public synchronized String updateUser(MyUser myUser){

        if (myUserInterface.modiUser(myUser) ) {
            return "更新用户成功";
        }else {
            return "更新用户失败";
        }
    }
    //产生一个id查询某个用户的方法
    @RequestMapping("/findone")
    public  String findone(int id){
          return myUserInterface.findUserById(id).toString();
    }

    @RequestMapping("/findoneusn")
    public  String findoneusn(String myusername){
        return myUserInterface.findUserNameById(myusername).toString();
    }

    @RequestMapping("/updatepassword")
    public synchronized String updatepassword(MyUser username){
        if (myUserInterface.changepassword(username) ) {
            return "更新用户成功";
        }else {
            return "更新用户失败";
        }
    }

}

