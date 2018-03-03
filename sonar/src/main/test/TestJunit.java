import com.yubing.util.DateUtil;
import org.junit.Test;

import java.util.Date;

/**
 * Created by wanglei on 2017/12/23.
 */
public class TestJunit {

    private void p(String str) {
        System.out.println(str);
    }

    @Test
    public void test1() {
       String line = "记录编号：61 滤筒编号：318";
       String leftRecord = line.substring(0,line.indexOf("滤筒编号"));
       String rightRecord = line.substring(line.indexOf("滤筒编号"),line.length());
        p(leftRecord);
        p(rightRecord);
    }

    @Test
    public void testTime() throws Exception {
        p(DateUtil.transTimeToString(new Date(),DateUtil.FORMAT_24HHMMSS));
    }
}
