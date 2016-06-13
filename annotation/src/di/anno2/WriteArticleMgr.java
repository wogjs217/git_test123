package di.anno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("articlemgr")
public class WriteArticleMgr implements IWriteArticleMgr {

	@Autowired
	@Qualifier("oracle")
	private IArticleDAO articleDAO;
	
	public WriteArticleMgr() {
		super();
	}

	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
		System.out.println("WriteArticleMgr의 생성자 호출 완료");
	}

	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}

}
