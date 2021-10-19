package td2.filesystem;

public interface Composant
{
    String getName();
    Owner getOwner();
    void setOwner(Owner owner,Boolean recursive);

    int getSize();
    String getContent();
    void appendContent(String name);

    Boolean isComposite();


}
