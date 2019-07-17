package cn.wolfcode.crm.util;

import com.jagregory.shiro.freemarker.ShiroTags;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;


public class MyFreeMarkerConfig extends FreeMarkerConfigurer {

    @Override
    public void afterPropertiesSet() throws IOException, TemplateException {
        super.afterPropertiesSet();
        Configuration configuration = this.getConfiguration();
        configuration.setSharedVariable("shiro", new ShiroTags());
    }
}
