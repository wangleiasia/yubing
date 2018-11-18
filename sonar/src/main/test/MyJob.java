import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.escape.Escaper;
import com.google.common.net.UrlEscapers;
import com.offbytwo.jenkins.model.ExtractHeader;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.QueueReference;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.util.Map;

/**
 * Created by wanglei on 2018/11/17.
 */
public class MyJob extends Job {

    private String remoteUrl;

    public MyJob(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public void build(Map<String, String> params) throws IOException {
        String qs = StringUtils.join(Collections2.transform(params.entrySet(), new MyJob.MapEntryToQueryStringPair()), "&");

        String postData = this.remoteUrl + "buildWithParameters?" + qs;

        this.client.post(postData);
    }

    public QueueReference build(Map<String, String> params, boolean crumbFlag) throws IOException {
        String qs = StringUtils.join(Collections2.transform(params.entrySet(), new MyJob.MapEntryToQueryStringPair()), "&");
        ExtractHeader location = (ExtractHeader)this.client.post(this.remoteUrl + "buildWithParameters?" + qs, (Object)null, ExtractHeader.class, crumbFlag);
        return new QueueReference(location.getLocation());
    }

    private static class MapEntryToQueryStringPair implements Function<Map.Entry<String, String>, String> {
        private MapEntryToQueryStringPair() {
        }

        public String apply(Map.Entry<String, String> entry) {
            Escaper escaper = UrlEscapers.urlFormParameterEscaper();
            return escaper.escape((String)entry.getKey()) + "=" + escaper.escape((String)entry.getValue());
        }
    }

}
