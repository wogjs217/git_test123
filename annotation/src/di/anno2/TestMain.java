package di.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("config/bean.xml");
		ArticleDTO article = new ArticleDTO("±Ë¿Á«Â","123" ,"456", "789");
		IWriteArticleMgr articlemgr = (IWriteArticleMgr) container.getBean("articlemgr");
		articlemgr.write(article);
		
	}
}
