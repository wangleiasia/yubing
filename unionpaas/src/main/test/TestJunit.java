import com.yubing.web.model.devops.config.DevopsConfigInfo;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by wanglei on 2017/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestJunit {

    @Autowired
    private JedisPool jedisPool;
    @Autowired
    private ShardedJedisPool shardedJedisPool;

    private void p(String str) {
        System.out.println(str);
    }

    @Test
    public void testJedisPool() throws Exception {
        //获取ShardedJedis对象
        Jedis jedis = jedisPool.getResource();
//        jedis.set("a","hello world");
//        jedis.expireAt("a",30000);
        jedis.setex("a",30,"hello world");
        jedis.close();
    }

    @Test
    public void testJedisShardePool() throws Exception {
        //获取ShardedJedis对象
        ShardedJedis shardJedis = shardedJedisPool.getResource();
        shardJedis.set("a","hello");
        shardJedis.expireAt("a",30);
        shardJedis.close();
    }

    @Test
    public void tesstJson() throws Exception {
        DevopsConfigInfo devopsConfigInfo = new DevopsConfigInfo();
        devopsConfigInfo.setConfigId(1000000000L);
        devopsConfigInfo.setConfigContext("sfsdfsdf");
        devopsConfigInfo.setConfigDescription("sdjfldsjfllsdjflj");

        JSONObject valueObj = JSONObject.fromObject(devopsConfigInfo);
        p(valueObj.getString("configId"));

        Set set = valueObj.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
    }
}
