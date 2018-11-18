import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;
import com.yubing.util.DateUtil;
import org.junit.Test;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanglei on 2017/12/23.
 */
public class TestJunit {

    private void p(String str) {
        System.out.println(str);
    }
    private void p(Object str) {
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

    private static final String jenkinsUrl = "http://127.0.0.1:8089/view/%E4%BB%A3%E7%A0%81%E6%9B%B4%E6%96%B0/";
    private static final String userName = "admin";
    private static final String password = "admin";
    private static final String jobName = "promote-rmaa";

    private static final String API_URL = "http://127.0.0.1:8089/job/promote-rmaa/";

    @Test
    public void testJenkins() throws Exception {
        JenkinsServer jenkinsServer = new JenkinsServer(new URI(jenkinsUrl), userName, password);

        Map<String, Job> jobs = jenkinsServer.getJobs();

        Job job = jobs.get(jobName);

        MyJob myJob = new MyJob(API_URL);
        myJob.setClient(job.getClient());

        Map<String, String> param = new HashMap<String, String>();
        param.put("codeList","dsfdsfdsf323232");

        //启动构建
        myJob.build(param);
    }

}
