import controller.BankController;
import controller.RequestMapping;

import java.lang.reflect.Method;

public class Dispatcher {

    public void route(String path) {
        BankController con = BankController.getInstance();
        Method[] methods = con.getClass().getDeclaredMethods();

        for (Method method : methods) {

            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);

            if(rm == null) continue;

            if (rm.uri().equals(path)) {
                try {
                    method.invoke(con);
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