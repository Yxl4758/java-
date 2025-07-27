package _05Test;

import java.util.Arrays;
import java.util.List;

public enum Province {
    Beijing("北京", Arrays.asList("朝阳区","海淀区","昌平区")),
    Hebei("河北", Arrays.asList("石家庄","保定","沧州")),
    Shandong("山东",Arrays.asList("济南","青岛","淄博"));

    private final String name;
    private final List<String> citys;

    Province(String name, List<String> citys){
        this.name = name;
        this.citys = citys;
    }
    public String getName() {
        return name;
    }
    public List<String> getCitys() {
        return citys;
    }
}
