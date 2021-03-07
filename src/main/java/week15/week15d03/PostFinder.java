package week15.week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    List<Post> posts = new ArrayList<>();

    public List<Post> findPostsFor(String user){

        List<Post> post = new ArrayList<>();

        for (Post item : posts){
            if (item.getOwner().equals(user) && item.getPublishedAt().isBefore(LocalDate.now()) && !item.getContent().isBlank() && !item.getTitle().isBlank()){
                post.add(item);
            }
        }
        return post;
    }

    public void addPosts(Post post) {
        posts.add(post);
    }

}
