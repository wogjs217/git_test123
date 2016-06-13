package di.anno2;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MysqlArticleDAO implements IArticleDAO {

	public MysqlArticleDAO(){
		
	}
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("mysql");
		System.out.println(article.getName());
		System.out.println(article.getTitle());
		System.out.println(article.getContent());
		System.out.println(article.getDate());
		
	}

}
