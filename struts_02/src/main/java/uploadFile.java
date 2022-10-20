import com.opensymphony.xwork2.ActionSupport;
import com.sun.deploy.net.HttpRequest;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.io.File;

public class uploadFile extends ActionSupport {

    private File picFile;
    private String picFileFileName;

    public File getPicFile() {
        return picFile;
    }

    public void setPicFile(File picFile) {
        this.picFile = picFile;
    }

    public String getPicFileFileName() {
        return picFileFileName;
    }

    public void setPicFileFileName(String picFileFileName) {
        this.picFileFileName = picFileFileName;
    }

    @Override
    public String execute() throws Exception {
        if (picFileFileName != null){
            String path = ServletActionContext.getServletContext().getRealPath("images");
            File testFile = new File(path, picFileFileName);
            //判断是否存在
//            if (testFile.exists()){
//                String path2 = ServletActionContext.getServletContext().getRealPath("images2");
//                File file2 = new File(path2, picFileFileName);
//                FileUtils.copyFile((File)picFile, file2);
////                HttpSession session = ServletActionContext.getRequest().getSession();
////                session.setAttribute("path", path2);
//                return "SUCCESS";
//            }
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("path", path);
            FileUtils.copyFile((File)picFile, testFile);
            return "SUCCESS";
        }
        return "FAIL";
    }
}
