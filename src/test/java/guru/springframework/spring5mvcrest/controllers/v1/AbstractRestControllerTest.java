package guru.springframework.spring5mvcrest.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Adetola on 06/07/2019
 */
public abstract class AbstractRestControllerTest {

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}