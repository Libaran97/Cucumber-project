package Java_Classes;

import java.util.HashMap;

public class J2_DemoDataDriver2 {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("url", "https://demo.actitime.com/");
	map.put("username", "admin");
	map.put("password", "manager");
	System.out.println(map.get("password"));
}
}
