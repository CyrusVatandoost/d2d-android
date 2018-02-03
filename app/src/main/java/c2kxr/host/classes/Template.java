package c2kxr.host.classes;

/**
 * Created by Kristian on 2/3/2018.
 */

public class Template {

    private String templateName;
    private String templateImage;
    public Template(String templateName, String templateImage) {
        this.templateName = templateName;
        this.templateImage = templateImage;
    }
    public void setTemplateImage(String TemplateImage) {
        this.templateImage = templateImage;
    }

    public void setTemplateName(String TemplateName) {
        this.templateName = templateName;
    }

    public String getTemplateImage() {
        return templateImage;
    }public String getTemplateName() {
        return templateName;
    }
}
