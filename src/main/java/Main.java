import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = ClientForHttp.getResponse("https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats");
        //test
        //System.out.println(str);
        List<Catfacts> cFacts = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            cFacts = objectMapper.readValue(str, new TypeReference<>() {
            });
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        String srtFacts = cFacts.stream().filter(c -> c.getUpvotes() != null)
                .filter(c -> !Objects.equals(c.getUpvotes(), ""))
                .filter(c -> !Objects.equals(c.getUpvotes(), "0"))
                .collect(Collectors.toList())
                .toString();
        System.out.println(srtFacts);
    }
}
