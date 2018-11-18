import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanglei on 2018/11/17.
 */
public class RmJenkinsDev {

    private static final String jenkinsUrl = "http://10.220.67.206:8900/jenkins/view/%E4%BB%A3%E7%A0%81%E6%9B%B4%E6%96%B0/";
    private static final String userName = "admin";
    private static final String password = "";
    private static final String jobName = "promote-rm";

    private static final String API_URL = "http://10.220.67.206:8900/jenkins/job/promote-rm/";

    private JenkinsServer jenkinsServer = null;

    public RmJenkinsDev() throws Exception {
        jenkinsServer = new JenkinsServer(new URI(jenkinsUrl), userName, password);
    }

    //代码同步
    public void synCodes() throws Exception {
        Map<String,Job> jobs = jenkinsServer.getJobs();
        Job remoteRmJob = jobs.get(jobName);

        MyJob myJob = new MyJob(API_URL);
        myJob.setClient(remoteRmJob.getClient());

        StringBuilder commitListBuilder = new StringBuilder();
        commitListBuilder.append("exeprogress/src/com/asiainfo/util/TfToTaskDispatcher.java|@wanglei6@modify");
        commitListBuilder.append("\r\n");
        commitListBuilder.append("exeprogress/src/com/asiainfo/util/LocalTfFrameWork.java|@wanglei6@modify");
        Map<String, String> param = new HashMap<String, String>();
        param.put("commitlist",commitListBuilder.toString());

        //启动构建
        myJob.build(param,true);
    }


    public static void main(String[] args) throws Exception {
        RmJenkinsDev rmJenkinsDev = new RmJenkinsDev();
        rmJenkinsDev.synCodes();
    }

}
