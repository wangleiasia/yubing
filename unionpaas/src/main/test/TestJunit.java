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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    @Test
    public void testMySqlConn() throws Exception {
        String DBDRIVER = "com.mysql.jdbc.Driver";
        //定义MySQL数据库的连接地址
        String DBURL = "jdbc:mysql://localhost:3306/sonar";
        //MySQL数据库的连接用户名
        String DBUSER = "sonar";
        //MySQL数据库的连接密码
        String DBPASS = "sonar";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
            try {
                //加载驱动程序
                Class.forName(DBDRIVER);
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                //连接MySQL数据库时，要写上连接的用户名和密码
                con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

                String sql = "select * from sonar.issues where id = 649185";
                stmt = con.createStatement();
                rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    System.out.println(rs.getString(2));
                }

            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(con);
            try {
                //关闭数据库
                con.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
    }

    @Test
    public void testKey() {
        for (int i = 0; i < 1000; i++) {
            String millis =  System.currentTimeMillis()%10000+"";
            int rand = (int)(Math.random()*10000);
            p(millis+rand);
        }
     }
}
