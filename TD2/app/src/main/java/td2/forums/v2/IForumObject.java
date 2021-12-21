package td2.forums.v2;public interface IForumObject {

    String sujet();
    String contenue();
    String typeRepr();
    default String repr(){
        return "default ";
    };
}
