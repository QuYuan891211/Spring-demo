package CH2_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: QuYuan
 * @Description:
 * @Date: Created in 19:07 2019/1/31
 * @Modified By:
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
    @org.junit.jupiter.api.Test
    public void testSimplyLoad(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
        assertEquals ("test bean", myTestBean.getString());
    }
}
