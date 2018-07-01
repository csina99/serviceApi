package api;

import model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface HelloServiceApi {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello (@RequestParam("name") String name);

    @RequestMapping(value = "/queryUser", method = RequestMethod.GET)
    User queryUser(@RequestParam("name") String name, @RequestParam("age") int age);

    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    String updateUser(@RequestBody User user);
}
