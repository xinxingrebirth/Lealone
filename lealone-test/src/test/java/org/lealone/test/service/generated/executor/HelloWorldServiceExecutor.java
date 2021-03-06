package org.lealone.test.service.generated.executor;

import org.lealone.db.service.ServiceExecutor;
import org.lealone.orm.json.JsonArray;
import org.lealone.test.service.impl.HelloWorldServiceImpl;

/**
 * Service executor for 'hello_world_service'.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
public class HelloWorldServiceExecutor implements ServiceExecutor {

    private final HelloWorldServiceImpl s = new HelloWorldServiceImpl();

    public HelloWorldServiceExecutor() {
    }

    @Override
    public String executeService(String methodName, String json) {
        JsonArray ja = null;
        switch (methodName) {
        case "SAY_HELLO":
            this.s.sayHello();
            break;
        case "SAY_GOODBYE_TO":
            ja = new JsonArray(json);
            String p_name2 = ja.getString(0);
            String result2 = this.s.sayGoodbyeTo(p_name2);
            if (result2 == null)
                return null;
            return result2;
        default:
            throw new RuntimeException("no method: " + methodName);
        }
        return NO_RETURN_VALUE;
    }
}
