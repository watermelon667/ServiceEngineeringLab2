package org.example.ynu.edu.controller;

import org.example.ynu.edu.entity.CommonResult;
import org.example.ynu.edu.entity.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "success(11001)/getUserById/{userId}";
        try{
            User u = new User(userId, "小明", "123456");
            result.setResult(u);
        }
        catch(Exception e){
            code = 500;
            message = "failed";
        }
        result.setMessage(message);
        result.setCode(code);
        System.out.println(11001);
        return result;
    }

    @PostMapping("/saveUserByRequestBody")
    public CommonResult<User> saveUserByRequestBody(@RequestBody User user){
        //ResquestBody需要发送json格式
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "success(11001)/saveUserByRequestBody";
        try{
            result.setResult(user);
        }
        catch(Exception e){
            code = 500;
            message = "failed";
        }
        result.setMessage(message);
        result.setCode(code);
        System.out.println(11001);
        return result;
    }

    @PutMapping("/putUser")
    public CommonResult<User> putUser(@RequestBody User user){
        //ResquestBody需要发送json格式
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "success(11001)putUser";
        try{
            result.setResult(user);
        }
        catch(Exception e){
            code = 500;
            message = "failed";
        }
        result.setMessage(message);
        result.setCode(code);
        System.out.println(11001+"putUser");
        return result;
    }

    @DeleteMapping("/deleteUserById/{userId}")
    public CommonResult<User> deleteUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "success(11001)/deleteUserById/{userId}";
        try{
            User u = new User(userId, "小明(delete)", "123456");
            result.setResult(u);
        }
        catch(Exception e){
            code = 500;
            message = "failed";
        }
        result.setMessage(message);
        result.setCode(code);
        System.out.println(11001+"/deleteUserById/{userId}");
        return result;
    }
}