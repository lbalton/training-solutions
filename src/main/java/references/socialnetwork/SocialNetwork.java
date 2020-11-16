package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public String addMember(String name){
        members.add(new Member(name));
        return null;
    }

}
