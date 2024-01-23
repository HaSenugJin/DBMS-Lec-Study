package ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        String path = "/update-password";

        UserController con = new UserController();

        // con 클래스에 있는 메서드 다 가지고 옴
        Method[] methods = con.getClass().getDeclaredMethods();
        //System.out.println(methods.length);

        for (Method method : methods) {
            //System.out.println(method.getName());

            // 찾을 때 랜덤한 순서로 찾음
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);

            if(rm == null) continue;

            if (rm.uri().equals(path)) {
                try {
                    method.invoke(con); // con.login()과 같은 오브젝트를 호출 해줌
                    break;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}