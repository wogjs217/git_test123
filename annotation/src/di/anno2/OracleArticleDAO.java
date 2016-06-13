package di.anno2;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleArticleDAO implements IArticleDAO {
	
	public OracleArticleDAO(){
		
	}
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("oracle");
		System.out.println(article.getName());
		System.out.println(article.getTitle());
		System.out.println(article.getContent());
		System.out.println(article.getDate());
		
	}
}
